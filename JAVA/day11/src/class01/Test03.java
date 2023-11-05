package class01;

//���ϸ�

// - �̸� String name
// - �̱�Ƚ�� int win
// - �����Ҹ�() hello() : ������ ���ϸ� ���� ������ �Ҹ��� ��� 
// - ����() game() :��� ���ϸ�� ����� �ؼ� ���� �̰���� ������ boolean game(Pokemon pokemon)
// -> pokemonA.game(pokemonB)
// 			-> pokemonA.game(pokemonB) // ���� �������� ���� �̱�� true, ���� ���� false.
// 				�̱�Ƚ���� ȦȦ �������� �̱�
//				�̱�Ƚ���� ¦¦ ū���� �̱�
//				�̱�Ƚ���� Ȧ¦,¦Ȧ Ȧ���� �̱�
//				�̱�Ƚ���� �����ϴٸ� A�� �̱�(A > B)
// class ������ �������
// 1. abstract �ϱ�?
// -> �Ǵ� ��� 
//  1) �� Ŭ������ ��ü�� �ʿ��Ѱ�?
//  2) �߻�޼��尡 �ֳ�? ==> �������̵��� �����ؾ� �ϴ� �޼��尡 �ֳ�?
//							== ������ �ؾ��ϴ� �޼��尡 �ֳ� ? �����Ҹ� ()

//2. ������� ����
//	1) private �ϴ� �޾�
//	2) getter, setter  �ϴ� �޾�
//3. ������  - new�� ���� ������ ������ ������ �ִ� .
//4. �޼��� 
// 1)�������̵��� �����ؾߵǳ�? => �߻�޼���� �������ϳ� ?
// 2) '���'�� ���� , "INPUT,OUTPUT"�� �����Ͽ� '�޼��� �ñ״�ó' �ۼ�
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
	// 1. �޼��� �ȸ���� �־�~~ => �������̵� �����ǰ��ִ� �޼���(�߻�޼���)
	// => 1. ���� �߻�Ŭ���� �ϴ���
	// => 2. �߻�޼��� �������̵� ���ִ��� ��
	// 2. super()�� ȣ���ϴ� ���̾�~~ => �θ�Ŭ�������Դ� �⺻�����ڰ� ���� ����
	// => 1. �θ�Ŭ������ �⺻������ �������
	// => 2. �θ�Ŭ������ �ٸ������ڸ� ����ϴ��� ��

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

public class Test03 {

	public static void main(String[] args) {
		// �߻�Ŭ������ ��ü�� �����Ҽ� ����
		//		Pokemon pokemonB = new Pokemon("���ϸ�",0); 
		Pika pika = new Pika("��ī��");
		Pika pika2 = new Pika("��ī��");
		Charmander cm = new Charmander("���̸�");

		pika.hello();
		cm.hello();

		pika.game(pika2);
		System.out.println(pika.getWin());
		pika.game(cm);
		System.out.println(pika.getWin());
		pika2.game(cm);
		System.out.println(pika2.getWin());
		cm.game(pika);
		System.out.println(cm.getWin());
		cm.game(pika2);
		System.out.println(cm.getWin());

	}

}


// 1. �ڽ��� �����ڸ� ��Ʈ��(�� ������ �ִ°�)
// 2. �������̵� (�߻�޼��� �������̵�)
// 3. ���ڸ� ��ü �ش� ��ü�� ����Ҽ� �ִ°� 

