package class02;

public class Test01 {

	public static void main(String[] args) {
		
//		������ ������ "������" ȣ��(���)�ؾ� �Ҷ� Ȱ��
		
//		int i = 0 ;
//		while(i < 3) {
//			// ���ǽ��� ���϶� ����
//			System.out.println("�ȳ��ϼ���!");
//			
//			i++;
//			
//		} // �ݴ� ��Ͽ� ������, while(���ǽ�)���� ó������ ���ư���.
//		  // �ݴ� ��� } �� �հ� ���������� ���� ���� !!
//		  // �ٽ� ó������ . false�� ������ ��ȣ ������ ������.
		
		
		int data = 10;
		while(data > 5) {//���ǽ��� false�� �ɶ� ���� ����.
			System.out.println("���� data: " + data);
			data -= 3; // data = data - 3;
		}
		
		System.out.println("���� data : " + data);
		
		
		
		
	}

}
