package class04;

class A {
	int a;
	int b;
	int c;
	int d;
	int e;
	int f;
	int g;
	int h;

	A(int a, int b, int c, int e, int f, int g, int h) {
		// this == 자기자신객체
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = 0;
		this.e = e;
		this.f = f;
		this.g = g;
		this.h = h;
	}

}

//생성자의 int값이랑 멤버변수의 int 값이랑 맞춰준다.
// 보기 불편함
// 왼쪽 옆에 있는 내 a야
// this == 자기 자신의 객체
// 내 생성자 나 자신 내꺼 ! 내가 입력 받을거
public class Test05 {
	public static void main(String[] args) {

	}
}
