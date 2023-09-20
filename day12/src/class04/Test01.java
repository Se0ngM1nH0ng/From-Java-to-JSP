package class05;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class Student {
   private int num; // PK // 사용자가 만들면 중복검사해야함 
   private String name;
   private int score;
   Student(int num,String name){
      this.num=num;
      this.name=name;
      Random rand=new Random();
      this.score=rand.nextInt(101);
   }
   void test() {
      Random rand=new Random();
      this.score=rand.nextInt(101);
      System.out.println(this.name+"학생은 "+this.score+"점입니다.");
   }
   public int getNum() {
      return num;
   }
   public void setNum(int num) {
      this.num = num;
   }
   public String getName() {
      return name;
   }
   public void setName(String name) {
      this.name = name;
   }
   public int getScore() {
      return score;
   }
   public void setScore(int score) {
      this.score = score;
   }
   @Override 
   public String toString() {
      return this.num+"번 학생 "+this.name+" "+this.score+"점";
   }
}

public class Test01 {
   public static void main(String[] args) {

      Scanner sc=new Scanner(System.in);
      ArrayList<Student> data=new ArrayList<Student>(); // 몇명추가할지 알지못하는 상황이라 
      int numPK=1001; // 1001번부터 순서대로 부여
      // PK를 "사용자"로부터 입력받는경우, 반드시 "중복검사"를 해야함!
      // ex) ID
      
      while(true) {
         System.out.println("1. 학생목록출력");
         System.out.println("2. 재시험보기");
         System.out.println("3. 학생추가");
         System.out.println("4. 학생삭제");
         System.out.println("5. 프로그램종료");
         System.out.print("입력) ");
         int action=sc.nextInt();

         if(action==1) {
            for(Student student:data) {
               System.out.println(student);
            }
         }
         else if(action==2) {
        	 // 그학생 배열에서 찾은 학생 재시험 봐 
        	 // 학생 백만명인데 2번에서 걸렸으면 찾고 바로 빠져나오는게 좋으므로 break 씀
        	  System.out.print("학생번호입력) ");
              int num=sc.nextInt();
              for(int i=0;i<data.size();i++) {
                 if(num == data.get(i).getNum()) {
                    data.get(i).test();
                    break;
                 }
              }
         }
         else if(action==3) {
            System.out.print("학생이름입력) ");
            String name=sc.next();
            data.add(new Student(num++,name));
         }
         else if(action==4) {
        	 System.out.print("학생번호입력) "); // 이름이 중복일수도 있으므로
        	 								//  학생 고유 번호를 받아야함
             int num =sc.nextInt();
             for (int i = 0; i < data.size(); i++) {
            	 //배열에 들어가있는 학생의 번호
				if(num == data.get(i).getNum()) {//num와 번호가 같은 학생이 있니?
						data.remove(i);
						break;
				}
			}
         }
         else {
            break;
         }








      }



























   }
}