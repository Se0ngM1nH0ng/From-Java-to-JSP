package class01;

class Point {
	int x;
	int y; // 멤버변수

	Point(int x, int y) {
		this.x = x; // 생성자에서 초기화
		this.y = y;
	}

	@Override // 오버라이딩
	public boolean equals(Object obj) {

		Point p = (Point) obj; // 다운캐스팅 Point 타입으로 변환

		if (this.x == p.x) { // 인덱스 0번과 같으면 정답이야
			if (this.y == p.y) { // x,y가 모두 같다면 
				return true;
			}
		}
		return false;
	}

}

class ColorPoint extends Point { //자식클래스 Color Point
	String color;

	ColorPoint(String color) {
		// this로 끌어다 쓸때에는 3가지 인자 다쓸것. 다 초기화 시켜줘야함
		this(0,0,color); //인자가 가장 많은것들을 써놓고 나머지가 this()를 쓴다. 
	}

	ColorPoint(int x, int y) {
		this(x,y,"검정"); // x,y 만 받았지만 this()로 묶기위해 초기화로 검정이라 기입했다.
	}

	ColorPoint(int x, int y, String color) {
		super(x, y); // 부모클래스에서 받아왔을때 super로 써준다
		this.color = color; // 초기화 안한 인자 초기화
	}

	@Override
	public boolean equals(Object obj) {

		ColorPoint cp = (ColorPoint) obj; // 다운캐스팅 obj를 
									// ColorPoint타입으로 바꾸기

		if (this.color.equals(cp.color)) { // 색깔이 서로 같니 ?
			return true; // 지금 내 컬러가 cp의 컬러와 같니 
		}
		return false;
		// 메서드 오버라이딩

	}
}
	public class Test03 {

		public static void main(String[] args) {

			Point[] data = new Point[3];
			data[0] = new Point(10, 20);
			data[1] = new Point(123, 20);
			data[2] = new Point(10, 20);

			if (data[0].equals(data[1])) { // 인덱스 0 과 인덱스 1 이 같니?
				System.out.println("o"); // 같으면 o
			} else {
				System.out.println("x"); // 다르면 x
			}
			if (data[0].equals(data[2])) {// 인덱스0 과 인덱스2 가 같니?
				System.out.println("o");
			} else {
				System.out.println("x");
			}

			ColorPoint[] datas = new ColorPoint[3];
			datas[0] = new ColorPoint(10, 20, "파랑");
			datas[1] = new ColorPoint(10, 20, "파랑");
			datas[2] = new ColorPoint(10, 20, "빨강");

			if (datas[0].equals(datas[1])) { // 인덱스 0 과 인덱스 1 이 같니?
				System.out.println("o"); // 같으면 o
			} else {
				System.out.println("x"); // 다르면 x
			}
			if (datas[0].equals(datas[2])) {// 인덱스0 과 인덱스2 가 같니?
				System.out.println("o");
			} else {
				System.out.println("x");
			}
		}
	}

