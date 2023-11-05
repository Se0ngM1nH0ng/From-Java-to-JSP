package class03;

public class Test02 {

	public static void main(String[] args) {

		// while문은 일반적으로
		// "무한루프(반복문)" 일때 활용

		// 프로그램에서 무한 루프는 위험 하다 !
		// 웹개발에서, 프로그램동작은 '서버자원'을 사용함
		// -> '비용'이 발생함 !

//			int i = 0;
////		while(1 < 10) {
////			System.out.println("안녕");
//			i++;
//			
//			if(i == 5) {
//				// 종료조건
//				}
////		}

		// ★★★★★ 무한루프는 반드시 "종료조건"이 필요하다.

//		int i = 0;
//		while (1 < 10) {
//			System.out.println("안녕");
//			i++;
//
//			if (i == 3) {
//				break; // break를 만나면 해당 반복문이 즉시 종료
//					   // 해당 "반복문" 을 "즉시" 종료
//			}
//			System.out.println("★");
//			
//		}
//		

//		while (true) {
//			// 이거 무한루프구나?
//			// "종료조건"이 꼭 있어야 한다.
//		}

		int a = 33;
		int b = 29;

		int i = b;
		while (true) {
			System.out.print(i + " ");
			i++;
			if (i > a) {
				break;
			}

		}

	}

}
