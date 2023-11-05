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
	String result = "";
	
	if(request.getMethod().equals("POST")){
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		
			if(id.equals("admin") && password.equals("1234")){
				result = "관리자님 환영합니다 !";
				
			}else{
				result = "다시 입력해주세요";
			}
		}
	

%>

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
	
	결과 : <%= result %>


</body>
</html>