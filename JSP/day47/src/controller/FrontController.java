package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//not pojo ��� ���� ��� ���� ������ ���� �� �� ���� 
/**
 * Servlet implementation class Controller
 */
// �ڡڡڡڡ�
@WebServlet("/Controller") // ������̼� ���п� Ư�� ��û�� ���� ���� �� �� �ִ�. Ư�� Client(������,�����)�� ��û�� ���� ������ �� ����
// ����, �����ʿ��� ����� ������̼� �±��� , ���ʿ� ������ ��ӹ��� Ư���� �����̴�. 
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L; // ����ȭ ��°��� �� �� �ʿ��Ѱ� (���� �Ǵ� �κ�) 
       
    public FrontController() { // ������ :  Ŭ������ �̸��� ���� output����. �⺻�������̴�. �������� �⺻�����ڰ� default �� ���ȴ�. �׷��� �� �ʿ��ϴ�.  
        super();
    }

    private void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	// ���⿡ ����� �ڵ� 
    	// ���Ƿ� ����� �޼��带 ����� ���� 
    	String action=request.getParameter("action");
    	
    	ActionForward forward=null;
    	if(action.equals("main")){
    		MainAction mainAction=new MainAction();
    		forward=mainAction.execute(request, response);
    	}
    	else if(action.equals("board")){
    		
    	}
    	else if(action.equals("login")){
    		
    	}
    	else if(action.equals("logout")){
    		LogoutAction logoutAction=new LogoutAction();
    		logoutAction.execute(request, response);
    	}
    	else if(action.equals("signupPage")){
    		response.sendRedirect("e_signup.jsp");
    	}
    	else if(action.equals("signup")){
    		
    	}
    	else if(action.equals("insertBoardPage")){
    		response.sendRedirect("c_insertBoard.jsp");
    	}
    	else if(action.equals("insertBoard")){
    		boolean flag=bDAO.insert(bVO);
    		if(flag){
    			out.println("<script>alert('�Խñ� �ۼ� ����!');location.href='controller.jsp?action=main';</script>");
    		}
    		else{
    			out.println("<script>alert('�Խñ� �ۼ� ����...');history.go(-1);</script>");
    		}
    	}
    	else if(action.equals("updateBoard")){
    		boolean flag=bDAO.update(bVO);
    		if(flag){
    			out.println("<script>alert('�Խñ� ���� ����!');location.href='controller.jsp?action=board&num="+bVO.getNum()+"';</script>");
    		}
    		else{
    			out.println("<script>alert('�Խñ� ���� ����...');history.go(-1);</script>");
    		}
    	}
    	else if(action.equals("deleteBoard")){
    		boolean flag=bDAO.delete(bVO);
    		if(flag){
    			response.sendRedirect("controller.jsp?action=main");
    		}
    		else{
    			out.println("<script>alert('�Խñ� ���� ����...');history.go(-1);</script>");
    		}
    	}
    	else if(action.equals("mypagePage")){
    		response.sendRedirect("mypage.jsp");
    	}
    	else if(action.equals("mypage")){
    		///// mVO.setMid((String)session.getAttribute("mid"));
    		mVO=mDAO.selectOne(mVO);
    		if(mVO!=null){
    			request.setAttribute("data", mVO);
    			request.getRequestDispatcher("f_mypage.jsp").forward(request, response);
    		}
    		else{
    			out.println("<script>alert('��й�ȣ ����ġ...');history.go(-1);</script>");
    		}
    	}
    	else if(action.equals("updateMember")){
    		boolean flag=mDAO.update(mVO);
    		if(flag){
    			out.println("<script>alert('ȸ������ ���� ����! �α����Ŀ� �̿��ϼ���! :D');location.href='controller.jsp?action=logout';</script>");
    		}
    		else{
    			out.println("<script>alert('ȸ������ ���� ����...');history.go(-1);</script>");
    		}
    	}
    	else if(action.equals("deleteMember")){
    		boolean flag=mDAO.delete(mVO);
    		if(flag){
    			out.println("<script>alert('ȸ��Ż�� ����!');location.href='controller.jsp?action=logout';</script>");
    		}
    		else{
    			out.println("<script>alert('ȸ��Ż�� ����...');history.go(-1);</script>");
    		}
    	}
    	else{
    		out.println("<script>alert('action �Ķ������ ���� Ȯ�����ּ���!');history.go(-1);</script>");
    	}
    	
    	//////////
    	// 3. ��û ó���� �Ϸ�Ǹ� ����ڿ��� �����ϱ�
    	//  : View�� �̵�
    	//////////
    	
    		// 3. ����ڿ��� ����. View�� �̵�
    		if(forward!=null) {
    			if(forward.isRedirect()) {
    				response.sendRedirect(forward.getPath());
    			}
    			else {
    				RequestDispatcher dispatcher=request.getRequestDispatcher(forward.getPath());
    				dispatcher.forward(request, response);
    			}
    		};
    	
    	
    	
    }
    
    
	// get��û���� ������ ���� ���� 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doAction(request,response);
	}

	// post��û���� ������ ���� ���� 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doAction(request,response);
	}

}
