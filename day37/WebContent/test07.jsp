<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:useBean id="cb" class="test.CalcBean" />
    <%-- 액션태그
    CalcBean cb = new CalcBean(); 객체화를 담당하는 태그이다 jsp:useBean 이게
    
     --%>
     
     <jsp:setProperty property="*" name="cb"/>
     <%-- cb라는 객체의 대해서 멤버변수 초기화 된다. 객체의 멤버변수의 이름과 파라미터의 이름이 맞아야 한다. 이름만 보고 
     만약에 클래스에도 변수 이름이 똑같아야 등록이 된다. 그래서 설계서 대로 변수명을 생성하는 것이 중요하다. 
     자동으로 되고 타입도 알아서 맞춰준다.  --%>
     <%-- 멤버변수를 초기화 할때에는 name 값을 보고 자동호출 되기 때문에 이름을 반드시 맞춰줘야 함 
     타입도 알아서 맞춰줌 자동 형변환 처리됨 
     멤버변수를 초기화 안하고 싶었으면 ? 그것을 고려해서 코딩을 해야한다.  자동초기화 --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>코드분리하기</title>
</head>
<body>

<% cb.calculate(); %>


<form method="post">
	<input type="number" name="num1">
	<select name="op">
		<option>+</option>
		<option>-</option>
	</select>
	<input type="number" name="num2">
	<input type="submit" value="결과확인">
</form>

<hr>

계산결과 : <%-- <jsp:getProperty property="result" name="cb"/> --%>
<%= cb.getResult() %>
</body>
</html>