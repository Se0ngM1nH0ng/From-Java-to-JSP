<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="model.BoardVO,java.util.ArrayList" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="kim" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인</title>
</head>
<body>
<script type="text/javascript">
	function check(){ // 함수 실행 된다. 
		var ans=prompt('비밀번호를 입력하세요.'); 
		location.href='controller.jsp?action=mypage&mpw='+ans; // 마이페이지 & 비밀번호 
	}
</script>

<kim:login></kim:login>

<hr> 

<kim:mainBorder></kim:mainBorder>

</body>
</html>