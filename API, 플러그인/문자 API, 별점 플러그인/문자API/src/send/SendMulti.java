package send;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;

import net.nurigo.java_sdk.api.Message;
import net.nurigo.java_sdk.exceptions.CoolsmsException;

/**
 * Servlet implementation class sendMulti
 */
@WebServlet("*.send")
public class SendMulti extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public SendMulti() {
        super();
        // 생성자 코드 작성
    }

    private void doSend(HttpServletRequest request, HttpServletResponse response) {
     System.out.println("샌드로그");
        int count = Integer.parseInt(request.getParameter("inputCount"));//전체 칸 수

        String api_key = "NCSJ2VUDNK4FXADI"; // API 키
        String api_secret = "0PDAUWULVLUTU4BDDFM6JXQD9ZHJZCZD"; // API 시크릿 키
        String number = request.getParameter("inputField1");

        Message coolsms = new Message(api_key, api_secret);
        for (int i = 1; i <= count; i++) {
            HashMap<String, String> params = new HashMap<String, String>();
            params.put("to", request.getParameter("inputField" + String.valueOf(i))); // 수신자 번호
            params.put("from", "발신전화번호"); // 발신 전화번호 (테스트 시에는 발신, 수신 모두 본인 번호로 설정)
            params.put("type", "SMS"); // 보내는 문자의 타입
            params.put("text", request.getParameter("content")); // 보낼 내용
            params.put("app_version", "test app 1.2"); // 애플리케이션 이름과 버전

            try {
                JSONObject obj = (JSONObject) coolsms.send(params);
                System.out.println(obj.toString());
            } catch (CoolsmsException e) {
                System.out.println(e.getMessage());
                System.out.println(e.getCode());
            }
        }

        // send.jsp로 리디렉션
        RequestDispatcher dispatcher = request.getRequestDispatcher("send.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doSend(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doSend(request, response);
    }

}
