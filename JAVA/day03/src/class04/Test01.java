package class04;

import java.util.Random;
import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {

		// 1. ����
		// 2. Ǯ��
		// 3. Ǯ�� -> �ڵ�

		// 1. N���� �������� ����
		// 2. �������� 1~10���� �߿��� �����ȴٰ� �մϴ�
		// ex) 6 : 10 1 2 2 3 4
		// 3. �� ���������� ����� ���
		// 4. ��պ��� ���� ������ '����', ���Ŀ� ���

		// �� Ǯ�̸� �ѱ���� �ۼ��غ��� ��
		// 1. Random�� ���� (����������� N�� ���� �����Ҷ�)
		// 2. N�� �����ؾ��� ( N�� �������� �ϰ� ������ ��������)
		// 3. N����ŭ�� �������� ����
		// 4. ���� ----> ���
		// 5. ��պ��� ���� ������ ������ ���� ����
		// 6. ��պ��� ���� ������ ������ ������ �� ����
		// 7. 6�� ���

		// [1]
		Random rand = new Random();
//		int N = rand.nextInt(10) + 1;
		// rand.nextInt(101) --->> 0~100
		// rand.nextInt(10) + 1 --->> 1~10
		
		Scanner sc = new Scanner(System.in);
		
		int N = 0;
		System.out.println("��� ���ڸ� �����Ͻǰǰ���?");
		N = sc.nextInt();

		// [3]
		// �迭���� �ʹ�!
		// : �迭 3��Ҹ� ��� �����ϹǷ� , ��밡��!

		int[] data = new int[N];
		
		for (int i = 0; i < data.length; i++) {
			data[i] = rand.nextInt(10)+1;
		}
//		data[0] = 10;
//		data[0] = 10;
//		data[0] = 10;
//		data[0] = 10;
//		data[0] = 10;
//		data[0] = 10;
		// ���� ���� �ϰ� �ֳ� ? for�� �� �������

		// [4]

		int sum = 0; // ������ ������ ����

		//  �츮�� ���� for��
//		for (int i = 0; i < stu.length; i++) {
//			sum += stu[i]; // ������ �������� �״´�. (���տ����ڷ�)
//		}

		// ���� for�� == forEach ��
		// �迭�� for���� ���� ���̸鼭 forEach���� ����.
		for (int v : data) { // �����ʿ� �ִ� �迭�� �ϳ��� ��Ÿ���ٰ�
			System.out.println("������ " + v);
			sum += v;
		}
		System.out.println("����: " + sum);
		double avg = sum * 1.0 / data.length;
		System.out.println("���: " + avg);

		// [5] ��պ��� ���� ������ ������ ���� ����
		// �迭 3��� Ȯ�� ��...
		// : ���� �迭�� ������ �˼�������!
		// a) ����
		// b) Ȯ���� �迭���� --->> "��պ��� ���������� ��ϱ�?"
		int num = 0; // ��պ��� ���� ������ ������ ������ ���� ����
		for (int v : data) {
			if (v > avg) { // ��պ��� ������?
				num++;
			}
		}
		System.out.println("��պ��� ���������� " + num + "��"); // b �Ϸ�

		int[] data2 = new int[num]; // ��պ��� ���� ������ ������ ���� ���� �Ϸ�

		// [6]
		int j = 0; // data2 �迭������ �ε���
		for (int i = 0; i < data.length; i++) {
			if (data[i] > avg) { // ��պ��� ��������
				data2[j] = data[i];
				j++;
				
				// => data[i]�� data2[j]�� �����ϰ�,
				// j�� ��ĭ�̵�
			}
		}

		// [7]
		System.out.print("��պ��� ū����...");
		for (int v : data2) {
			System.out.print(v + " ");
		}
		System.out.println("�Դϴ�.");

	}

}
