package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MainAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BoardDAO bDAO=new BoardDAO();
		ArrayList<BoardVO> datas=bDAO.selectAll(null);
		request.setAttribute("datas", datas);
	
		ActionForward forward=new ActionForward();
		forward.setRedirect(false);
		forward.setPath("main.jsp");
		return forward;
	}

}

ArrayList<BoardVO> datas = bDAO.selectAll(null); // 게시글 목록 전체 출력 
request.setAttribute("datas", datas); // "datas" 라는 이름으로 목록 전체 보내줌 
request.getRequestDispatcher("b_main.jsp").forward(request, response); 