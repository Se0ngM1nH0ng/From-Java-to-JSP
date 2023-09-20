package class06;

import java.util.Scanner;

public class Test07 {
//	[1] 번 방식 : 거의 90퍼센트 1번 방식
//	Q1) 어떤 정수가 입력되었을때 , 짝수인지 아닌지 판별하는 함수
//	input : int 1개
//	output : boolean 짝수 인지 아닌지
	
	public static boolean isEven(int num) {
		if(num % 2 == 0) {
			return true; // 함수 즉시 종료 라서 true들어오면 바로 끝
		}
		return false;
	}
	
//	[2]번 방식
//	Q2) main에 구현되어있던 기능을 뜯어서 func()에 우선 넣고 시작!
	public static int checkMinus(int num, int b) {
		if(num < 0) {
			b++;
		}
		return b;
	}
	// 완성된 기능들의 묶음을 하나하나 분리해내는 작업
	// == 모듈화, 컴포넌트화
	// : 코드 재사용성이 증가함 ---->> 유지보수 용이(이익증가)
	
	public static int negativeNumber(int num) {
		int b = 0;
		if(num < 0) {
			b++;
		}
		return b;
	}
	
//	[1]
//	Q3) 어떤 정수가 0이니? 그럼 프로그램 종료 예정이야..
//			프로그램 종료 안내 멘트 출력해줘 !!
//	INPUT : int 1개 
//	OUTPUT: boolean
	
	public static boolean check(int num) {
	
		if(num == 0) {
			System.out.println("0이 입력되어 종료 ");
			System.out.println();
		}
		
		return false; // 보통 종료안함 
	}

	public static void main(String[] args) {
		
//		[ 과제 ]
//				1. main()에서 정수를 10번 입력할예정입니다.// 몇번만에 0을 입력할지 모르므로 while문
//				2. if(짝수야?) a++;
//				3. if(음수야?) b++;
//				4. 10번 입력완료했습니다. a=ㅁ,b=ㅁ입니다.
//				5. 만약, 입력된 정수가 0이라면 프로그램을 종료
//				   3번 입력완료했습니다. a=2,b=1입니다.
//				+) 함수를 활용해서 해당 과제를 해결해주세요!~~
//				   함수는 최대 3개까지 활용할수있습니다.
//		Scanner sc = new Scanner(System.in);
//
//		xxxxx int[] num = new int[10];// xxxxxx 몇번이 입력될거 같은지 아예 모르니까 배열 xxx 쓰지마라
		int a = 0; //이따 a++ 할거 초기화
		int b = 0; //이따 b++ 할거 초기화
		int count = 0; // 몇번 체크
		while (count<10) {
			System.out.println((count+1) + "번 정수를 입력해주세요");
			// 사용자 편의성을 고려
			// UI/UX
			int num = sc.nextInt();
				if (check(num)) {// num == 0
					break;
				}

			}
			count++;
			
			if(isEven(num)) { //num %2 == 0
				a++;
			}
			
			b = checkMinus(num,b); // 함수 끼리는 서로 메모리 공간을 공유 하지 않기 때문에 
								// 반드시 리턴값을 b를 써준다 
								// 서울에 사는 b와 부산에 사는 b는 서로 다르다 .
//			if(num <0 ) {
//				b++;
//			}
		}

		
		System.out.println(count + "번 입력완료했습니다.");
		System.out.println("짝수 : " + a );
		System.out.println("음수 : " + b );
		
	
	
	}

}
