package class05;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {


	      // ���Ǳ�
	      String[] mName=new String[3];
	      mName[0]="�Ƹ޸�ī��";
	      mName[1]="īǪġ��";
	      mName[2]="���̽�Ƽ";
	      
	      int[] mPrice=new int[3];
	      mPrice[0]=2500;
	      mPrice[1]=4500;
	      mPrice[2]=3000;
	      
	      int[] mCnt=new int[3];
	      mCnt[0]=100;
	      mCnt[1]=10;
	      mCnt[2]=2;
	      
	      Scanner sc=new Scanner(System.in);
	      
	      
	      while(true) { // ���������� �Ϻη� �ȸ���!
	         
	         System.out.println("=== �޴��� ===");
	         for(String v:mName) {
	            System.out.println(v);
	         }
	         System.out.println("=============");
	         
	         // ������� ���Ǽ��� ����Ͽ� �ڵ��Ѵ�! ��
	         System.out.print("�԰�����޴��� �Է��ϼ���) ");
	         int uNum=sc.nextInt(); // �Ƹ޸�ī��
	         int uCnt=10; // � ��������
	         
	         if(uCnt>mCnt[uNum-1]) {//������ ������ ��� �Ѿ��
	            System.out.println("��� �����մϴ�!");
	            break;
	         }
	         
	         System.out.println(mName[uNum-1]+"�޴��� ");
	         System.out.println(uCnt+"�� �����߽��ϴ�.");
	         System.out.println("�� �ݾ�: "+uCnt*mPrice[uNum-1]);
	         mCnt[uNum-1]-=uCnt;
	         
	         
	      }

		
		
		
		
	}

}
