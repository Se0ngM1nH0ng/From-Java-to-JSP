package class02;

import java.util.Random;
import java.util.Scanner;

// 강사님 풀이
class Pokemon{
   String name; // 포켓몬 이름
   int lv; // 레벨
   int exp; // 경험치
   
   Pokemon(){ // 생성자에서 만든다
      Scanner sc=new Scanner(System.in);
      System.out.print("이름입력) ");
      this.name=sc.next();
      System.out.print("레벨입력) ");
      this.lv=sc.nextInt();
      Random rand=new Random();
      this.exp=rand.nextInt(11); // 경험치는 0~10에서 랜덤
   }
   Pokemon(String name,int lv,int exp){ // 이름, 레벨, 경험치
      this.name=name;
      this.lv=lv;
      this.exp=exp;
   }
   void printInfo() { // 이름과 레벨 , 경험치를 출력해주는 메서드
      System.out.println(this.name+" Lv."+this.lv+"["+this.exp+"/100]");
   }
   void game() { // 게임을 실행하는 메서드
      Random rand=new Random();
      int randNum=rand.nextInt(2); // 0,1 둘중 선택 //0이면 성공 1이면 실패
      if(randNum==0) {
         this.exp+=rand.nextInt(101)+50; // 50~150 까지의 랜덤 경험치를 얻는다
         System.out.println("성공!");
      }
      else {
         this.exp+=10; // 10의 경험치를 얻는다
         System.out.println("실패...");
      }

      while(this.exp>=100) { // 경험치가 100이 넘어가면
         System.out.println(this.name+", 레벨업!");
         this.lv++; // 레벨업 
         this.exp-=100; // 레벨업 되고 경험치는 다시 초기화 되어야 하므로 -100 해주기
      }
   }
}

public class Test05 {
   public static void main(String[] args) {

      Pokemon[] data=new Pokemon[2]; // 포켓몬 2칸 배열
      data[0]=new Pokemon(); // 생성자에서 만들어온 것

      Scanner sc=new Scanner(System.in);

      String name;
      while(true) {
         System.out.print("이름입력) "); // 입력받아서도 받기
         name=sc.next();
         
         System.out.print("이게맞나요?(1-YES,2-NO) ");
         int action=sc.nextInt();
         if(action==1) {
            break;
         }
      }
      System.out.print("레벨입력) ");
      int lv=sc.nextInt();
      Random rand=new Random();
      int exp=rand.nextInt(11); // 0~10 까지중 랜덤 경험치
      data[1]=new Pokemon(name,lv,exp); // 두번째 포켓몬도 이름,레벨,경험치 설정완료
      

      int i=0;
      while(true) {

         for(int j=0;j<data.length;j++) {
            data[j].game(); // 게임진행
            data[j].printInfo(); // 포켓몬 출력 메서드
         }
         if(i==10) {// 게임을 10번만 진행하기로 한다.
            break;
         }
         i++;
      }
   }
}