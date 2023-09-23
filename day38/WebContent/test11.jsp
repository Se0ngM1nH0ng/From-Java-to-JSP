<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="model.ProductVO,java.util.ArrayList" %>

	
    <%
    ArrayList<ProductVO> pdatas = new ArrayList<ProductVO>();
    pdatas.add(new ProductVO(1,"티셔츠",1000));
    pdatas.add(new ProductVO(2,"목도리",1000));
    pdatas.add(new ProductVO(3,"청바지",1000));
    pdatas.add(new ProductVO(4,"운동화",1000));
    pdatas.add(new ProductVO(5,"가방",1000));
    
   
    //★★★★★★★★★★★★★★★★★★★★★
    // 장바구니 , 로그인 유지여부, 광고 띄우지 않기 설정 등 
    // 서버가 변경되어도 ' 브라우저가 유지되고 있었ㄷ다면 설정이 유지되어야 하는 상태'에 있는 데이터들을 
    // "세션(session)"으로 관리 !!!! 세션에 배울 예정 <내장 객체>
    // 일정시간이 흐르면 연결이 해제됨 
    // 은행어플에 로그인 연장 하실래요 ? 이것도 세션을 쓴다 
    // 다른 브라우저 이면 세션이 없다 브라우저 끼리는 값을 공유 하지 않는다 
    // 같은 브라우저에서 두 창 이면 세션이 유지 
    // ★★★★★★★★★★
    
    
    request.setCharacterEncoding("UTF-8"); // 현재 한글 데이터로 전송중이라 -> 인코딩 필수 (1) 
    // 장바구니는 세션에 있어야 하는 datas이다 
    //ArrayList<String> datas = //(ArrayList<String>)session.getAttribute("datas");
    // 세션 내장객체야 너가 가지고 있는 들고있는 것중에 장바구니를 좀 줘라 
    
    ProductVO v = null;
    ArrayList<ProductVO> datas = (ArrayList<ProductVO>)session.getAttribute("datas");
    String product=request.getParameter("product"); //  사용자가 product라는 이름의 파라미터를 전송할 예정 (2)
 	if(datas==null){ // 혹시 (datas가 없니?)//꺼내왓는데 없대..즉 , 첫번째 상품이니 >?
 		datas=new ArrayList<ProductVO>();	// 그러면 ArrayList ( 임포트 도 꼭 ) 
 		session.setAttribute("datas", datas);
 	}
   	
    for(int i=0; i<datas.size();i++){
    	 if(datas.get(i).getName().equals(product)){
			v=datas.get(i);
			break;
    	}
    }
    
    boolean flag= false;
    
    for(int i=0; i<datas.size();i++){
    	if(product.equals(datas.get(i).getName())){
    		flag=true;%>
    		<script type="text/javascript">
    		alert('<%=product%>이(가) 이미 장바구니에 있습니다....!');
    		history.go(-1);
    	</script>
    	<% 
    	}
    }
    
    if(!flag){%>
    	<script type="text/javascript">
    	alert('<%=product%>이(가) 장바구니에 추가되었습니다! :D');
    	history.go(-1);
    </script>
    	<% datas.add(v);
    	
    }
    %>
    
    
    
    // 세션을 처음 불러 올 때는 세션에 셋 어트리뷰트를 해준다. 
    
    
    
    // 사용자 물품 물건 받아오기 
    // datas를 선언 한적이 없어서 선언 
    // 
    // 혹시 (datas가 없니?){
    // 	즉 , 첫번째 상품이니 >?
    // 	그러면 ArrayList ( 임포트 도 꼭 ) 
    //}
    //물품 추가해 
    // String product=request.getParameter("product");
 	// if(datas==null){
 	// 	datas=new ArrayList<String>();
 	// 	session.setAttribute("datas", datas);
 	// }
	// datas.add(product);

    
    
    		
    		
    
    
    // 전달 받은 상품을 "장바구니"에 추가 
    // 현재 한글 데이터로 전송중이라 -> 인코딩 필수 
    
    // 장바구니를 맨처음 만드는 경우에ㅇ는 새로 new 
    // 기존 장바구니가 있는 경우에는 .add() 할 예정
    
    
    
    
    // 추가완료 되면 다시 test10으로 이동 할 예정
    
    
    
    
    <!--  입력창 띄우는건 스크립트 -->

    
    
    
    
    
    
    
    
    
    
    