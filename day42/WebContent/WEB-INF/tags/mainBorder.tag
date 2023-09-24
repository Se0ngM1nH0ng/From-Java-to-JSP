<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<table border="1">
   <tr>
      <th>글 번호</th><th>글 제목</th><th>작성자</th>
   </tr>
   
   
   
   <c:forEach var="v" items="${datas}" >
   <tr>
      <td><a href="controller.jsp?action=board&num=${v.num}">${v.num}</a></td>
      <td>${v.artist}</td>
      <td>${v.writer}</td>
   </tr>
 </c:forEach>
 
</table>
<br>
<c:if test="${not empty mid}">
      <a href='controller.jsp?action=insertBoardGo'>게시글 작성</a>
</c:if>
