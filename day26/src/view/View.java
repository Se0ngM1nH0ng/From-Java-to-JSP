package view;

import java.util.ArrayList;
import java.util.Scanner;

import model.MemberVO;
import model.ProductVO;

public class View {
	private static Scanner sc=new Scanner(System.in);

	// 어떤기능이 가능한지 보여주기
	public int printMenu() {
		System.out.println("=== 메뉴 ===");
		System.out.println("1. 상품목록출력");
		System.out.println("2. 상품검색"); // 실습(이름,가격으로 검색하기)
		System.out.println("3. 상품구매");
		System.out.println("4. 회원가입");
		System.out.println("5. 로그인");
		System.out.println("6. 로그아웃");
		System.out.println("7. 회원비번변경"); // 실습
		System.out.println("8. 회원탈퇴");
		System.out.println("9. 프로그램 종료");
		System.out.print("입력) ");
		int action=sc.nextInt();
		return action;
	}

	// 상품목록출력
	public void printList(ArrayList<ProductVO> pdatas) {
		System.out.println("=== 목록출력 ===");
		if(pdatas.isEmpty()) {
			System.out.println("출력할 리스트 없음!");
			return;
		}
		for(ProductVO pdata:pdatas) {
			System.out.println(pdata);
		}
	}

	// 상품선택
	public int getNum() {
		System.out.print("상품번호입력) ");
		int num=sc.nextInt();
		return num;
	}
	public void printData(ProductVO pdata) {
		if(pdata==null) {
			System.out.println("출력할 데이터 없음!");
			return;
		}
		System.out.println(pdata);
	}

	public void printTrue() {
		System.out.println("성공!");
	}
	public void printFalse() {
		System.out.println("실패.....");
	}

	// 회원가입
	// 로그인
	public MemberVO signin() {
		System.out.print("아이디입력) ");
		String mid=sc.next();
		System.out.print("비밀번호입력) ");
		String mpw=sc.next();
		MemberVO mVO=new MemberVO(mid,mpw);
		return mVO;
	}

//============================================================
	
	// 마이페이지

	// B. 비번불일치시 , 실패
	// 비번 일치시, 비번 변경가능 ! ----> 이거 구현중 
	//		버튼을 눌러보니까 어? 아니네 ? 이게 아니라
	//				>> 버튼이후에 확인가능
	//				>> DB가 필요
	//				>> 백엔드
	//		버튼을 누르기 전에 이전과 같다면 버튼 자체가 비활성화 된다 .
	//				>> 프론트 

	//		이전 비번과 다른 새로운 비번이 들어와야 나갈수 있다 
	//		컨트롤러나 DB도움 없이 진행 


	// if(새로 입력한 비번이 이전비번과 다를때)

	// 회원비번변경
	public String funcA(MemberVO mVO) { //input으로 사용자 정보가 들어옴
		// A. 현재 로그인한 ____님,
		//    비번입력해보세요!~~ (확인절차)
		System.out.println(mVO.getMid()+"님 비번입력) "); // ___님 사용자 정보 가져오기 
		String mpw=sc.next();
		return mpw; // 비밀번호 반환해주기
	}
	
	public String funcB(String mpw) { // input으로 사용자의 비번이 들어옴 
		// B. 비번불일치시, 실패
		//    비번일치시, 비번변경가능! << funcB() ----> 이거 하는중 
		
		while(true) { // 몇번만에 성공할지 모르므로
			System.out.print("변경할 비번입력) ");
			String newMpw=sc.next();
			if(!newMpw.equals(mpw)) { // 전 비밀번호와 중복된 값이 아닐시 
				return newMpw; // 새로운 비밀번호 반환해줘 
			}
		}
	}
	
//============================================================

	// 이름,가격으로 검색하기
	
	
	// 이름, 가격을 뷰에서 다 같이 하고 넘어가야 한다. 
	// 한 화면에서 다같이 처리 
	// 사용자가 어떤 선택을 할지를 뷰에서 다~~~ 고른다음 한번에 보낸다

	//			내가 한개일수도 있고 몇개일수도 있고 모르기 때문에 
	//			pVO로 반환을 해줘야 한다. 

	public ProductVO funcC() {
		ProductVO pVO=new ProductVO();
		String searchCondition="";

		System.out.println("Q. 이름으로 검색할래요?");
		System.out.print("1.YES  2.NO ) ");
		int num=sc.nextInt();
		if(num==1) { 
			searchCondition+="이름";
			System.out.print("검색할 이름입력) ");
			String name=sc.next();
			pVO.setName(name);
		}

		System.out.println("Q. 가격으로 검색할래요?");
		System.out.print("1.YES  2.NO ) ");
		num=sc.nextInt();
		if(num==1) { 
			searchCondition+="가격";
			System.out.print("검색할 최저가격입력) ");
			int min=sc.nextInt();
			System.out.print("검색할 최고가격입력) ");
			int max=sc.nextInt();
			pVO.setPrice(min);
			pVO.setTmpNum(max);
		}

		if(searchCondition.equals("")) {
			searchCondition+="이름"; // 빈 값으로 보내면 디폴트가 이름이다.
		}
		pVO.setSearchCondition(searchCondition);
		return pVO;
	}





























	// ====================================================








}
