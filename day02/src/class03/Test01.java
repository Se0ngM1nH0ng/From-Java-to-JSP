package class03;

public class Test01 {

	public static void main(String[] args) {

//		한 소스코드내에서는 
//		유사한 코드가 없도록 작성해보자
		
		
//		a = 5, b= 9
//		5 6 7 8 9 출력
				
//		int a = 5, b = 9;
//				
//		while(a <= b) {
//			System.out.println(a);
//			a++;
//		}
		
		
//		강사님 풀이 
		
//		a = 5, b= 9
//		5 6 7 8 9 출력
						
//		int a = 5, b = 9;
//		
//		int i = a;
		
//		while(i <= b) {
//			System.out.println(i);
//			i++;
//			}
		
//		 int a=10;
//	      int b=9;

	      // 항상 a가 b보다 작을수있도록
	      // "교환 알고리즘"을 활용!
//	      if(a>b) { //   a와 b의 값을 교환해줘!
//	         int tmp=a; // "임시저장변수" tmp랑 temp 똑같은말
//	         a=b;
//	         b=tmp;
//	      }
//	      
//	      int i=a;
//	      while(i<=b) { 
//	         System.out.print(i+" ");
//	         i++;
//	      }
	      /*
	      int a=10;
	      int b=9;

	      int min=a>b?b:a;
	      int max=a>b?a:b;
	      
	      int i=min;
	      while(i<=max) { 
	         System.out.print(i+" ");
	         i++;
	      }
	*/

		int a = 33;
		int b = 29;

		while(a>=b){
		System.out.println(b);
		b++;
		if(a<b){
		 break;
		}
		
	


