package section02;

import java.util.Random;

public class Test01 {

	public static void main(String[] args) {

		Random rand = new Random();

		int[] data = new int[10];

		// 1) �ݺ��� �Ѵ�!
		// 2) ��������� �𸥴�! -> while��
		int index = 0; // ���� ��ġ�� ��Ÿ���� ����

		while (index < data.length) { // data �迭�� �ϼ��ɶ����� ���

			data[index] = rand.nextInt(10) + 1; // �������� ������ �����ϰ�,
			// [flag �˰���]

			boolean flag = false; // �ʱ����
			// Ư���� ���� �߻��ϸ�,
			// [������ �ߺ�] �� �߻��ϸ�

			for (int i = 0; i < index; i++) {
				if (data[i] == data[index]) { // �����Ͱ� �ߺ��̾�?
					flag = true;
				}
			} 
			// flag�� true ���
			if (flag) { // data[index]�� ������ �־��ٸ�
				continue; // �Ʒ��� �������� �ȵȴ�!!!!!
			}
			index++; // ��������!
		}
		System.out.print("[");
		for (int v : data) {
			System.out.print(v + " ");
		}
		System.out.println("]");
	}
}
