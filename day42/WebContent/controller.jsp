<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.ArrayList,model.BoardVO"%>

<jsp:useBean id="bDAO" class="model.BoardDAO" />
<jsp:useBean id="mDAO" class="model.MemberDAO" />
<jsp:useBean id="mVO" class="model.MemberVO" />
<jsp:setProperty property="*" name="mVO" />
<jsp:useBean id="bVO" class="model.BoardVO" />
<jsp:setProperty property="*" name="bVO" />

<%

String action = request.getParameter("action"); // 동작을 수행할 액션을 받아온다. 

System.out.println("로그: controller.jsp");
System.out.println("action: " + action);
System.out.println("bVO: " + bVO);
System.out.println("mVO: " + mVO);
System.out.println();

if (action.equals("main")) { // 메인이라고 받았을때 
	ArrayList<BoardVO> datas = bDAO.selectAll(null); // 게시글 목록 전체 출력 
	request.setAttribute("datas", datas); // "datas" 라는 이름으로 목록 전체 보내줌 
	request.getRequestDispatcher("b_main.jsp").forward(request, response); 
	// sendRedirect같은 친구인데 정보를 기억하고 넘겨줌
} 
else if (action.equals("board")) { // board라고 받았을때 
	bVO = bDAO.selectOne(bVO); // 하나 비교 게시글 하나 
	if (bVO != null) { // 게시글이 비어있는게 아니라면 
		request.setAttribute("data", bVO); //"data" 로 해서 bVO 정보를 보냄
		request.getRequestDispatcher("d_board.jsp").forward(request, response); 
		// sendRedirect같은 친구인데 정보를 기억하고 넘겨줌
	}
} 
/////////////////////////////////////////////////////////////////


else if (action.equals("login")) {
	mVO = mDAO.selectOne(mVO); // mVO에 mid,mpw가 setter에 의해 저장됨
	if (mVO == null) { // 정보가 없다면 
		out.println("<script>alert('로그인 실패...');history.go(-1);</script>");
	} else { // 있다면 
		session.setAttribute("mid", mVO.getMid()); //"mid"로 사용자 아이디"pk"를 보내준다. 
		response.sendRedirect("controller.jsp?action=main"); // 메인으로 다시 돌아간다. 
	}
} 
else if (action.equals("logout")) {
	session.removeAttribute("mid"); // pk인 mid를 제거 
	response.sendRedirect("controller.jsp?action=main"); // 메인으로 다시 돌아간다. 
}

/////////////////////////////////////////////////////////////////
else if(action.equals("mypagePage")){
	response.sendRedirect("mypage.jsp");
}
else if (action.equals("mypage")) {
		//mVO.setMid((String)session.getAttribute("mid"));// 세션에 있는 mid를 불러와서 타입을 맞게 형변환 시킨후 다시 보낸다.
		mVO=mDAO.selectOne(mVO); // 객체로 변환 , 정보를 다 들고온다. 
		if(mVO!=null){ // 정보가 있을때 
			request.setAttribute("data", mVO); // 정보를 다  "data"로 이제 보내줌
			request.getRequestDispatcher("f_mypage.jsp").forward(request, response);
		}
		else{ // 정보가 없을때 
			out.println("<script>alert('비밀번호 불일치...');history.go(-1);</script>");
		}
	
} 
else if(action.equals("updateMember")){ // 회원정보 변경
	boolean flag=mDAO.update(mVO); // 회원 정보 업데이트 
	if(flag){ //성공시
		out.println("<script>alert('회원정보 변경 성공! 로그인후에 이용하세요! :D');location.href='controller.jsp?action=logout';</script>");
	}
	else{
		out.println("<script>alert('회원정보 변경 실패...');history.go(-1);</script>");
	}
}

else if(action.equals("deleteMember")){
	boolean flag = mDAO.delete(mVO); // 회원정보 삭제 
	if(flag){ //성공시
		out.println("<script>alert('탈퇴 성공! 로그아웃 됩니다.');location.href='controller.jsp?action=logout';</script>");
	}else{
		out.println("<script>alert('탈퇴 실패... 처음으로 돌아갑니다.'); window.location.href='controller.jsp?action=main';</script>");
		
	}
}

/////////////////////////////////////////////////////////////////

else if(action.equals("updateBoard")){ //게시글 변경
	boolean flag=bDAO.update(bVO); // 게시글을 변경해줘 
	if(flag){ // 성공시
		out.println("<script>alert('게시글 변경 성공!');location.href='controller.jsp?action=board&num="+bVO.getNum()+"';</script>");
	}
	else{
		out.println("<script>alert('게시글 변경 실패...');history.go(-1);</script>");
	}
}
else if(action.equals("deleteBoard")){ // 게시글 삭제
	boolean flag = bDAO.delete(bVO); // 게시글을 삭제 해줘 
	if(flag){ // 성공시 
		out.println("<script>alert('게시글 삭제 성공 !! 처음으로 돌아갑니다.'); window.location.href='controller.jsp?action=main';</script>");
	}else{
		out.println("<script>alert('게시글 삭제 실패... 처음으로 돌아갑니다.'); window.location.href='controller.jsp?action=main';</script>");
		
	}
}

/////////////////////////////////////////////////////////////////

else if (action.equals("insertBoardGo")) { // 게시글 작성 페이지로 가줘 
	response.sendRedirect("c_insertBoard.jsp");
}
else if (action.equals("insertBoard")) {
	boolean flag = bDAO.insert(bVO); // 게시글 작성을 등록 해줘 
	if(flag){
		out.println("<script>alert('게시글 작성 성공 !! 처음으로 돌아갑니다.'); window.location.href='controller.jsp?action=main';</script>");
	}else{
		out.println("<script>alert('게시글 작성 실패... 처음으로 돌아갑니다.'); window.location.href='controller.jsp?action=main';</script>");
	}
}


/////////////////////////////////////////////////////////////////

else if (action.equals("signupPage")) {
	// 회원가입 페이지로 가줘 ~~
	response.sendRedirect("e_signup.jsp");
}
else if (action.equals("signup")) { // 회원가입 
	boolean flag = mDAO.insert(mVO);
	if (!flag) {
		out.println("<script>alert('회원가입 실패...');history.go(-1);</script>");
		
	} else {
		out.println("<script>alert('회원가입 성공 !! 처음으로 돌아갑니다.'); window.location.href='controller.jsp?action=main';</script>");
		
	}
} 

/////////////////////////////////////////////////////////////////

else {
	out.println("<script>alert('action 파라미터의 값을 확인해주세요!');history.go(-1);</script>");
}
%>