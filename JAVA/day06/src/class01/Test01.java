package class01;

import java.util.Random;
import java.util.Scanner;

// flag�˰��� : Ư����Ȳ�� T����F���� �Ǵ��Ҷ� Ȱ��
// ������ ���������� �� Ȯ���ؾ� �˼� �ִ� ��Ȳ�� ���� ����
// �̶� ' Ư����Ȳ' �� �ݺ��� , �Լ� ��ó�� �ð��� �� �귯��,
// ������ ��� Ȯ���ؾ� �˼� ������ !
// � �迭�� �ִµ� �迭�� Ȧ���� �ִ�? 
// �迭 ���� �ִ� 
// �ݺ��ϴ� ���� �ִ� ?

public class Test01 {

	public static void main(String[] args) {

		/// ���� �����ϱ� ////

		int[] data = new int[5]; // 5ĭ �迭 �����
		Random rand = new Random(); // ���� ������
		for (int i = 0; i < data.length; i++) {
			data[i] = rand.nextInt(100) + 1; // 1~100
		}
		// data.length == �迭�� ũ��
		// != ����Ǿ��ִ� �������� ����
		// �������� ������ 0�̴� �򰥸��� �ʵ��� ����

		System.out.print("[ ");
		for (int v : data) {
			System.out.print(v + " ");
		}
		System.out.println("]");

		Scanner sc = new Scanner(System.in);
		System.out.print("�����Է�) ");// �ε��� ��ȣ Ȯ���ϴ� ���� ����
		int num = sc.nextInt();

		boolean flag = false; // OFF. �迭�� num�� ���� ��Ȳ�� �ǹ�
		int index = -1; // ������ off�� ���� �迭�� num�� ���� ��Ȳ�� �ǹ�
		// �ٽ��� flag���� �̸� Ư����Ȳ���� Ȯ���ϴ�
		// �ִٸ� true ���ٸ� false

		for (int i = 0; i < data.length; i++) {
			if (data[i] == num) {
				flag = true; // ON. �迭�� num�� �ִ� ��Ȳ�� �ǹ�
				index = i;
			}
		}

		if (flag) { // num�� �迭�� �����Ѵٸ�,
			System.out.println(num + "�� [" + index + "]�� �����մϴ�!");
		} else {
			System.out.println(num + "�� ���������ʽ��ϴ�...");
		}
	}
}
