<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	response.sendRedirect("controller.jsp?action=main"); // 컨트롤러야 메인 보여줘 
	// controller 없이는 main 페이지로 이동이 불가능하다!
	//왜 ?
	// datas가 없으니까 !
	// 메인보여줘 라는 부탁을 해야지만 볼 수 있다. 
%>