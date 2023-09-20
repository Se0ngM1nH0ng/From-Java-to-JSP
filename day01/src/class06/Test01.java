package class06;

public class Test01 {
	public static void main(String[] args) {
		//정수 37이라는 값을 저장
		int data = 37;
		// 변수 생성과 값 초기화를 한번에 진행하는것도 가능하다 !
		
		
		// [연산자]
		
		System.out.println(3+7);
		System.out.println(10/3);
		System.out.println(10%3);
		System.out.println("현재 data: " + data);
		
		// 하나의 변수공간에는
		// 하나의 값 (덮어쓰기 개념)
		data = 10 - 3; // =,-라는 대입연산자와 산술연산자가 있다.
						// 컴퓨터는 하나하나의 일을 빨리 처리함
						// 동시처리 xxx
		System.out.println("지금 data: " + data);
		
		
	}
}
