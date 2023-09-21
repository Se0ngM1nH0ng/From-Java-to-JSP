package model;

import java.util.ArrayList;


// DAO의 CRUD(비즈니스 메서드 , 핵심로직)는
// 어떤 추가 요청사항에도 절대 !
// " 메서드 시그니처" 가 변하지 않도록 코드를 작성해야함 !
// 내부에 뭔가 바꾸는 행위는 외부에 영향을 주지 않는다.
// 메서드 시그니처를 변경하면 다른 데서 다 바꿔야 하기 때문에 주의 !

//"메서드 시그니처"가 변경되면 다른 파트에 영향을 줘버림 ...
// '기능' 변경은 괜찮다.
//결론 ) "메서드 시그니처"는 설계단계에서 절대로 변경되면 안됨 !!!



public class ProductDAO { // this 다 붙여주기
	private static int PK = 1; // 시스템에서 부여하는 변수이다.
	private ArrayList<ProductVO>datas;
	
	 public ProductDAO(){
		this.datas = new ArrayList<ProductVO>();
	}
	
	 // 모든 인자는 ProductVO vo 로 고정
	 
	// C : 음료를 추가하는 행위 // 이름,가격,수량 추가
	 public boolean insert(String name,int price, int cnt) {
			this.datas.add(new ProductVO(PK++,name,price,cnt));
				return true; // 이건 항상 되겠지
	 }
	 // 이름, 가격, 재고 가 추가돼야해  
	 
	 
	// R : 목록 출력
	 public ArrayList<ProductVO> selectAll() {
		if(전체목록출력) { // vo.getName() == null	 
		 return this.datas;
		}else {
			
			for() {
				if(검색이름이 data이름에 존재해?) { //data.getName().equals(vo.getName())
					datas.add(data);
				}
			}
			
			이름을 보고 ,
			새로운 datas를 만들어서, 
			이름을 가진 애들을 넣어서 반환
		}
			 
			
			 selectAll 로 할수 있는거
			 1. 전체목록출력 => 그냥 내가 가진 멤버변수 datas  반환
			 2. 검색결과 출력 => 이름을 보고, 그 이름을 가진 애들을 반환
			 
			 
			 
		}
	 public ProductVO selectOne(int num) { // 얘는 하나만 받아오는 거라서 PK를 무조건 받아야함
		 for(ProductVO data : datas) {
			 if(data.getNum() == num) {
				 return data;
			 }
		 }
		 System.out.println(" 로그: selectOne(): ");
		 return null;
	 }
	 // 실제 DB 데이터 (==datas)를 전송 xxxx
	 // 새로 vo객체를 new(객체화) 해서 전송 
	 
	 
	// U 구매 : 음료번호와 수량을 입력받고 계산을 하면 재고가 변경
	 // 뷰에서는 재고를 알수가 없기 때문에 //data를 뷰에서 알수 없기 때문에 
	 // 
	 
	 
	 // 상품은 찾았어 
	 구매하는 거니? 구매할 친구 스탑
			 너의 재고가 나보다 많니 ?
					 아닌데 ? 그럼 false
					 
	 public boolean update(int num, int cnt) { // 뭘 받을건지
		 for (int i = 0; i < this.datas.size(); i++) {
			if(this.datas.get(i).getNum() == num) { // 번호가 일치하면
			datas.get(i).setCnt(datas.get(i).getCnt()-cnt); // 마이너스 시킬예정
			
			//set 바꿀거야 수량을 setCnt 다시세팅할거야 ~ =>
			//어떻게 ? 기존 수량에서 구매할 수량을 빼줘! 
			return true;
			}
		}
		 System.out.println(" 로그 : model: ProduuctDAO: update(): 구매할 음료가 없습니다.");
		 return false;
	 }
//	 혹시내가 데이터에 입력한 넘버 값이 내가 선택한 번호랑 같아?
//			 if(혹시 재고 있어?) {
//			 재고를 --;
//			 return true;
//			 }
//	 			syso :재고없음
//	 			return false;
//	 for를 다 돌았는데도 넘버값을 만나지 못했다면 해당하는 상품이 없어서 
//	 false이다 
//	 return false;
//	 
	// D : 음료를 삭제하는 행위
	 
	 public boolean delete(int num) { // 번호를 입력받아야 하니까 // 뭘 받을건지 
		 for(int i = 0; i < this.datas.size(); i++) {
			 if(this.datas.get(i).getNum() == num) {
				 this.datas.remove(i); //제거 할때는 forEach가 불리하다 
				 						//제거 할땐 for문
				 return true;
			 }
		 }
		 System.out.println(" 로그 : model: ProductDAO: delete(): 제거할 음료가 없습니다.");
		 return false;
	 }
	
	
}
