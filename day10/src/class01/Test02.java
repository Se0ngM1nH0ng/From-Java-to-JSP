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
	public boolean equals(Object obj) { // �� ���� ���� !// �޼���ñ״�ó�� ����
		
		
		A a =(A)obj;
		
		
		if(this.num == a.num) {//�� ���ڿ� ����� ���ڰ� ����?
			return true;
		}

		return false;
	}
	
}

class B extends A{
//	B(){
//		super(); // �θ𿡰� �⺻�����ڰ� ���°� ���� ���� ~~
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
		B b2 = new B(1); //BŬ������ ��ü���� 1
		C c1 = new C(2); //CŬ������ ��ü���� 2
		
		//
		if(b1.equals(b2)) { // �����ڷ� ����� �� ���� ������ equals�� //b1�� b2�� ���� ?
			System.out.println("o");
		}else {
			System.out.println("x");
		}
		
		
	}

}
