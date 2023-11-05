package class01;

import java.util.Random;

class Player{
	private final static int maxIndex=3;
	private int preIndex;
	private Pokemon[] data;
	Player(){
		this.preIndex=0;
		this.data=new Pokemon[maxIndex];

		this.data[this.preIndex++]=new Pika();
	}
	// ��� : �� �迭�� ���ϸ� �߰��ϱ�(���ϸ��� main()���� �޾ƿ´�!)
	// INPUT: ���ϸ�
	// OUTPUT: x
	void addPokemon(Pokemon pokemon) {
		this.data[this.preIndex++]=pokemon;
	}
	// ��� : �� �迭�� ����� ���ϸ��� ���
	// INPUT: x
	// OUTPUT: x
	void printData() {
		for(int i=0;i<this.preIndex;i++) {
			System.out.println(this.data[i]);
		}
	}
	void play() {
		Random rand=new Random();
		int num1=rand.nextInt(this.preIndex);
		int num2=rand.nextInt(this.preIndex);
		System.out.println(" num1 = "+num1+", num2 = "+num2);
		if(this.data[num1].equals(this.data[num2])) {
			// �ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�
			// this.data[num1]�� equals()�� �����ϴ� ��ü(�־�)
			// Ÿ��==���ϸ�      ��ī��,���̸�,��Ÿ��,...
			// �θ�.�޼���()�߾, �˾Ƽ�
			// �ڽ��̱����Ѹ޼��尡 ����Ǵ� ����
			//  == �������ε� -> "������"�� �����Ǿ���!

			// �� ���� equals()�� �����ϴ� ��ü(�־�)��
			// ��ī��,���̸�,���α�,...
			System.out.println("���� ���ϸ��̶� �����մϴ�.");
			return;
		}
		if(this.data[num1].game(this.data[num2])) {
			this.data[num1].hello();
		}
		else {
			this.data[num2].hello();
		}
	}
	public int getPreIndex() {
		return preIndex;
	}
	public void setPreIndex(int preIndex) {
		this.preIndex = preIndex;
	}
	public Pokemon[] getData() {
		return data;
	}
	public void setData(Pokemon[] data) {
		this.data = data;
	}
}

// class Pokemon
//  - String name
//  - int win �̱�Ƚ��
//  - void hello() : ������ ���ϸ󸶴� ������ �Ҹ��� ���
//  - boolean game(Pokemon pokemon)
//      -> pokemonA.game(pokemonB);
//         �̱�Ƚ���� ȦȦ �������� �̱�
//         �̱�Ƚ���� ¦¦ ū���� �̱�
//          �����ϴٸ� A�� �̱�(A>B)
//         �̱�Ƚ���� Ȧ¦,¦Ȧ Ȧ���� �̱�

// class ������
// 1. abstract�ϱ�?
//    1) �� Ŭ������ ��ü�� �ʿ��Ѱ�?
//    2) �߻�޼��尡 �ֳ�? == �������̵��� �����ؾ��ϴ� �޼��尡 �ֳ�?
//         == �������ؾ��ϴ� �޼��尡 �ֳ�?
// 2. ������� ����
//    1) private
//    2) getter,setter
// 3. ������
// 4. �޼���
//    1) �������̵�(������)�� �����ؾߵǳ�? => �߻�޼���� �������ϳ�?
//    2) '���'�� ����, "INPUT,OUTPUT"�� �����Ͽ� '�޼��� �ñ״�ó' �ۼ�
abstract class Pokemon{
	private String name;
	private int win;
	Pokemon(String name){ // �߻�Ŭ���� ������ ���� ����
		this.name=name;
		this.win=0;
	}
	abstract void hello();
	boolean game(Pokemon pokemon) { 
		if(this.win%2==1 && pokemon.win%2==1) {
			if(this.win<=pokemon.win) {
				this.win++;
				return true;
			}
			else {
				pokemon.win++;
				return false;
			}
		}
		else if(this.win%2==0 && pokemon.win%2==0) {
			if(this.win>=pokemon.win) {
				this.win++;
				return true;
			}
			else {
				pokemon.win++;
				return false;
			}
		}
		else {
			if(this.win%2==1) {
				this.win++;
				return true;
			}
			else {
				pokemon.win++;
				return false;
			}
		}
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
	@Override
	public String toString() {
		return this.name+"��(��) �̱� Ƚ���� "+this.win+"���Դϴ�.";
	}
}

class Pika extends Pokemon{
	Pika() {
		super("��ī��");
	}
	@Override
	void hello() {
		System.out.println("��ī��ī");
	}
	// 1. �޼��� �ȸ���� �־�~~ => �������̵� �����ǰ��ִ� �޼���(�߻�޼���)
	//    => 1. ���� �߻�Ŭ���� �ϴ���
	//       2. �߻�޼��� �������̵� ���ִ��� ��
	// 2. super()�� ȣ���ϴ� ���̾�~~ => �θ�Ŭ�������Դ� �⺻�����ڰ� ���� ����
	//    => 1. �θ�Ŭ������ �⺻������ �������
	//       2. �θ�Ŭ������ �ٸ������ڸ� ����ϴ��� ��
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Pika) { // Pika�� ���Ϸ��� obj�� Ŭ������ ����?
			return true;
		}
		return false;
	}
}
class Metamon extends Pokemon{
	Metamon() {
		super("��Ÿ��");
	}
	@Override
	void hello() {
		System.out.println("���䢪");
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Metamon) { // Metamon�� ���Ϸ��� obj�� Ŭ������ ����?
			return true;
		}
		return false;
	}
}

public class Test03 {
	public static void main(String[] args) {
		Pika pika=new Pika();
		Metamon m1=new Metamon();
		Metamon m2=new Metamon();

		pika.setWin( pika.getWin()+1 ); // == pika.win++;

		pika.game(m1);
		System.out.println(pika.getWin());
		m2.game(pika);
		System.out.println(pika.getWin());
		m1.game(pika);
		System.out.println(pika.getWin());
		m1.game(m2);
		System.out.println(m1.getWin());
		pika.game(m1);
		System.out.println(m1.getWin());


		if(pika.equals(m2)) {
			System.out.println();
		}



		System.out.println();
		System.out.println();
		System.out.println();



		// ���ϸ� �߰�
		// ����� ����? -> �޼��� ����(����,����)
		// "����"�ϴ� ���?
		// "�÷��̾�"�� �ϴ� ���!
		Player player = new Player();
		player.addPokemon(new Metamon());
		player.addPokemon(new Metamon());

		for(int i=0;i<20;i++) {
			player.play();
		}

		// ���ϸ� ���
		// "�÷��̾�"�� �ϴ� ���!
		player.printData();












		// data�� ����� ���ϸ��� �������� 2���� 
