package class06;

//import java.util.Random;

public class Test06 {

//	�Լ��� :test1()
//	input : ����
//	��� : �������� ���� , 1���� ������������ ������ ���
	
//	public static void test1() { // "�޼��� �ñ״�ó"
//		Random rand = new Random();
//		int num = (rand.nextInt(10)+1) + 10; // 11~20
//		
//		int result = 0;
//		for (int i = 0; i < num; i++) {
//			result += i;
//		}
//		
//		System.out.println("������: " + result);
//		
//	}
	
	
//	public static int test2(int num) {// input : ����
//		int count = 0;
//		for (int i = 0; i < num; i++) {
//			if(num % 2 == 0) {
//				count++; // ���
//			}
//		}
//		return count; //output : ��ȯ
//	}
//	
	
	public static String test3(int num) {
		String msg = "banana";
		if(num >10) {
			msg = "apple";
		}
		return msg;
		
	}
	
	
	
	public static void main(String[] args) {
			
		test3(5);
		
	}

}
