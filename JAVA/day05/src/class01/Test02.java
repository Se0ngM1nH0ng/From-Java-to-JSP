package class01;

import java.util.Random;
import java.util.Scanner;

/*
+++) 10���� ���������� ����� �迭(����:1~100)
 ����ڰ� ������ �Է� ex) 50
 50�� [2]�� ����Ǿ��ֽ��ϴ�.
 50�� �迭�� �����ϴ�!
 */
public class Test02 {

   // �迭�� Ư�������� �ִ���������-1
   // �ִٸ�, ����ε�������-2
   // INPUT: int[] 1��, int 1��
   // OUTPUT: (boolean,)int
   //   => 2���̻��� ��ȯ�� �Ұ���!
   //      int�� ���� �ǹ̸� �ο��ϴ� ������� �ذ�!
   public static int checkNum(int[] data,int num){
      for(int i=0;i<data.length;i++) {// �迭 ���� ��ŭ
         if(data[i] == num) {// �ε��� ��ȣ�� �� ������ ������ �� �ε����� ��ȯ�Ѵ�
            return i;
         }
      }      
      return -1; // false�� �ǹ���
   }
   
   public static void main(String[] args) {
      
      Random rand=new Random();
      int[] data=new int[10]; //10ĭ�� ���� �迭�� �������.
      for(int i=0;i<data.length;i++) {
         data[i]=rand.nextInt(100)+1; //1~100���� �� �����̴�.
      }
      System.out.print("[ ");
      for(int v:data) { //���� for��(forEach��)���� data�� v�� ���
         System.out.print(v+" ");
      }
      System.out.println("]");
      System.out.println();
      
      Scanner sc=new Scanner(System.in);
      System.out.print("�����Է�) "); // ���� �������� ��µȰ� �߿��� ���� �ϳ��� �ε��� ��ȣ�� �˰������
      int num=sc.nextInt();
      int index=checkNum(data,num);// �ε�����ȣ ��ġ�� ���� ���� �ֱ�
      if(index<0) { // ��ȿ�� �˻�
         System.out.println(num+"�� �迭�� �����ϴ�!");
      }
      else {
         System.out.println(num+"�� ["+(index+1)+"]�� ����Ǿ��ֽ��ϴ�.");
      }
      
   }

}