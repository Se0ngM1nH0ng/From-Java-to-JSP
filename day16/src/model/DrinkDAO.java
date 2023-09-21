package model;

import java.util.ArrayList;

// DAO의 CRUD(비즈니스 메서드,핵심 로직)는
// 어떤 추가 요청사항에도 절대!
// "메서드 시그니처"가 변하지않도록 코드를 작성해야함!!!!!

// "메서드 시그니처"가 변경되면 다른 파트에 영향을 줘버림...
// '기능' 변경은 ㄱㅊ

// 결론) "메서드 시그니처"는 설계단계에서 절대로 변경되면 안됨!!!!!!!!!!

public class DrinkDAO {

	private static int PK = 1001;
	private ArrayList<DrinkVO> datas;

	public DrinkDAO() {
		datas = new ArrayList<DrinkVO>();
		datas.add(new DrinkVO(PK++, "콜라", 1200, 3));
		datas.add(new DrinkVO(PK++, "사이다", 900, 2));
		datas.add(new DrinkVO(PK++, "환타", 1500, 1));
	}

	// C
	public boolean insert(DrinkVO vo) { // DrinkVO vo로 인자 통일
		// 앞으로 insert에 호출할 데이터는 vo에 다 넣어놔야한다.
		// 컨트롤러로 이동 -> insert 할때 vo전달
		System.out.println("MODEL(DAO): vo: " + vo); // 로그 보여주기 vo 출력
		datas.add(new DrinkVO(PK++, vo.getName(), vo.getPrice(), vo.getCnt()));
		// vo로 부터 이름받고, vo로 부터 가격받고, vo로 부터 재고받기
		return true;
	}



	// 목록 출력 부분에서 
	// nullpointException 이 뜨는 이유 
	//★★★ java.lang.NullPointerException
	//-> "주어(주체)"가 Null이어서 발생하는 이슈
	//-> 메서드 앞의 주어가 Null이어서 발생하는 이슈
	//-> aaa.bbbbb();에서 aaa가 Null이어서 발생하는 이슈



	//	1. 전체목록 출력 => 그냥 내가가진 멤버변수 datas 반환
	//	2. 검색결과 출력 => 이름을 보고, 그 이름을 가진 애들을 반환	
	// R
	public ArrayList<DrinkVO> selectAll(DrinkVO vo) {
		if (vo.getName() == null) { 
			//지금 주어 vo.뭐시기 에서 vo가 null이라서 NullPointerException 이 뜬것이다.
			//사용자의 name이 검색을 안했어 ? // 만약에 그냥 전체목록출력이었다면 
			return datas; // 그럼 그냥 데이터를 반환해주고 
		}  else {// 이름을 보고
			ArrayList<DrinkVO> datas = new ArrayList<DrinkVO>();
			// 새로운 datas를 만들어서,
			// 검색 결과에 해당하는 애 
			for (DrinkVO data : this.datas) {//이름을 가진 애들을 넣어서 반환
				if (data.getName().contains(vo.getName())) {// 검색이름이 data이름에 존재해 ?
					// equals는 그 정확히 그 단어가 일치해야만 나온다 
					// 그래서 contains를 쓰기 
					datas.add(data);
				}
			}
			return datas;
		}
	}

	// R
	public DrinkVO selectOne(DrinkVO vo) { // PK
		for (DrinkVO data : datas) {
			if (data.getNum() == vo.getNum()) { // 데이터를 받은 pk랑 입력받은 번호랑 일치하면
				DrinkVO dVO = new DrinkVO(data.getNum(), data.getName(), data.getPrice(), data.getCnt());
				// return 자리에 data가 들어가게 되면 ,, 원본이 자료를 받은 그대로 출력 되기때문에
				// 원본 데이터에 손상이 올수도 있다는 에러가 떴다.
				// 그래서 data를 그대로 반환 하는것이 아니라 그것과 똑같은 복사본을 만들어서
				// 그 복사본을 반환 시킨다.

				return dVO;
				// 실제 DB 데이터(==datas)를 전송 xxxxx
				// 새로 vo객체를 new(객체화)해서 전송 O
			}
		}
		System.out.println(" 로그: selectOne(): 해당상품없음");
		return null;
	}


	// 오버로딩이 불가능한 기능 일 경우,
	// 기능이 매우 유사한 것이기 때문에 내부 로직에서 분리하여 관리
	// -> 유사한 기능끼리는 묶어서 관리하는것이 용이하기 때문
	// == 응집도를 높임 -> 유지보수에 용이

	// 인자를 vo로 맞춰서 결합도를 낮추고 기능이 유사한 것을 한데 모아서 응집도를 높임
	// 자바로만 했을 때의 최상급 코드

	// U
	public boolean update(DrinkVO vo) {
		for (DrinkVO data : datas) {
			if (data.getNum() == vo.getNum()) {
				// 구매할때에는 절대값이랑 내 재고랑 비교
				if (vo.getCnt() < 0) { // 구매할때
					int cnt = vo.getCnt() * (-1); // 구매하려는 양
					if (cnt > data.getCnt()) {
						System.out.println(" 로그: update(): 재고없음");
						return false;
					}
				}
				data.setCnt(data.getCnt() + vo.getCnt()); 
				// 보통 재고추가에 맞춰서 + 로 하고
				// 구매를 하면 cnt를 빼주는 걸로 많이 쓴다.
				System.out.println("data: " + data);
				return true;
			}
		}
		System.out.println(" 로그: update(): 해당상품없음");
		return false;
	}


	// D
	public boolean delete(DrinkVO vo) {
		for (int i = 0; i < datas.size(); i++) {
			if (datas.get(i).getNum() == vo.getNum()) {
				datas.remove(i);
				return true;
			}
		}
		System.out.println(" 로그: delete(): 해당상품없음");
		return false;
	}
}
