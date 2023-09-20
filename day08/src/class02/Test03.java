package class02;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i=0;
		int sum = 0;
		while(i<3){
		   for(int j=1;j<=100;j++){
		      sum+=j;
		   }
		   System.out.println("총합은 " + sum + "이다.");
		   System.out.println("계속 ?");
		   System.out.println("1)Y 2)N");
		   int select = sc.nextInt();
		   if(select == 2){
		      break;
		   }
		   i++;
		}
		System.out.println("프로그램을 종료합니다.");
	}

}
