package controller;

import java.util.ArrayList;

import model.ProductDAO;
import model.ProductVO;
import view.ProductView;

public class ProductCtrl { // this 다 붙여줘야함

	private ProductView view;
	private ProductDAO dao;

	public ProductCtrl() {
		this.view = new ProductView();
		this.dao = new ProductDAO();
	}

	// DAO 의 CRUD에게 전달해야하는 값만 설정
	// 전달하지 않아도되는 값들을 0,null 설정

	public void startApp() {
		while (true) { // 프로그램 종료를 누르기 전까지는 안끝낼것이다.

			System.out.println(" 로그: 사용자가 새로 입장합니다.");
			//장바구니를 위해 사용자개념을 추가하였다.
			// 사용자가 새로 입장하면 장바구니도 같이 생긴다.
			// 로그는 : 확인을 위한것 
			// 실제 서비스에서는 출력 xxx
			ArrayList<ProductVO> cart = new Product();


			//장바구니 장바구니 = 초기화;
			음료 여러개 구매할때 
			ArrayList

			//			(한글코딩)
			// 사용자에게 메뉴화면을 보여주어야함
			// 메뉴화면을 본 사용자는 console에 사용할 메뉴를 입력
			int action = view.printMenu();

			// C는V에게 입력값을 받아서, 
			// 어떤 M(기능)을 수행해야 하는지 연결해줄 예정
			
			if(action == 1) {// 만약에 음료추가를 사용자가 선택했다면
				
				//dao의 인서트에 이름 ,가격 ,수량 을 받으려면
				// 미리 만들어져 있었어야 한다
				String name = view.getMenuName();
				int price = view.getMenuPrice();
				int cnt = view.getMenuCnt();
				
				//c는 m한테 음료추가를 부탁할 예정
				//m 은 음료추가 (c, insert())를 하기위해 -
				//-음료의 이름, 음료의 가격, 음료의 재고를 필요로함 
				if(dao.insert(name, price, cnt)) {// 이게 만들어 질려면
					 //true 
				}else {
					//false
				}
				
				
				//c는 이런m의 상황을 알고, 
				//v한테 부탁합니다.
				//v는 이름, 가격 , 재고를 순서대로 사용자에게 입력 받아옴
				//입력값 v->c 넘겨줌 
				//c는 입력값을 m한테 넘겨줌
			}else if(action ==2) {
				// 만약에 음료목록출력을 선택했다면, c가 m한테 R(selectAll())을 요청함
				//m은 selectAll()을 수행하고 , 그 결과값(반환값,리턴값,output)을 c한테 줌 
				//c는 결과값을 v한테 전달
				//v는 console화면에 출력
			}
			else if(action ==3) {
				//만약에 구매를 선택했다면 , 
				//v는 사용자한테 뭐살래 ? 물어봄
				//사용자는 console에 번호 입력
				//v는 받은 번호를 c한테 줌 
				//c는 m한테  U(update())를 요청
				//이때 , 받은 번호를 m한테 전달함 
				//m은 UPDATE 수행결과를 T or F 로 c에게 반환해줌 // 만약 번호가 올바랐어도 재고가 없는것도 F다
				//C는 수행 결과를 아니까 ,
				//수행결과에 맞는 화면을 V에게 요청함 
			}
			else if(action ==4) {
				//만약에 삭제를 선택했다면, 
				//v는 사용자한테 뭐삭제할래 ? 물어봄 
				//사용자는 console에 번호 입력
				//v는 받은 번호를 c한테 줌 
				//c는 m한테 d(delete())를 요청
				//이때, 받은 번호를 m한테 전달함
				//m은 d 수행결과를 t or f 로 c에게 반환해줌 
				//c는 수행결과를 아니까 
				//수행결과 맞는 화면을 V에게 요청함
			}
			else if(action ==5) { // 종료조건이라면
				//프로그램 종료
					view.printFalse();
			}


			// 만약에 음료추가를 사용자가 선택했다면,
			//c는 m한테 음료추가를 부탁할 예정
			//m 은 음료추가 (c, insert())를 하기위해 -
			//-음료의 이름, 음료의 가격, 음료의 재고를 필요로함 
			//c는 이런m의 상황을 알고, 
			//v한테 부탁합니다.
			//v는 이름, 가격 , 재고를 순서대로 사용자에게 입력 받아옴
			//입력값 v->c 넘겨줌 
			//c는 입력값을 m한테 넘겨줌 



			// 만약에 음료목록출력을 선택했다면, c가 m한테 R(selectAll())을 요청함
			//m은 selectAll()을 수행하고 , 그 결과값(반환값,리턴값,output)을 c한테 줌 
			//c는 결과값을 v한테 전달
			//v는 console화면에 출력



			//만약에 구매를 선택했다면 , 
			//v는 사용자한테 뭐살래 ? 물어봄
			//사용자는 console에 번호 입력
			//v는 받은 번호를 c한테 줌 
			//c는 m한테  U(update())를 요청
			//이때 , 받은 번호를 m한테 전달함 
			//m은 UPDATE 수행결과를 T or F 로 c에게 반환해줌 // 만약 번호가 올바랐어도 재고가 없는것도 F다
			//C는 수행 결과를 아니까 ,
			//수행결과에 맞는 화면을 V에게 요청함 



			//만약에 삭제를 선택했다면, 
			//v는 사용자한테 뭐삭제할래 ? 물어봄 
			//사용자는 console에 번호 입력
			//v는 받은 번호를 c한테 줌 
			//c는 m한테 d(delete())를 요청
			//이때, 받은 번호를 m한테 전달함
			//m은 d 수행결과를 t or f 로 c에게 반환해줌 
			//c는 수행결과를 아니까 
			//수행결과 맞는 화면을 V에게 요청함
			//				         
			//프로그램 종료
			if(종료조건이라면) {
				view.printFalse();
			}






			// 사용자에게 메뉴보여줘
			view.printProduct();
			// 사용자가 뭐할지 입력받아봐
			int menuNum = view.getMenuNum();

			// 음료추가해줘
			if (menuNum == 1) {
				view.printInfo_C_Start(); // 음료 안내 멘트
				String name = view.getMenuName(); 
				// 이름 입력받기 //view ->con 입력값넘겨주기
				int price = view.getMenuPrice(); 
				// 가격 받아오기//view ->con 입력값넘겨주기
				int cnt = view.getMenuCnt(); 
				// 수량 입력받기//view ->con 입력값넘겨주기
				if (dao.insert(name, price, cnt)) { 
					// 입력한 값들 추가하기 //con -> model한테 다시 넘겨줌
					view.printInfo(); // true일때 이 값 출력
				} else {
					view.printFalse(); // false 일때 이 값 출력
				}
				view.printReturn(); // 처음으로 돌아갑니다 안내멘트
			} else if (menuNum == 2) {
				// 음료 목록 출력해줘
				ArrayList<ProductVO> datas = dao.selectAll(); 
				//selectAll하면 결과값이 arraylist로 나옴 
				// 배열 전체를 출력 해주세요 
				view.printMenuList(datas); // 다시 뷰한테 전달 

			} else if (menuNum == 3) {
				// 음료 구매해줘
				view.printInfo_U_Start();
				ArrayList<ProductVO> datas = dao.selectAll(); // 배열 전체 출력
				view.printMenuList(datas);
				int num = view.getProductNum(); 
				// 입력한 음료번호 저장 // 뷰는 몇번 살래 ?
				int cnt = view.sellCnt(); 
				// 입력한 수량 저장 // 몇개 살래 ?
				if (dao.update(num, cnt)) { // 구매한 만큼 빼기
					// 구매에 성공했을때에만 장바구니에 해당 상품 을 추가
					// 장바구니.add(내가 구매한 상품);
					ProductVO data = dao.selectOne(vo);
					data.setCnt(cnt); // pk,name,price 는 자판기에 저장된 상품정보로 가능하지만,
					// cnt는 사용자가 입력했던 정보로 변경해야함 !
					cart.add(data); // pk,name,price,cnt // 장바구니.add(내가 구매한 상품);
					view.printInfo_U_End();
				} else {
					view.printFalse();
				}
				view.printReturn();

			} else if (menuNum == 4) {
				// 음료 삭제해줘
				view.printInfo_D_Start(); // 음료 삭제 버튼 안내멘트
				ArrayList<ProductVO> datas = dao.selectAll();
				view.printMenuList(datas);
				int num = view.getProductNum(); // 음료 번호받기
				if (dao.delete(num)) {
					view.printInfo_D_End();
				} else {
					view.printFalse();
				}
				view.printReturn();

			} else if (menuNum == 5) {
				// 프로그램 종료해줘
				view.printInfo_Program_End();
				break;
			}

		}
		cart.clear();
	}
}