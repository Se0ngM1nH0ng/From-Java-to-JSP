package class04;

import java.util.Scanner;

// JAVA 의 기본단위 == class

//임의로 만든 클래스 , 파일로 만든 클래스는 public이 붙지만 내가 임의로 만든 class는 붙일수 없다.



// 질문은 이런식 : '학생' 코딩해줘
// 학생이라는 기본단위를 만들어야 해서 class를 만듬
class Student{//  클래스는 대문자로 , 모든 클래스 대문자
	String name;
	int score;
	
	// 1 .상태 : 멤버변수 , 필드, 속성 ex) 피카츄 레벨 
	// 학생이 인사 할수 있지
	
	// static == "객체와 무관하게"
	// 지금 이것은 객체와 관련이 있기때문에 안붙는다 
	void hello() {
		System.out.println("안녕, 난 " + name + "야.");
	} //메소드안에 내가 name을 선언하지 않았는데 
	 //같은 객체 내 같은 속성값이라 name을 쓸수 있다.
	// 메소드는 함수에게 주어(주체)가 생긴것 !
	
	// 2. 동작(기능) : 메서드 , 멤버함수  ex) 백만볼트, 도망치기  
}

public class Test01 {

	public static void main(String[] args) {

//		hello(); // 내가 피카츄를 안갖고 있기 때문에 백만볼트를 못쓴다
				// 내가 차가 없어서 액셀을 못밟는다.
		
		int num = 10;
		double d = 3.14;
		Scanner sc = new Scanner(System.in);
		String str = new String ("apple");
		String a = "apple";
		String b = "banana";
		String c = "kiwi";
		
		// ex) 베이가가 우리팀 베이가도 있고 상대팀 베이가도 있다.
		
		
		//얘네가 다 다른애들인지 검증이 필요하다
		Student student1 = new Student(); //<- 주체를 만들어줬다
		Student student2 = new Student();
		//클래스로 부터 객체를 생성할때에는 -> 붕어빵을 구우려고 붕어빵틀을 준비할때면				
		//클래스    객체 = new 생성자();
		//new 생성자()가 반드시 필요하며
		// 객체화 (인스턴스화)
		
		Student student3 = new Student();
		// 클래스는 자료형, 붕어빵틀(10개 먹고 싶은 사람은 빵틀을 하나 사서 10번찍는다.)의 역할 
		// 객체는 변수, 붕어빵의 역할 
		// 
		
		
		// new를 사용하고 있어서 heap메모리 영역에 만들어 졌고 
		// 그것에 주소를 사용하고 있는 상황 
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
		
		
		// . 멤버접근 연산자
		student1.name = "아무무";
		student1.score = 97;
		student2.name = "티모";
		student2.score = 13;
		student3.name = "아리";
		student3.score = 56;
		
		
		
		
		
		
		
		
	}

}
