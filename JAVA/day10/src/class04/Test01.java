package class04;

import java.util.Scanner;

class Point {
	int x;
	int y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	void printPoint() { // 점 1개 출력 // 점 현재위치 출력
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
		this("검정", x, y);
	}
	ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}

	void changeColor() {
		System.out.println("선택하신 색 " + this.color + " 으로 변경되었습니다.");
	}

}

public class Test01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int select = 0;
		int index = 0;
		Point[] data = new Point[3];

		while (true) {
			System.out.println("===== 메뉴 =====");
			System.out.println("1. 점 생성 ");
			System.out.println("2. 점 목록 출력 ");
			System.out.println("3. 점 1개 출력 ");
			System.out.println("4. 점 이동 ");
			System.out.println("5. 색 변경 ");
			System.out.println("6. 점 합치기 ");
			System.out.println("7. 프로그램 종료 ");
			System.out.println("입력 ) ");
			select = sc.nextInt();

			if (select == 1) {
				while (true) {
					if (index == 0) {
						System.out.println("생성된 점이 없습니다.");
						break;
					}
					while(true) {
					System.out.println("첫번째 값 x를 입력해주세요");
					int num = sc.nextInt();
					System.out.println("정말" + num + "으로 하시겠습니까?");
					System.out.println("1) YES 2) NO ");
					int number = sc.nextInt();
					if(number == 1) {
						//저장 
					}else {
						continue;
					}
					System.out.println("두번째 값 y를 입력해주세요");
					int num2 = sc.nextInt();
					System.out.println("정말" + num2 + "으로 하시겠습니까?");
					System.out.println("1) YES 2) NO ");
					int number2 = sc.nextInt();
					if(number2 == 1) {
						//저장 
					}else {
						continue;
					}
				}
					//점 배열에 저장
					data[index++];
				}
			} else if (select == 2) {
					if (index == 0) {
						System.out.println("저장된 점이 없습니다.");
						continue;
					}
					System.out.println("===== 목록 =====");
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
