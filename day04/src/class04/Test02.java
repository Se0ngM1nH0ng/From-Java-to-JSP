package class04;

import java.util.Random;
import java.util.Scanner;

public class Test02 {

   public static void main(String[] args) {
      
      Random rand=new Random();
      Scanner sc=new Scanner(System.in);
      
      int N=4; // ��ǰ�� 4���� ��
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
         mCnt[i]=rand.nextInt(4); // 0~3 // ���� �������� ������
      }
      
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
			int cnt; // ���������� Ư��
			while (true) { // ��ȿ�� �˻� : ������ ������ �����̰ų�, ����� ������ �ȵ�!
				System.out.println("������ ��ǰ�� " + mName[num - 1] + "�Դϴ�.");
				System.out.println("����: " + mPrice[num - 1] + "��  ���: " + mCnt[num - 1] + "��");
				System.out.print("������ ������ �Է�) ");
				cnt = sc.nextInt();

				if (0 <= cnt && cnt <= mCnt[num - 1]) {
					break;
				}

				System.out.println("�߸��� �Է��Դϴ�!");
				System.out.println("�ٽ� �Է����ּ���!~~");
				System.out.println();
			}
			int res = mPrice[num-1]*cnt;
			int money;
			
//			while(ture) {
//				if() {
//					break;
//				}else if{
//					
//				}
//			}
			System.out.println("���� ����");
			System.out.println("");
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
      }
      
      
      
      
      
   }

}