package class01;

import java.util.Random;
import java.util.Scanner;

// 369���� 1,2�� Ǯ��
public class Test03 {

//	1�� ���� !
   // input: ����� ������� �Է°��� �˷��ָ�
   // output: ������� Ʋ�ȴ����� ��ȯ
   public static boolean check(int num,String user) {// �������� �ƴ��� boolean
      final int NUM=num; //�ʱⰪ�� ���ϸ� �ȵǴϱ� final�� �������ֱ� 
      int cnt=0; //  "¦" �ڼ��� ����

      int x=1000;
      while(x>0) {
         int n=num/x;
         if(n==3 || n==6 || n==9) {
            cnt++;
         }

         num=num%x; // 1234 -> 234
         x=x/10;
      }
      
      String ans=""; // ���ڿ��� �ʱ�ȭ
      for(int i=0;i<cnt;i++) {	// �ݺ����� ���� ¦ ī��Ʈ��ŭ "¦" �̶�� ����
         ans+="¦";
      }
      if(cnt==0) {					// ¦�� �ϳ��� �ȵ��ÿ�
         ans=Integer.toString(NUM); // �������� ���ڿ��� int->String
      }				// ���ڿ����� ������ ? String->int��? Integer.parseInt();
      
      System.out.println("ans: "+ans); 
      System.out.println("user: "+user);
      
      if(ans.equals(user)) {// ����� �Է��� ���� ���ٸ� true
         return true; // true �� ����
      }
      return false; // �⺻�� false
   }

   public static void main(String[] args) {

      // int num
      //  -> 1~1000�߿��� �������� ���� 1�� ����
      // syso("[num] : ")
      // ����ڰ� �Է��� �õ���
      //  -> String user
      // if(�����Ȳ�̶��,)
      //     syso("����")
      // else
      //     syso("����")

      Scanner sc=new Scanner(System.in);
      Random rand=new Random();
      int num=rand.nextInt(1000)+1;
      System.out.print("["+num+"] : "); //1~1000���� ���� ���� 1��
      String user=sc.next(); // ����ڿ��� �����Է��� �޴´�

      if(check(num, user)) { // �����Ȳ�̶��,
         System.out.println("�����Դϴ�!"); // �� ������ ������ ������ ����
      }
      else {
         System.out.println("�����Դϴ�....."); // �Է��� ���ڿ� ������ Ʋ���� ����
      }










   }
}