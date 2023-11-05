<%@ tag language="java" pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:if test="${empty mid}">
	<a href="#" class="button">로그인하고 게시글 작성하기</a> 
</c:if>

<c:if test="${not empty mid}">
	<a href="controller.jsp?action=insertBoardPage" class="button">게시글 작성하기</a>
</c:if>