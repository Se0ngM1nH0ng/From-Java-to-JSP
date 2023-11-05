<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.ArrayList, model.StarVO" %>
    
<%	request.setCharacterEncoding("UTF-8");	%>
 
<jsp:useBean id="sDAO" class="model.StarDAO" />
<jsp:useBean id="sVO" class="model.StarVO"/>
<jsp:setProperty property="*" name="sVO" />

<%

String action=request.getParameter("action");

/*System.out.println("로그 : controller.jsp");
System.out.println("action: "+action);
System.out.println("bVO: "+bVO);
System.out.println("mVO: "+mVO);*/

if(action.equals("main")){
	response.sendRedirect("starscore.jsp"); // jsp 액션 태그를 자바로 작성한 것
}		// 유지해야하기 때문에 forward를 사용 

else if(action.equals("save")){
	 int inputValue = Integer.parseInt(request.getParameter("inputValue"));
	 System.out.println(inputValue);
	 sVO.setStarvalue((double)inputValue/2);
	 if(sDAO.insert(sVO)){
		 %>
<script>alert('별점 <%=sVO.getStarvalue()%> 저장 성공!  '); 
location.href='controller.jsp?action=main';
</script>")
<%
	 }
	 else{
		 out.println("<script>alert('별점 저장 실패...');history.go(-1);</script>");
	 }
}
%>