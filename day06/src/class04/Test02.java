package class04;

//클래스
class Book {
// 멤버변수
	String title;
	int price;

	Book(String t,int p){
	      title=t;
	      price=p;
	      System.out.println(title+" 생성완료!");
	   }
	
// 메서드
	void printInfo() {
		System.out.println(title + "은(는) " + price + "원입니다.");
	}
}

public class Test02 {
	public static void main(String[] args) {

		// 객체들
		// 함수는 선언을 해야만 사용해야되는데
				// 선언을 안했는데도 쓸수 있는 생성자가 있다.
				// 기본 생성자
		Book b1 = new Book(); // 선언하지않아도 기본적으로 제공되는 생성자
		Book b2 = new Book(); // 기본(디폴트)생성자 : 인자없음
		// 생성자(함수)
		// 1. 클래스와 이름이 같고
		// 2. 객체를 생성할수있으며
		// 3. new 연산자와 함께 사용

		// 올바르게 출력하고 싶다면?
		b1.title = "어린왕자";
		b1.price = 7800;
		b1.printInfo();

		// 15~23라인까지 함수는 총 4개
		// 함수 1개
		// 메서드 1개
		// 생성자 2개

	}

}
