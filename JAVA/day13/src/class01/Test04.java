package class01;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {

		ArrayList<Integer> data = new ArrayList<Integer>();

		Scanner sc = new Scanner(System.in);
		//정수를 입력 10개가 될때 까지 계속
		
		int cnt = 0;
		while(cnt<10){
			// 사용자가 잘못된 입력을 했을시	
			try {
				System.out.println("정수 입력) ");
				int num = sc.nextInt();
				System.out.println("num= " + num);
				data.add(num);
				cnt++;
			}
			catch(InputMismatchException e){
				sc.nextLine(); // 버퍼에 남아있는 쓰레기값을 제거하는 코드 
				System.out.println("정수로만 입력해주세요");
				
			}
		}

		// 입력한 정수들을 모두 출력 
		System.out.println(" 입력한 정수 ");
		for(int i =0; i<data.size(); i++){
			data.get(i);
			// 이중에서 0이하인 정수들을 모두 제거 
			if(data.get(i) <=0) {
				data.remove(i);
			}
		}
		System.out.println();
		System.out.println("0 이하의 수 제거");
		System.out.println(data);
		

		//이중에서 가장 큰 정수가 저장된 인덱스 넘버 출력 
		//data[0] 첫번째를 제일 큰값이라고 지정 
		// 최대값 알고리즘
		int max = data.get(0);
		int maxIndex = 0;

		for(int i = 1 ; i<data.size(); i++){
			if(max<data.get(i)){
				max = data.get(i);
				maxIndex = i;
			}
		}

		//가장 큰 정수를 제외하고 남은 정수들의 합과 평균 출력 
		//가장 큰 정수를 제외 
		for(int i =0; i<data.size(); i++){
			data.get(i);
		} 
		System.out.println("가장큰정수가있는곳은 "+ "[" + (maxIndex+1) + "] 번");
		data.remove(maxIndex);

		//남은 정수들의 합 과 평균 출력 
		int index = 0; // 남은 인덱스 개수
		int sum = 0; // 총합
		double avg = 0.0;
		for(int i =0; i<data.size(); i++){
			sum += data.get(i); // 정수들의 합 구하기
			index ++; // 카운트 해주기 
		} 
		avg = sum * 1.0 / index;
		System.out.println("남은 정수들의 합은 " + sum + "입니다.");
		System.out.println("평균은 "+avg + " 입니다");





	}

}

