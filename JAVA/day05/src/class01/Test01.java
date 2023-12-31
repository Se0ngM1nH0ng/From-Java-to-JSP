package class01;

import java.util.Scanner;

public class Test01 {

   // 1. 메서드 시그니처를 먼저 만들고, 그 다음에 기능을 구현
   // 2. 기능을 먼저 만들고, 메서드 시그니처를 문제에 맞추는 방법

   // [1] 
   // Q1) 어떤정수가 입력되었을때, 짝수인지아닌지 판별하는 함수
   // INPUT: int 1개 // 어떤정수가 입력
   // OUTPUT: boolean
   public static boolean isEven(int num) {
      if(num%2==0) {
         return true; // 함수 즉시 종료
      }
      return false;
   }
   
   // [2]
   // Q2) main에 구현되어있던 기능을 뜯어서 func()에 우선 넣고 시작!
   public static int checkMinus(int num,int b) {
      if(num<0) {
         b++;
      }
      return b;
   }
   // 완성된 기능들의 묶음을 하나하나 분리해내는 작업
   // == 모듈화,컴포넌트화
   // : 코드 재사용성이 증가함 --->> 유지보수 용이(이익증가)

   public static void main(String[] args) {

//     [ 과제 ]
//				1. main()에서 정수를 10번 입력할예정입니다.// 몇번만에 0을 입력할지 모르므로 while문
//				2. if(짝수야?) a++;
//				3. if(음수야?) b++;
//				4. 10번 입력완료했습니다. a=ㅁ,b=ㅁ입니다.
//				5. 만약, 입력된 정수가 0이라면 프로그램을 종료
//				   3번 입력완료했습니다. a=2,b=1입니다.
//				+) 함수를 활용해서 해당 과제를 해결해주세요!~~
//				   함수는 최대 3개까지 활용할수있습니다.
      
	   Scanner sc=new Scanner(System.in);


      // CTRL C,V를 하고있네? --->> 반복문!
      // while  VS  for : 여기선 while 
      int cnt=0; // 개수
      int a=0; // 짝수의 개수
      int b=0; // 음수의 개수
      while(cnt<10) { // 10번 입력될때 까지
         System.out.println((cnt+1)+"번 정수를 입력하세요."); // 개수가 0번부터 시작하니까 +1 
         // 사용자 편의성을 고려
         // UI/UX
         System.out.print("입력) ");
         int num=sc.nextInt();
         if(num==0) { // 0이 입력되었을때
            System.out.println("0이 입력되어 종료합니다...");
            System.out.println();
            break;
         }
         cnt++;

         if(num%2==0) {
            a++;
         }
         if(num<0) {
            b++;
         }
      }

      System.out.println(cnt+"번 입력완료했습니다.");
      System.out.println("짝수: "+a+"개");
      System.out.println("음수: "+b+"개");

   }

}