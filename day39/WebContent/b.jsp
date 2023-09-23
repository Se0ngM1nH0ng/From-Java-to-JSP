<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:useBean id="mDAO" class="model.MemberDAO" />
    <jsp:useBean id="mVO" class="model.MemberVO" />
    <jsp:setProperty property="*" name="mVO"/>
<%
	// 로그인 mid,mpw를 받아와 
	
	
	
	// 그정보를 mVO로 받아서 넘겨줘 
	
	
	// 근데 회원정보가 없으면 ?
	// 만들면 됨
	
	
	mVO=mDAO.selectOne(mVO);

	if(mVO == null){
		out.println("<script>alert('로그인 실패...');history.go(-1);</script>");	
	}
	else{
	session.setAttribute("name", mVO.getName());
	
	response.sendRedirect("a.jsp");
	}
	
	
	// 그것을 selectOne 으로 비교해줘 
	// 그러면 그 정보를 이제 추가해줘 
	








%>