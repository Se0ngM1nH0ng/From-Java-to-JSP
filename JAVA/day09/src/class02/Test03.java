package class02;

class Shape { // ������� , �޼��� , ������
	String name;
	double area;

	Shape(String name) { // �������̳� �Է��� �޾ƾ� ���̸� ���Ҽ� �ִ� ��Ȳ, �߰����� �κ�
		this(name, 0.0); // ���̸� ���������� �� ���� �ʾƵ�
							// �ܺο��� �޾ƿ� ������ ����Ҽ��� �ְڴ�.
	}

	Shape(String name, double area) {
		this.name = name;
		this.area = area;
	}

	void printArea() {
		System.out.println(this.name + "�� ���̴� " + this.area + "�Դϴ�.");
	}
} // �θ� ���� Ȯ���ϰ� ����� ���� �������� �Ѿ�� �Ѵ�
/////////////////// �θ�Ŭ������ �ڵ��� ������ ������, �ڽ� Ŭ������ �ڵ��Ѵ� !

class Circle extends Shape { // ������� 4�� ��� �ʱ�ȭ �ϰ� �ִ��� �� üũ
	int radius;
	final static double PI = 3.14; // 3.14 ��� ������ ��õǴ°�

	Circle(int radius) {
		this("��", radius);
	}

	Circle(String name, int radius) { // ��������� �ʱ�ȭ �ϴ� ������ ��� �����ڿ��� ����
		super(name);
		this.radius = radius;
		this.area = this.radius * this.radius * Circle.PI;
		// area��� ���̸� �ܺο��� �������̶� ���� �޾ƿͼ� ��� ���ټ� �ֱ⶧����
		// ���� ����� ��Ӱ��� �� this.area �� �����ü� �ִ� !
	}
}

class Rect extends Shape {
	int x;
	int y;

	Rect(String name, int x, int y) {
		super(name);
		this.x = x;
		this.y = y;
		this.area = this.x * this.y;
		// area��� ���̸� �ܺο��� x,y �� ���� �޾ƿͼ� ��� ���ټ� �ֱ⶧����
		// ���簢���� ����� ��Ӱ��� �� this.area �� �����ü� �ִ� !
	}

}

public class Test03 {
	public static void main(String[] args) {

		Circle c1 = new Circle("��", 10);
		Circle c2 = new Circle(1);
		c1.printArea();
		c2.printArea();

		Rect rec = new Rect("�׸�׸�", 5, 3);
		rec.printArea();

	}

}
