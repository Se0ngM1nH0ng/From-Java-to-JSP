<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="model.MemberVO"%>
    <jsp:useBean id="mVO" class="model.MemberVO" />
    <%@ taglib tagdir="/WEB-INF/tags" prefix="kim" %>
<!DOCTYPE html>
<html> 
<head>
<meta charset="UTF-8">
<title>마이페이지</title> 
</head>
<body>

<script type="text/javascript">
	function dMember(){
		var msg = confirm("정말 탈퇴하시겠습니까?")
		if(msg == true){
			document.form.action.value="deleteMember";
			document.form.submit();
		}
	}


</script>


	

<!-- value 값에 java를 넣어서 들고 올수 있다. data에 담은 정보를 ,아예 새로운 비밀번호를 받으려면 mVO에 아예 하나 추가해야 된다.  -->
<kim:mypagef></kim:mypagef>



<br>

<a href="controller.jsp?action=main">메인으로 돌아가기</a>

</body>
</html>