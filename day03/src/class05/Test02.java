package class05;

import java.util.Random;

public class Test02 {

	public static void main(String[] args) {
		
		// ����� Ǯ��
		/*
		[����]
		1. �ּ�
		2. �ѱ�Ǯ��

		1) �� �迭�� �̸��� data �̰�
		2) 3~5�������߿��� �������� ũ�⸦ ����
		   ex) 3 --->> [ _ _ _ ]
		3) data�� ����Ǵ� ������ 100~105 ������ �������� �����
		   ex) [ 102 100 100 ]
		4) A- �����Ͱ� Ȧ������ ����
		5) B- �����Ͱ� ¦������ ���

		console)
		 [ 102 100 100 ]
		 Ȧ������ : 0
		 ¦����� : 100.666667


		 */

		      Random rand=new Random();
		      int randNum=rand.nextInt(3)+3;
		      int[] data=new int[randNum];
		      
		      System.out.print("[ ");
		      for(int i=0;i<data.length;i++) {
		         data[i]=rand.nextInt(6)+100;
		         System.out.print(data[i]+" ");
		      }
		      System.out.println("]");
		      
		      int oSum=0; // Ȧ�� ����
		      int eSum=0; // ¦�� ����
		      int eCnt=0; // ¦�� ����
		      double eAvg; // ���� 3��ҿ� '��'�� �����ϴ�!
		      
		      for(int v:data) { //forEach��
		         if(v%2==0) {
		            eSum+=v; //¦���� ¦�� ���տ�
		            eCnt++; // ¦�� ����
		         }
		         else {
		            oSum+=v; // Ȧ�� ����
		         }
		      }
		      
		      eAvg=eSum*1.0/eCnt; //¦�� ���
		      
		      System.out.println("Ȧ������ : "+oSum);
		      System.out.println("¦����� : "+eAvg);
		      
		      
		      
		      
		      
		      
		      

	}

}
