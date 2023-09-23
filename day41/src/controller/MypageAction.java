package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.MemberDAO;
import model.MemberVO;

public class MypageAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ActionForward forward = null;
	
		///// mVO.setMid((String)session.getAttribute("mid"));
		MemberDAO mDAO=new MemberDAO();
		MemberVO mVO=new MemberVO();
		mVO.setMid(request.getParameter("mid"));
		mVO.setMpw(request.getParameter("mpw"));
		mVO=mDAO.selectOne(mVO);
			if(mVO!=null){
				request.setAttribute("data", mVO);
				forward = new ActionForward();
				forward.setRedirect(false);
				forward.setPath("f_mypage.jsp");
			}
			
		
		
		return forward;
	}

}
