package class01;

import java.util.Scanner;

public class Test01 {

   // 1. �޼��� �ñ״�ó�� ���� �����, �� ������ ����� ����
   // 2. ����� ���� �����, �޼��� �ñ״�ó�� ������ ���ߴ� ���

   // [1] 
   // Q1) ������� �ԷµǾ�����, ¦�������ƴ��� �Ǻ��ϴ� �Լ�
   // INPUT: int 1�� // ������� �Է�
   // OUTPUT: boolean
   public static boolean isEven(int num) {
      if(num%2==0) {
         return true; // �Լ� ��� ����
      }
      return false;
   }
   
   // [2]
   // Q2) main�� �����Ǿ��ִ� ����� �� func()�� �켱 �ְ� ����!
   public static int checkMinus(int num,int b) {
      if(num<0) {
         b++;
      }
      return b;
   }
   // �ϼ��� ��ɵ��� ������ �ϳ��ϳ� �и��س��� �۾�
   // == ���ȭ,������Ʈȭ
   // : �ڵ� ���뼺�� ������ --->> �������� ����(��������)

   public static void main(String[] args) {

//     [ ���� ]
//				1. main()���� ������ 10�� �Է��ҿ����Դϴ�.// ������� 0�� �Է����� �𸣹Ƿ� while��
//				2. if(¦����?) a++;
//				3. if(������?) b++;
//				4. 10�� �Է¿Ϸ��߽��ϴ�. a=��,b=���Դϴ�.
//				5. ����, �Էµ� ������ 0�̶�� ���α׷��� ����
//				   3�� �Է¿Ϸ��߽��ϴ�. a=2,b=1�Դϴ�.
//				+) �Լ��� Ȱ���ؼ� �ش� ������ �ذ����ּ���!~~
//				   �Լ��� �ִ� 3������ Ȱ���Ҽ��ֽ��ϴ�.
      
	   Scanner sc=new Scanner(System.in);


      // CTRL C,V�� �ϰ��ֳ�? --->> �ݺ���!
      // while  VS  for : ���⼱ while 
      int cnt=0; // ����
      int a=0; // ¦���� ����
      int b=0; // ������ ����
      while(cnt<10) { // 10�� �Էµɶ� ����
         System.out.println((cnt+1)+"�� ������ �Է��ϼ���."); // ������ 0������ �����ϴϱ� +1 
         // ����� ���Ǽ��� ���
         // UI/UX
         System.out.print("�Է�) ");
         int num=sc.nextInt();
         if(num==0) { // 0�� �ԷµǾ�����
            System.out.println("0�� �ԷµǾ� �����մϴ�...");
            System.out.println();
            break;
         }
         cnt++;

         if(num%2==0) {
            a++;
         }
         if(num<0) {
            b++;
         }
      }

      System.out.println(cnt+"�� �Է¿Ϸ��߽��ϴ�.");
      System.out.println("¦��: "+a+"��");
      System.out.println("����: "+b+"��");

   }

}