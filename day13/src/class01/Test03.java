package class01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		// 정상적인 입력을 3번 할때 까지 계속 

		Scanner sc = new Scanner(System.in);

		int i =0; // 변수 설정
		while(true) {
			try {
				System.out.println("정수 입력) ");
				int num = sc.nextInt();
				System.out.println("num= " + num);
			}
			catch(InputMismatchException e){
				sc.nextLine(); // 버퍼에 남아있는 쓰레기값을 제거하는 코드 
				System.out.println("정수로만 입력하셔야 합니다 ㅜㅜ...");
				continue; // 다시 처음으로 
			}
			i++; // 횟수카운트
			if(i == 3) { // 3 이상 채워졌을때 탈출
				break;
			}
		}
		
		
		
		int i =0; // 변수 설정
		while(i<3) {
			try {
				System.out.println("정수 입력) ");
				int num = sc.nextInt();
				System.out.println("num= " + num);
				
				i++;
			}
			catch(InputMismatchException e){
				sc.nextLine(); // 버퍼에 남아있는 쓰레기값을 제거하는 코드 
				System.out.println("정수로만 입력하셔야 합니다 ㅜㅜ...");
				
			}
		}
		
	}
}
