<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="model.ProductVO,java.util.ArrayList" %>
<jsp:useBean id="pDAO" class="model.ProductDAO" />
<jsp:useBean id="pVO" class="model.ProductVO" />
<jsp:setProperty property="*" name="pVO" />
<%	
	// pVO의 모든 setter를 호출하겠다.
    //setter에 넣을 값을 request.getParameter()에서 자동으로 매핑해주겠다! 형변환까지 서비스~ ><


	// 사용자에게 상품이란 정보를 받아서 (pk 받는게 더 좋음)
	// 상품이 있는지 없는지 비교 해주고 
	// 장바구니가 비어있으면 ?
	// 새로 만들면 돼 .		
	
	// 그걸 장바구니에 추가해줘 
	// 그 다음 다시 a로 돌아 갈 수 있도록 해줘 
	
	//int num = Integer.parseInt(request.getParameter("num")); // 얘는 PK만 들고 있음
	// PK만 들고왔으니 이름이랑 가격도 있는 정보 자체 객체를 들고 와야함 
	// 그러면 어떻게 가져올건데 ?
	
	//ProductVO pVO = new ProductVO();
	//pVO.setNum(num); // PK를 받아서 넘버를 넘겨서
	// ProductDAO pDAO = new ProductDAO();


	ProductVO data = pDAO.selectOne( pVO ); // pk를 비교해서 이름 가격 있는 객체를 가져옴 
	// data라는 이름으로 다시 선언 하는게 새로 선언 방법  
	
	
	//pVO 는 다시 안쓰이니까 ProductVO pVO = pDAO.selectOne( pVO );
	// 새로운 pVO에 다시 담는게 재활용 하는 방법 // 이게 유리하긴함 
	
	ArrayList<ProductVO> cart=(ArrayList<ProductVO>)session.getAttribute("cart");
	
	if(cart == null){
		cart=new ArrayList<ProductVO>();
		session.setAttribute("cart", cart);
	}
	
	cart.add(data); // 그걸 장바구니에 추가 
%>
<script>
	alert('<%=data.getName()%>이(가) 장바구니에 추가되었습니다! :D');
	location.href='a.jsp';
</script>