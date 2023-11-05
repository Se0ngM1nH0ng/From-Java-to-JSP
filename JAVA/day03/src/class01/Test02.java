package class01;

public class Test02 {

	public static void main(String[] args) {

//		변수 3요소, 함수 3요소
//		주석, 가독성
//		연산자-우선순위
//		제어문 : 조건문, 반복문 <<-------- 어떤 상황에 어떤 문법을 사용하는지 !
//		디버깅표
		
		// 배열 []
		
		int stu1 = 20;
		int stu2 = 50;
		int stu3 = 70;
		//1. 서로 관련되어 있고 2. 타입도 같고 3. 개수도 안다.
		// 배열을 사용할수 있는 상황 이구나!
		int[] stu = new int[3];
		// new 연산 : 메모리에 공간을 생성해줘 ! 라는 부탁을 할때 쓴다.
		
		// [ 인덱스 ]
		// [ index] => 목차랑 똑같은 말 , 책에서 같은 주제 끼리 모아놓는 목차 !
		// ★ 0부터 시작한다 ★
		stu[0] = 20;
		stu[1] = 50;
		stu[2] = 75;
		
		
		for (int i = 0; i < 3; i++) {
			System.out.println("학생 " + i + "의 점수는 " + stu[i] + "점 입니다.");
		}
		
		
		
		
		
	}

}
