package class04;

import java.util.Random;
import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {

      Random rand=new Random();
      Scanner sc=new Scanner(System.in);

      int N=2; // ��ǰ�� 2���� ��
      String[] mName=new String[N]; // �޴��̸� �迭 // ���ڿ� N����ŭ �Է¹ޱ�
      for(int i=0;i<mName.length;i++) {
         System.out.print((i+1)+"�� ��ǰ�̸� �Է�: ");
         mName[i]=sc.next(); // ���ڿ� �Է�
         System.out.println(mName[i]+" ��ǰ ����Ϸ�!");
         System.out.println();
      }
      int[] mPrice=new int[N]; // ���ݵ� N�� ����
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
      /*
      String[] mName=new String[N]; // �޴��̸� �迭
      mName[0]="�Ƹ޸�ī��";
      mName[1]="ī���";
      mName[2]="���̽�Ƽ";
      mName[3]="����Ǫġ��";
      int[] mPrice=new int[N];
      for(int i=0;i<mPrice.length;i++) {
         mPrice[i]=(rand.nextInt(6)+10)*100; // 1000~1500
         // 10~15 x100 : ������ �켱���� �̽� üũ!
      }
      int[] mCnt=new int[N];
      for(int i=0;i<mCnt.length;i++) {
         mCnt[i]=rand.nextInt(4); // 0~3
      }
       */
      
      while(true) {
         System.out.println("1.���� 2.����");
         System.out.print("�Է�) ");
         int action=sc.nextInt();
         if(action==2) {
            System.out.println("���α׷� ����...");
            System.out.println();
            break;
         }
         else if(action<1 || 2<action) {
            System.out.println("��ȿ�������� ���Դϴ�!");
            System.out.println("�ٽ��Է����ּ���!");
            continue;
         } 
         
         int num;
         while(true) {
            System.out.println(" === �޴���� ===");
            for(int i=0;i<mName.length;i++) {
               System.out.print((i+1)+". "+mName[i]+"[");
               if(mCnt[i]==0) {
                  System.out.print("������");
               }
               else {
                  System.out.print(mCnt[i]);
               }
               System.out.println("]");
            }
            System.out.println("===============");
            System.out.print("��ȣ�Է�) ");
            num=sc.nextInt();

            // 1~4�����̰�, ��� �־����!
            if((1<=num && num<=N) && (mCnt[num-1]>0)) {
               break;
            }

            if(num<1 || N<num) {
               System.out.println("���� ��ǰ�Դϴ�!");
            }
            else if(mCnt[num-1]==0) {
               System.out.println("��� ��� ���Ű� �Ұ����մϴ�!");
            }

         }
         
         
         int cnt;
         while(true) {
        	 System.out.println("�����Ͻ� ��ǰ�� " + mName[num-1] + "�Դϴ�.");
        	 System.out.println("������ " + mPrice[num-1] + "�Դϴ�.");
        	 System.out.println("���� " + mCnt[num-1] + "�Դϴ�.");
        	 System.out.println("� �����Ͻðڽ��ϱ� ?");
        	 cnt = sc.nextInt();
        	 
        	 if(cnt > 0 && cnt <= mCnt[num-1]) {
        		 break;
        	 }else if(cnt == 0) {
        		 System.out.println("��� �����ϴ�.");
        	 }
        	 
        	 System.out.println("�߸��Է��ϼ̽��ϴ�.");
        	 System.out.println("�ٽ��Է����ּ���.");
         }
         int product = mCnt[num-1] - cnt;
         int res = (mPrice[num-1]) * cnt;
         int money;
         
         
         System.out.println("�� ������ " + res + "�Դϴ�.");
         
         while(true) {
        	 System.out.println("�� �Է��ϱ�");
        	 money = sc.nextInt();
        	 if(money >= res) {
        		 break; 
        	 }
        	 else if(money == 0 ) {
        		 System.out.println("�ܾ��� �����մϴ�.");
        	 }
        	 System.out.println("�ٽ� �Է����ּ���");
         }
         System.out.println("���� ���� " + product + "�Դϴ�.");
         res = money - res;
         if(res != 0) {
        	 System.out.println("�Ž�������" + res + "�� �Դϴ�.");
         }
         System.out.println("�̿����ּż� �����մϴ�.");












      }





   }

}