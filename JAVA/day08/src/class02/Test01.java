package class02;

import java.util.Scanner;

// ���� -> ���� �����ϴ°� �ǽ��� �� ���� [����]
// 1. Ȱ��(���� ����) 2. ���۸�->���� ��α� <<<
// ���α׷��� -> ��ȿ�� �˻�(��¿�� ���� ���ʰ� �Ǵºκ�), ���� ���� x(��ƼĿ �޸� ���� Ȱ��)

class Product {
	// 1. �������
	int num; // PK
	String name;
	int cnt;
	int price;

	// 3. ������
	Product(int num, String name, int price) {
		this.num = num;
		this.name = name;
		this.cnt = 5; // ����� ����Ʈ���� 5
		this.price = price;
		System.out.println(this.name + " �����Ϸ�!");
	}

	// 2. �޼���
//	1. ����ľ�
//	: ����ڰ� 3�� �����Ұǵ� , ���Ű���?
//			�����ϴٸ� ��� ���̳ʽ�
//			�Ѱ��ݾȳ�
//			�Ұ����ϴٸ� ���Ž���
//	2. �޼��� �ñ״�ó �ľ�
//	: INPUT -> int ������ ��ǰ�� ���� 
//	: OUTPUT -> int �� ����, boolean
//	:=> int �� ����(���Ž��н� 0��)
//	3. ��� ���� 
	int sell(int cnt) {
		int sum = 0;
		if (this.cnt >= cnt) {
			this.cnt -= cnt;
			sum = cnt * this.price;
			System.out.println("�� �ݾ��� " + sum + "�� �Դϴ�.");
		} else {
			System.out.println(this.name + " ��� �����մϴ�.");
		}
		return sum;
	}

//	1) �����ڰ� ������������ ������ ����
//		����Ǿ����ϴ�!
//	2) INPUT -> int ���� 
//		OUTPUT -> void
//	3)��ɱ���
	// set���� ���� ��
	void setPrice(int price) {// (���ݺ���) // �������(�ν��Ͻ�����)�� ���� ���� �����ϴ� �� == setter
		this.price = price;
		System.out.println(this.name + " ���ݺ���Ϸ�!");
	}

	void printInfo() {
		System.out.println(this.name + " [" + this.cnt + "] " + this.price + "��");
	}

}

public class Test01 {
	public static void main(String[] args) {
		// �� main()���� ��ü�� ��������� ���������� ���� xxxxx

		Product[] data = new Product[3];
		// ���� ��ǰ�迭 data[]�� ����� ��ǰ�� ������ 0��
		// data[]�� ũ�� , length, ���� == 3�̴�
		// �ٵ� ���� ��ǰ�� ������ 0�� �̴� �򰥸��� �ʱ� !!
		int index = 0; // ��ǰ�迭�� ����Ǿ��ִ� ��ǰ�� ������ 0 ����� ��õǾ� �־
		int action;

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("===���Ǳ�===");
			System.out.println("1. �޴����");
			System.out.println("2. �޴�����");
			System.out.println("3. ���α׷� ����");
			System.out.println("============");
			System.out.println("�Է�) ");
			action = sc.nextInt();
			if (action == 3) { // ���α׷� ��������
				System.out.println("���α׷�����...");
				break;
			} else if (action == 1) { // R
				// ��ǰ�迭�� ����Ǿ��ִ� ��ǰ��ŭ ȭ�鿡 �������~
				for (int i = 0; i < index; i++) { // ��ǰ�迭�� ����Ǿ��ִ� ��ǰ�� ����
					///// System.out.println((i+1)+". "+data[i].name+" ["+data[i].cnt+"]
					///// "+data[i].price+"��");
					///// ������(����)�� ������, �̷��� �ڵ� xxxxx
					System.out.print((i + 1) + ". ");
					data[i].printInfo();
				}
			} else if (action == 2) { // U
				// ����ڰ� �����һ�ǰ��ȣ�Է�
				// �ش��ǰ���Ÿ� ����
				System.out.println("������ ��ǰ�� ��ȣ�Է�");
				System.out.print("�Է�) ");
				int num = sc.nextInt(); // ������ ��ǰ�� ��ȣ
				System.out.println("������ ��ǰ�� �����Է�");
				System.out.print("�Է�) ");
				int cnt = sc.nextInt(); // ������ ��ǰ�� ����
				data[num - 1].sell(cnt); // ��ȣ�� -1�� �ε��� �����ְ�, �Ǹ� �޼��忡 ������ ���� �Է°��� �ִ´�.
			} else if (action == 1234) { // ������ ���
				System.out.println("������ ����Դϴ�.");
				System.out.println();

				System.out.println("=== ������ ===");
				System.out.println("1. �޴��߰�");
				System.out.println("2. ���ݺ���");
				System.out.println("===============");
				System.out.print("�Է�) ");
				action = sc.nextInt();

				if (action == 1) { // C
					// ��ǰ ��ü�� �����ؼ�,
					System.out.println("������ ��ǰ�� �̸��Է�");
					System.out.print("�Է�) ");
					String name = sc.next(); // ������ ��ǰ �̸� �Է� 
					System.out.println("������ ��ǰ�� �����Է�");
					System.out.print("�Է�) "); // ��ǰ ���� �Է�
					int price = sc.nextInt();

					// ��ǰ ��ü �迭�� ��������~
					data[index++] = new Product(index, name, price); // ����
				} else if (action == 2) { // U
					/*
					 * if(Ȥ�� ���氡���� ��ǰ�� ����?) { �׷��� �������... }
					 */

					if (index <= 0) { // ������ ��ǰ�� ������ �������
						System.out.println("����� ��ǰ�� �����ϴ�!");
						continue;
					}

					System.out.println("���ݺ����� ��ǰ�� ��ȣ�Է�");
					System.out.print("�Է�) ");
					int num = sc.nextInt(); // num�� ��ȣ�ȿ��� ����� �ӽú����� �� ���� �ִ�
					if (num <= 0 || index < num) { // Ȥ�� num�� ��ȿ�������ʾ�?
						// �� ��谪 �˻�
						System.out.println("���� ��ǰ��ȣ�Դϴ�!");
						continue;
					}

					System.out.println("��ǰ�� �����Է�");
					System.out.print("�Է�) ");
					int price = sc.nextInt();
					if (price <= 0) {
						System.out.println("�ùٸ������� �����Դϴ�!");
						continue;
					}

					data[num - 1].setPrice(price); // ���� å�� �޼��忡 �Է��ϱ�

				}
			} else { // ��ȿ�� �˻�(������� �Է°� �˻�)
				System.out.println("�߸��� ��ȣ�Դϴ�! Ȯ���� �ٽ��̿����ּ���!");
			}
		}
	}
}