package class01;

public class Test02 {

	public static void main(String[] args) {

		int[] data = new int[3];
		for (int i = 0; i < 3; i++) {
			data[i]=i+1;
		}
		try {
			System.out.println(data[3]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�ش� �ε����� ���� �ε��� �Դϴ�.");
		}
		finally {
			System.out.println("���� �߻����ο� �����ϰ� �׻� ����Ǵ� �ڵ� ");
		}
		
		
	}

}
