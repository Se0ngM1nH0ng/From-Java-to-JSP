package class01;

import java.util.Random;
import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {

//			[자판기 프로그램 작성하기]
//			1. 상품은 4개
//			2. 이름은 정하되
//			3. 가격, 재고는 랜덤으로 설정
//			4. 1.구매, 2. 종료
//			5. 상품 목록을 재고와 함께 출력
//			단, '재고가 없는 상품은 출력하지 않습니다'
//			
//			1 입력시 -> 몇개구매?
//			2 입력시 -> 재고가 없어서 구매가 불가능합니다
//			4 입력시 -> 없는 상품입니다!
//			
//			6. 그외에는 모두 연습문제와 동일하게 진행해주세요 ~

//			상품 4개 갯수 공간 정하기
//			메뉴 담을 변수 생성
//			가격, 재고는 랜덤 설정 생성
//			구매 , 종료 버튼 만들기
//		
//			상품목록 만들기
//			재고 만들기
//			총금액 안내
//			사용자 돈 입력 받기
//			거스름돈 만들기
//			재고와 함께 출력
//			

		Scanner sc = new Scanner(System.in);
		Random rand = new Random();

		int N = 4; // 상품개수
		String[] mName = new String[N]; // 상품 목록 만들기 [N]인덱스 개 만큼
		mName[0] = "포도";
		mName[1] = "딸기";
		mName[2] = "참외";
		mName[3] = "수박";

		int[] mPrice = new int[N]; // 가격은 랜덤으로 
		for (int i = 0; i < mPrice.length; i++) {
			mPrice[i] = (rand.nextInt(5)+1) * 100;
		}

		int[] mCnt = new int[N]; // 재고도 랜덤으로
		for (int i = 0; i < mCnt.length; i++) {
			mCnt[i] = rand.nextInt(5) + 1;
		}

		// 구매 ,종료 할건지 툴 만들기
		while (true) {
			System.out.println("1.구매 2. 종료 ");
			System.out.println("입력) ");
			int action = sc.nextInt(); // 구매 종료 둘중 숫자를 입력 받는다.
			
			if (action == 2) {
				System.out.println("이용해주셔서 감사합니다 !");
				System.out.println();
				break; // 즉시 탈출
			} else if (action < 1 || action > 2) { // 유효성 검사
				System.out.println("잘못된 입력값입니다 .");
				System.out.println("다시 확인해주세요 !");
				System.out.println();
				continue;
			}
			
		
		
//		메뉴판 목록 만들기
//		메뉴판과, 재고 같이 띄워주기
//		재고가 ==0 일때 재고없음 만들어주기
		int num;
		while (true) {
			System.out.println("===메뉴판====");
			System.out.println("어떤 과일을 고르시겠습니까 ?");
			System.out.println("[]괄호 안이 현재 남아있는 재고입니다.");
			for (int i = 0; i < mName.length; i++) {
				System.out.print((i + 1) + "-" + mName[i] +"[" +mCnt[i]);
				if (mCnt[i] == 0) {
					System.out.println("재고없음");
				}// else {
				//	System.out.print(mCnt[i]);
				//}
				System.out.println("]" + " ");
			}
			System.out.println();
			System.out.println("===========");
			System.out.println("구매하실 상품의 번호를 입력하세요 !");
			num = sc.nextInt(); // 구매할 상품 번호 입력넣기

			if (1 <= num && num <= N) {// 여기안에 들어가면 통과 
				break;
			}

			// 입력된 값이 1부터 N사이가 아니면 출력
			System.out.println("없는 상품번호입니다 !");
			System.out.println("다시 입력해주세요 !");
			System.out.println();
		}

		// 상품
		int cnt;
		int product;
		while (true) { //상품 번호보다 인덱스 번호는 0부터 시작하기 때문에 -1 해준다.
			System.out.println("선택한 상품은" + mName[num - 1] + "입니다."); //상품이름
			System.out.println("가격: " + mPrice[num - 1] + "원");
			System.out.println("재고: " + mCnt[num - 1] + "개");
			System.out.println("구매할 개수를 입력해주세요");
			cnt = sc.nextInt(); // 상품에 대한 가격 재고 안내하였고 구매할 개수 입력받기
			// 구매할 개수
			product = mCnt[num - 1] - cnt;
			
			if(product > 0) {
				System.out.println("구매 성공 !");
				break;
			}else if(product == 0) {
				System.out.println("재고가 없습니다.");
				System.out.println("다시 입력해주세요 !");
				
			}
			
			System.out.println("잘못된 입력입니다");
			System.out.println("다시 입력해주세요 !");

		}
			System.out.println("구매성공");
			System.out.println("현재 재고는 : " + product + "입니다.");
			// 총 금액
			int result = (mPrice[num - 1]) * cnt;
			int money;
			System.out.println("금액은 :" + result + "원 입니다.");
		
			// 가진 금액
			while(true) {
				System.out.println("금액을 입력하세요.");
				money = sc.nextInt();
				if(result <= money) {
					break;
				}
				System.out.println("금액이 부족합니다 !");
				System.out.println("돈을 다시 투입해주세요 !");
			}
		
			// 거스름돈
			result = money - result;
			System.out.println("거스름돈은 " + result + "입니다.");
			
			// 재고 차감
			product -= cnt;
			
		}
		
	}

}
