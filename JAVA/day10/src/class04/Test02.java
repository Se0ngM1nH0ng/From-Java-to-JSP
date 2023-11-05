package class04;

import java.util.Scanner;

class Point {
	int x;
	int y; // �������

	Point() {
		this(0, 0); // ��ܽ� x,y
	}

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	void move() { //�����ε�
		move(1);
	}

	void move(int x) {
		move(x, x);
	}

	void move(int x, int y) {
		this.x += x;
		this.y += y;
	}


	@Override
	public String toString() {
		return "��(" + this.x + "," + this.y + ")";
	}

}

class ColorPoint extends Point {
	String color;

	ColorPoint() {
		this(0, 0);
	}

	ColorPoint(int x, int y) {
		this("����", x, y);
	}

	ColorPoint(String color, int x, int y) {
		super(x, y);
		this.color = color;
	}

	void changeColor(String color) {
		this.color = color;
		System.out.println("�� ���� �Ϸ�!");
	}

	@Override
	public boolean equals(Object obj) {
		ColorPoint colorPoint = (ColorPoint) obj;
		if ((this.x == colorPoint.x) && (this.y == colorPoint.y) && (this.color.equals(colorPoint.color))) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return this.color + "(" + this.x + "," + this.y + ")";
	}
}

public class Test02 {

	// INPUT: �� 2���� �޾Ƽ�
	// OUTPUT: ����ϰ� ��! void
	public static void addPoint(Point point1,Point point2) {// ����ġ��� �޼���� ����
		Point resPoint=new Point();
		resPoint.x=point1.x+point2.x;
		resPoint.y=point1.y+point2.y;
		System.out.println(point1);
		System.out.println("���ϱ�");
		System.out.println(point2);
		System.out.println("���) "+resPoint);
	}

	public static void main(String[] args) {      
		Point[] data=new Point[3]; // ����Ʈ �迭�� ����Ʈ�� ��ӹް� �ִ� �÷�����Ʈ�� ����Ҽ� �ִ�.
		Scanner sc=new Scanner(System.in);
		int index=0;
		while(true) {
			System.out.println("1. �� ����"); // �޼��� xxx
			System.out.println("2. �� ��� ���"); // �޼��� xxx
			System.out.println("3. �� 1�� ���");
			System.out.println("4. �� �̵�");
			System.out.println("5. �� ����");
			System.out.println("6. �� ��ġ��");
			System.out.println("7. ���α׷� ����");
			System.out.print("�Է�) ");
			int action=sc.nextInt();
			if(action==1) {
				System.out.println("1. �� ����");
				System.out.println("2. ���� �� ����");
				System.out.print("�Է�) ");
				action=sc.nextInt();
				if(action==1) {
					data[index++]=new Point();
				}
				else {
					System.out.print("�� �Է�) ");
					String color=sc.next();
					data[index++]=new ColorPoint(color,10,20);
				}
			}
			else if(action==2) {
				// �迭�� ����� ������ ������ŭ
				// ���� �������~~ index �� ������ /length�� �ƴ� 
				for(Point point:data) {
					if(point==null) {
						break;
					}
					System.out.println(point);
					///// == System.out.println(point.toString());
				}
			}
			else if(action==3) {
				System.out.print("index ��ȣ �Է�) ");
				action=sc.nextInt();
				System.out.println(data[action]);
			}
			else if(action==4) {
				System.out.print("index ��ȣ �Է�) ");
				action=sc.nextInt();
				data[action].move();
				System.out.println(data[action]);
			}
			else if(action==5) {
				System.out.print("index ��ȣ �Է�) ");// ��Ÿ� ���� �����Ұž�?
				//�°� ���� �����Ҽ� �ִ� �������� Ȯ�� �ؾ��Ѵ�.
				action=sc.nextInt();
				// ��ü instanceof Ŭ����
				// ��ü�� Ŭ�����ž�?
				// �� instanceof Point T
				// ������ instanceof Point T
				// � ���� Ÿ��, �ڷ���, ��� Ŭ������ ����� ������: instanceof
				if(data[action] instanceof ColorPoint) { // data[action]�� �������̾�?
					// T ���϶� ���� �Ҽ� �ִ�.  
					ColorPoint cp=(ColorPoint)data[action]; // �ٿ� ĳ����
					System.out.print("�� �Է�) "); // ��������� �Է� �ޱ� 
					String color=sc.next(); // �����Է� ����
					cp.changeColor(color); // �� ����� �������� �޼���
				}
				else {
					System.out.println("�� ���� �Ұ���!");
				}
				System.out.println(data[action]);
			}
			else if(action==6) {
				// ��A�� ��B�� ������~~ O
				// ��A��, ��B�� ����! xxxxx
				// �� ����� �����Ҷ����� �׻�
				// "�־�(��ü)"�� ��������?
				// "���(����)"�� ��������?
				System.out.print("index ��ȣ �Է�1) ");
				action=sc.nextInt();
				System.out.print("index ��ȣ �Է�2) ");
				int action2=sc.nextInt();
				addPoint(data[action],data[action2]);
			}
			else if(action==7) {
				break;
			}
