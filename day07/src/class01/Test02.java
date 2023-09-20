package class01;

import java.util.Random;

class Student {
   String name;
   int[] score;
   double avg;
   char grade;
   Student(String name){
      this(name,2);
   }
   Student(String name,int cnt){
      this.name=name;
      this.score=new int[cnt];
//      this.makeScore(); // 한줄로 밑에 내용을 정리 할수 있다.
      Random rand=new Random();
      int sum=0;
      for(int i=0;i<this.score.length;i++) {
         this.score[i]=rand.nextInt(101);
         sum+=this.score[i];
      }
      this.avg=sum*1.0/this.score.length;
      this.grade='C';
      if(this.avg>=80.0) {
         this.grade='A';
      }
      else if(this.avg>=60.0) {
         this.grade='B';
      }
      
      System.out.println(this.name+"는 시험을 "+this.score.length+"번 봅니다.");
   }
//   void makeScore() { // 이렇게 따로 만들어 놔서 부르는게 가능
//      Random rand=new Random();
//      int sum=0;
//      for(int i=0;i<this.score.length;i++) {
//         this.score[i]=rand.nextInt(101);
//         sum+=this.score[i];
//      }
//      this.avg=sum*1.0/this.score.length;
//      this.grade='C';
//      if(this.avg>=80.0) {
//         this.grade='A';
//      }
//      else if(this.avg>=60.0) {
//         this.grade='B';
//      }
//   }
   void printInfo() {
      System.out.println(this.name);
      for(int i=0;i<this.score.length;i++) {
         System.out.println((i+1)+"번 시험 "+this.score[i]+"점");
      }
      System.out.println("평균 "+this.avg+"점 ["+this.grade+"]");
   }
   void test() {
//      this.makeScore(); // 이렇게 한줄로 바꿀수도 있다.
	   Random rand=new Random();
	      int sum=0;
	      for(int i=0;i<this.score.length;i++) {
	         this.score[i]=rand.nextInt(101);
	         sum+=this.score[i];
	      }
	      this.avg=sum*1.0/this.score.length;
	      this.grade='C';
	      if(this.avg>=80.0) {
	         this.grade='A';
	      }
	      else if(this.avg>=60.0) {
	         this.grade='B';
	      }
      System.out.println(this.name+"가 재시험을 봅니다.");
   }
}
public class Test02 {
   public static void main(String[] args) {

      
      Student s1=new Student("럭스");
      Student s2=new Student("유미",4);
      
      s1.printInfo();
      s2.printInfo();
      s2.test();
      s2.printInfo();
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
   }
}