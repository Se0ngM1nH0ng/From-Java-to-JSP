package class02;

import java.util.Random;
import java.util.Scanner;

class Poketmon {
	String name;// ���ϸ� �̸�
	int level; // ���ϸ󸶴� ������ �� �ٸ���.

	static int exp;

	Poketmon(String name) {
		this.name = name;
//		this.level = level;
	}

	Poketmon(String name, int level) {
		this.name = name;
		this.level = level;
		System.out.println(this.name + " Lv" + this.level + " ���ϸ� �����Ϸ�!");

	}

	void printInfo() {
		System.out.println();
		System.out.print(this.name + " Lv" + this.level + ". ");
		System.out.println("[" + Poketmon.exp + "/100]");
	}

	void game() {
		Random rand = new Random();
		int randNum = rand.nextInt(2);// ������ 0,1�� ������ ��������
		if (randNum == 1) {
			System.out.println("���� !");
			Poketmon.exp += rand.nextInt(101) + 50; // ���� 50~150 ����ġ ����
		} else {
			System.out.println("���� !");
			Poketmon.exp += 10; // ����ġ 10 ����
		}

		if (Poketmon.exp >= 100) { // ����ġ�� 100 �Ѿ��
			Poketmon.exp = 100;
			level++; // ������ �ö󰣴�.
			System.out.print(this.name + " Lv" + this.level + "�� ������!");
			System.out.println();
		}

	}
}

public class Test04 {

	public static void main(String[] args) {

//		Poketmon po = new Poketmon("��ī��", 5);
//		Poketmon po2 = new Poketmon("���̸�", 4);
//		Poketmon po3 = new Poketmon("���α�", 3);
		int N = 3;
		Poketmon[] datas = new Poketmon[N];

		String name = null; // �̸� �ʱⰪ
		int num = 0; // ���� �Է°�

		int i = 0;
		while (i < 3) {
			Scanner sc = new Scanner(System.in);
			for (i = 0; i < datas.length; i++) { // �̸� �Է¹ޱ�
				System.out.println((i + 1) + "��°" + " ���ϸ� �̸��� �Է����ּ��� !");
				name = sc.next();
				System.out.println("������ �Է����ּ��� !");
				num = sc.nextInt();

				datas[i] = new Poketmon(name, num);// �̸��� ���� �ޱ�
			}
		}
		
		i=0;
		while(true) {
			datas[i].game();
			if(i==datas.length) {
				i=0;
			}
		}
		
		
		
	}
}
//			���ϸ��� �̸��� ������ 
//			������ ���� �Է¹޾Ƽ�
//			���ϸ� �������� ����� 
//			���� ���� !
