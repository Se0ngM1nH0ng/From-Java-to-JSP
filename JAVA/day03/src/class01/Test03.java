package class01;

// �ڡڡڡڡ� �� �� �� �� �ڡڡڡڡ�
public class Test03 {

   public static void main(String[] args) {
      
      // ���Ǳ⸦ ����ǵ�, ���ᰡ 3����
      // ��� �����͸� ������ ����
		int[] data = new int[5]; // ���� ������ ����
		data[0] = 5;
		data[1] = 2;
		data[2] = 3;
		data[3] = 100;

		for (int i = 0; i < data.length; i++) { // �迭����� ����
			System.out.println("����" + (i + 1) + "�� " + data[i] + "���ֽ��ϴ�.");
		}



   }

}