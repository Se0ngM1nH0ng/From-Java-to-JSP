<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="model.BoardVO"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="kim" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 작성 페이지</title>
</head>
<body>

<kim:insertBoard></kim:insertBoard>
<!-- session 자바로 표현한 것 name은 바뀔수 있으므로 mid가 pk 라서 mid를 가져와야 된다.    -->
<br>

<a href="controller.jsp?action=main">메인으로 돌아가기</a>


</body>
</html> 