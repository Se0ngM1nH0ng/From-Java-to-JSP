<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="test.MemberVO,java.util.ArrayList"%>
<jsp:useBean id="vo" class="test.MemberVO" />
<jsp:useBean id="dao" class="test.MemberDAO" />
<jsp:setProperty property="*" name="vo" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
#wrap>button {
	display: inblock;
	cursor: pointer;
	padding: 5px;
	margin: 5px;
}
</style>
</head>
<body>

<script type="text/javascript">
		
	<%
	if(request.getMethod().equals("POST")){
		MemberVO data = dao.selectOne(vo);
		if (data != null) {
			out.println("alert('로그인 성공')");
		} else {
			out.println("alert('로그인 실패')");
		}
	}
	%>
	</script>
	
	<form method="post" name ="test">
		<table border="1">
			<tr>
				<td>아이디</td>
				<td><input type="text" name="mid" placeholder="아이디를 입력해주세요"></td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><input type="password" name="mpw"
					placeholder="비밀번호를 입력해주세요"></td>
			</tr>
			<tr align ="right">
				<td colspan="2"><input type="submit" value="로그인"></td>
			</tr>
		</table>
		<input type="hidden" name="action" value="login">
		</form>

	<hr>
	
	<ul>
	<% 
	ArrayList<MemberVO> datas = dao.selectAll(null);
	for(MemberVO v:datas){
		out.println("<li>"+v+"</li>");
	}
	%>
	</ul>


</body>
</html>