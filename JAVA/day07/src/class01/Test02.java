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
//      this.makeScore(); // ���ٷ� �ؿ� ������ ���� �Ҽ� �ִ�.
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
      
      System.out.println(this.name+"�� ������ "+this.score.length+"�� ���ϴ�.");
   }
//   void makeScore() { // �̷��� ���� ����� ���� �θ��°� ����
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
         System.out.println((i+1)+"�� ���� "+this.score[i]+"��");
      }
      System.out.println("��� "+this.avg+"�� ["+this.grade+"]");
   }
   void test() {
//      this.makeScore(); // �̷��� ���ٷ� �ٲܼ��� �ִ�.
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
      System.out.println(this.name+"�� ������� ���ϴ�.");
   }
}
public class Test02 {
   public static void main(String[] args) {

      
      Student s1=new Student("����");
      Student s2=new Student("����",4);
      
      s1.printInfo();
      s2.printInfo();
      s2.test();
      s2.printInfo();
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
   }
}