package class01;

// [ ���ܿ� ����ó�� ]
// ����
// 1 . ��ũ���� -> ������ 
// 2. ���� �߻��� ���γѹ�
// 3. ���� --->> �ذ��� 

///////////////

public class Test01 {

	public static void main(String[] args) {

		int a =10;
		int b = 0; // ���� / ���� ��ü�� ������ ���� !
		try {
		      System.out.println("Ȯ��1");
		      System.out.println(a/b); // ������ �Ϸ����ϱ�, 0�̾�����!
		      // �ڵ���ü���� ������������,
		      // "�����" �߻��ϴ� ���� == ����
		      System.out.println("Ȯ��2");
		   }
		   catch(ArithmeticException e) {
		      System.out.println("Ȯ��3");
		      System.out.println(a/1);
		      System.out.println("Ȯ��4");
		   }
		//if(���ܰ� �߻��߾� ?) {
		//System.out.println(a/b); // ������ �Ϸ��� ���ϱ� , 0�̾�����!
		//-> �׷� 1�� ������ ,,
		
		// �ڵ���ü���� ������ ������,
		// " ����� " �߻��ϴ� ����  == ����
		}
	}

  


