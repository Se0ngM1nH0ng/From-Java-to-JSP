package class01;

import java.util.HashSet;
import java.util.Random;

public class Test03 {

	public static void main(String[] args) {

		//랜덤수 생성 
		Random rand = new Random();

		//중복을 제외하고 //HashSet
		HashSet<Integer> data = new HashSet<Integer>();
		 
		 
		int num =0; //랜덤수
		int cnt = 0; //랜덤수의 개수

		//10개 생성 (단, 1~15 사이)
		for (int i = 0; i < 10; i++) {
			num = rand.nextInt(15)+1;
			data.add(num); // 컬렉션은 객체라 메서드 활용
			cnt ++;	
		}

		System.out.println("랜덤수는 " + cnt + "개 생성되었고,");
		System.out.println(data);
		System.out.println("입니다.");
		
		
	}

}
