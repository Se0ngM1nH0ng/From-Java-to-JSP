package class02;

import java.util.Random;
import java.util.Scanner;

// ����� Ǯ��
class Pokemon{
   String name; // ���ϸ� �̸�
   int lv; // ����
   int exp; // ����ġ
   
   Pokemon(){ // �����ڿ��� �����
      Scanner sc=new Scanner(System.in);
      System.out.print("�̸��Է�) ");
      this.name=sc.next();
      System.out.print("�����Է�) ");
      this.lv=sc.nextInt();
      Random rand=new Random();
      this.exp=rand.nextInt(11); // ����ġ�� 0~10���� ����
   }
   Pokemon(String name,int lv,int exp){ // �̸�, ����, ����ġ
      this.name=name;
      this.lv=lv;
      this.exp=exp;
   }
   void printInfo() { // �̸��� ���� , ����ġ�� ������ִ� �޼���
      System.out.println(this.name+" Lv."+this.lv+"["+this.exp+"/100]");
   }
   void game() { // ������ �����ϴ� �޼���
      Random rand=new Random();
      int randNum=rand.nextInt(2); // 0,1 ���� ���� //0�̸� ���� 1�̸� ����
      if(randNum==0) {
         this.exp+=rand.nextInt(101)+50; // 50~150 ������ ���� ����ġ�� ��´�
         System.out.println("����!");
      }
      else {
         this.exp+=10; // 10�� ����ġ�� ��´�
         System.out.println("����...");
      }

      while(this.exp>=100) { // ����ġ�� 100�� �Ѿ��
         System.out.println(this.name+", ������!");
         this.lv++; // ������ 
         this.exp-=100; // ������ �ǰ� ����ġ�� �ٽ� �ʱ�ȭ �Ǿ�� �ϹǷ� -100 ���ֱ�
      }
   }
}

public class Test05 {
   public static void main(String[] args) {

      Pokemon[] data=new Pokemon[2]; // ���ϸ� 2ĭ �迭
      data[0]=new Pokemon(); // �����ڿ��� ������ ��

      Scanner sc=new Scanner(System.in);

      String name;
      while(true) {
         System.out.print("�̸��Է�) "); // �Է¹޾Ƽ��� �ޱ�
         name=sc.next();
         
         System.out.print("�̰Ը³���?(1-YES,2-NO) ");
         int action=sc.nextInt();
         if(action==1) {
            break;
         }
      }
      System.out.print("�����Է�) ");
      int lv=sc.nextInt();
      Random rand=new Random();
      int exp=rand.nextInt(11); // 0~10 ������ ���� ����ġ
      data[1]=new Pokemon(name,lv,exp); // �ι�° ���ϸ� �̸�,����,����ġ �����Ϸ�
      

      int i=0;
      while(true) {

         for(int j=0;j<data.length;j++) {
            data[j].game(); // ��������
            data[j].printInfo(); // ���ϸ� ��� �޼���
         }
         if(i==10) {// ������ 10���� �����ϱ�� �Ѵ�.
            break;
         }
         i++;
      }
   }
}