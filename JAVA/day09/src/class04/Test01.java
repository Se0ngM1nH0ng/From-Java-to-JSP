package class04;

class Shape {
	String name;
	double area;

	Shape(String name) {
		this.name = name;
		this.area = 0.0;
	}

	void print() {
		System.out.println(this.name + "은 넓이가 " + this.area);
	}
}

class Rect extends Shape {
	int x;
	int y;

	Rect(int x, int y) {
		super("네모"); // super라는 생성자가 숨어있다
		this.x = x;
		this.y = y;
		this.area = this.x * this.y;
	}

	void print() { // 기존의 메서드가 출력되는게 아니라 자식의 수정된 메서드가 출력된다.
		// 재정의한 메서드가 // 재정의한 값으로 실행된다.
		System.out.println(this.name + "는 ");
		System.out.println("가로의 길이가" + this.x + ", ");
		System.out.println("세로의 길이가" + this.y + "입니다 ");
		System.out.println("넓이가" + this.area + "입니다 ");
	}
}

public class Test01 {

	public static void main(String[] args) {

		Rect r = new Rect(10, 20);

		r.print();

		// 기존에 부모가 갖고있던 기능을 다시 정의 하고 싶어지는것 "r.print()로 한번에 나오면 안돼 ?"

	}

}
