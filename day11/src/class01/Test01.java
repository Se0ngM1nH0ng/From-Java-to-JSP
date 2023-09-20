package class01;

class Student{
	private String name; // 나만 건드릴거야 private  // 접근 제어자
	private int score;  // 외부에서 다이렉트 접근이 불가능해진다.
	
	Student(String name, int score){
		this.name = name;
		this.score = score;
		System.out.println(this.name + "학생 생성완료!");
	}
	
	@Override // 프로그램에 영향을 주는 주석
	public String toString() {
		return this.name + "학생은 " + this.score + "점입니다. ";//화면에 뭐가 출력될지 여기다가 작성
	}
	
	// private된 멤버변수에 접근 가능하도록 하는 "메서드"를 추가로 생성 
	// private일때 변경하는 방법
	// setter : 멤버변수에 값을 설정해줌
	void setName(String name) {
		this.name = name ;
	}
	void setScore(int score) {
		this.score = score ;
	}
	
	// getter : 멤버변수에 값을 받아올수 있도록 설정해줌
	String getName() {
		return this.name;
	}
	int getScore() {
		return score;
	}
}


public class Test01 {

	public static void main(String[] args) {
		Student s1 = new Student("아리", 89);
//		s1.name = "홍"; // 대입연산자(단순 연산자) 는 로그에 안남는다 .
		s1.setScore(95); // '로그'에 기록됨
		System.out.println(s1);
		
		// [로그] ★★★★★★
		// 일종의 히스토리 보드 // 기록 게시판 
		// 하나의 코드를 여러 개발자가 작업하게 되는데 
		// 하나의 코드로 여러 개발자들이 동시에 작업 하게 되는데 
		// : 프로젝트 완성시 기여도 측정 
		// 어떤사람이 어떤 코드를 건드렸는지에 대한 기록이 필요하다.
		// 오류 발생시 어떤 액션 + 어떤 기능에서 발생했는지 기록 
		// => 메서드 위주로 기록됨
		// => 단순 연산자는 할수 있지만 보통 안한다 xxxx
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
