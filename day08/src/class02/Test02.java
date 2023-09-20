package class02;

import java.util.Scanner;

class A{
	int a;
	
	A(int a){
		this.a=a;
	}
	
	
	
}
public class Test02 {

	public static void main(String[] args) {

			A[] abc = new A[3];
			
			Scanner sc =new Scanner(System.in);
			
			int i =0;
			while(i<3) {
				
				System.out.println("정수입력");
				int num = sc.nextInt();
				abc[i] =new A(num);//abc[i]라는 배열이름 안에 저장 // num 자리 생성자에 숫자 넣는자리 
				if(num % 2 ==1) {
					continue;
				}
				
				i++;
				
			}
			
		
		
		
		
		
	}

}
