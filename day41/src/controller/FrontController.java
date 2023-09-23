package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("*.do")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public FrontController() {
		super();
	}

	private void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. Client�� ���� ��û�� ���� -> � �׼����� �ľ�
		// ���̻� �Ķ���͸� ���ٴ�������!
		// URL�� �м��ؾ���!!!
		String uri=request.getRequestURI();
		System.out.println("uri: "+uri);
		String cp=request.getContextPath();
		System.out.println("cp: "+cp);
		String command=uri.substring(cp.length());
		System.out.println("command: "+command);

		// 2. ������ ��û�� �´� ActionŬ������ execute() �޼��带 ȣ��
		ActionForward forward=null;
		if(command.equals("/main.do")) {
			forward=new MainAction().execute(request, response);
		}
		else if(command.equals("/signup.do")) {
			forward=new SignupAction().execute(request, response);
		}
		else if(command.equals("/board.do")) {
			forward=new BoardAction().execute(request, response);
		}
		else if(command.equals("/login.do")) {
			forward=new LoginAction().execute(request, response);
		}
		else if(command.equals("/logout.do")) {
			forward=new LogoutAction().execute(request, response);
		}
		else if(command.equals("/signupPage.do")) {
			forward=new SignupPageAction().execute(request, response);
		}
		else if(command.equals("/insertBoardPage.do")) {
			forward=new InsertBoardPageAction().execute(request, response);
		}
		else if(command.equals("/insertBoard.do")) {
			forward=new InsertBoardAction().execute(request, response);
		}
		else if(command.equals("/updateBoard.do")) {
			forward=new UpdateBoardAction().execute(request, response);
		}
		else if(command.equals("/deleteBoard.do")) {
			forward=new DeleteBoardAction().execute(request, response);
		}
		else if(command.equals("/mypagePage.do")) {
			forward=new MypagePageAction().execute(request, response);
		}
		else if(command.equals("/mypage.do")) {
			forward=new MypageAction().execute(request, response);
		}
		else if(command.equals("/updateMember.do")) {
			forward=new UpdateMemberAction().execute(request, response);
		}
		else if(command.equals("/deleteMember.do")) {
			forward=new DeleteMemberAction().execute(request, response);
		}
		else {
			forward=new FalseAction().execute(request, response);
		}

		// 3. ����ڿ��� ����. View�� �̵�
		if(forward!=null) {
			if(forward.isRedirect()) {
				response.sendRedirect(forward.getPath());
			}
			else  {
				RequestDispatcher dispatcher=request.getRequestDispatcher(forward.getPath());
				dispatcher.forward(request, response);
			}
		}
		else {
			// ���� ó�� 
		}
		// html,css,js �� �׻� V�� �ξ�� �� 
		
		PrintWriter out=response.getWriter();
		out.println("<script>alert('��ûó���� �����߽��ϴ�.....');history.go(-1);</script>");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doAction(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doAction(request, response);
	}

}
