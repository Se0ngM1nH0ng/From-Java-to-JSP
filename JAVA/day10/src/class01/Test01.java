package class01;

// [상속 - 심화]
class Poketmon2{
	String name;
	Poketmon2(){
		this("포켓몬");
	}
	Poketmon2(String name){
		this.name = name;
	}
	void printInfo() {
		System.out.println("이 포켓몬은 " +  this.name + "입니다.");
	}
	// 최상위 클래스 Object 로부터 상속받은 메서드인 equals()를 
	// 살짝 바꿔서 내입맛에 맞춰서 사용하고 싶음!
	// -> 오버라이딩 (하려면 메서드 시그니처가 같아야 함 )
	// -> 메서드 재정의 -> 메서드 시그니처
	
	//예)
//	  void func(double d) { // int 10이 인자로 설정됨
//	      d=10.0;
//	      int i=(int)d; // 형변환(캐스팅)
//	   }
	   
	
	
	
	@Override // 어노테이션 : 프로그램이 인지하는 주석
	public boolean equals(Object obj) { // Object의 equals를 재정의
		// equals 라는 메서드 
		double d = 3; // 3.0
		// 자동형변환
		// 업캐스팅
		
		Poketmon2 poketmon2 = (Poketmon2)obj;
		// 명시적형변환 (강제 형변환)
		// 다운 캐스팅
		// 명시적 형변환 시에는 명시를 해줘야 한다
		
		
		
		// 현재 Object 는 포켓몬 이름을 가지고 있는 상황이 아니다 
		if(this.name.equals(poketmon2.name)) {// 내 이름이랑 비교할 대상의 이름이랑 같아 ?
			return true;
		}
		
		return false;
	}
	 
}

class Pika extends Poketmon2{
	Pika(){
		super("피카츄"); // 아무것도 없는 생성자에서 포켓몬으로 들어가는게 맘에 안들땐?
	}
}

class Charmander extends Poketmon2{
	Charmander(){
		super("파이리");
	}
}
public class Test01 {

	public static void main(String[] args) {

	Pika p1 = new Pika();	// 애초에 객체 비교시에 본질적으로 두개의 객체가 같니?
							// 라고 물어보면 안됨 독립된 객체기 때문에
	Pika p2 = new Pika();	// 두개의 객체가 같은 주소야 ? xxxx
	Charmander c1 = new Charmander();	
		
	// 예를 들어 포켓몬을 키워주는 키우미집이 있다.	
	// : 포켓몬1마리 , 포켓몬 2마리를 키워준다. 
	// -> 피카츄 피카츄 -> 알 o
	// -> 파이리 피카츄 -> 알 x
	
	// 두 포켓몬의 종류가 같니 ? 물어보기 
	// p1, c1을 키우미집에 맡겼다! 
	// p1==c1이 에러 나는 이유 : 연산자와 대상이 객체가 될수 없음!
	// ex) 문자열
	// equals()메서드는(객체비교시에 쓴다) 두개의 객체가 같은 주소일때만 True 가 뜬다. 
	// p1.equals(p1) -> o
	// p1.equals(p2) -> x
	// 객체를 비교하는 상황이라 연산자는 못씀 // equals를 사용
	if(p1.equals(p2)) {//이 질문이 같은 주소니 ? 물어보는 질문이라 같지않다 // p1과 c1이 같은 포켓몬이야?
		// equals 라는 메서드를 쓴것 
		// 다시 돌아와서 비교하면 p1과 p2가 같아진다.
		System.out.println("알을 획득했습니다!");
	}else {
		System.out.println("......");
	}
	
	// ※ Object 클래스
	// JAVA에서 기본제공해주는 최상위 클래스 
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
