package class06;

public class Test03 {

	public static void printGrade(int score) {
	      if(score<0 || 100<score) { // ��ȿ�� �˻�
	         System.out.println("������ ��ȿ�����ʽ��ϴ�! Ȯ���� �ʿ��մϴ�!");
	         return; // �Լ��� ��������ϰڽ��ϴ�. // ���⼭ ����
	      }

	      char grade='C'; // ������ ������ ����� �⺻���� C�� ����
	      
	      if(80<=score) { // ������ 80�̻��̸�
	         grade='A'; // ����� A�̴� 
	      }
	      else if(60<=score) {// ������ 60�̻��̸� 
	         grade='B'; // ����� B�̴�
	      }
	      
	      System.out.println(score+"���� "+grade+"����Դϴ�.");
	   } // ���� ���� ���� ����̴� !
	
   public static void main(String[] args) {

      printGrade(811);
      printGrade(81);
      printGrade(68);
      printGrade(1);

   }
}