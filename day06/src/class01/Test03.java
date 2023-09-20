package class01;

import java.util.Random;
import java.util.Scanner;

// 369게임 1,2번 풀이
public class Test03 {

//	1번 문제 !
   // input: 정답과 사용자의 입력값을 알려주면
   // output: 맞췄는지 틀렸는지를 반환
   public static boolean check(int num,String user) {// 정답인지 아닌지 boolean
      final int NUM=num; //초기값은 변하면 안되니까 final로 설정해주기 
      int cnt=0; //  "짝" 박수의 개수

      int x=1000;
      while(x>0) {
         int n=num/x;
         if(n==3 || n==6 || n==9) {
            cnt++;
         }

         num=num%x; // 1234 -> 234
         x=x/10;
      }
      
      String ans=""; // 문자열값 초기화
      for(int i=0;i<cnt;i++) {	// 반복문을 통해 짝 카운트만큼 "짝" 이라고 적립
         ans+="짝";
      }
      if(cnt==0) {					// 짝이 하나도 안들어갈시에
         ans=Integer.toString(NUM); // 정수에서 문자열로 int->String
      }				// 문자열에서 정수는 ? String->int는? Integer.parseInt();
      
      System.out.println("ans: "+ans); 
      System.out.println("user: "+user);
      
      if(ans.equals(user)) {// 정답과 입력한 값이 같다면 true
         return true; // true 로 종료
      }
      return false; // 기본값 false
   }

   public static void main(String[] args) {

      // int num
      //  -> 1~1000중에서 랜덤으로 정수 1개 생성
      // syso("[num] : ")
      // 사용자가 입력을 시도함
      //  -> String user
      // if(정답상황이라면,)
      //     syso("정답")
      // else
      //     syso("오답")

      Scanner sc=new Scanner(System.in);
      Random rand=new Random();
      int num=rand.nextInt(1000)+1;
      System.out.print("["+num+"] : "); //1~1000까지 랜덤 정수 1개
      String user=sc.next(); // 사용자에게 정답입력을 받는다

      if(check(num, user)) { // 정답상황이라면,
         System.out.println("정답입니다!"); // 그 숫자의 정답이 맞으면 정답
      }
      else {
         System.out.println("오답입니다....."); // 입력한 숫자와 정답이 틀리면 오답
      }










   }
}