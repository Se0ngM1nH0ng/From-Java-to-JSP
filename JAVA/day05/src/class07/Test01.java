package class07;

import java.util.Random;
import java.util.Scanner;

public class Test01 {
   
   // �޼��� �ñ״�ó�� ���� ����Ұ�
   // INPUT: int 1��, String 1��
   // OUTPUT: boolean
   // ����� ������� �Է°��� ���ؼ�,
   // �¾Ҵ��� Ʋ�ȴ����� ��ȯ
   public static boolean check(int num,String user) {
      final int NUM=num;
      // final : ���ȭ
      
      int cnt=0; // �ڼ� Ƚ�� ī��Ʈ�� ����
      
      // 1. ��¥ ������ ����� String ans
      //////////////////////////////////////////////////
      int n=num/1000; // 1000�� ���, 1�� �ǹ���
      if(n==3 || n==6 || n==9) {
         cnt++;
      }
      
      num=num%1000; // 1312�� ���, 13�� �ǹ��ϰ� �ǹǷ� ��ó���� �ʼ�!
      n=num/100; // 1312->312, 3�� �ǹ���
      if(n==3 || n==6 || n==9) {
         cnt++;
      }
      
      num=num%100;
      n=num/10; // 56�� ���, 5�� �ǹ���
      if(n==3 || n==6 || n==9) {
         cnt++;
      }
      
      num=num%10;
      n=num/1; // 8�� ���, 8�� �ǹ���
      if(n==3 || n==6 || n==9) {
         cnt++;
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
      
      // 1~1000 �߿��� �������� ���� 1�� ����
      // int randNum
      // [randNum] : ���
      // ����ڰ� ������ �Է� : ¦,19,22
      // String userAns=sc.next();
      // if(����)
      //  syso("����!");
      // else
      //  syso("����...");
      
      int randNum=rand.nextInt(1000)+1; // ���� �Ѱ��� �����̶� for�� �ȵ�
      System.out.print("["+randNum+"] : ");
      String userAns=sc.next();
      
      if(check(randNum,userAns)) {
         System.out.println("�����Դϴ�!");
      }
      else {
         System.out.println("�����Դϴ�.....");
      }

   
      
   }

}