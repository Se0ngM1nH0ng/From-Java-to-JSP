package class04;

public class Test01 {

	public static void main(String[] args) {

		int a = 33;
		int b = 29;
		
//		int num = a < b? a: b; // 대소비교
		
		//교환 로직
		if(a > b) {
			int tmp = a;
			a = b;
			b = tmp;
		}
		
		
		int num = a;
		while(true) {
			
			System.out.println(num + " ");
			num++;
			
			if(num > b) {
				break;
			}
			
			
			
		}
		
		
		
		
		
		
		
	}

}
