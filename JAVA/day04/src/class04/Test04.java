package class04;

import java.util.Random;
import java.util.Scanner;

public class Test04 {
   public static void main(String[] args) {
      Random rand=new Random();
      Scanner sc=new Scanner(System.in);

      int N=2; // ��ǰ�� 2���� ��
      String[] mName=new String[N]; // �޴��̸� �迭
      int index=0;
      while(true) {
         if(index==N) {
            break;
         }
         
         System.out.print((index+1)+"�� ��ǰ�̸� �Է�: ");
         mName[index]=sc.nextLine(); // ���ڿ� �Է�         
         System.out.println(mName[index]+"��(��) �³���?");
         System.out.print("1-YES 2-NO : ");
         int ans=sc.nextInt();
         sc.nextLine(); // ���ۿ� �����ִ� �������°����� ġ���ִ� �ڵ�
         
         if(ans!=1) {
            System.out.println("�ٽ� �Է����ּ���!");
            continue;
         }
         
         System.out.println();
         
         index++;
      }
      int[] mPrice=new int[N];
      for(int i=0;i<mPrice.length;i++) {
         System.out.print(mName[i]+"�� �����Է�: ");
         mPrice[i]=sc.nextInt();
      }
      System.out.println();
      int[] mCnt=new int[N];
      for(int i=0;i<mCnt.length;i++) {
         System.out.print(mName[i]+"�� �����Է�: ");
         mCnt[i]=sc.nextInt();
      }
      System.out.println();
      System.out.println();
      System.out.println();
   }
}