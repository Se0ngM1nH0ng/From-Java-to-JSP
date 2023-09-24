<%@ tag language="java" pageEncoding="UTF-8"%>

<form action="controller.jsp" method="post">
	<input type="hidden" name="action" value="insertBoard">
	제목 <input type="text" name="title"> <br>
	내용 <input type="text" name="artist"> <br>
	작성자 <input type="text" name="writer" value='${mid}' readonly> <br>
	<input type="submit" value="게시글 작성">
</form>