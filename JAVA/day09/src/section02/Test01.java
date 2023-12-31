package section02;

import java.util.Random;

public class Test01 {

	public static void main(String[] args) {

		Random rand = new Random();

		int[] data = new int[10];

		// 1) 반복을 한다!
		// 2) 몇번할지는 모른다! -> while문
		int index = 0; // 현재 위치를 나타내는 변수

		while (index < data.length) { // data 배열이 완성될때까지 계속

			data[index] = rand.nextInt(10) + 1; // 랜덤수를 열심히 저장하고,
			// [flag 알고리즘]

			boolean flag = false; // 초기상태
			// 특별한 일이 발생하면,
			// [데이터 중복] 이 발생하면

			for (int i = 0; i < index; i++) {
				if (data[i] == data[index]) { // 데이터가 중복이야?
					flag = true;
				}
			} 
			// flag가 true 라면
			if (flag) { // data[index]가 이전에 있었다면
				continue; // 아래로 내려가면 안된다!!!!!
			}
			index++; // 다음으로!
		}
		System.out.print("[");
		for (int v : data) {
			System.out.print(v + " ");
		}
		System.out.println("]");
	}
}
