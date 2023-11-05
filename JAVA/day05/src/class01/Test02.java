package class01;

import java.util.Random;
import java.util.Scanner;

/*
+++) 10개의 랜덤정수가 저장된 배열(범위:1~100)
 사용자가 정수를 입력 ex) 50
 50은 [2]에 저장되어있습니다.
 50은 배열에 없습니다!
 */
public class Test02 {

   // 배열에 특정정수가 있는지없는지-1
   // 있다면, 몇번인덱스인지-2
   // INPUT: int[] 1개, int 1개
   // OUTPUT: (boolean,)int
   //   => 2개이상의 반환은 불가능!
   //      int의 값에 의미를 부여하는 방식으로 해결!
   public static int checkNum(int[] data,int num){
      for(int i=0;i<data.length;i++) {// 배열 길이 만큼
         if(data[i] == num) {// 인덱스 번호에 그 점수가 있으면 그 인덱스를 반환한다
            return i;
         }
      }      
      return -1; // false를 의미함
   }
   
   public static void main(String[] args) {
      
      Random rand=new Random();
      int[] data=new int[10]; //10칸의 공간 배열을 만들었다.
      for(int i=0;i<data.length;i++) {
         data[i]=rand.nextInt(100)+1; //1~100까지 중 랜덤이다.
      }
      System.out.print("[ ");
      for(int v:data) { //향상된 for문(forEach문)으로 data를 v에 담기
         System.out.print(v+" ");
      }
      System.out.println("]");
      System.out.println();
      
      Scanner sc=new Scanner(System.in);
      System.out.print("정수입력) "); // 랜덤 정수들이 출력된것 중에서 정수 하나의 인덱스 번호를 알고싶을때
      int num=sc.nextInt();
      int index=checkNum(data,num);// 인덱스번호 위치에 각각 값들 넣기
      if(index<0) { // 유효성 검사
         System.out.println(num+"은 배열에 없습니다!");
      }
      else {
         System.out.println(num+"은 ["+(index+1)+"]에 저장되어있습니다.");
      }
      
   }

}