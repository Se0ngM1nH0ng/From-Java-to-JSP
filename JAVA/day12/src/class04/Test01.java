package class05;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class Student {
   private int num; // PK // ����ڰ� ����� �ߺ��˻��ؾ��� 
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
      System.out.println(this.name+"�л��� "+this.score+"���Դϴ�.");
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
      return this.num+"�� �л� "+this.name+" "+this.score+"��";
   }
}

public class Test01 {
   public static void main(String[] args) {

      Scanner sc=new Scanner(System.in);
      ArrayList<Student> data=new ArrayList<Student>(); // ����߰����� �������ϴ� ��Ȳ�̶� 
      int numPK=1001; // 1001������ ������� �ο�
      // PK�� "�����"�κ��� �Է¹޴°��, �ݵ�� "�ߺ��˻�"�� �ؾ���!
      // ex) ID
      
      while(true) {
         System.out.println("1. �л�������");
         System.out.println("2. ����躸��");
         System.out.println("3. �л��߰�");
         System.out.println("4. �л�����");
         System.out.println("5. ���α׷�����");
         System.out.print("�Է�) ");
         int action=sc.nextInt();

         if(action==1) {
            for(Student student:data) {
               System.out.println(student);
            }
         }
         else if(action==2) {
        	 // ���л� �迭���� ã�� �л� ����� �� 
        	 // �л� �鸸���ε� 2������ �ɷ����� ã�� �ٷ� ���������°� �����Ƿ� break ��
        	  System.out.print("�л���ȣ�Է�) ");
              int num=sc.nextInt();
              for(int i=0;i<data.size();i++) {
                 if(num == data.get(i).getNum()) {
                    data.get(i).test();
                    break;
                 }
              }
         }
         else if(action==3) {
            System.out.print("�л��̸��Է�) ");
            String name=sc.next();
            data.add(new Student(num++,name));
         }
         else if(action==4) {
        	 System.out.print("�л���ȣ�Է�) "); // �̸��� �ߺ��ϼ��� �����Ƿ�
        	 								//  �л� ���� ��ȣ�� �޾ƾ���
             int num =sc.nextInt();
             for (int i = 0; i < data.size(); i++) {
            	 //�迭�� ���ִ� �л��� ��ȣ
				if(num == data.get(i).getNum()) {//num�� ��ȣ�� ���� �л��� �ִ�?
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