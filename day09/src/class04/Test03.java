package class04;

import java.util.Random;

class Poketmon {
	String name;
	int exp;
	int lv;
	String sound;// �������̵��� �� �ٿ���
	// String �����Ҹ��� ��������� �����ؼ� �������̵��� ���ֺ��� �ִ�
	static Random rand = new Random();

	Poketmon() { // ���������ʴ� ��쿡�� ����Ʈ�� "���ϸ�"�� ������
		this("���ϸ�");
	}

	Poketmon(String name) { // �̸��� ����ڰ� �����Ҽ����ְ�,
		this.name = name;
		this.exp = 0;
		this.lv = 5;
		this.sound = "...";
	}

	void game() {
		int action = rand.nextInt(2);
		if (action == 0) {
			gameT();
		} else {
			gameF();
		}
		lvUp();
	}

	// ���ȭ �ϱ�
	// �ڵ尡 �ƹ��� ª�Ƶ� �ݺ��Ǹ� ���ȭ�� ����ϴ°� ����
	void gameT() {
		this.exp += (rand.nextInt(41) + 10);
		System.out.println(this.name + ", ����!");
	}

	void gameF() {
		this.exp += 10;
		System.out.println(this.name + ", ����...");
	}

	void lvUp() { // ������ �ϴ� �޼��嵵 ����
		while (this.exp >= 100) {
			this.exp -= 100;
			this.lv++;
			System.out.println(this.name + ", ������!");
		}
	}

	void hello() { // �����Ҹ� �ϳ��� �����ϱ�
		// ���� ���̵� : ��� o, �޼��� �ñ״�ó ����
		System.out.println(this.name + ": " + this.sound); // ���ϸ� : �����Ҹ�
	}

	void printInfo() { // ���
		System.out.println(this.name + "�� Lv." + this.lv + " [" + this.exp + "/100]");
	}
}

class Pika extends Poketmon {
	Pika() { // �⺻������ �϶� ���������ϱ� !
		this(5);
	}

	Pika(int lv) {// �����ڿ��� ������ ���ڰ� ������ ���� �ۼ��Ѵ� , ���ڰ� �ִ°ź���
		super("��ī��");
		this.lv = lv;
		this.sound = "��ī��ī";
	}

	void game() {
		int action = rand.nextInt(1);
		if (action == 0) {
			gameT();
		} else {
			gameF();
		}
		lvUp();
	}
}

class Charmander extends Poketmon {
	Charmander() {
		this(5);
	}

	Charmander(int lv) {
		super("���̸�"); // super("���̸�");
		this.lv = lv; // this.level = level; ������ �� ������ �ٲ���
		this.sound = "�ľ�~~~";
	}

	void game() {
		int action = rand.nextInt(5);
		if (action == 0) {
			gameT();
		} else {
			gameF();
		}
		lvUp();
	}
}

public class Test03 {
	public static void main(String[] args) {
		Pika p1 = new Pika(); // ��ī��,5,0
		Pika p2 = new Pika(10); // ��ī��,10,0

		Charmander c1 = new Charmander();
		Charmander c2 = new Charmander(11);

		for (int i = 0; i < 10; i++) {
			p1.game();
			p2.game();
			c1.game();
		}
		p1.printInfo();
		p2.printInfo();
		c1.printInfo();

		p1.hello();
		c1.hello();

	}
}
