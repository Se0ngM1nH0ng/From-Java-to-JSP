package class04;

// 클래스
class Book2 {
	// 멤버변수
	String title;
	int price;
	int cnt; // 판매량

	Book2(String title, int price) {
		this.title = title;
		this.price = price;
		this.cnt = 0; // 입력값이 없으면 0으로 세팅
		System.out.println(this.title + " 생성완료!");
	}

	Book2(String title, int price, int cnt) {
		this.title = title;
		this.price = price;
		this.cnt = cnt;
		System.out.println(this.title + " 생성완료!");
	}

	// 메서드
	void printInfo() {
		System.out.println(this.title + " 판매량: " + this.cnt);
		System.out.println(this.title + " 가격: " + this.price);
	}

	void sell() {
		cnt += 10;
		System.out.println(this.title + " 판매완료");
	}
}

public class Test04 {
	public static void main(String[] args) {

		// 객체들
		Book2 b1 = new Book2("어린왕자", 7800); // 선언하지않아도 기본적으로 제공되는 생성자
		Book2 b2 = new Book2("해리포터", 23000); // 기본(디폴트)생성자 : 인자없음
		// 생성자(함수)
		// 1. 클래스와 이름이 같고
		// 2. 객체를 생성할수있으며
		// 3. new 연산자와 함께 사용

		b1.printInfo();
		b2.printInfo();

		// 15~23라인까지 함수는 총 4개
		// 함수 1개
		// 메서드 1개
		// 생성자 2개

		Book2 b3 = new Book2("비전공자를 위한 이해할 수 있는 IT지식", 16800, 100);

		b3.sell();
		b3.printInfo();

	}
}
