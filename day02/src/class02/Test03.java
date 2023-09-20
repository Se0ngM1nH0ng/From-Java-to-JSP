package class02;

public class Test03 {

	public static void main(String[] args) {

//		a = 5, b= 9
//		5 6 7 8 9 출력
		int a = 5;
		int b = 9;
		
		while(a<=b) {
			System.out.println(a);
			a++;
		}
		
		
//		a = -5, b = -3
//		-5, -4, -3 출력
		
		int a = -5;
		int b = -3;
		
		while(a>=b) {
			System.out.println(b);
			b++;
		}

		
//		a = 3, b = 1
//		1 2 3 오름차순 출력
		
		int a = 3, b = 1;
		
		if(a >= b) {
			
			while(a >= b) {
				System.out.println(b);
				b++;
			}
		}else {
			while(a <= b) {
				System.out.println(a);
				a++;
		}
			
		
		
	}
	}
}
