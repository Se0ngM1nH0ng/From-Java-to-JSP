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
				
				System.out.println("�����Է�");
				int num = sc.nextInt();
				abc[i] =new A(num);//abc[i]��� �迭�̸� �ȿ� ���� // num �ڸ� �����ڿ� ���� �ִ��ڸ� 
				if(num % 2 ==1) {
					continue;
				}
				
				i++;
				
			}
			
		
		
		
		
		
	}

}
