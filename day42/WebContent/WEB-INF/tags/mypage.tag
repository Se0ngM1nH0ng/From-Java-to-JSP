<%@ tag language="java" pageEncoding="UTF-8"%>

<form action="controller.jsp" method="post">
	<input type="hidden" name="action" value="mypage">
	<input type="hidden" name="mid" value="${mid}">
	비밀번호를 입력하세요 <br>
	<input type="password" name="mpw">
	<input type="submit" value="비밀번호 변경">
</form>
