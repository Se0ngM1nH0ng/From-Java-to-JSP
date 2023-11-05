<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:useBean id="pb" class="model.ProductBean" scope="session" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 선택 페이지</title>
</head>
<body>

<form action="test02.jsp" method="post">
	<select name="product">
		<!-- JAVA의 for문 기능을 가지는 태그 -->
		<!-- JSTL에서 구현해놓았다! -->
		<c:forEach var="v" items="${pb.pdatas}">
			<option>${v}</option>
			<!-- EL식 ↔ 자바 표현식 -->
		</c:forEach>
		
		
	</select>
	<input type="submit" value="상품 선택">
</form>

</body>
</html> 