package class04;

import java.util.Scanner;

class Point {
	int x;
	int y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	void printPoint() { // �� 1�� ��� // �� ������ġ ���
		System.out.println("(" + this.x + ", " + this.y + ")");
	}

	void move() {
		this.x++;
		this.y++;
	}

	void move(int x) {
		this.x += x;
		this.y += x;
	}

	void move(int x, int y) {
		this.x += x;
		this.y += y;
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
	ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}

	void changeColor() {
		System.out.println("�����Ͻ� �� " + this.color + " ���� ����Ǿ����ϴ�.");
	}

}

public class Test01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int select = 0;
		int index = 0;
		Point[] data = new Point[3];

		while (true) {
			System.out.println("===== �޴� =====");
			System.out.println("1. �� ���� ");
			System.out.println("2. �� ��� ��� ");
			System.out.println("3. �� 1�� ��� ");
			System.out.println("4. �� �̵� ");
			System.out.println("5. �� ���� ");
			System.out.println("6. �� ��ġ�� ");
			System.out.println("7. ���α׷� ���� ");
			System.out.println("�Է� ) ");
			select = sc.nextInt();

			if (select == 1) {
				while (true) {
					if (index == 0) {
						System.out.println("������ ���� �����ϴ�.");
						break;
					}
					while(true) {
					System.out.println("ù��° �� x�� �Է����ּ���");
					int num = sc.nextInt();
					System.out.println("����" + num + "���� �Ͻðڽ��ϱ�?");
					System.out.println("1) YES 2) NO ");
					int number = sc.nextInt();
					if(number == 1) {
						//���� 
					}else {
						continue;
					}
					System.out.println("�ι�° �� y�� �Է����ּ���");
					int num2 = sc.nextInt();
					System.out.println("����" + num2 + "���� �Ͻðڽ��ϱ�?");
					System.out.println("1) YES 2) NO ");
					int number2 = sc.nextInt();
					if(number2 == 1) {
						//���� 
					}else {
						continue;
					}
				}
					//�� �迭�� ����
					data[index++];
				}
			} else if (select == 2) {
					if (index == 0) {
						System.out.println("����� ���� �����ϴ�.");
						continue;
					}
					System.out.println("===== ��� =====");
					for (int i = 0; i < data.length; i++) {
						data[i].printPoint();
					}
					System.out.println("===============");

			} else if (select == 3) {

			} else if (select == 4) {

			} else if (select == 5) {

			} else if (select == 6) {

			} else if (select == 7) {

			}

		}

	}

}
