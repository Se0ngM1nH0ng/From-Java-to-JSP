package class01;


class A{ // ������ �־��� Ŭ����
	// �θ� Ŭ���� , ���� Ŭ���� 
	int a;
	void funcA() {
		System.out.println("a= "+this.a);
	}
}


// �θ�Ŭ���������� �ڽ�Ŭ������ ���뿡 ���� xxx
// �ڽ�Ŭ���� ������ �θ�Ŭ������ �������, �޼��忡 ������ O (����)


class B extends A{ // ������ �����ߴ� Ŭ������ ���� �߰��� ������ Ŭ���� 
	// �ڽ� Ŭ����, ���� Ŭ���� 
	int b;
	void funcB() {
		System.out.println("b= "+this.b);
	}
}


public class Test01 {

	public static void main(String[] args) {

		A aaa = new A(); // ��üȭ(�ν��Ͻ�ȭ)
		aaa.a=10; // aaa ��ü�� -> ������� a �� funcA() �� ���� �ִ� 
		
		
		B bbb = new B(); // bbb -> b,funcB(), a, funcA() �θ� Ŭ������ �ִ����� �����Ͽ� ������ �ִ�
		bbb.a=22; 
		bbb.b=20;
		
		//A�� B�� ���� �ٸ� ��ü�̱� ������ ���ο��� ������ ���� �ʴ´�
		//bbb ������ 22�� �����س��� aaa�� �ִ� a���� ������ �ʴ´� 
		aaa.funcA();
		bbb.funcB();
		
		
		
	}

}
