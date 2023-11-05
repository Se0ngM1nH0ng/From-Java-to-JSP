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
        // ������ �ڵ� �ۼ�
    }

    private void doSend(HttpServletRequest request, HttpServletResponse response) {
     System.out.println("����α�");
        int count = Integer.parseInt(request.getParameter("inputCount"));//��ü ĭ ��

        String api_key = "NCSJ2VUDNK4FXADI"; // API Ű
        String api_secret = "0PDAUWULVLUTU4BDDFM6JXQD9ZHJZCZD"; // API ��ũ�� Ű
        String number = request.getParameter("inputField1");

        Message coolsms = new Message(api_key, api_secret);
        for (int i = 1; i <= count; i++) {
            HashMap<String, String> params = new HashMap<String, String>();
            params.put("to", request.getParameter("inputField" + String.valueOf(i))); // ������ ��ȣ
            params.put("from", "�߽���ȭ��ȣ"); // �߽� ��ȭ��ȣ (�׽�Ʈ �ÿ��� �߽�, ���� ��� ���� ��ȣ�� ����)
            params.put("type", "SMS"); // ������ ������ Ÿ��
            params.put("text", request.getParameter("content")); // ���� ����
            params.put("app_version", "test app 1.2"); // ���ø����̼� �̸��� ����

            try {
                JSONObject obj = (JSONObject) coolsms.send(params);
                System.out.println(obj.toString());
            } catch (CoolsmsException e) {
                System.out.println(e.getMessage());
                System.out.println(e.getCode());
            }
        }

        // send.jsp�� ���𷺼�
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
