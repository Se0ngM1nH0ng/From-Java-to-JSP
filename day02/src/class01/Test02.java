package class01;

public class Test02 {
	public static void main(String[] args) {
		
	
//	2. ���̰� ����� �������ֽ��ϴ�.
//	���̰� 8~19�̸� 1000��
//	20~65�̸� 2000��
//	�������� ����!
//	��� ������ּ���.
	
//	��Ǯ��

//	int age = 10;
//	
//	if(8 <= age && age <= 19) {
//		System.out.println("1000��");
//	}else if(20 <= age && age <= 65) {
//		System.out.println("2000��");
//	}else {
//		System.out.println("����");
//	}

//	����� Ǯ��
	
		   int age=21;
		      int res; // ����� ����

		      // �� ��ȿ�� �˻�
		      if(age<1 || 200<=age) {
		         System.out.println("��ȿ�������� ���Դϴ�!");
		      }
		      else {

		         if(8<=age && age<=19) {
		            res=1000;
		         }
		         else if(20<=age && age<=65) {
		            res=2000;
		         }
		         else {
		            res=0;
		         }

	
	}
}
