package class06;

public class Test04 {
	
	public static String funcC() {
		// �Լ� ���� C
		
		System.out.println("funcC() ����!");
		
		return "apple"; // �Լ� ��� �����!!!!!
		///// System.out.println("funcC()�� ������ �ڵ�");
	}
	
	public static void main(String[] args) {
		
		funcC(); // return���� �ش��Լ��� ȣ���� �ڸ��� �̵��� //
				 //�̷��Դ� �� �Ⱦ� // return���� �ش��Լ��� ȣ���� �ڸ��� �̵���
	      		 // ���嵵 ���� �ʾҰ� ��µ� ���ؼ� �ƹ��ϵ� �Ͼ�� �ʾҴ�.
		System.out.println("main() ���� : "+ funcC());
		// 1. println() ���ּ���.
		// 2. funcC() ȣ�����ּ���.
		// 2 >> 1
		String msg=funcC();
		// 1. = ���� ������
		// 2. funcC() ȣ�����ּ���.
		// 2 >> 1
		System.out.println("msg: "+msg);

		// 1. �Ϲ������� OUTPUT�� �����ϴ� �Լ�����
		//   a) ����ϰų�,
		//   b) ������ �����ϰų�,
		//   �ؼ� Ȱ����
		
		// 2. return���� �ش��Լ��� ȣ���� �ڸ��� �̵���
		
		
		
		
		
		
	}
}
