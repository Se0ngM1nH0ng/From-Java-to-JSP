<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
	//사용자가 보내는값 가져오는값 받아야해 -> 댓글
	String write = " ["+session.getAttribute("name")+"] "+request.getParameter("write");
	
	
	//그 댓글을 배열리스트에 담아서 
	ArrayList<String> letter =(ArrayList<String>)application.getAttribute("letter");
	
	//만약 없으면 ?
	if(letter == null){
		letter = new ArrayList<String>();
		application.setAttribute("letter", letter);
	}
	
	letter.add(write);
	
 	response.sendRedirect("a.jsp");
	
 	//새로만들어서 세팅 해줌
	
	//있다면 
	//추가만 
	
	//리스트는 어플리 케이션으로 
	
	//사용자 댓글은 String 

	%>
</body>
</html>