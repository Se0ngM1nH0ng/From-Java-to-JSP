package controller;

import java.io.IOException;
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
    	// 1. ��û�� ����
    	String uri=request.getRequestURI();
    	String cp=request.getContextPath();
    	String command=uri.substring(cp.length());
    	System.out.println(" FrontController Ŭ���� : doAction() �޼��� : command : "+command);
    	
    	// 2. Action Ŭ������ execute() �޼��带 ȣ��
    	ActionForward forward=null;
    	if(command.equals("/main.do")) {
    		forward=new MainAction().execute(request, response);
    	}
    	else if(command.equals("/signup.do")) {
    		forward=new SignupAction().execute(request, response);
    	}
    	else if(command.equals("/insertBoard.do")) {
    		forward= new InsertBoardAction().execute(request, response);
    	}
    	else if(command.equals("/login.do")) {
    		forward = new LoginAction().execute(request, response);
    	}
    	else if(command.equals("/logout.do")) {
    		forward = new LogoutAction().execute(request, response);
    	}
    	
    	// 3. ����ڿ��� ����. View�� �̵�
    	if(forward != null) {
    		if(forward.isRedirect()) {
    			response.sendRedirect(forward.getPath());
    		}
    		else {
    			request.getRequestDispatcher(forward.getPath()).forward(request, response);
    		}
    	}
    	else {
    		response.sendRedirect("goback.jsp");
    	}
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doAction(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doAction(request, response);
	}

}
