<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="model.ProductVO,java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%=session.getAttribute("mid")%>님이 구매한 상품들입니다.
<hr>
<ol> 
<%
	int total=0;
	ArrayList<ProductVO> cart=(ArrayList<ProductVO>)session.getAttribute("cart");
	if(cart == null ){
		out.println("<h2>장바구니가 비어있습니다.</h2>");
	}
	for(ProductVO v:cart){
		out.println("<li>"+v+"</li>");
		total+=v.getPrice();
	}
%>
</ol>
<hr>
<h2>총 금액은 <%= total %>원입니다.</h2>
<hr>
<a href="a.jsp">메인으로 돌아가기</a>

</body>
</html>