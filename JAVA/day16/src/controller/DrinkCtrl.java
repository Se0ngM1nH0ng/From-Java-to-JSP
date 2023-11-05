package ctrl;

import java.util.ArrayList;

import model.DrinkDAO;
import model.DrinkVO;
import view.DrinkView;

public class DrinkCtrl {
	private DrinkView view;
	private DrinkDAO dao;
	public DrinkCtrl() {
		view=new DrinkView();
		dao=new DrinkDAO();
	}

	public void startApp() {
		while(true) {// while문으로 한번 더 감쌌다. 
			// 장바구니가 종료되기 전까지 절대로 끝나지 않는 루프 

			System.out.println(" 로그: 사용자가 새로 입장합니다."); 
			// 장바구니를 설명하기 위해 고객이 접속한다는 뜻
			// 로그
			//  : 확인을 위한 것
			//  : 실제 서비스에서는 출력 xxx
			ArrayList<DrinkVO> cart=new ArrayList<DrinkVO>(); 
			// 카트라는 공간을 하나 새로 만든다.
			// 사용자가 새로 입장하면 장바구니가 초기화 돼야된다
			// 장바구니의 타입은 ArrayList 
			// 장바구니 장바구니 = 초기화;


			while(true) {
				int action=view.printMenu();

				if(action==1) { // 음료추가
					String name=view.getDrinkName(); // 이름을 입력받고
					int price=view.getDrinkPrice(); // 가격도 입력받고
					int cnt=view.getDrinkCnt(); // 수량도 입력받고
					DrinkVO vo=new DrinkVO(0,name,price,cnt); 
					// vo는 살짝 만들어서 쓰고 그다음에 쓰지 않는 친구 
					// pk는 지금 몰라서 그냥 0으로 설정
					// 요렇게 선언 해주고 사용하기 // 인자 4개
					// 전달하지않아도되는 값들은 0,null 등으로 설정

					System.out.println("CTRL: vo: "+vo); // vo 로그 생성
					// DAO의 CRUD에게 전달해야하는 값만 설정

					if(dao.insert(vo)) { // DrinkVO의 vo라는 값에 추가해줘  
						view.printTrue(); // true면 성공
					}
					else { 
						view.printFalse(); // false면 실패
					}
				}
				else if(action==2) { //음료 목록 출력 
					ArrayList<DrinkVO> datas=dao.selectAll(new DrinkVO(0,null,0,0)); 
					// 목록에 반환되는 값은 없지만 null을 넣으면 에러가 뜨므로 
					// 필요한 값은 없지만 초기화 해주기 
					//전체 목록을 불러올건데 
					// 인자가 vo인데 로직에서 vo를 사용하지 않아서 
					// selectAll(vo 이지만 사용하는 게 없기 때문에)
					// selectAll(null) null 값을 넣어준다.
					// 초기값 pk =0, 이름 = null, 가격 = 0, 수량 =0 ;
					view.printDrinkList(datas); // 저장된 데이터들을 forEach문으로 다 불러와줘 
				}
				else if(action==3) { // 구매하기
					int num=view.getDrinkNum(); // 음료 번호 입력 받기
					int cnt=1; // 수량은 1로 정해놨다.
					DrinkVO vo=new DrinkVO(num,null,0,-cnt);  
					// 전달하고자 하는 값만 넣어주면 된다.
					// 보통 구매에서 수량을 구입하면 재고에서 빼줘야 하기 때문에
					// -cnt라고 표현해준다 
					// 입력하면 구입할 시에 cnt를 빼줄수 있게

					if(dao.update(vo)) {
						// 구매에 성공했을때에만 장바구니에 해당 상품을 추가
						// 구매에 성공 했다~~ 그러면 
						DrinkVO data=dao.selectOne(vo); 
						//모델에게 PK,name,price좀 줄래 ? 한데 묶은 data좀 줄래?
						// data 하나 니까 selectOne
						// 이때 selectOne 해서 나온 데이터는 자판기에 들어있는 재고가 저장이 되어있기 때문에
						// data의 재고는 내가 원하던 재고로 맞춰줘야함 


						// data에 정보를 담아서 하나 가져와 //복사본을 가져왔다.
						// 근데 복사본도 원본과 동일하므로 받아온 데이터를 그대로 출력한것 
						// 목록엔 콜라가 5개 있는데 
						// 나는 내가 구입한 1개의 콜라만 보여줘야 하므로 
						// 내가 가진 콜라 1개 짜리로 data를 다시 설정한다.
						// data의 수량
						data.setCnt(cnt); 
						// ★ PK,name,price는 자판기에 저장된 상품 정보로 가능하지만,
						// ★ cnt는 사용자가 입력했던 정보로 변경해야함! 


						// 커스터마이징 할일이 없기때문에 flag 알고리즘을 사용 
						boolean flag=false; // 카트에 그게 있었는지 없었는지~
						int index=0; // 인덱스 번호 변수 선언 
						for(int i=0;i<cart.size();i++) { //장바구니의 크기만큼
							if(data.equals(cart.get(i))) { // 사용자가 선택한 제품이랑 카트 제품이 동일해?
								//데이터 인덱스 번호 자리랑 카트에 고른 인덱스 번호랑 같은 상품일때
								//연산자가 안되서 오버라이딩
								index=i;  //인덱스 위치를 기억 시켜놓으면 바로 추가하면 되니까
								// 인덱스 번호는 몇번인지 //인덱스 번호 표시
								flag=true; // true일때 작동 // 조건이 맞을때 작동
							}
						}
						if(flag) {
							// true 일때 이것도 true가 되면서 
							// 인덱스번호자리의 수량들을 다시 설정 
							// 같은 품목이니까 1-> 2로 수량이 쌓임 
							// 카트의 인덱스 번호 자리의 수량을 다시 설정
							// 기존거 에서 + 수량을 추가 
							cart.get(index).setCnt(cart.get(index).getCnt()+cnt);
							// 기존 수량에 추가한 수량을 더함 
						}
						else {
							// 혹시 cart에 없던 제품이었니 ? 그러면 add
							cart.add(data); // 데이터에 담길거 : PK,name,price,cnt 알아야한다
							// 근데 ! 기존 데이터에서 PK,name,price는 알아낼수 있는데
							// cnt는 input 값에서 얻어낼수 있다.
							// 장바구니.add(무엇을 샀는지 기입 : 내가 구매한 상품 넣기);
							// 장바구니에는 담지만 내가 담은 항목이 서로 연관없는 다른 상품이라면 
							// 재고가 중첩되지않고 물건 1개, 물건 1개 이렇게 쌓임
							// 단 , 내가 커스터마이징 할수 있는 제품은 1개, 1개 이렇게 쌓임
							//ex)아메리카노 시럽없이, 아메리카노 얼음많이 등등 
							// 내가 구매한 상품을 차곡차곡 
						}

						view.printDrinkList(cart); // 장바구니에 추가된 항목 보기 
						view.printTrue();
					}
					else {
						view.printFalse();
					}
				}
				else if(action==4) { // 음료 삭제
					int num=view.getDrinkNum();
					DrinkVO vo=new DrinkVO(num,null,0,0);
					if(dao.delete(vo)) {
						view.printTrue();
					}
					else {
						view.printFalse();
					}
				}
				else if(action==5) { // 재고 추가
					int num=view.getDrinkNum();
					int cnt=view.getDrinkCnt();// 재고추가는 입력한 만큼 더하는것
					DrinkVO vo=new DrinkVO(num,null,0,cnt); //누구를 얼마만큼 추가할래 ?
					if(dao.update(vo)) {
						view.printTrue();
					}
					else {
						view.printFalse();
					}
				}
				else if(action==6) { // 음료 검색
					String name=view.getDrinkName(); // 너 뭐 검색할래 ? 이름받기
					// 그다음 출력하기 
					ArrayList<DrinkVO> datas=dao.selectAll(new DrinkVO(0,name,0,0));
					view.printDrinkList(datas);
				}
				else if(action==7) { // 프로그램 종료
					view.printEnd();
					break;
				}
			}
			System.out.println(" 로그: 사용자가 종료했습니다.");
			cart.clear();
		}
	}
}
