<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// 로그아웃 하면 다 비워주기 
	//session.setAttribute("mid", null);
	session.removeAttribute("name");
	//session.invalidate();
	
	response.sendRedirect("a.jsp");
%>