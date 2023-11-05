package class01;


class A{ // 기존에 있었던 클래스
	// 부모 클래스 , 상위 클래스 
	int a;
	void funcA() {
		System.out.println("a= "+this.a);
	}
}


// 부모클래스에서는 자식클래스의 내용에 접근 xxx
// 자식클래스 에서는 부모클래스의 멤버변수, 메서드에 접근이 O (가능)


class B extends A{ // 기존에 존재했던 클래스를 보고 추가로 구현한 클래스 
	// 자식 클래스, 하위 클래스 
	int b;
	void funcB() {
		System.out.println("b= "+this.b);
	}
}


public class Test01 {

	public static void main(String[] args) {

		A aaa = new A(); // 객체화(인스턴스화)
		aaa.a=10; // aaa 객체는 -> 멤버변수 a 와 funcA() 를 쓸수 있다 
		
		
		B bbb = new B(); // bbb -> b,funcB(), a, funcA() 부모 클래스에 있던것을 포함하여 가질수 있다
		bbb.a=22; 
		bbb.b=20;
		
		//A와 B는 서로 다른 객체이기 때문에 서로에게 영향을 주지 않는다
		//bbb 에서만 22로 설정해놔서 aaa에 있는 a값은 변하지 않는다 
		aaa.funcA();
		bbb.funcB();
		
		
		
	}

}
