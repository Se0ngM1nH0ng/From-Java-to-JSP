<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
   String mid=request.getParameter("mid");
   String mpw=request.getParameter("mpw");
   if(mid.equals("admin") && mpw.equals("1234")){
%>
   <h1>관리자페이지입니다.</h1>
<%
   }
   else{
%>
   <h1>다시 시도하세요.</h1>
<%
   }
%>

<form action="test06.jsp" method="post">
   아이디 <input type="text" name="mid" required> <br>
   비밀번호 <input type="password" name="mpw" required> <br>
   <input type="submit" value="로그인">
</form>


</body>
</html>