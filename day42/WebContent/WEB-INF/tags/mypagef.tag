<%@ tag language="java" pageEncoding="UTF-8"%>

<form name='form' action="controller.jsp" method="post">
	<input type="hidden" name="action" value="updateMember">
	아이디 <input type="text" name="mid" readonly value='${data.mid}'> <br>
	비밀번호 <input type="password" name="mpw" value='${data.mpw}'> <br>
	이름 <input type="text" name="name" value='${data.name}'> <br>
	<input type="submit" value="회원정보변경"> <input type="button" value="회원탈퇴" onClick='dMember()'>
</form>

