package class02;

public class Test02 {

	public static void main(String[] args) {

		int[] stu = new int[6];
		
		stu[0] = 29;
		stu[1] = 99;
		stu[2] = 30;
		stu[3] = 22;
		stu[4] = 87;
		stu[5] = 57;

		// ���
		System.out.println("===== �л� ��� =====");
		for (int i = 0; i < stu.length; i++) {
			System.out.println("�л�" + (i + 1) + "����" + stu[i] + "�� �Դϴ�.");
		}
		System.out.println("===================");

//		�������
		int sum = 0; // ������ ������ ����

		for (int i = 0; i < stu.length; i++) {
			sum += stu[i]; // ������ �������� �״´�. (���տ����ڷ�)
		}

		double avg = sum * 1.0 / stu.length;
		System.out.println("������ " + sum + "�� �Դϴ�.");
		System.out.println("��������� " + avg + "�� �Դϴ�.");

//		����� �ѱ� �л���
		int count = 0; //����� �ѱ� �л� ��
		for (int i = 0; i < stu.length; i++) {
			if (stu[i] > avg) {
			// if(���� �����ִ� �л��� ����� �Ѱ��?)
				count++;
			}
		}
		System.out.println("����� �ѱ� �л� ���� " + count + "�� �Դϴ�.");
		
//		6���� ��ȣ
//		----->> [�ִ밪ã�� �˰���] �� Ȱ��
		int min = stu[0];
		int minIndex = 0;

		for (int i = 0; i < stu.length; i++) {
			if (min > stu[i]) {
				min = stu[i];
				minIndex = i;
			}
		}

		System.out.println("6���� �л�" + (minIndex + 1) + "���̰� " + "������ " + min + "�� �Դϴ�.");
//		¦����° �л����� ����
		int total = 0; //������ ���� ���� 
		for (int i = 0; i < stu.length; i++) {
			if ((i + 1) % 2 == 0) {
				total += stu[i]; // ¦����° �л����� ������ total�� ��������
			}
			
//			����
//			if ((i + 1) % 2 == 1) {
//				continue; // Ȧ����°�� ������
//			}
		}

		System.out.println("¦����° �л����� ������ " + total + "�� �Դϴ�.");

//		����� ���ѱ� �л����� ��ȣ --->> ���� xx
//		 : ��������� �����ϴ� ���
//		 : ���߿� �迭�� ����
		int result = 0;

		System.out.print("����� ���ѱ� �л����� ��ȣ�� ");
		for (int i = 0; i < stu.length; i++) {
			if (stu[i] < avg) {
				result = (i + 1);
				System.out.print(result + "�� ");
			}
		}

		System.out.println(" �Դϴ�.");

	}

}
