package class01;

import java.util.Random;

// �޼��� �ñ״�ó
// �޼���(�Լ�)�� 3���
// 1.input 2.output 3.���
// public static int makeRandNum(int start,int end)

public class Test02 {
   
   // �Լ� ���� ��� 1)
   // �޼��� �ñ״�ó�� ���� �����ϰ�,
   // ���� ����� �����ϴ� ���
   
   // ���� �������� ~ �� �������� �߿���
   // �������� ���� 1���� ������ּ���!~~
   // input: int start,int end -> int x2
   // output: X(void) ��� �Ҷ� output�� ���� ���� void
   public static void printRandNum(int start,int end){
      Random rand=new Random();
      int randNum=rand.nextInt(end-start+1)+start;
      System.out.println("������: "+randNum);
   }
   
   
   
   // �Լ� ���� ��� 2)
   // ���� ����� ��������,
   // ������ �� ��ɿ� �°� �޼��� �ñ״�ó�� �ۼ��ϴ� ���
   public static int makeRandNum(int start,int end) {
      Random rand=new Random();
      int randNum=rand.nextInt(end-start+1)+start;
      return randNum;
   }
   
   public static void main(String[] args) {
      
      ///// �̹� �� ��������־��� ����� ��
      int randNum=makeRandNum(10,20);
      System.out.println("������: "+randNum);
      
   }

}