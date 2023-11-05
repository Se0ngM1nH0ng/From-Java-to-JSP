package class04;

import java.util.Random;
import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {

      Random rand=new Random();
      Scanner sc=new Scanner(System.in);

      int N=2; // 상품이 2개란 뜻
      String[] mName=new String[N]; // 메뉴이름 배열 // 문자열 N개만큼 입력받기
      for(int i=0;i<mName.length;i++) {
         System.out.print((i+1)+"번 상품이름 입력: ");
         mName[i]=sc.next(); // 문자열 입력
         System.out.println(mName[i]+" 상품 저장완료!");
         System.out.println();
      }
      int[] mPrice=new int[N]; // 가격도 N개 까지
      for(int i=0;i<mPrice.length;i++) {
         System.out.print(mName[i]+"의 가격입력: ");
         mPrice[i]=sc.nextInt();
      }
      System.out.println();
      int[] mCnt=new int[N];
      for(int i=0;i<mCnt.length;i++) {
         System.out.print(mName[i]+"의 개수입력: ");
         mCnt[i]=sc.nextInt();
      }
      System.out.println();
      System.out.println();
      System.out.println();
      /*
      String[] mName=new String[N]; // 메뉴이름 배열
      mName[0]="아메리카노";
      mName[1]="카페라떼";
      mName[2]="아이스티";
      mName[3]="프라푸치노";
      int[] mPrice=new int[N];
      for(int i=0;i<mPrice.length;i++) {
         mPrice[i]=(rand.nextInt(6)+10)*100; // 1000~1500
         // 10~15 x100 : 연산자 우선순위 이슈 체크!
      }
      int[] mCnt=new int[N];
      for(int i=0;i<mCnt.length;i++) {
         mCnt[i]=rand.nextInt(4); // 0~3
      }
       */
      
      while(true) {
         System.out.println("1.구매 2.종료");
         System.out.print("입력) ");
         int action=sc.nextInt();
         if(action==2) {
            System.out.println("프로그램 종료...");
            System.out.println();
            break;
         }
         else if(action<1 || 2<action) {
            System.out.println("유효하지않은 값입니다!");
            System.out.println("다시입력해주세요!");
            continue;
         } 
         
         int num;
         while(true) {
            System.out.println(" === 메뉴목록 ===");
            for(int i=0;i<mName.length;i++) {
               System.out.print((i+1)+". "+mName[i]+"[");
               if(mCnt[i]==0) {
                  System.out.print("재고없음");
               }
               else {
                  System.out.print(mCnt[i]);
               }
               System.out.println("]");
            }
            System.out.println("===============");
            System.out.print("번호입력) ");
            num=sc.nextInt();

            // 1~4사이이고, 재고도 있어야함!
            if((1<=num && num<=N) && (mCnt[num-1]>0)) {
               break;
            }

            if(num<1 || N<num) {
               System.out.println("없는 상품입니다!");
            }
            else if(mCnt[num-1]==0) {
               System.out.println("재고가 없어서 구매가 불가능합니다!");
            }

         }
         
         
         int cnt;
         while(true) {
        	 System.out.println("선택하신 상품은 " + mName[num-1] + "입니다.");
        	 System.out.println("가격은 " + mPrice[num-1] + "입니다.");
        	 System.out.println("재고는 " + mCnt[num-1] + "입니다.");
        	 System.out.println("몇개 구입하시겠습니까 ?");
        	 cnt = sc.nextInt();
        	 
        	 if(cnt > 0 && cnt <= mCnt[num-1]) {
        		 break;
        	 }else if(cnt == 0) {
        		 System.out.println("재고가 없습니다.");
        	 }
        	 
        	 System.out.println("잘못입력하셨습니다.");
        	 System.out.println("다시입력해주세요.");
         }
         int product = mCnt[num-1] - cnt;
         int res = (mPrice[num-1]) * cnt;
         int money;
         
         
         System.out.println("총 가격은 " + res + "입니다.");
         
         while(true) {
        	 System.out.println("돈 입력하기");
        	 money = sc.nextInt();
        	 if(money >= res) {
        		 break; 
        	 }
        	 else if(money == 0 ) {
        		 System.out.println("잔액이 부족합니다.");
        	 }
        	 System.out.println("다시 입력해주세요");
         }
         System.out.println("현재 재고는 " + product + "입니다.");
         res = money - res;
         if(res != 0) {
        	 System.out.println("거스름돈은" + res + "원 입니다.");
         }
         System.out.println("이용해주셔서 감사합니다.");












      }





   }

}