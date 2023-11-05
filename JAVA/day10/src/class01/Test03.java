package class01;

class Point {
	int x;
	int y; // �������

	Point(int x, int y) {
		this.x = x; // �����ڿ��� �ʱ�ȭ
		this.y = y;
	}

	@Override // �������̵�
	public boolean equals(Object obj) {

		Point p = (Point) obj; // �ٿ�ĳ���� Point Ÿ������ ��ȯ

		if (this.x == p.x) { // �ε��� 0���� ������ �����̾�
			if (this.y == p.y) { // x,y�� ��� ���ٸ� 
				return true;
			}
		}
		return false;
	}

}

class ColorPoint extends Point { //�ڽ�Ŭ���� Color Point
	String color;

	ColorPoint(String color) {
		// this�� ����� �������� 3���� ���� �پ���. �� �ʱ�ȭ ���������
		this(0,0,color); //���ڰ� ���� �����͵��� ����� �������� this()�� ����. 
	}

	ColorPoint(int x, int y) {
		this(x,y,"����"); // x,y �� �޾����� this()�� �������� �ʱ�ȭ�� �����̶� �����ߴ�.
	}

	ColorPoint(int x, int y, String color) {
		super(x, y); // �θ�Ŭ�������� �޾ƿ����� super�� ���ش�
		this.color = color; // �ʱ�ȭ ���� ���� �ʱ�ȭ
	}

	@Override
	public boolean equals(Object obj) {

		ColorPoint cp = (ColorPoint) obj; // �ٿ�ĳ���� obj�� 
									// ColorPointŸ������ �ٲٱ�

		if (this.color.equals(cp.color)) { // ������ ���� ���� ?
			return true; // ���� �� �÷��� cp�� �÷��� ���� 
		}
		return false;
		// �޼��� �������̵�

	}
}
	public class Test03 {

		public static void main(String[] args) {

			Point[] data = new Point[3];
			data[0] = new Point(10, 20);
			data[1] = new Point(123, 20);
			data[2] = new Point(10, 20);

			if (data[0].equals(data[1])) { // �ε��� 0 �� �ε��� 1 �� ����?
				System.out.println("o"); // ������ o
			} else {
				System.out.println("x"); // �ٸ��� x
			}
			if (data[0].equals(data[2])) {// �ε���0 �� �ε���2 �� ����?
				System.out.println("o");
			} else {
				System.out.println("x");
			}

			ColorPoint[] datas = new ColorPoint[3];
			datas[0] = new ColorPoint(10, 20, "�Ķ�");
			datas[1] = new ColorPoint(10, 20, "�Ķ�");
			datas[2] = new ColorPoint(10, 20, "����");

			if (datas[0].equals(datas[1])) { // �ε��� 0 �� �ε��� 1 �� ����?
				System.out.println("o"); // ������ o
			} else {
				System.out.println("x"); // �ٸ��� x
			}
			if (datas[0].equals(datas[2])) {// �ε���0 �� �ε���2 �� ����?
				System.out.println("o");
			} else {
				System.out.println("x");
			}
		}
	}

