package class06;

//import java.util.Random;

public class Test06 {

//	함수명 :test1()
//	input : 정수
//	기능 : 랜덤정수 생성 , 1부터 랜덤수까지의 총합을 출력
	
//	public static void test1() { // "메서드 시그니처"
//		Random rand = new Random();
//		int num = (rand.nextInt(10)+1) + 10; // 11~20
//		
//		int result = 0;
//		for (int i = 0; i < num; i++) {
//			result += i;
//		}
//		
//		System.out.println("총합은: " + result);
//		
//	}
	
	
//	public static int test2(int num) {// input : 정수
//		int count = 0;
//		for (int i = 0; i < num; i++) {
//			if(num % 2 == 0) {
//				count++; // 기능
//			}
//		}
//		return count; //output : 반환
//	}
//	
	
	public static String test3(int num) {
		String msg = "banana";
		if(num >10) {
			msg = "apple";
		}
		return msg;
		
	}
	
	
	
	public static void main(String[] args) {
			
		test3(5);
		
	}

}
