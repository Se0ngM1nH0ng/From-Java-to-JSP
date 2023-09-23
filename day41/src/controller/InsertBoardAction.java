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
		
		// �ۼ��ڵ� �־�� �ǳ� ?
		// �ۼ��ڴ� �α��� �ϰ� ���ͼ� �̹� ������ �����ٵ� 
		
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
