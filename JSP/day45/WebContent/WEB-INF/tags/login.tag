<%@ tag language="java" pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<header class="major">
	<h2>MAIN</h2>
</header>

<div class="table-wrapper">
<c:if test="${empty mid}">
	<form action="controller.jsp" method="post">
		<input type="hidden" name="action" value="login">
		<table class="alt">
			<tbody>
				<tr>
					<td>ID</td>
					<td><input type="text" name="mid" required></td>
				</tr>
				<tr>
					<td>PASSWD</td>
					<td><input type="password" name="mpw" required></td>
				</tr>
			</tbody>
		</table>
		<input type="submit" class="button primary" value="LOGIN">
	</form>
</c:if>
<c:if test="${not empty mid}">
		<h3>${mid}님, 환영합니다!&nbsp;&nbsp;&nbsp;:D</h3> <br>
		<a href="controller.jsp?action=logout" class="button">LOGOUT</a>
</c:if>
</div>