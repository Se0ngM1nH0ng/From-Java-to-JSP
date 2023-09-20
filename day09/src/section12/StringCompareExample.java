package section12;

import java.util.Scanner;

public class UpDownGame {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int count = 0;
		int matchValue = 0;
		int value = 0;

		matchValue = (int)(Math.random() * 30) + 1;
		while(count < 10) {
			System.out.println("맞출 숫자 입력 : ");
			value = scan.nextInt();

			// 코드를 작성해보세요 
			count++; // 카운트를 올려주다가 
			if(value == matchValue) { // 숫자를 맞췄을시  while문을 바로 탈출 !
				System.out.println(count + "번 째 정답 !");
				break; // 무한루프 종료조건 !
			}

		}

	}
}