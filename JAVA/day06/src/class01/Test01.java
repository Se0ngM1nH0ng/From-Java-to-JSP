package class01;

import java.util.Random;
import java.util.Scanner;

// flag알고리즘 : 특정상황이 T인지F인지 판단할때 활용
// 어디부터 어디까지인지 다 확인해야 알수 있는 상황에 많이 쓰임
// 이때 ' 특정상황' 이 반복문 , 함수 등처럼 시간이 좀 흘러야,
// 범위를 모두 확인해야 알수 있을때 !
// 어떤 배열이 있는데 배열에 홀수가 있니? 
// 배열 내에 있니 
// 반복하는 동안 있니 ?

public class Test01 {

	public static void main(String[] args) {

		/// 복습 수정하기 ////

		int[] data = new int[5]; // 5칸 배열 만들기
		Random rand = new Random(); // 랜덤 돌리기
		for (int i = 0; i < data.length; i++) {
			data[i] = rand.nextInt(100) + 1; // 1~100
		}
		// data.length == 배열의 크기
		// != 저장되어있는 데이터의 개수
		// 데이터의 개수는 0이다 헷갈리지 않도록 주의

		System.out.print("[ ");
		for (int v : data) {
			System.out.print(v + " ");
		}
		System.out.println("]");

		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력) ");// 인덱스 번호 확인하는 정수 선택
		int num = sc.nextInt();

		boolean flag = false; // OFF. 배열에 num이 없는 상황을 의미
		int index = -1; // 전원이 off된 상태 배열에 num이 없는 상황을 의미
		// 핵심은 flag변수 이며 특정상황동안 확인하는
		// 있다면 true 없다면 false

		for (int i = 0; i < data.length; i++) {
			if (data[i] == num) {
				flag = true; // ON. 배열에 num이 있는 상황을 의미
				index = i;
			}
		}

		if (flag) { // num이 배열에 존재한다면,
			System.out.println(num + "은 [" + index + "]에 존재합니다!");
		} else {
			System.out.println(num + "은 존재하지않습니다...");
		}
	}
}
