<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<div id="header">

		<%
		if (session.getAttribute("name") == null) {
		%>

		<form action="b.jsp">
			아이디 <input type="text" name="mid"> <br> 비번 <input
				type="password" name="mpw"> <br> <input type="submit"
				value="로그인">

		</form>

		<%
		} else {
		%>
		<%=session.getAttribute("name")%>님, 안녕하세요! | <a href="c.jsp">로그아웃</a>

		<hr>


		<div>


			<form action="d.jsp">
				<input type="text" name="write" placeholder="글을 작성해주세요" required>
				<input type="submit" value="글 작성">

			</form>
			<hr>

			<ul>
				<%
				ArrayList<String> letter = (ArrayList<String>) application.getAttribute("letter");

				if (letter == null) {
					out.println("<p>글이 아직 작성되지않았어요!</p>");
				} else {
					for (String v : letter) {
						out.println("<li>" + v + "</li>");
					}
				}
				%>
			</ul>


		</div>


		<%
		}
		%>
	</div>





</body>
</html>