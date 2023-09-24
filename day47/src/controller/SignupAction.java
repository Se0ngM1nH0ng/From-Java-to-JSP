package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SignupAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MemberDAO mDAO=new MemberDAO();
		boolean flag=mDAO.insert(mVO);
		if(flag){
			out.println("<script>alert('ȸ������ ����! �α����Ŀ� �̿��ϼ���! :D');location.href='controller.jsp?action=main';</script>");
		}
		else{
			out.println("<script>alert('ȸ������ ����...');history.go(-1);</script>");
		}
		
		ActionForward forward=new ActionForward();
		forward.setRedirect(true);
		forward.setPath("main.jsp");
		return forward;
	}

}
