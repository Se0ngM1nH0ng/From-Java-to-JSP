package class01;

public class Test03 {
   public static void func1(int num) {
      num+=100;
   }
   public static int func2(int num) {
      return num--;
   }
   public static void func3(int[] data) { 
	   // �Լ��� ȣ���Ҷ��� ���ڷ� �迭�� ����ϴ°��
	   // (�迭 Ư���� �ּҰ��� �̵��ϱ� ������)
	   // ������ ���� ȣ��(call by reference)
	   // �迭�̸��� arr�� �ٲ� �ּҰ��� �����Ѱ��� �ȹٲ�� ������ �Ȱ���.
      for(int i=0;i<data.length;i++) {
         data[i]=123;
      }
   }
   public static void main(String[] args) {

      int num=10;
      int[] data=new int[3];
      for(int i=0;i<data.length;i++) {
         data[i]=i+1; // [ 1, 2, 3 ]
      }
      
      func1(num);
      System.out.println("num1= "+num);
      num = func2(num);
      System.out.println("num2= "+num);
      func3(data);
      System.out.print("[ ");
      for(int v:data) {
         System.out.print(v+" ");
         // [ ?, ?, ? ]
      }
      System.out.println("]");
      
      
      
      
      
      
      
      
      
      
      
   }
}