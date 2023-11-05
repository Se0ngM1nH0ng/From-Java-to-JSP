/*package test;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

// ������ ��й�ȣ : 1234
class Product {
	private int number; // PK // ���� ��ǰ��ȣ
	private String name;
	private int price;
	private int cnt;

	Product() {
		this(0, "����");
	}

	Product(int number, String name) {
		this(0, "����", 1000);
	}

	Product(int number, String name, int price) {
		this.number = number;
		this.name = name;
		this.price = price;
		Random rand = new Random();
		this.cnt = rand.nextInt(21); // ���� �������� ���� ����
	}

	int sell(int cnt) { // �Ǹ�
		int sum = 0; // �հ�
		int result = 0; // �Ž�����
		sum = cnt * this.price; // �հ�
		System.out.println("������ " + sum + "�� �Դϴ�.");

		Scanner sc = new Scanner(System.in);
		System.out.print("�� �Է� ) "); // ����ڿ��� ���Է¹ޱ�
		int money = sc.nextInt();
		if (money >= sum) { // �������� �հ躸�� �ϴ� ���ƾ��Ѵ�.
			this.cnt -= cnt; // ���� ����� ������ ���ŭ ���ֱ�
			result = money - sum; // (�Է��ѵ� - �հ�)�� result�� ��Ҵ�
			// �Ž�����
			System.out.println("���� ���� !");
			System.out.println("�Ž������� " + result + "�� �Դϴ�.");
			System.out.println("�̿��� �ּż� �����մϴ�.");
		} else {
			System.out.println("�ܾ��� �����մϴ�...!");
		}
		return result; // �Ž����� ��ȯ

	}

	void changeProduct(int cnt) {// �����
		this.cnt += cnt;
		System.out.println("��� ���� �Ϸ� !");
		System.out.println("[��� : " + this.cnt + "]");
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	@Override
	public String toString() {
		return "��ǰ��ȣ " + this.number + "�� " + this.name + ", " + this.price + "��" + "[���: " + this.cnt + "]";
	}

}

public class Test01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Product> data = new ArrayList<Product>();

		int number = 1; // ��ǰ ��ȣ�� 1������ ����

		while (true) {
			System.out.println("===== ��� =====");
			System.out.println("1. ��ǰ ��� ���");
			System.out.println("2. �����ϱ�");
			System.out.println("3. ���α׷� ����");
			System.out.println("===============");
			System.out.print("�Է� ) ");
			int action = sc.nextInt();

			if (action == 1) { // ��ǰ ��� ���
				for (Product product : data) { // �迭�� ����� ��ǰ����
					System.out.println(product); // product ��ü�� �ִ´�
				}
			} else if (action == 2) { // �����ϱ�
				for (Product product : data) {
					System.out.println(product);// ��� ���
				}
				System.out.println("� ��ǰ�� �����Ͻðڽ��ϱ� ?");
				System.out.println("��ǰ ��ȣ�� �Է��ϼ���.");
				number = sc.nextInt();
				for (int i = 0; i < data.size(); i++) {
					if (data.get(i).getNumber() == number) { // ��ǰ�� ��ȣ�� number�� ������
						System.out.println(data.get(i)); // �迭 �ε�����ȣ�� ���� �ҷ��´�
						System.out.println("� �����Ͻðڽ��ϱ� ?");
						int cnt = sc.nextInt(); // ���� �Է� �ޱ�
						data.get(i).sell(cnt);
					}
				}
				// �迭 �ε��� ��ȣ�� �Ǹ� �޼��� ����
				// INPUT : ������ ���� int cnt
				// OUTPUT : �Ž����� result

			} else if (action == 3) { // ���α׷� ����
				System.out.println("���α׷��� ���� �մϴ�.");
				break;
			} else if (action == 1234) { // �����ڸ��
				System.out.println("������ ��� �Դϴ�");
				while (true) {
					System.out.println("====== ��� =====");
					System.out.println("1. ��ǰ �߰�");
					System.out.println("2. ��ǰ ��� ����");
					System.out.println("3. ��ǰ ����");
					System.out.println("4. ������ ��� ����");
					System.out.println("================");
					System.out.print("�Է� ) ");
					int select = sc.nextInt();

					if (select == 1) { // ��ǰ �߰�
						System.out.println("��ǰ�� �̸��� �Է��ϼ���.");
						String name = sc.next();
						sc.nextLine();
						System.out.println("��ǰ�� ������ �Է��ϼ���.");
						int price = sc.nextInt();
						data.add(new Product(number++, name, price));
					} else if (select == 2) { // ��ǰ ��� ����
						for (Product product : data) {
							System.out.println(product);
						}
						System.out.println("��� �߰��� ��ǰ�� ��ȣ�� �Է��ϼ���.");
						number = sc.nextInt();
						for (int i = 0; i < data.size(); i++) {
							if (data.get(i).getNumber() == number) { // ��ǰ�� ��ȣ�� number�� ������
								System.out.println(data.get(i));
								System.out.println("�߰��ϰ� ���� ����� ������ �Է��ϼ���.");
								int cnt = sc.nextInt();
								data.get(i).changeProduct(cnt);
								// ������ �迭 �ε��� ��ȣ�� ��ǰ�� �ҷ��´�
								// �� ��ǰ�� ��� �����Ѵ� // ����� �޼���
							}
						}
					} else if (select == 3) { // ��ǰ ����
						for (Product product : data) {
							System.out.println(product);
						}
						System.out.println("��ǰ�� ��ȣ�� �Է��ϼ���.");
						int num = sc.nextInt();
						for (int i = 0; i < data.size(); i++) { // ��ǰ �迭 ����� ���ִ� ��ǰ��ȣ
							if (num == data.get(i).getNumber()) {// �Է¹��� ��ǰ ��ȣ�� �����س��� ��ȣ��
								// ���� ��ȣ�� �ִ�?
								System.out.println(data.get(i));
								data.remove(i); // �׷��� ��������
								System.out.println("���� �Ϸ� !");
								break;
							}
						}
					} else if (select == 4) { // ������ ��� ����
						System.out.println("������ ��带 ���� �մϴ�.");
						break;
					}

				}
			}

		}
		sc.close();
	}

}
*/