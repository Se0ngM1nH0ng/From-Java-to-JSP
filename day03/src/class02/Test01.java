package class02;

public class Test01 {

	public static void main(String[] args) {

//		��Ȳ ) �л� N��
//		������ ��
//		�������
//		1���� �������?
		
		int[] stu = new int[5];
		stu[0] = 20;
		stu[1] = 12;
		stu[2] = 63;
		stu[3] = 87;
		stu[4] = 54;
		
		// ���
		System.out.println("===�л����===");
		for (int i = 0; i < stu.length; i++) {
			System.out.println("�л� " + (i+1) + "���� " + stu[i] + "�� �Դϴ�.");
		}
		System.out.println("===============");
		
		
		// ���� �� ��
		int sum = 0;
		for (int i = 0; i < stu.length; i++) {
			sum += stu[i];
		}
		
		System.out.println("������ " + sum + "�� �Դϴ�.");
		
		double avg = sum * 1.0/stu.length; //����ȯ (casting)
		System.out.println("����� " + avg  + "�� �Դϴ�.");
		
		// [�ִ밪 ã�� �˰���]
		
		int max = stu[0]; // ���� �ִ밪�� [0]�� �����ϴ� ���̴�!
		int maxIndex = 0; // �ִ밪�� ����� index�� ����� ����
						  // �ִ밪�� �ٲ𶧸� �ٲ��ȴ�.
		
		// [1]���� ���ʴ�� '���� �ִ밪'�� ��
		for (int i = 1; i < stu.length; i++) {
			if(max<stu[i]) { // �ִ밪�� ���� �񱳰����� �۴ٸ�,
				// ��ȭ�߻�
				max = stu[i];
				maxIndex = i;
			}
		}
		
		System.out.println("1���� " + (maxIndex+1) + "�� �л��̰�" + "1���� ������ " + max + "�� �Դϴ�.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
