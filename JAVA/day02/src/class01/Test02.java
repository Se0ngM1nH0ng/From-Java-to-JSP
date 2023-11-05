package class01;

public class Test02 {
	public static void main(String[] args) {
		
	
//	2. 나이가 저장된 변수가있습니다.
//	나이가 8~19이면 1000원
//	20~65이면 2000원
//	나머지는 무료!
//	라고 출력해주세요.
	
//	내풀이

//	int age = 10;
//	
//	if(8 <= age && age <= 19) {
//		System.out.println("1000원");
//	}else if(20 <= age && age <= 65) {
//		System.out.println("2000원");
//	}else {
//		System.out.println("무료");
//	}

//	강사님 풀이
	
		   int age=21;
		      int res; // 결과값 변수

		      // ★ 유효성 검사
		      if(age<1 || 200<=age) {
		         System.out.println("유효하지않은 값입니다!");
		      }
		      else {

		         if(8<=age && age<=19) {
		            res=1000;
		         }
		         else if(20<=age && age<=65) {
		            res=2000;
		         }
		         else {
		            res=0;
		         }

	
	}
}
