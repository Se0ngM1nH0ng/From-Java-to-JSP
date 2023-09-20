package class08;

// 양자택일
public class Test02 {

	public static void main(String[] args) {

//		int a = 9;
//		
//		if(a % 2 == 0) {
//			System.out.println("짝수 입니다.");
//		}
//		
//		if(a % 2 == 1) {
//			System.out.println("홀수 입니다.");
//		}
		
		// a값 무관하게 5번 연산자 사용 대입,산술,비교,산술,비교
		
		int a = 9;
		
		if(a % 2 == 0) { // a가 짝수라면
			System.out.println("짝수 입니다.");
		}else{ // if문이 거짓이 되면 전부 else 
			System.out.println("홀수 입니다.");
		}
		
		// 결론)
		// 양자택일의 상황이라면 
		// if-else를 사용한다!
		
		
	}

}
