package class04;

// Ŭ����
class Book2 {
	// �������
	String title;
	int price;
	int cnt; // �Ǹŷ�

	Book2(String title, int price) {
		this.title = title;
		this.price = price;
		this.cnt = 0; // �Է°��� ������ 0���� ����
		System.out.println(this.title + " �����Ϸ�!");
	}

	Book2(String title, int price, int cnt) {
		this.title = title;
		this.price = price;
		this.cnt = cnt;
		System.out.println(this.title + " �����Ϸ�!");
	}

	// �޼���
	void printInfo() {
		System.out.println(this.title + " �Ǹŷ�: " + this.cnt);
		System.out.println(this.title + " ����: " + this.price);
	}

	void sell() {
		cnt += 10;
		System.out.println(this.title + " �ǸſϷ�");
	}
}

public class Test04 {
	public static void main(String[] args) {

		// ��ü��
		Book2 b1 = new Book2("�����", 7800); // ���������ʾƵ� �⺻������ �����Ǵ� ������
		Book2 b2 = new Book2("�ظ�����", 23000); // �⺻(����Ʈ)������ : ���ھ���
		// ������(�Լ�)
		// 1. Ŭ������ �̸��� ����
		// 2. ��ü�� �����Ҽ�������
		// 3. new �����ڿ� �Բ� ���

		b1.printInfo();
		b2.printInfo();

		// 15~23���α��� �Լ��� �� 4��
		// �Լ� 1��
		// �޼��� 1��
		// ������ 2��

		Book2 b3 = new Book2("�������ڸ� ���� ������ �� �ִ� IT����", 16800, 100);

		b3.sell();
		b3.printInfo();

	}
}
