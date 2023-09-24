<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.ArrayList" %>
<%
	request.setCharacterEncoding("UTF-8");
// "필터"
// "인코딩필터"
%>

<jsp:useBean id="eDAO" class="model.EmailDAO" />
<jsp:useBean id="eVO" class="model.EmailVO" />
<jsp:useBean id="mDAO" class="model.MemberDAO" />
<jsp:useBean id="mVO" class="model.MemberVO" />
<jsp:setProperty property="*" name="mVO" />
<jsp:setProperty property="*" name="eVO" />
<%
	String action=request.getParameter("action");


	if(action.equals("main")){
		response.sendRedirect("b_main.jsp");
	}
	else if(action.equals("login")){
		mVO = mDAO.selectOne(mVO); // mVO에 mid,mpw가 setter에 의해 저장됨
		if(mVO==null){
			out.println("<script>alert('로그인 실패...');history.go(-1);</script>");
		}
		else{
			session.setAttribute("mid", mVO.getMid());
			response.sendRedirect("controller.jsp?action=main");
		}
	}
	else if(action.equals("logout")){
		session.removeAttribute("mid");
		response.sendRedirect("controller.jsp?action=main");
	}
	else if(action.equals("signupPage")){
		response.sendRedirect("e_signup.jsp");
	}
	else if(action.equals("signup")){
		boolean flag=mDAO.insert(mVO);
		if(flag){
			out.println("<script>alert('회원가입 성공! 로그인후에 이용하세요! :D');location.href='controller.jsp?action=main';</script>");
		}
		else{
			out.println("<script>alert('회원가입 실패...');history.go(-1);</script>");
		}
	}
	else if(action.equals("insertemailPage")){
		response.sendRedirect("c_insertemail.jsp");
	}
	else if(action.equals("insertemail")){
		boolean flag=eDAO.insert(eVO);
		if(flag){
			out.println("<script>alert('이메일 발송 성공!');location.href='controller.jsp?action=main';</script>");
		}
		else{
			out.println("<script>alert('이메일 발송 실패...');history.go(-1);</script>");
		}
	}
	else if(action.equals("mypage")){
		mVO.setMid((String)session.getAttribute("mid"));
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
			session.removeAttribute("mid");
			out.println("<script>alert('회원탈퇴 성공!');location.href='controller.jsp?action=logout';</script>");
		}
		else{
			out.println("<script>alert('회원탈퇴 실패...');history.go(-1);</script>");
		}
	}
	else{
		out.println("<script>alert('action 파라미터의 값을 확인해주세요!');history.go(-1);</script>");
	}
%>