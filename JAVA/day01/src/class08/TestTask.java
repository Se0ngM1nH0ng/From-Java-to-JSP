package class08;

public class TestTask {

	public static void main(String[] args) {
//		1. ���� ����� ������(==����)�� �ֽ��ϴ�.
//		3,4,5 -> ��
//		6,7,8 -> ����
//		9,10,11 -> ����
//		12,1,2 -> �ܿ�
//		�̶�� console�� ������ּ���
		
//		int month = 1;
//		
//		
//		if(3 <= month && month <= 5 ) {
//			System.out.println("��");
//		}else if(6 <= month && month <= 8) {
//			System.out.println("����");
//		}else if(9 <= month && month <= 11) {
//			System.out.println("����");
//		}else {
//			System.out.println("�ܿ�");
//		}
		

//		2. ���̰� ����� �������ֽ��ϴ�.
//		���̰� 8~19�̸� 1000��
//		20~65�̸� 2000��
//		�������� ����!
//		��� ������ּ���.
		
//		int age = 10;
//		
//		if(8 <= age && age <= 19) {
//			System.out.println("1000��");
//		}else if(20 <= age && age <= 65) {
//			System.out.println("2000��");
//		}else {
//			System.out.println("����");
//		}

//		3. 3�� 30���� 1�ð� 20�� �� �ð��� 2�� 10���Դϴ�.
//		int a=3;
//		int b=30;
//
//		int a=1;
//		int b=10;
//		--->> 1�� 10���� 1�ð� 20�� �� �ð��� 11�� 50���Դϴ�.
		
//		3�� 30������ �����ϸ�
//		int hour = 3;
//		int minute = 30;
//		���� ���� ��Ƽ�
//		���� 1�ð��̶� 20���� ����
//		���� ���ϴ°���!!
		
//		�׳� �ٵ� �ð��� 1-12�̰� ���� 1-60�̴ϱ� if�� ����
		
		int hour = 1;
		int minute = 10;
		int hour2 = 1;
		int minute2 = 20;
		int result = hour - hour2;
		int result2 = minute - minute2;
		
		if(result <= 0) {
			result += 12;
		}
		
		if(result2 <= 0) {
			result2 += 60;
		}
		
		System.out.println(hour + "��" + minute + "���� " 
		+ hour2 + "�ð�" + minute2 + "�� �� �ð���" + (result) + "��" + (result2) + "���Դϴ�.");
		
		
		
		

	}

}
