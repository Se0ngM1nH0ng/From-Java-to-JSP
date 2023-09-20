package class02;

import java.util.Random;

// 자동 임포트 ( C + S + O )
// 비옷을 꺼낼건데 창고에 있다 . 그러면 창고에서 계속 꺼내올수 없으니
// 단축키로 하자
public class Test03 {

	public static void main(String[] args) {

		int[] stu = new int[6];
		
		// 랜덤으로 정수를 생성해보자
		Random rand = new Random(); // 랜덤할 수 있는 기계를 미리 만들어놔야한다.
		
		for (int i = 0; i < stu.length; i++) {
			// stu[i] = 랜덤수;
			stu[i] = rand.nextInt(101); // 0~100 까지
			System.out.print(stu[i] + " ");
		}
		System.out.println();
		// 출력
		System.out.println("===== 학생 명단 =====");
		for (int i = 0; i < stu.length; i++) {
			System.out.println("학생" + (i + 1) + "번은" + stu[i] + "점 입니다.");
		}
		System.out.println("===================");

//		평균점수
		int sum = 0; // 총점을 저장할 변수

		for (int i = 0; i < stu.length; i++) {
			sum += stu[i]; // 총점을 차곡차곡 쌓는다. (복합연산자로)
		}

		double avg = sum * 1.0 / stu.length;
		System.out.println("총점은 " + sum + "점 입니다.");
		System.out.println("평균점수는 " + avg + "점 입니다.");

//		평균을 넘긴 학생수
		int count = 0; //평균을 넘긴 학생 수
		for (int i = 0; i < stu.length; i++) {
			if (stu[i] > avg) {
			// if(내가 보고있는 학생이 평균을 넘겼니?)
				count++;
			}
		}
		System.out.println("평균을 넘긴 학생 수는 " + count + "명 입니다.");
		
//		6등의 번호
//		----->> [최대값찾기 알고리즘] 을 활용
		int min = stu[0];
		int minIndex = 0;

		for (int i = 0; i < stu.length; i++) {
			if (min > stu[i]) {
				min = stu[i];
				minIndex = i;
			}
		}

		System.out.println("6등은 학생" + (minIndex + 1) + "번이고 " + "점수는 " + min + "점 입니다.");
//		짝수번째 학생들의 총점
		int total = 0;
		for (int i = 0; i < stu.length; i++) {
			if ((i + 1) % 2 == 0) {
				total += stu[i]; // 짝수번째 학생들의 점수를 total에 차곡차곡
			}
			
//			번외
//			if ((i + 1) % 2 == 1) {
//				continue; // 홀수번째면 하지마
//			}
		}

		System.out.println("짝수번째 학생들의 총점은 " + total + "점 입니다.");

//		평균을 못넘긴 학생들의 번호 --->> 변수 xx
//		 : 저장공간을 예상하는 방법
//		 : 나중에 배열을 생성
		int result = 0;

		System.out.print("평균을 못넘긴 학생들의 번호는 ");
		for (int i = 0; i < stu.length; i++) {
			if (stu[i] < avg) {
				result = (i + 1);
				System.out.print(result + "번 ");
			}
		}

		System.out.println(" 입니다.");

	}

}
