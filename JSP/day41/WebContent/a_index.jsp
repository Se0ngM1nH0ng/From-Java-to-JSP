<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	response.sendRedirect("main.do"); // 컨트롤러야 메인 보여줘 
	// controller 없이는 main 페이지로 이동이 불가능하다!
	//왜 ?
	// datas가 없으니까 !
	// 메인보여줘 라는 부탁을 해야지만 볼 수 있다. 
	
	// URL :main.do
	// .do로 끝남 -> FrontController(FC)로 가주세요!
	// .jsp로 끝남 -> 해당 페이지(view)를 보여주세요 !
	
	// controller.jsp?action=main VS main.do
	// action 이라는 파라미터를 1개 갖고 다녀 
%>