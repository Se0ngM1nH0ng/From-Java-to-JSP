package class04;

import java.util.Scanner;

class Point {
	int x;
	int y; // 멤버변수

	Point() {
		this(0, 0); // 계단식 x,y
	}

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	void move() { //오버로딩
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
		return "점(" + this.x + "," + this.y + ")";
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

	ColorPoint(String color, int x, int y) {
		super(x, y);
		this.color = color;
	}

	void changeColor(String color) {
		this.color = color;
		System.out.println("색 변경 완료!");
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

	// INPUT: 점 2개를 받아서
	// OUTPUT: 출력하고 끝! void
	public static void addPoint(Point point1,Point point2) {// 점합치기는 메서드로 쓰기
		Point resPoint=new Point();
		resPoint.x=point1.x+point2.x;
		resPoint.y=point1.y+point2.y;
		System.out.println(point1);
		System.out.println("더하기");
		System.out.println(point2);
		System.out.println("결과) "+resPoint);
	}

	public static void main(String[] args) {      
		Point[] data=new Point[3]; // 포인트 배열은 포인트를 상속받고 있는 컬러포인트도 사용할수 있다.
		Scanner sc=new Scanner(System.in);
		int index=0;
		while(true) {
			System.out.println("1. 점 생성"); // 메서드 xxx
			System.out.println("2. 점 목록 출력"); // 메서드 xxx
			System.out.println("3. 점 1개 출력");
			System.out.println("4. 점 이동");
			System.out.println("5. 색 변경");
			System.out.println("6. 점 합치기");
			System.out.println("7. 프로그램 종료");
			System.out.print("입력) ");
			int action=sc.nextInt();
			if(action==1) {
				System.out.println("1. 점 생성");
				System.out.println("2. 색깔 점 생성");
				System.out.print("입력) ");
				action=sc.nextInt();
				if(action==1) {
					data[index++]=new Point();
				}
				else {
					System.out.print("색 입력) ");
					String color=sc.next();
					data[index++]=new ColorPoint(color,10,20);
				}
			}
			else if(action==2) {
				// 배열에 저장된 데이터 개수만큼
				// 점을 출력해줘~~ index 가 들어가야함 /length가 아님 
				for(Point point:data) {
					if(point==null) {
						break;
					}
					System.out.println(point);
					///// == System.out.println(point.toString());
				}
			}
			else if(action==3) {
				System.out.print("index 번호 입력) ");
				action=sc.nextInt();
				System.out.println(data[action]);
			}
			else if(action==4) {
				System.out.print("index 번호 입력) ");
				action=sc.nextInt();
				data[action].move();
				System.out.println(data[action]);
			}
			else if(action==5) {
				System.out.print("index 번호 입력) ");// 어떤거를 색을 변경할거야?
				//걔가 색을 변경할수 있는 애인지를 확인 해야한다.
				action=sc.nextInt();
				// 객체 instanceof 클래스
				// 객체가 클래스거야?
				// 점 instanceof Point T
				// 색깔점 instanceof Point T
				// 어떤 애의 타입, 자료형, 출신 클래스를 물어보는 연산자: instanceof
				if(data[action] instanceof ColorPoint) { // data[action]이 색깔점이야?
					// T 참일때 실행 할수 있다.  
					ColorPoint cp=(ColorPoint)data[action]; // 다운 캐스팅
					System.out.print("색 입력) "); // 사용자한테 입력 받기 
					String color=sc.next(); // 색깔입력 받음
					cp.changeColor(color); // 그 색깔로 변경해줘 메서드
				}
				else {
					System.out.println("색 변경 불가능!");
				}
				System.out.println(data[action]);
			}
			else if(action==6) {
				// 점A와 점B를 더해줘~~ O
				// 점A야, 점B를 더해! xxxxx
				// ☆ 기능을 개발할때에는 항상
				// "주어(주체)"가 누구인지?
				// "대상(인자)"가 누구인지?
				System.out.print("index 번호 입력1) ");
				action=sc.nextInt();
				System.out.print("index 번호 입력2) ");
				int action2=sc.nextInt();
				addPoint(data[action],data[action2]);
			}
			else if(action==7) {
				break;
			}
