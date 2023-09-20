package class07;

public class Test01 {

	public static void main(String[] args) {
//		int data = 10 > 5 ? 1 : 2;
//		System.out.println(data);
		
//		예제 1)
		int a = 100;
		int b = 200;
		int data = a > b ? a : b; //data에다가 정답을 저장할 변수
		
		System.out.println(data);
		
		
		if(a > b) {
			System.out.println(a);
		}else {
			System.out.println(b);
		}
		
//		예제 2)
		
		int c = 9;
		char number1 = 'E';
		char number2 = 'O';
		
		
		char result = c % 2 == 0 ? number1 : number2;
		char result2 = c % 2 == 1 ? number2 : number1;
		char result3 = c % 2 != 0 ? number2 : number1;
		System.out.println(result);
		
		if(c % 2 == 0) {
			System.out.println(number1);
		}else {
			System.out.println(number2);
		}
		
		
		
		
		
		
	}

}
