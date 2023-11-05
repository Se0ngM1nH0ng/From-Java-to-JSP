package send;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
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
 * Servlet implementation class test
 */
@WebServlet("*.do")
public class Test extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Test() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
//	private void doAction(HttpServletRequest request, HttpServletResponse response) {
//		try {// Է¹         utf-8           ȯ
//			request.setCharacterEncoding("UTF-8");//    ڷκ     Է¹             
//		} catch (UnsupportedEncodingException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//
//		String api_key = "NCSKBCZMXPIBM8UL"; //apiŰ
//		String api_secret = "JXUHSQQDI82W4YOLB7G5D37ZN5WPB6KQ";//api   ũ   Ű
//		Message coolsms = new Message(api_key, api_secret);//api               Ŭ       ü     
//		// 4 params(to, from, type, text) are mandatory. must be filled
//		HashMap<String, String> params = new HashMap<String, String>();//Ű   
//		params.put("to", request.getParameter("msg")); //       ȭ  ȣ
//		params.put("from"," "); //  ߽   ȭ  ȣ.  ׽ Ʈ ÿ     ߽ ,      Ѵ         ȣ    ϸ    
//		params.put("type", "SMS");//            Ÿ  
//		params.put("text", request.getParameter("content"));//         
//		params.put("app_version", "test app 1.2"); // application name and version
//
//		//   ں         
//		try {
//			JSONObject obj = (JSONObject) coolsms.send(params);
//			System.out.println(obj.toString());
//		} catch (CoolsmsException e) {
//			System.out.println(e.getMessage());
//			System.out.println(e.getCode());
//		}
//		
//		 // send.jsp      𷺼 
//        RequestDispatcher dispatcher = request.getRequestDispatcher("NewFile.jsp");
//        try {
//            dispatcher.forward(request, response);
//        } catch (ServletException | IOException e) {
//            e.printStackTrace();
//        }
//
//	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doAction(request, response);

	}

	private void doAction(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		System.out.println();
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doAction(request, response);

	}

}