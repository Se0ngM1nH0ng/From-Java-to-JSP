package class02;

class A {
	int a; // �������,�ʵ�,�Ӽ�
	// �ν��Ͻ� ����
	// : ������ ��ü���� ������ ���� ����, ��ü�鳢�� ���� ���� xxxxx
	// ��������� ���� �������� �ʴ´�
	// Ŭ���� ������ static ���� ���� �ؼ� ���� �ö󰣴�.

	static int b;
	// ��ü�� �����ϰ�
	// Ŭ���� ����,���� �ڿ�
	// : ������ Ŭ������ ��ü�鳢�� ���� ���� O

	void printInfo() {
		System.out.println("a= " + this.a);
		System.out.println("b= " + this.b);
	}
}

public class Test01 {
	public static void main(String[] args) {

		A a1 = new A();
		a1.a = 10;
		a1.b = 10;
		A a2 = new A();
		a2.a = 10;
		a2.b = 10;
		a2.a++;
		a2.b++;

		a1.printInfo();
		a2.printInfo();

	}
}
