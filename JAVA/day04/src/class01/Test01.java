package class01;

import java.util.Random;
import java.util.Scanner;

// [ ���Ǳ� ���α׷� ]
// ���, � ������� "��ȿ�� �˻�"�� �����ұ�?
// �� � �߰��Ǿ���ұ�??? => 4��
//  : ��ȿ�� �˻�� "�Է��Ҷ�����" ����!
//  1) ����ڿ��� �ȳ� -> �ùٸ� �Է��� �˷��ָ� �� ����!
//  2) ���α׷��� �������Ḧ ����
public class Test01 {
   public static void main(String[] args) {

      // 1. �����ϱ� / �����ϱ�
      // 2-1. �����ϱ� : ���α׷� ����
      // 2-2. �����ϱ� : �Ƹ޸�ī��/ī���/���̽�Ƽ ���� �޴��� ���
      // 3. � ����?
      // 4. ���ݾȳ�
      // 5. �����Է� -> �Ž����� ��ȯ
      // �� ��� ������ O

      Scanner sc=new Scanner(System.in);
      Random rand=new Random();

      int N=3; // �޴��� ����
      // �� ���������� �����ϰ��ϱ�����!!!!!
      String[] mName=new String[N]; // �޴��̸� �迭
      mName[0]="�Ƹ޸�ī��";
      mName[1]="ī���";
      mName[2]="���̽�Ƽ";
      int[] mPrice=new int[N];
      mPrice[0]=2500;
      mPrice[1]=3500;
      mPrice[2]=3000;
      int[] mCnt=new int[N];
      for(int i=0;i<mCnt.length;i++) {
         mCnt[i]=rand.nextInt(3)+1;
      }

      while(true) { // ����ݺ����� �𸣱⶧��
         // 1. ���
         System.out.println("1.���� 2.����");
         System.out.print("�Է�) ");
         int action=sc.nextInt();

         // 2-1. ����
         if(action==2) { // �������� : �����ϱ� ��ư�� �����ٸ�
            System.out.println("�̿����ּż� �����մϴ�!");
            System.out.println();
            break; // ���ѷ�����? ���������� �ʼ���!
         }
         else if(action<1 || 2<action) { // ��ȿ�� �˻� : 1,2�� �ƴ϶��
            System.out.println("�߸��� �Է°��Դϴ�.");
            System.out.println("Ȯ���� �ٽ� �̿����ּ���!~~");
            System.out.println();
            continue;
         }
         int num;
         // 2-2. ����
         while(true) {
            System.out.println("=== �޴��� ===");
            for(int i=0;i<mName.length;i++) {
               System.out.println((i+1)+". "+mName[i]);
            }
            System.out.println("====================");

            System.out.print("������ ��ǰ�� ��ȣ�� �Է�) ");
            num=sc.nextInt();
            // num (����)������ 61���� while��Ͽ��� ����Ǿ��⶧����
            // 85���� ����� ����� �Ҹ�ȴ�!

            if(1<=num && num<=N) { // �������� : ����� �Է��ߴٸ�
               break;
            }            
            /*if(num<1 || N<num) {
               System.out.println("���� ��ǰ��ȣ�Դϴ�!");
               System.out.println("�ٽ� �Է��ϼ���!~~");
               System.out.println();
               continue;
            }*/
            System.out.println("���� ��ǰ��ȣ�Դϴ�!");
            System.out.println("�ٽ� �Է��ϼ���!~~");
            System.out.println();
         }

         int cnt; // ���������� Ư��
         while(true) { // ��ȿ�� �˻� : ������ ������ �����̰ų�, ����� ������ �ȵ�!
            System.out.println("������ ��ǰ�� "+mName[num-1]+"�Դϴ�.");
            System.out.println("����: "+mPrice[num-1]+"��  ���: "+mCnt[num-1]+"��");
            System.out.print("������ ������ �Է�) ");
            cnt=sc.nextInt();

            if(0<=cnt && cnt<=mCnt[num-1]) {
               break;
            }

            System.out.println("�߸��� �Է��Դϴ�!");
            System.out.println("�ٽ� �Է����ּ���!~~");
            System.out.println();
         }

         int res = mPrice[num-1]*cnt; // �����Ϸ��� ��ǰ ����
         int money;
         System.out.println("�ݾ�: "+res+"��");
         
         
         while(true) {
            System.out.print("�� �Է�) ");
            money=sc.nextInt();
            if(res<=money) {
               break;
            }
            System.out.println("�߸��� �Է��Դϴ�!");
            System.out.println("���� �Է����ּ���!");
            System.out.println();
         }

         res=money-res;
         if(res!=0) {
            System.out.println("�Ž����� "+res+"�� ��ȯ �Ϸ�!");
         }
         System.out.println("���� ����!");
         System.out.println();

         mCnt[num-1]-=cnt; // "��ٱ��� �̽�"�� �����غ���!

      }





   }
}