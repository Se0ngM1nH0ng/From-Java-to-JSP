package class05;

import java.util.Random;

public class Test04 {

	public static void main(String[] args) {
		// �ߺ����� ������ �����ϱ�
		int[] data=new int[3];

	      Random rand=new Random();
	      int index=0; // ������ġ
	      while(true) {
	         if(index == data.length) { // �迭�� ����á�ٸ�
	            break;
	         }

	         data[index]=rand.nextInt(10)+1;

	         boolean flag=false;

	         for(int i=0;i<index;i++) { // ó������ ���ݱ��� �ߺ��� �ִ�
	            if(data[index]==data[i]) { // Ư���� �� : �ߺ��߻�
	               flag=true;
	            }
	         }

	         if(flag) {
	            continue;
	         }


	         index++;
	      }

	      for(int v:data) {
	         System.out.println(v);
	      }


			
			
			
			
		}
		
		
		
		
		
		
		
		
	}


