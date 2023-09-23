package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BoardDAO;
import model.BoardVO;

public class InsertBoardAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ActionForward forward = null;
		
		// 작성자도 있어야 되나 ?
		// 작성자는 로그인 하고 들어와서 이미 정보가 있을텐데 
		
		BoardDAO bDAO= new BoardDAO();
		BoardVO bVO = new BoardVO();
		bVO.setTitle(request.getParameter("title"));
		bVO.setContent(request.getParameter("content"));
		bVO.setWriter(request.getParameter("writer"));
		boolean flag=bDAO.insert(bVO);
		if(flag){
			forward = new ActionForward();
			forward.setRedirect(true);
			forward.setPath("main.do");
		
		}
		
		
		return forward;
	}

}
