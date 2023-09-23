<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<jsp:useBean id="lb" class="test.LoginBean" />
	<jsp:setProperty property="*" name="lb"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>실습 분리하기</title>

</head>
<body>

<% lb.login(); %> <%-- 계산하고 싶은걸 불러올때  --%>

	<form method="post">
		<table border="1">
			<tr>
				<td>아이디</td>
				<td><input type="text" name="id" placeholder="아이디를 입력해주세요"></td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><input type="password" name="password" placeholder="비밀번호를 입력해주세요"></td>
			</tr>
			<tr align="right">
				<td colspan="2"><input type="submit" value="로그인"></td>
			</tr>
		</table>
	</form>

	<hr>
	
	결과 : <%= lb.getResult() %> <%-- 결과를 출력하고 싶을때  --%>


</body>
</html>