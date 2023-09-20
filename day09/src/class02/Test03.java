package class02;

class Shape { // 멤버변수 , 메서드 , 생성자
	String name;
	double area;

	Shape(String name) { // 반지름이나 입력을 받아야 넓이를 구할수 있는 상황, 추가적인 부분
		this(name, 0.0); // 넓이를 직접적으로 딱 주지 않아도
							// 외부에서 받아온 것으로 계산할수도 있겠다.
	}

	Shape(String name, double area) {
		this.name = name;
		this.area = area;
	}

	void printArea() {
		System.out.println(this.name + "의 넓이는 " + this.area + "입니다.");
	}
} // 부모를 먼저 확실하게 만들고 나서 다음으로 넘어가야 한다
/////////////////// 부모클래스의 코딩이 완전히 끝나야, 자식 클래스를 코딩한다 !

class Circle extends Shape { // 멤버변수 4개 모두 초기화 하고 있는지 꼭 체크
	int radius;
	final static double PI = 3.14; // 3.14 라고 누구나 명시되는것

	Circle(int radius) {
		this("원", radius);
	}

	Circle(String name, int radius) { // 멤버변수를 초기화 하는 행위는 모두 생성자에서 진행
		super(name);
		this.radius = radius;
		this.area = this.radius * this.radius * Circle.PI;
		// area라는 넓이를 외부에서 반지름이란 값을 받아와서 계산 해줄수 있기때문에
		// 원과 모양은 상속관계 라서 this.area 로 가져올수 있다 !
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
		// area라는 넓이를 외부에서 x,y 란 값을 받아와서 계산 해줄수 있기때문에
		// 직사각형과 모양은 상속관계 라서 this.area 로 가져올수 있다 !
	}

}

public class Test03 {
	public static void main(String[] args) {

		Circle c1 = new Circle("원", 10);
		Circle c2 = new Circle(1);
		c1.printArea();
		c2.printArea();

		Rect rec = new Rect("네모네모", 5, 3);
		rec.printArea();

	}

}
