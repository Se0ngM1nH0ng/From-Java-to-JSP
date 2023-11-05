<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="model.ProductVO,java.util.ArrayList"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>결제 페이지</h1>
	<%=session.getAttribute("member")%>님이 결제하신 상품목록입니다.
	<br>
	<ul>
		<%
		ArrayList<ProductVO> datas = (ArrayList<ProductVO>) session.getAttribute("datas");
		int total=0; // 총 가격
		if (datas == null) {
			out.println("장바구니가 비어있습니다!");
		} else {
			for (ProductVO v : datas) {
				total+=v.getPrice();
				out.println("<li>" + v + "</li>");
				
			}
		}
		
		%>
	</ul>
	<hr>
	<h3>총 가격은 <%= total %>원 입니다.</h3>
</body>
</html>