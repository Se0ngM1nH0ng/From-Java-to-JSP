package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//not pojo 라는 증거 얘네 들이 없으면 실행 할 수 없어 
/**
 * Servlet implementation class Controller
 */
// ★★★★★
@WebServlet("/Controller") // 어노테이션 덕분에 특정 요청에 대해 반응 할 수 있다. 특정 Client(브라우저,사용자)의 요청에 대해 반응할 수 있음
// 필터, 리스너에서 사용한 어노테이션 맞구요 , 애초에 서블릿을 상속받은 특수한 서블릿이다. 
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L; // 직렬화 라는것을 할 때 필요한것 (몰라도 되는 부분) 
       
    public FrontController() { // 생성자 :  클래스와 이름이 같고 output없다. 기본생성자이다. 웹에서는 기본생성자가 default 로 사용된다. 그래서 꼭 필요하다.  
        super();
    }

    private void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	// 여기에 기능을 코딩 
    	// 임의로 실행될 메서드를 만들어 놓음 
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
    			out.println("<script>alert('게시글 작성 성공!');location.href='controller.jsp?action=main';</script>");
    		}
    		else{
    			out.println("<script>alert('게시글 작성 실패...');history.go(-1);</script>");
    		}
    	}
    	else if(action.equals("updateBoard")){
    		boolean flag=bDAO.update(bVO);
    		if(flag){
    			out.println("<script>alert('게시글 변경 성공!');location.href='controller.jsp?action=board&num="+bVO.getNum()+"';</script>");
    		}
    		else{
    			out.println("<script>alert('게시글 변경 실패...');history.go(-1);</script>");
    		}
    	}
    	else if(action.equals("deleteBoard")){
    		boolean flag=bDAO.delete(bVO);
    		if(flag){
    			response.sendRedirect("controller.jsp?action=main");
    		}
    		else{
    			out.println("<script>alert('게시글 삭제 실패...');history.go(-1);</script>");
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
    			out.println("<script>alert('비밀번호 불일치...');history.go(-1);</script>");
    		}
    	}
    	else if(action.equals("updateMember")){
    		boolean flag=mDAO.update(mVO);
    		if(flag){
    			out.println("<script>alert('회원정보 변경 성공! 로그인후에 이용하세요! :D');location.href='controller.jsp?action=logout';</script>");
    		}
    		else{
    			out.println("<script>alert('회원정보 변경 실패...');history.go(-1);</script>");
    		}
    	}
    	else if(action.equals("deleteMember")){
    		boolean flag=mDAO.delete(mVO);
    		if(flag){
    			out.println("<script>alert('회원탈퇴 성공!');location.href='controller.jsp?action=logout';</script>");
    		}
    		else{
    			out.println("<script>alert('회원탈퇴 실패...');history.go(-1);</script>");
    		}
    	}
    	else{
    		out.println("<script>alert('action 파라미터의 값을 확인해주세요!');history.go(-1);</script>");
    	}
    	
    	//////////
    	// 3. 요청 처리가 완료되면 사용자에게 응답하기
    	//  : View로 이동
    	//////////
    	
    		// 3. 사용자에게 응답. View로 이동
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
    
    
	// get요청으로 들어오면 수행 해줘 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doAction(request,response);
	}

	// post요청으로 들어오면 수행 해줘 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doAction(request,response);
	}

}
