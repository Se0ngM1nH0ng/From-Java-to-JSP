package class04;

class Shape {
	String name;
	double area;

	Shape(String name) {
		this.name = name;
		this.area = 0.0;
	}

	void print() {
		System.out.println(this.name + "�� ���̰� " + this.area);
	}
}

class Rect extends Shape {
	int x;
	int y;

	Rect(int x, int y) {
		super("�׸�"); // super��� �����ڰ� �����ִ�
		this.x = x;
		this.y = y;
		this.area = this.x * this.y;
	}

	void print() { // ������ �޼��尡 ��µǴ°� �ƴ϶� �ڽ��� ������ �޼��尡 ��µȴ�.
		// �������� �޼��尡 // �������� ������ ����ȴ�.
		System.out.println(this.name + "�� ");
		System.out.println("������ ���̰�" + this.x + ", ");
		System.out.println("������ ���̰�" + this.y + "�Դϴ� ");
		System.out.println("���̰�" + this.area + "�Դϴ� ");
	}
}

public class Test01 {

	public static void main(String[] args) {

		Rect r = new Rect(10, 20);

		r.print();

		// ������ �θ� �����ִ� ����� �ٽ� ���� �ϰ� �;����°� "r.print()�� �ѹ��� ������ �ȵ� ?"

	}

}
