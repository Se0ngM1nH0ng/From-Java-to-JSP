package class02;

public class Test01 {

	public static void main(String[] args) {

//		상황 ) 학생 N명
//		총점수 합
//		평균점수
//		1등이 몇번인지?
		
		int[] stu = new int[5];
		stu[0] = 20;
		stu[1] = 12;
		stu[2] = 63;
		stu[3] = 87;
		stu[4] = 54;
		
		// 출력
		System.out.println("===학생명단===");
		for (int i = 0; i < stu.length; i++) {
			System.out.println("학생 " + (i+1) + "번은 " + stu[i] + "점 입니다.");
		}
		System.out.println("===============");
		
		
		// 총점 수 합
		int sum = 0;
		for (int i = 0; i < stu.length; i++) {
			sum += stu[i];
		}
		
		System.out.println("총점은 " + sum + "점 입니다.");
		
		double avg = sum * 1.0/stu.length; //형변환 (casting)
		System.out.println("평균은 " + avg  + "점 입니다.");
		
		// [최대값 찾기 알고리즘]
		
		int max = stu[0]; // 현재 최대값이 [0]에 존재하는 값이다!
		int maxIndex = 0; // 최대값이 저장된 index를 기억할 변수
						  // 최대값이 바뀔때만 바뀌면된다.
		
		// [1]부터 차례대로 '현재 최대값'과 비교
		for (int i = 1; i < stu.length; i++) {
			if(max<stu[i]) { // 최대값이 현재 비교값보다 작다면,
				// 변화발생
				max = stu[i];
				maxIndex = i;
			}
		}
		
		System.out.println("1등은 " + (maxIndex+1) + "번 학생이고" + "1등의 점수는 " + max + "점 입니다.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
