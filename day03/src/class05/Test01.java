package class05;

import java.util.Random;

public class Test01 {

	public static void main(String[] args) {

//				[문제]
//				1. 주석
//				2. 한글풀이
//
//				1) 이 배열의 이름은 data 이고
//				2) 3~5개까지중에서 랜덤으로 크기를 결정
//				   ex) 3 --->> [ _ _ _ ]
//				3) data에 저장되는 정수는 100~105 사이의 랜덤수가 저장됨
//				   ex) [ 102 100 100 ]
//				4) A- 홀수들의 총합
//				5) B- 짝수들의 평균

		// 1. 랜덤으로 크기를 결정
		// 2. 배열 생성
		// 3. data에 100~105 사이에 값도 랜덤
		// 4. data 배열에 담기
		// 5. 홀수들의 총합
		// 6. 짝수들의 평균

		// 랜덤으로 크기를 생성해보자
		Random rand = new Random(); // 랜덤할 수 있는 기계를 미리 만들어놔야한다.
		int N = rand.nextInt(3) + 3;

		int[] data = new int[N]; // 데이터배열의 크기

		// 100~105 사이에 랜덤수를 담을 공간

		// N 으로 쓸수 있다(배열의 크기 랜덤)
		System.out.print("[ ");
		for (int i = 0; i < data.length; i++) {
			data[i] = rand.nextInt(6) + 100;
			System.out.print(data[i] + " ");
		}
		System.out.println("]");

		// 홀수들의 총합

		int sum = 0;
		for (int i = 0; i < data.length; i++) {
			if (data[i] % 2 == 1) {
				sum += data[i];
			}
		}
		System.out.println("홀수총합 : " + sum);
		// 짝수들의 평균

		int num = 0;

		for (int i = 0; i < data.length; i++) {
			if (data[i] % 2 == 0) {
				num += data[i];
			}
		}

		double avg = num * 1.0 / data.length;
		System.out.println("짝수평균 : " + avg);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
	}
}
