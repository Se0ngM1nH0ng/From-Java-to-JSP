package class05;

import java.util.Random;

public class Test03 {

	public static void main(String[] args) {

		// ��ȭ ����
		// [���� ���̵�]
		
//		��ȭ)
//		[ 102 100 104 ]
//		�ߺ��� �߻������ʵ���
//		�����͵��� �����غ�����!~~ :D
		
//		 data[0]=������;
//	     data[0]�� ������ ������ �ȵǾ��ִ�, ���ο� ����?
//	     YES -> ��������!
//	     ��NO -> �ٽ�
//	     data[0]=������;
//	     data[0]�� ������ ������ �ȵǾ��ִ�, ���ο� ����?
//	     ��YES -> ��������!
//	     NO -> �ٽ�
//	     data[1]=������;
//	     data[1]�� ������ ������ �ȵǾ��ִ�, ���ο� ����?
//	     ��YES -> ��������!
//	     NO -> �ٽ�
//	     data[2]=������;
//	     data[2]�� ������ ������ �ȵǾ��ִ�, ���ο� ����?
//	     YES -> ��������!
//	     ��NO -> �ٽ�      
//	     data[2]=������;
//	     data[2]�� ������ ������ �ȵǾ��ִ�, ���ο� ����?
//	     YES -> ��������!
//	     ��NO -> �ٽ�      
		

	      Random rand=new Random();
	      int randNum=rand.nextInt(3)+3; // ������ ���� ���� 3~5 ����
	      int[] data=new int[randNum];

	      // 1) �ݺ��� �Ѵ�!
	      // 2) ��������� �𸥴�! -> while��

	      int index=0; // ���� ��ġ�� ��Ÿ���� ����
	      while(index<data.length) { // data �迭�� �ϼ��ɶ����� ���
	         data[index]= rand.nextInt(6)+100; // �������� ������ �����ϰ�,

	         // [flag �˰���]
	         boolean flag=false; // �ʱ����

	         // Ư���� ���� �߻��ϸ�,
	         // [������ �ߺ�]
	         for(int i=0;i<index;i++) {
	            if(data[i]==data[index]) { // �����Ͱ� �ߺ��̾�?
	               flag=true;
	            }
	         }
	         // �� �Ǿ��ٸ�
	         // flag�� true ���
	         if(flag) { // data[index]�� ������ �־��ٸ�
	            continue; // �Ʒ��� �������� �ȵȴ�!!!!!
	         }
	         index++; // ��������!
	      }

	      /*
	      while(true) {
	         if(data �迭�� �ϼ��Ǿ���?) {
	            break;
	         }
	      }
	       */

	      for(int v:data) {
	         System.out.println(v);
	      }







		
		
	}

}
