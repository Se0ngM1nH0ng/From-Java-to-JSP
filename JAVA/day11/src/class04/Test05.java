package class04;

import java.util.Random;

abstract class Pokemon {
	private String name;
	private int win;

	Pokemon(String name) { // �߻�Ŭ���� ������ ���� ����
		this.name = name;
		this.win = 0;
	}

	abstract void hello(); // �߻�޼���� {}�� ����. // �������̵� ����

	boolean game(Pokemon pokemon) {
		if (this.win == pokemon.win) {
			System.out.println(this.name + " �¸� !");
			return true;
			// else�� ���и� �ȸ��� ����: ������ �¸��� �ȵ��� �� ���а� �߱� ������
		} else if (this.win % 2 == 1) {
			if (pokemon.win % 2 == 1) {
				if (this.win < pokemon.win) {
					System.out.println(this.name + " �¸� !");
					return true;
				} else {
					System.out.println(this.name + " �й� !");
				}
			}
		} else if (this.win % 2 == 0) {
			if (pokemon.win % 2 == 0) {
				if (this.win < pokemon.win) {
					System.out.println(this.name + " �¸� !");
					return true;
				} else {
					System.out.println(this.name + " �й� !");
				}
			}
		} else if (this.win % 2 == 1 && pokemon.win % 2 == 0) {
			System.out.println(this.name + " �¸� !");
			return true;
		} else if (this.win % 2 == 0 && pokemon.win % 2 == 1) {
			System.out.println(pokemon.name + " �¸� !");
			return true;
		}
		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWin() {
		return win;
	}

	public void setWin(int win) {
		this.win = win;
	}

}

class Pika extends Pokemon {

	Pika() {
		this("��ī��");
	}

	Pika(String name) {
		super("��ī��");
	}

	@Override
	void hello() {
		System.out.println("��ī��ī");
	}

}

class Charmander extends Pokemon {

	Charmander() {
		this("���̸�");
	}

	Charmander(String name) {
		super("���̸�");
	}

	@Override
	void hello() {
		System.out.println("�ľ�~~");
	}

}

class Player {
	final static int maxIndex = 3; // �ִ� ���� ���ϸ� ����
	int preIndex; // ���� �����ϰ� �ִ� ���ϸ� ����
	Pokemon[] data; // ���ϸ� �迭�� ����

	Player() {
		this.preIndex = 1; // �⺻���� �Ѹ��� ������ ����
		this.data = new Pokemon[maxIndex]; // ���ϸ��� 3�������� �����Ҽ� ����
		this.data[0] = new Pika(); // ù��° �迭 ���� ��ī�� �⺻��
	}

	void play() {
		Random rand = new Random();
		// ������ ���ϸ� �迭 ���� �θ����� �������� �̱�
		int n1 = rand.nextInt(this.preIndex);// �����ִ� ���ϸ󰳼���ŭ
		int n2 = rand.nextInt(this.preIndex);// ���� �����ϴ� ����������
		// data[n1] data[n2]
		if (data[n1].equals(data[n2])) {
			// �� ���� equals()�� �����ϴ� ��ü(�־�)
			System.out.println("�� ���ϸ��� �����ϴ�.");
		} else {
			data[n1].game(data[n2]);
		}

		if (data[n1].game(data[n2])) {
			data[n1].hello();
			System.out.println("�¸� !");
		} else {
			data[n2].hello();
			System.out.println("�¸� !");
		}
	}

	// Ÿ���̶� �޾ƿ� �̸� ����
	void addPokemon(Pokemon pokemon) { // ���� ���ϸ��� ����޾ƾ��ϴϱ�
		// ���ϸ��� input ������ �÷��̾��� data �迭�� �����Ѵ� :�� �ѱ��ڵ�
		// �� player �ȿ� data �迭�� �����Ŵ�
		// player�� �� this.data[������ �ִ� ���ϸ� ������ŭ] = �Է� pokemon
		// this.data[������ �ִ� ���ϸ��� �÷������� �ϱ� ������]
		this.data[preIndex++] = pokemon;
	}

	@Override
	public boolean equals(Object obj) {
		Player player = (Player) obj;
		if (this.data == player.data) {
			return true;
		}
		return false;
	}

}

public class Test05 {

	public static void main(String[] args) {
		// �߻�Ŭ������ ��ü�� �����Ҽ� ����
		//		Pokemon pokemonB = new Pokemon("���ϸ�",0); 

		Player player = new Player();


		player.play();

		//��ü�� ������� �� �ȿ� data �迭�� ���ϸ��� �����Ѵ� 
		// : player �ȿ� �޼��带 ���� ���ϸ� ���� 

		//data ���ϸ󵥷��ͼ� play()
		//player.data[0].play();
		
		player.addPokemon();


	}

}

// 1. �ڽ��� �����ڸ� ��Ʈ��(�� ������ �ִ°�)
// 2. �������̵� (�߻�޼��� �������̵�)
// 3. ���ڸ� ��ü �ش� ��ü�� ����Ҽ� �ִ°�
