package class07;

import java.util.Random;
import java.util.Scanner;

public class Test03 {

   /*
   ���� ����
   2�� ������ ����� ������� ����� ������ּ���!~~

   1. ȫ�浿
   2. �Ӳ���
   3. Ƽ��
   4. ��Ʈ�Ͻ�
   5. �𸣰���

   �ִ� 5��
   5�� �������� ��---��
    */

   // [2]�� ������ �����ϱ�����,
   // for(���� ���翡 ����� ����� ����ŭ)
   // �迭 OK! String[] data=new String[5];

   public static boolean check(int num,String user) {
      final int NUM=num;
      // final : ���ȭ

      int cnt=0; // �ڼ� Ƚ�� ī��Ʈ�� ����

      // 1. ��¥ ������ ����� String ans
      //////////////////////////////////////////////////
      int x=1000;
      while(x>0) {
         int n=num/x; // 1000�� ���, 1�� �ǹ���
         if(n==3 || n==6 || n==9) {
            cnt++;
         }

         num%=x; // 1312�� ���, 13�� �ǹ��ϰ� �ǹǷ� ��ó���� �ʼ�!
         x/=10;
      }
      //////////////////////////////////////////////////

      String ans="";
      for(int i=0;i<cnt;i++) {
         ans+="¦";
      }
      if(cnt==0) {
         // ����ȯ(casting)
         // ������ num���� ������� ������ �ʿ��ϱ���!
         ans=Integer.toString(NUM);
      }      

      // 2. ans�� user�� ��
      System.out.println("ans: "+ans);
      System.out.println("user: "+user);
      if(ans.equals(user)) {
         return true;
      }
      return false;
      // �����ڴ� �⺻ �ڷ���(����Ÿ��)���Ը� ����Ǵ� ����
      // Ŭ����(��ü)���� �����ڷ� �񱳺Ұ���
   }

   public static void main(String[] args) {

      Scanner sc=new Scanner(System.in);
      Random rand=new Random();

      // [2]�� ������ �����ϱ�����,
      // for(���� ���翡 ����� ����� ����ŭ)
      // �迭 OK! String[] data=new String[5];
      
      String[] data=new String[5]; // 5ĭ�� �迭�� ����� 
      
//      for(int i=0;i<data.length;i++) {
//         data[i]="_____"; // ��ĭ����  "___" ��� // ���� ����� ����� ������
//      }
      int dataCnt=0; // ���� ���翡 ����� ����� ��

      while(dataCnt<data.length) { // ����� ����� �迭���� ��������

         for(int i=0;i<data.length;i++) {
            System.out.println((i+1)+". "+data[i]); //���. �̸�
         }
         System.out.println("--------------------");

         int i=0;
         while(i<3) {

            int randNum=rand.nextInt(1000)+1;
            System.out.print("["+randNum+"] : ");
            String userAns=sc.next();

            if(!check(randNum,userAns)) {
               System.out.println("�����Դϴ�.....");
               break;
            }
            System.out.println("�����Դϴ�!");
            i++;

         }

         if(i==3) {
            System.out.print("���� ���翡 �ø� �̸��� �Է�) ");
            data[dataCnt]=sc.next();
            System.out.println(data[dataCnt]+"��, �����մϴ�! :D");
            dataCnt++;
         }

      }

   }

}