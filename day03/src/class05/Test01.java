package class05;

import java.util.Random;

public class Test01 {

	public static void main(String[] args) {

//				[����]
//				1. �ּ�
//				2. �ѱ�Ǯ��
//
//				1) �� �迭�� �̸��� data �̰�
//				2) 3~5�������߿��� �������� ũ�⸦ ����
//				   ex) 3 --->> [ _ _ _ ]
//				3) data�� ����Ǵ� ������ 100~105 ������ �������� �����
//				   ex) [ 102 100 100 ]
//				4) A- Ȧ������ ����
//				5) B- ¦������ ���

		// 1. �������� ũ�⸦ ����
		// 2. �迭 ����
		// 3. data�� 100~105 ���̿� ���� ����
		// 4. data �迭�� ���
		// 5. Ȧ������ ����
		// 6. ¦������ ���

		// �������� ũ�⸦ �����غ���
		Random rand = new Random(); // ������ �� �ִ� ��踦 �̸� ���������Ѵ�.
		int N = rand.nextInt(3) + 3;

		int[] data = new int[N]; // �����͹迭�� ũ��

		// 100~105 ���̿� �������� ���� ����

		// N ���� ���� �ִ�(�迭�� ũ�� ����)
		System.out.print("[ ");
		for (int i = 0; i < data.length; i++) {
			data[i] = rand.nextInt(6) + 100;
			System.out.print(data[i] + " ");
		}
		System.out.println("]");

		// Ȧ������ ����

		int sum = 0;
		for (int i = 0; i < data.length; i++) {
			if (data[i] % 2 == 1) {
				sum += data[i];
			}
		}
		System.out.println("Ȧ������ : " + sum);
		// ¦������ ���

		int num = 0;

		for (int i = 0; i < data.length; i++) {
			if (data[i] % 2 == 0) {
				num += data[i];
			}
		}

		double avg = num * 1.0 / data.length;
		System.out.println("¦����� : " + avg);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
	}
}
