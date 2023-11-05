package view;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import model.ProductVO;

public class ProductView {
	private static final int maxMenuNum = 5;
	private static Scanner sc=new Scanner(System.in);


	public void printProduct() { // 음료 목록표 출력
		System.out.println("=== 목록 ===");
		System.out.println("1. 음료추가");
		System.out.println("2. 음료목록출력");
		System.out.println("3. 구매");
		System.out.println("4. 음료 삭제");
		System.out.println("5. 프로그램 종료");
	}

	// 사용자의 입력을 저장
	public int getMenuNum() {
		while(true) {
			System.out.print("입력) ");
			int menuNum=tryCatch();
			if(1<=menuNum && menuNum<=maxMenuNum) {
				return menuNum; // "유효성 검사" == 사용자의 입력값 검사
								// 재고가 있어 ? 없어 이거는 유효성 검사가 없다 // 재고 검사는 DAO
								// 사용자가 입력한 값이 말이 되는지 판단하는게 유효성검사
								// 타입이 올바른지 이런것 판단이 유효성 검사
								// : 사용자의 입력값에 대하여 자료형(타입), 범위 등을 확인하는것 
			}else {
				System.out.println("유효하지 않은 숫자입니다.");
				System.out.println("다시 입력해주세요.");
			}
		}
	}

	// 사용자가 입력한 음료 이름를 저장
	public String getMenuName() {
		System.out.println("음료 이름을 입력해주세요.");
		String name = sc.next();
		sc.nextLine();
		return name;
	}
	// 사용자가 입력한 가격을 저장
	public int getMenuPrice() {
		System.out.println("음료 가격 입력 ) ");
		int price = tryCatch();
		return price;	
	}
		// 사용자가 입력한 재고를 저장
		public int getMenuCnt() {
			System.out.println("음료 재고 입력 ) ");
			int cnt = tryCatch();
			return cnt;
		}



		// 추가완료를 안내해주는 기능
		public void printInfo() {
			System.out.println("음료 정보 등록완료!");
		}
		// 음료 추가 안내 멘트
		public void printInfo_C_Start() {
			System.out.println("음료를 추가합니다.");
		}


		// 음료 추가 성공멘트
		public void printInfo_C_End() {
			System.out.println("음료 추가를 완료했습니다.");
		}

		// 음료목록출력 
		public void printMenuList(ArrayList<ProductVO> datas) {
			if(datas.size() < 1) {
				System.out.println("목록이 없습니다 !");
				return;
			}
			System.out.println("=== 음료 목록출력 ===");
			for(ProductVO v : datas) {
				System.out.println(v);
			}
		}


		// 구매 안내멘트
		public void printInfo_U_Start() {
			System.out.println("구매 페이지로 이동합니다.");
			return;

		}

		// 음료 번호 입력
		public int getProductNum () {
			System.out.println("음료 번호를 입력해주세요 !");
			int num = tryCatch();
			return num;
		}
		// 구매 수량 입력 
		public int sellCnt() {
			System.out.println("구매할 수량을 입력해주세요.");
			int cnt = tryCatch();
			return cnt;

		}


		// 구매 성공 멘트
		public void printInfo_U_End() {
			System.out.println("구매 성공 !");
		}

		// 음료삭제 안내 멘트
		public void printInfo_D_Start() {
			System.out.println("음료삭제 페이지로 이동합니다.");
			return;

		}

		// 음료 번호 입력

		// 음료 삭제 완료 멘트
		public void printInfo_D_End() {
			System.out.println("음료삭제 성공 !");
		}

		// 프로그램 종료 멘트
		public void printInfo_Program_End() {
			System.out.println("프로그램을 종료 합니다...");
		}

		public void printFalse() {
			System.out.println("서비스 실패 !");
		}

		public void printReturn() {
			System.out.println("다시 메뉴로 돌아갑니다.");
		}

		public static int tryCatch() { // 번호 선택 trycatch 메서드
			while (true) {
				try {
					int action = sc.nextInt();
					sc.nextLine();
					return action;
				} catch (InputMismatchException e) {
					System.out.println("숫자만 입력해주세요 !");
					sc.nextLine();
				}
			}
		}








	}
