package class01;

import java.util.ArrayList;
import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {

		//중복 허용 
		ArrayList<Integer> datas = new ArrayList<Integer>();
		// 배열은 갯수가 정해져 있어야 하는데 그게 안되어 있어서 일반 배열은 못쓴다.
		// 컬렉션을 써야 겠네? 근데 중복을 허용 해야하니까 ? Array
		//정수를 입력 (끝날때 까지 한다 while)
		//0을 입력하면 종료  //종료조건 break;

		Scanner sc = new Scanner(System.in);
		int cnt = 0; // 입력 개수 
		int sum = 0; // 총합 초기화
		double avg = 0.0; // 평균 초기화
		int num = 0;
		while(true){
			System.out.println("정수입력) ");
			System.out.println("0을 입력하면 종료 됩니다.");
			num = sc.nextInt();

			if( num == 0) { // 프로그램 종료 
				break;
			}
			sum += num;
			cnt ++;
		}

		// 프로그램 종료 후 현재까지 입력한 정수들의 평균 출력
		avg = sum * 1.0 / cnt;
		
		System.out.println("평균은 " + avg + "입니다.");
		for (int i = 0; i < cnt; i++) { // 짝수를 보기전에 전체를 한번 봐야된다.
			datas.add(num); // 내가 저장한 수 들을 보여줘 !
		}
		if(  % 2 == 0 ) {
			System.out.println("짝수는 " + cnt + "개 입니다");
			System.out.println(datas);
		} 



	}

}
