package view;

import java.util.ArrayList;
import java.util.Scanner;

import model.MemberVO;
import model.ProductVO;

// 회원가입C,로그인R,로그아웃R,마이페이지U,회원탈퇴D
// 목록출력,목록검색_이름,목록검색_가격
public class ClientView {
	private static Scanner sc=new Scanner(System.in);

	public int printClientMenu01() { // 로그인 모드 
		// 로그인 하지 않은 사용자는 상품을 구매할 수 없다.
		System.out.println();
		System.out.println("=== 프 로 그 램 모 드 ===");
		System.out.println("1. 회원가입");
		System.out.println("2. 로그인");
		System.out.println("3. 프로그램 종료");
		System.out.print("입력) ");
		return sc.nextInt(); 
	}
	public MemberVO signUp() { // 회원가입할 시에 안내 해줘야 하는것 
		System.out.println();
		System.out.println("=== 회 원 가 입 ===");
		System.out.print("아이디입력) ");
		String mid=sc.next();
		System.out.print("비밀번호입력) ");
		String mpw=sc.next();
		System.out.print("이름입력) ");
		String name=sc.next(); // 아이디 비밀번호 이름 까지 입력해서 
		return new MemberVO(mid,mpw,name); // 그것을 전달 하는것 까지 
		// vo는 단순 자료형이다 ~ view에서 활용가능, DAO는 view에서 호출 안됨 
	}
	public void signUpTrue() {
		System.out.println();
		System.out.println("회원가입 성공!");
	}
	public void signUpFalse() {
		System.out.println();
		System.out.println("회원가입 실패...");
	}
	public String getMpw() { // 비밀번호를 입력 받는다 // 회원탈퇴시 한번더 비밀번호 확인을 위해서
		System.out.println();
		System.out.println("=== 비 밀 번 호 확 인 ===");
		System.out.print("비밀번호입력) ");
		String mpw=sc.next();
		return mpw;
	}
	public String printMpw(MemberVO mVO) { // 입력값을 mVO로 받으면 밑에서 mVO를 사용할 수 있다!
		System.out.println();
		System.out.println("=== 마 이 페 이 지 ===");
		System.out.println(mVO.getName()+"님의 현재 비밀번호는 ["+mVO.getMpw()+"]입니다.");

		while(true) { // 올바른 비밀번호를 입력 할때 까지 
			System.out.print("새 비밀번호입력) ");
			String mpw=sc.next();
			if(!mpw.equals(mVO.getMpw())) { // 전 비밀번호와 일치하지 않을때 !
				return mpw;
			}
		}		
	}
	public void printFalse() {
		System.out.println();
		System.out.println("비밀번호 불일치...");
	}
	public void printMemberDeleteTrue() {
		System.out.println();
		System.out.println("회원탈퇴 성공!");
	}
	public void printMemberDeleteFalse() {
		System.out.println();
		System.out.println("회원탈퇴 실패...");
	}
	public void printMemberUpdateTrue() {
		System.out.println();
		System.out.println("비밀번호 변경 성공!");
	}
	public void printMemberUpdateFalse() {
		System.out.println();
		System.out.println("비밀번호 변경 실패!");
	}

	public MemberVO signIn() {
		System.out.println();
		System.out.println("=== 로 그 인 ===");
		System.out.print("아이디입력) ");
		String mid=sc.next();
		System.out.print("비밀번호입력) ");
		String mpw=sc.next();
		return new MemberVO(mid,mpw,null); // 이름을 가질 필요는 없다 .
	}

	public void signInTrue() {
		System.out.println();
		System.out.println("로그인 성공!");
	}
	
	public void signInFalse() {
		System.out.println();
		System.out.println("로그인 실패...");
	}
	
	public void printClientEnd01() {
		System.out.println();
		System.out.println("=== 프 로 그 램 종 료 ===");
	}
							//vo 타입에 불과하기 때문에 model을 사용한 것이 아니다. DAO를 써야 모델을 쓰는거
	public int printClientMenu02(MemberVO mVO) { // 로그인 하면 들어오는 상태 
		System.out.println();
		System.out.println("=== 사 용 자 모 드 ===");
		System.out.println(" 현재 로그인한 사용자이름 ["+mVO.getName()+"]"); 
		System.out.println("1. 로그아웃(사용자모드 종료)");
		System.out.println("2. 마이페이지");
		System.out.println("3. 회원탈퇴(사용자모드 종료)");
		System.out.println("4. 상품목록출력");
		System.out.println("5. 상품목록검색_이름으로 검색");
		System.out.println("6. 상품목록검색_가격으로 검색");
		System.out.println("7. 상품검색_최고가 검색"); // 하나를 검색
		System.out.println("8. 상품검색_최저가 검색");
		System.out.print("입력) ");
		return sc.nextInt();
	}

	public ProductVO getSearchFilter() { // 최저부터 최고 까지 두개를 입력받음 
		System.out.println();
		System.out.println("=== 가 격 으 로 검 색 ===");
		System.out.print("최저가격입력) ");
		int minPrice = sc.nextInt();
		System.out.print("최고가격입력) ");
		int maxPrice = sc.nextInt();
		// 인자가 두개를 반환하는 행위는 못하기 때문에
		//pVO에 담아서 넘겨준다.
		// 안쓰는 공간을 활용하여 minPrice랑 maxPrice 를 두개 한번에 넘겨준다.		
		ProductVO pVO=new ProductVO(0,"필터검색",minPrice,maxPrice);
		// searchCondition
		return pVO;
	}

	public String getSearchContent() {// 그렇다면 검색어 넣으렴 
		System.out.println();
		System.out.println("=== 이 름 으 로 검 색 ===");
		System.out.print("검색어입력) ");
		String name=sc.next();
		return name;

	}

	public void printProduct(ProductVO pVO) {
		System.out.println();
		if(pVO==null) {
			System.out.println("=== 출 력 할 상 품 없 음 ===");
			return;
		}
		System.out.println("=== 상 품 출 력 ===");
		System.out.println(pVO);
	}

	public void printProductList(ArrayList<ProductVO> pdatas) {//내가 목록을 출력하고 싶은 사람이야  //목록이 있어야 보여줄것 아니냐  목록을 받아야 보여준다.
		System.out.println();
		if(pdatas.isEmpty()) { // 혹시 비어있니 ? // 사용자편의성고려(UI/UX)
			System.out.println("=== 출 력 할 상 품 없 음 ===");
			return;
		}
		System.out.println("=== 상 품 목 록 출 력 ===");
		for(ProductVO data:pdatas) {
			System.out.println(data); // .toString()은 자동호출됩니다!
		}
	}
	public void logout() {
		System.out.println();
		System.out.println("=== 로 그 아 웃 ===");
	}
	public void printClientEnd02() {
		System.out.println();
		System.out.println("=== 사 용 자 모 드 종 료 ===");
	}
}
