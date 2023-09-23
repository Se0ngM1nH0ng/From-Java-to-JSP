<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
   request.setCharacterEncoding("UTF-8"); // 다른 페이지로 이동 시킬 때 인코딩 하는것을  꼭 넣어줘야 한다. 
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

   선택상자 <%= request.getParameter("box") %> <br>
   체크박스
   <ul>
   <% // String 배열로 받아온다. 
      String[] datas=request.getParameterValues("fav"); // 불러올땐 밸류값 타입값 이름을 불러올수 없다
      for(int i=0;i<datas.length;i++){ // 이름을 불러와야함 
         out.println("<li>"+datas[i]+"</li>");
      }
   %>
   </ul>

</body>
</html>