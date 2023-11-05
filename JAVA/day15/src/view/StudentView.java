package view;

import java.util.ArrayList;
import java.util.Scanner;

import model.StudentVO;

//MVC중에서 V를 담당하는 클래스로,
// main()을 동작시키는것이 목표가 아님!

public class StudentView {
	// view : 사용자가 어떤 기능을 사용할지 예상하고 만들어야 함
	// 사용자랑만 생각하는거 , 소통하는거 


	// final : 상수화
	// 멤버변수에 초기화 할수 있는건 static밖에,, 객체와 무관하게
	// 멤버변수라서 private 까지
	private static final int maxMenuNum = 6;
	private static Scanner sc=new Scanner(System.in);

	//높은 응집도를 가진 코드를 구현하기 위함 !

	// 메뉴를 안내해주는 기능 // 입력받는것도 없고 주는것도 없다
	// 1. 학생목록출력
	// 2. 학생검색
	// 3. 학생정보변경
	// 메서드를 만드는 자리 

	public void printMenu() { // 사용자 메뉴 프린트 받을거야 
		System.out.println("=== 학생부 프로그램 ===");
		System.out.println("1. 목록출력");
		System.out.println("2. 학생검색");
		System.out.println("3. 정보변경");
		System.out.println("4. 학생추가");
		System.out.println("5. 학생삭제");
		System.out.println("6. 프로그램 종료");
	}

	// 나 이중에서 학생목록 할래 , 나 학생검색 할래 
	// 사용자의 입력을 저장하는 기능 
	public int getMenuNum() {
		while(true) {
			try {
				System.out.print("입력) ");
				int menuNum=sc.nextInt();

				if(1<=menuNum && menuNum<=maxMenuNum) {
					return menuNum;
				}
			}
			catch(Exception e) {
				sc.nextLine();
				System.out.println("정수로 입력해주세요!");
			}         
		}      
	}



	// 학생 목록을 출력하는 기능
	//	public void printStudentList() { // ArrayList<학생> datas 학생목록을 줘
	//		for(학생 v : datas) { // 학생 목록을 주면 내가 만들게
	//			System.out.println(v);
	//		}
	//	}
	// 학생
	//public void printStudentList(ArrayList<학생> datas) {
	public void printStudentList(ArrayList<StudentVO> datas) {

		System.out.println("===학생 목록 출력===");
		for(StudentVO v:datas) {
			System.out.println(v);
		}
	}




	// 검색한 학생의 정보를 출력하는 기능
	//public void printStudent(학생 data) {
	public void printStudent(StudentVO data) {
		System.out.println("===학생 출력===");
		System.out.println(data);
	}




	// 사용자가 입력한 번호를 저장하는 기능
	public int getStudentNum() {
		System.out.print("학생번호입력) ");
		int num=sc.nextInt();
		return num;
	}

	// 사용자가 입력한 점수를 저장하는 기능 
	public int getStudentScore() {
		System.out.print("학생점수입력) ");
		int score=sc.nextInt();
		return score;
	}

	// 변경완료를 안내해주는 기능
	public void printInfo() {
		System.out.println("학생정보변경완료!");
	}
 


	// 학생추가시 안내멘트
	public void printInfo_C_Start() {
		System.out.println("학생추가를 시작합니다.");
	}

	// 이름 입력받기
	public String getStudentName() {
		System.out.print("이름입력) ");
		String name=sc.next();
		return name;
	}

	// 학생추가완료를 안내해주는 기능
	public void printInfo_C_End() {
		System.out.println("학생추가완료!");
	}

	// 학생삭제시 안내멘트
	public void printInfo_D_Start() {
		System.out.println("학생삭제를 시작합니다.");
	}

	// 학생삭제완료를 안내해주는 기능
	public void printInfo_D_End() {
		System.out.println("학생삭제완료!");
	}

	// 프로그램 종료 안내해주는 기능
	public void printEnd() {
		System.out.println("프로그램 종료 .....");
	}

	public void printFalse() {
		System.out.println("서비스 수행 실패...");
	}
	



}
