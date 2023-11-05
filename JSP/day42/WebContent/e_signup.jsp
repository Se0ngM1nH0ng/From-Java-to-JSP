<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="model.MemberVO"%>
    <%@ taglib tagdir="/WEB-INF/tags" prefix="kim" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 페이지</title>
</head>
<body>

<!-- action 은 signup으로  -->
	<kim:signup></kim:signup>

<br>

<a href="controller.jsp?action=main">메인으로 돌아가기</a>

</body>
</html> 