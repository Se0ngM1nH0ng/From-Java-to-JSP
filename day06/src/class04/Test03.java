package class04;

//Point 1. 지역변수 vs 멤버변수
//Point 2. 멤버변수에 대입연산자 사용 xxx
//       -> 생성자를 정의하여 해결!
class Circle{ // 원 객체를 생성 해주세요
	String name; // 이름이랑 반지름은 다쓴다 
	int radius;
	double PI;
	double result; 
	// 여기는 멤버변수
	
	
	
	// 생성자
	// 1, input
	// 2, output xxxx -> 당연히 객체이기 때문에 안씀
	//언제나 객체여서 output안씀 
	// 3, 생성자함수명 == 클래스명
	// ★★★★★★ 생성자의 존재이유 ★★★★★★
	// : 멤버변수의 값들을 초기화 하기 위해서 사용함 !!
	
	Circle(String name, int radius){
		this.name=name;
		this.radius=radius;
		this.PI=3.14;
		this.result=this.radius*this.radius*this.PI;
		System.out.println(this.name+"이(가) 생성완료!");
	}
	
	
	
	void printInfo() {
		System.out.println(name + "은 넓이가 " + result + "입니다.");
	}   // 갈색 : 지역변수를 의미
		// 파랑: 멤버변수
}

public class Test03 {

	public static void main(String[] args) {

		// 생성자가 1개라도 제작하게되면, 
		// 더이상 기본생성자는 제공되지 않습니다..
		Circle a1 = new Circle("홍",10);
		Circle a2 = new Circle("성민", 20);
		
		a1.name = "홍"; // 출력전에 상태를 만들어줘야함 !
		
		a1.radius = 10;
		a2.name = "성민";
		a2.radius = 20;
		
		a1.printInfo();
		a2.printInfo();
		
		
		
		
		
		
	}

}
