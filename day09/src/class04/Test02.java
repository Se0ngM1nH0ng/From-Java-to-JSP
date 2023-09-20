package class04;

import java.util.Random;

class Pokemon {
	String name;
	int exp;
	int level;

//	Pokemon() { // �������� �ʴ� ��쿡�� ����Ʈ�� "���ϸ�"�� �����ȴ�.
//		this("���ϸ�");
//	}
	
	Pokemon(String name) { // �̸��� ����ڰ� ���� �Ҽ��� �ְ� 
		this(name, 0, 5);
	}

	Pokemon(String name, int exp, int level) {
		this.name = name;
		this.exp = exp;
		this.level = level;
	}

	void game() {
		Random rand = new Random();
		int num = rand.nextInt(2);
		if (num == 0) {
			System.out.println("���� !");
			this.exp += rand.nextInt(41) + 10;
		} else {
			System.out.println("����...!");
			this.exp += 10;
		}

		while (this.exp >= 100) { // ����ġ�� 100�� �Ѿ��
			System.out.println(this.name + ", ������!");
			this.level++; // ������
			this.exp -= 100; // ������ �ǰ� ����ġ�� �ٽ� �ʱ�ȭ �Ǿ�� �ϹǷ� -100 ���ֱ�
		}

	}

	void printChat() { // ��ȭ

	}

	void print() { // �������
		System.out.print(this.name + "�� Lv. " + this.level);
		System.out.println("[ " + this.exp + " / 100 ]");
		System.out.println();
	}
}

class Pikachu extends Pokemon {

	Pikachu(String name, int exp, int level) {
		super(name, exp, level);
	}

	void game() {
		Random rand = new Random();
		System.out.println("���� !");
		this.exp += rand.nextInt(41) + 10;
		System.out.println("����ġ ���");
		System.out.println();

		while (this.exp >= 100) { // ����ġ�� 100�� �Ѿ��
			System.out.println(this.name + ", ������!");
			this.level++; // ������
			this.exp -= 100; // ������ �ǰ� ����ġ�� �ٽ� �ʱ�ȭ �Ǿ�� �ϹǷ� -100 ���ֱ�
		}

	}

	void printChat() { // ��ȭ
		System.out.println("��ȭ : ��ī��ī");
	}
}

class Pairi extends Pokemon {

	Pairi(String name, int exp, int level) {
		super(name, exp, level);
	}

	void game() {
		Random rand = new Random();
		int select = rand.nextInt(5) + 1;
		if (select == 1) {
			System.out.println("���� !");
			this.exp += rand.nextInt(41) + 10;
			System.out.println("����ġ ���");
			System.out.println();
		} else {
			System.out.println("����...!");
			this.exp += 10;
		}
		while (this.exp >= 100) { // ����ġ�� 100�� �Ѿ��
			System.out.println(this.name + ", ������!");
			this.level++; // ������
			this.exp -= 100; // ������ �ǰ� ����ġ�� �ٽ� �ʱ�ȭ �Ǿ�� �ϹǷ� -100 ���ֱ�
		}

	}

	void printChat() { // ��ȭ
		System.out.println("��ȭ : �ľ�~~");
	}
}

public class Test02 {

	public static void main(String[] args) {

		Pikachu pika1 = new Pikachu("��ī��1", 0, 5);
		Pikachu pika2 = new Pikachu("��ī��2", 0, 6);
		Pairi ppp = new Pairi("���̸�", 0, 5);

		for (int j = 0; j < 10; j++) {
			pika1.game();
			pika2.game();
			ppp.game();
		}

		pika1.print();
		pika2.print();
		ppp.print();
		pika1.printChat();
		pika2.printChat();
		ppp.printChat();

	}

}
