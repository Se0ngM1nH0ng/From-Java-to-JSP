package class03;

public class Test02 {

	public static void main(String[] args) {

		// while���� �Ϲ�������
		// "���ѷ���(�ݺ���)" �϶� Ȱ��

		// ���α׷����� ���� ������ ���� �ϴ� !
		// �����߿���, ���α׷������� '�����ڿ�'�� �����
		// -> '���'�� �߻��� !

//			int i = 0;
////		while(1 < 10) {
////			System.out.println("�ȳ�");
//			i++;
//			
//			if(i == 5) {
//				// ��������
//				}
////		}

		// �ڡڡڡڡ� ���ѷ����� �ݵ�� "��������"�� �ʿ��ϴ�.

//		int i = 0;
//		while (1 < 10) {
//			System.out.println("�ȳ�");
//			i++;
//
//			if (i == 3) {
//				break; // break�� ������ �ش� �ݺ����� ��� ����
//					   // �ش� "�ݺ���" �� "���" ����
//			}
//			System.out.println("��");
//			
//		}
//		

//		while (true) {
//			// �̰� ���ѷ�������?
//			// "��������"�� �� �־�� �Ѵ�.
//		}

		int a = 33;
		int b = 29;

		int i = b;
		while (true) {
			System.out.print(i + " ");
			i++;
			if (i > a) {
				break;
			}

		}

	}

}
