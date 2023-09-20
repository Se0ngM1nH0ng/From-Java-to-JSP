package class04;

import java.util.Random;
import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();

		int N = 4;
		String[] mName = new String[N];
		mName[0] = "포도";
		mName[1] = "딸기";
		mName[2] = "참외";
		mName[3] = "수박";

		int[] mPrice = new int[N];
		for (int i = 0; i < mPrice.length; i++) {
			mPrice[i] = (rand.nextInt(6)+10)*100; //1000~1500
		}

		int[] mCnt = new int[N];
		for (int i = 0; i < mCnt.length; i++) {
			mCnt[i] = rand.nextInt(4); // 0~3
		}
		
		while (true) {
			System.out.println("1.구매 2. 종료 ");
			System.out.println("입력) ");
			int action = sc.nextInt();
			
			
			if (action == 2) {
				System.out.println("이용해주셔서 감사합니다 !");
				System.out.println();
				break;
			} else if (action < 1 || action > 2) {
				System.out.println("잘못된 입력값입니다 .");
				System.out.println("다시 확인해주세요 !");
				System.out.println();
				continue;
			}
			int num;
			while (true) {
				System.out.println("===메뉴판====");
				System.out.println("어떤 과일을 고르시겠습니까 ?");
				System.out.println("[]괄호 안이 현재 남아있는 재고입니다.");
				for (int i = 0; i < mName.length; i++) {
					System.out.print((i + 1) + "-" + mName[i] + "[");
					if (mCnt[i] == 0) {
						System.out.print("재고없음");
					} else {
						System.out.print(mCnt[i]);
					}
					System.out.print("]" + " " );
				}
				System.out.println();
				System.out.println("===========");
				System.out.println("구매하실 상품의 번호를 입력하세요 !");
				num = sc.nextInt();
				
			
//				1~4사이 이고 재고도 있어야함!
//				(1<=num && num <= N) && (mCnt[num - 1]>0)
				if((1<=num && num <= N) && (mCnt[num - 1]>0) ) {// 정상입력이라면
					break;
				}
				
				if(num <1 || N < num) {
					System.out.println("없는 상품");
				}else if(mCnt[num - 1] == 0) {
					System.out.println("재고 없어서 구매 불가");
				}
				
				
			}
			int cnt; // 지역변수의 특성
			while (true) { // 유효성 검사 : 구매할 개수가 음수이거나, 재고보다 많으면 안됨!
				System.out.println("선택한 상품은 " + mName[num - 1] + "입니다.");
				System.out.println("가격: " + mPrice[num - 1] + "원  재고: " + mCnt[num - 1] + "개");
				System.out.print("구매할 개수를 입력) ");
				cnt = sc.nextInt();

				if (0 <= cnt && cnt <= mCnt[num - 1]) {
					break;
				}

				System.out.println("잘못된 입력입니다!");
				System.out.println("다시 입력해주세요!~~");
				System.out.println();
			}
			 int res = mPrice[num-1]*cnt;
	         int money;
	         System.out.println("금액: "+res+"원");
	         
	         
	         while(true) {
	            System.out.print("돈 입력) ");
	            money=sc.nextInt();
	            if(res<=money) {
	               break;
	            }
	            System.out.println("잘못된 입력입니다!");
	            System.out.println("새로 입력해주세요!");
	            System.out.println();
	         }

	         res=money-res;
	         if(res!=0) {
	            System.out.println("거스름돈 "+res+"원 반환 완료!");
	         }
	         System.out.println("구매 성공!");
	         System.out.println();

		
		
		
	}
}
}
