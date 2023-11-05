package class01;

class A{
	int num;
	A(int num){
		this.num = num;
	}
	
	void printInfo() {
		System.out.println("A: " + this.num);
	}

	@Override
	public boolean equals(Object obj) { // 이 줄은 고정 !// 메서드시그니처에 의해
		
		
		A a =(A)obj;
		
		
		if(this.num == a.num) {//내 숫자와 상대의 숫자가 같아?
			return true;
		}

		return false;
	}
	
}

class B extends A{
//	B(){
//		super(); // 부모에게 기본생성자가 없는게 문제 였다 ~~
//		
//	}
	
	B(int num){
		super(num); 
		
	}
}

class C extends A{
	C(int num){
		super(num);
	}
}
public class Test02 {

	public static void main(String[] args) {

		B b1 = new B(1);
		B b2 = new B(1); //B클래스의 객체들은 1
		C c1 = new C(2); //C클래스의 객체들은 2
		
		//
		if(b1.equals(b2)) { // 연산자로 사용할 수 없기 때문에 equals로 //b1과 b2가 같아 ?
			System.out.println("o");
		}else {
			System.out.println("x");
		}
		
		
	}

}
