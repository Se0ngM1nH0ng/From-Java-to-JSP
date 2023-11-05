package test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

// �����ڸ�� ���� : 1234
// ������ ��� ��й�ȣ : 123 

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

	void sell(int cnt) { // �Ǹ�
		if (this.cnt >= cnt) {
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
				System.out.println("���� ���� !");
			}
		} else { // ����� �� �����Ϸ��� ������
			System.out.println("��� �����մϴ� !");
			System.out.println("�ٽ� �Է����ּ��� !");
		}
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
		if (this.cnt == 0) {
			System.out.println("[ǰ��] ");
		}
		return "��ǰ��ȣ " + this.number + "�� " + this.name + ", " + this.price + "��" + "[���: " + this.cnt + "]";

	}

}

public class Test03 {

	public static int tryCatch() { // ��ȣ ���� trycatch �޼���
		Scanner sc = new Scanner(System.in);
		while (true) {
			try {
				int action = sc.nextInt();
				sc.nextLine();
				return action;

			} catch (InputMismatchException e) {
				System.out.println("���ڸ� �Է����ּ��� !");
				sc.nextLine();
				return -1;

			}
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Product> data = new ArrayList<Product>();
		final String path = "D:\\KIM\\resource";
		final String fileName = "test.txt";
		File file = new File(path + fileName); // ���ο� ���� ����

		int number = 1; // ��ǰ ��ȣ�� 1������ ����
		int num = 0; // �ӽú���

		while (true) {
			try {
				Thread.sleep(1500);
				System.out.println("===== ��� =====");
				System.out.println("1. ��ǰ ��� ���");
				System.out.println("2. �����ϱ�");
				System.out.println("3. ���α׷� ����");
				System.out.println("===============");
				System.out.print("�Է� ) ");
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			int action = tryCatch();

			if (action == 1) { // ��ǰ ��� ���
				if (data.isEmpty()) { // ��ϵ� ��ǰ�� ���ٸ�
					System.out.println("��ǰ�� ��ϵ��� �ʾҽ��ϴ�.");
					continue;
				}
				for (int i = 0; i < data.size(); i++) {
					System.out.println(data.get(i)); // ��ϵ� ��ǰ ��� �����ֱ�
				}
			}

			else if (action == 2) { // �����ϱ�
				if (data.isEmpty()) { // ��ϵ� ��ǰ�� ���ٸ�
					System.out.println("��ǰ�� ��ϵ��� �ʾҽ��ϴ�.");
					continue;
				}
				for (int i = 0; i < data.size(); i++) {
					System.out.println(data.get(i)); // ��ϵ� ��ǰ ��κ����ֱ�
				}
				System.out.println("� ��ǰ�� �����Ͻðڽ��ϱ� ?");
				System.out.println("��ǰ ��ȣ�� �Է��ϼ���.");
				num = tryCatch(); // ��ǰ ��ȣ ����
				boolean flag = false; // flag �˰��� // for���� �� ���� true ã��
				for (int i = 0; i < data.size(); i++) {
					if (data.get(i).getNumber() == num) { // ��ǰ�� ��ȣ�� number�� ������
						flag = true;
						System.out.println(data.get(i)); // �迭 �ε�����ȣ�� ���� �ҷ��´�
						System.out.println("� �����Ͻðڽ��ϱ� ?");
						int cnt = tryCatch(); // ���� �Է� �ޱ�
						if (cnt != -1) {
							data.get(i).changeProduct(cnt);
						}
					}
				}
				if (!flag) { // flag�� �ƴ϶��// ��� false���
					System.out.println("��ǰ��ȣ�� �߸��Է� �ϼ̽��ϴ�.");
					System.out.println("�ٽ� �õ����ּ���.");
				}
				// for���� �ƴ϶��
				// ��ǰ��ȣ �̿��� ���ڴ� ��ȿ���� �ʴ�
			} else if (action == 3) { // ���α׷� ����
				System.out.println("���α׷��� ���� �մϴ�.");
				try {
					file.createNewFile();
					FileWriter writer = new FileWriter(path + fileName, true);
					writer.write("===== ��� =====");
					writer.write("\r\n");
					writer.write("1. ��ǰ ��� ���");
					writer.write("\r\n");
					writer.write("2. �����ϱ�");
					writer.write("\r\n");
					writer.write("3. ���α׷� ����");
					writer.write("\r\n");
					writer.write("===============");
					writer.write("\r\n");
					writer.write("\r\n");

					writer.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
					System.out.println("���� ���� �Ϸ�");
					System.out.println("��� ��� �Ϸ�");
				}
				break;
			} else if (action == 1234) { // �����ڸ��
				int count = 0; // ��й�ȣ Ʋ��Ƚ��

				while (true) { // ��й�ȣ 3ȸ ī��Ʈ �ݺ�
					System.out.print("password : ");
					int password = tryCatch(); // �ӽú���
					if (password == 123) {
						System.out.println("������ ��� �Դϴ�");
						while (true) {
							try {
								Thread.sleep(1500);
								System.out.println("====== ��� =====");
								System.out.println("1. ��ǰ �߰�");
								System.out.println("2. ��ǰ ��� ����");
								System.out.println("3. ��ǰ ����");
								System.out.println("4. ������ ��� ����");
								System.out.println("================");
								System.out.print("�Է� ) ");
							} catch (InterruptedException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							int select = tryCatch();

							if (select == 1) { // ��ǰ �߰�
								System.out.println("��ǰ�� �̸��� �Է��ϼ���.");
								String name = sc.next();
								sc.nextLine();
								System.out.println("��ǰ�� ������ �Է��ϼ���.");
								int price = tryCatch();
								if (price <= 0) { // ������ 0 �����δ� �������� ����.
									System.out.println("��ȿ���� �ʽ��ϴ�");
									System.out.println("�ٽ� �Է����ּ���.");
									continue;
								}
								data.add(new Product(number++, name, price));
								System.out.println("��ǰ ��� �Ϸ� !");
							} // ������ ��� 1
							else if (select == 2) { // ��ǰ ��� ����
								if (data.isEmpty()) { // ��ϵ� ��ǰ�� ���ٸ�
									System.out.println("��ǰ�� ��ϵ��� �ʾҽ��ϴ�.");
									continue;
								}
								for (Product product : data) {
									System.out.println(product);
								}
								System.out.println("��� �߰��� ��ǰ�� ��ȣ�� �Է��ϼ���.");
								num = tryCatch();
								boolean flag = false; // flag �˰���
								for (int i = 0; i < data.size(); i++) {
									if (data.get(i).getNumber() == num) { // ��ǰ�� ��ȣ�� number�� ������
										flag = true;
										System.out.println(data.get(i));
										System.out.println("�߰��ϰ� ���� ����� ������ �Է��ϼ���.");
										int cnt = tryCatch();
										if (cnt != -1) {
											if (cnt < 0) {
												System.out.println("��� 1���̻� �߰����ּ���.");
											} else {
												data.get(i).changeProduct(cnt);
											}
										}
										// ������ �迭 �ε��� ��ȣ�� ��ǰ�� �ҷ��´�
										// �� ��ǰ�� ��� �����Ѵ� // ����� �޼���
									}
								}
								if (!flag) {// ��ǰ��ȣ �̿��� ���ڴ� ��ȿ���� �ʴ� �׸� �߰� !
									System.out.println("��ǰ��ȣ�� �߸��Է� �ϼ̽��ϴ�.");
									System.out.println("�ٽ� �õ����ּ���.");
								}

							} // ������ ��� 2

							else if (select == 3) { // ��ǰ ����
								if (data.isEmpty()) { // ��ϵ� ��ǰ�� ���ٸ�
									System.out.println("��ǰ�� ��ϵ��� �ʾҽ��ϴ�.");
									continue;
								}
								for (Product product : data) {
									System.out.println(product); // ��ǰ ��� ���
								}
								System.out.println("��ǰ�� ��ȣ�� �Է��ϼ���.");
								num = tryCatch();
								boolean flag = false; // flag �˰���
								for (int i = 0; i < data.size(); i++) { // ��ǰ �迭 ����� ���ִ� ��ǰ��ȣ
									if (num == data.get(i).getNumber()) {// �Է¹��� ��ǰ ��ȣ�� �����س��� ��ȣ��
										flag = true;// ������ �¾����� ! ����ġ ���� ����// ���� ��ȣ�� �ִ�?
										System.out.println(data.get(i));
										data.remove(i); // �׷��� ��������
										System.out.println("���� �Ϸ� !");
										break;
									}
								}
								if (!flag) { // flag�� ��ã���� �� ��� false������
									System.out.println("��ǰ��ȣ�� �߸��Է� �ϼ̽��ϴ�.");
									System.out.println("�ٽ� �õ����ּ���.");
								}

							} // ������ ��� 3
							else if (select == 4) { // ������ ��� ����
								System.out.println("������ ��带 ���� �մϴ�.");
								try {
									file.createNewFile();
									FileWriter writer = new FileWriter(path + fileName, true);
									writer.write("===== ��� =====");
									writer.write("\r\n");
									writer.write("1. ��ǰ �߰�");
									writer.write("\r\n");
									writer.write("2. ��ǰ ��� ����");
									writer.write("\r\n");
									writer.write("3. ��ǰ ����");
									writer.write("\r\n");
									writer.write("4. ������ ��� ����");
									writer.write("\r\n");
									writer.write("===============");
									writer.write("\r\n");
									writer.write("\r\n");

									writer.close();
								} catch (IOException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								} finally {
									System.out.println("����� ���� ���ư��ϴ�.");
								}
								break;
							} else { // �Է°��� �߸��Ǿ�����
								System.out.println("�߸� �Է��ϼ̽��ϴ�.");
								System.out.println("�ٽ� �Է����ּ���.");
							} // ������ ��� ��� ���� ��ȿ���˻�
						} // ������ ������ ����
						break;
					} else { // ������ password �� Ʋ���� ��
						System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
						count++; // ù��° �Է� Ʋ������ 1
					} // �����ڸ�� ��й�ȣ Ʋ������

					if (count == 3) { // ��й�ȣ�� 3ȸ Ʋ�ȴٸ�
						System.out.println("ó������ ���ư��ϴ�");
						count = 0;
						break; // �ݺ�����
					}
				} // ��й�ȣ �Է� �ݺ�

			} else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				System.out.println("�ٽ� �Է����ּ���.");
			} // ����� ��� ���� ��ȿ��
		} // ��ǰ��� while
		sc.close();
	} // main �޼���

} // class

