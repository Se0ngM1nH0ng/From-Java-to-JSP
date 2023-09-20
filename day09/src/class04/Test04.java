package class04;

class Animal { // �̸�, ��, ����
	String name; // �̸�
	String type; // ��
	int age; // ����

	Animal(String name, String type) { // �����ε�
		this(name, type, 0);
	}

	Animal(String name, String type, int age) { // �̸�, ��, ����
		this.name = name;
		this.type = type;
		this.age = age;
	}

	void printAge() { // �������
		System.out.print(this.name + "�� ���� " + this.type + " �̰�, ");
		System.out.println(this.age + "�� �Դϴ�.");
	}

	void sound() { // �����Ҹ�
		System.out.println(this.name + "�� �����Ҹ� : ������");
	}

	void action() { // �ൿ
		System.out.println(this.name + "�� �ɱ�, �ٱ� �����մϴ�.");
	}
}

class Dog extends Animal { // ������ Ŭ����
	Dog(String name, String type, int age) { // ���
		super(name, type, age); // �θ�Ŭ���� ��������
	}

	void sound() { // �����Ҹ� // �������̵�
		System.out.println(this.name + "�� �����Ҹ� : �۸� !");
	}

	void action() { // �ൿ // �������̵�
		System.out.println(this.name + "�� �ɱ�, �ٱ�, ������, ȣ�� �����մϴ�.");
	}
}

class Cat extends Animal { // ����� Ŭ����
	Cat(String name, String type, int age) { // ���
		super(name, type, age); // �θ�Ŭ���� ��������
	}

	void sound() { // �����Ҹ� // �������̵�
		System.out.println(this.name + "�� �����Ҹ� : �߿� !");
	}

	void action() { // �ൿ // �������̵�
		System.out.println(this.name + "�� �ɱ� , ������ �����մϴ�.");
	}
}

public class Test04 {
	public static void main(String[] args) {

		Animal a = new Animal("�ǻ�", "����", 2);
		Dog d = new Dog("����", "��Ƽ��", 1);
		Cat c = new Cat("����", "�丣�þȰ����", 3);

		a.printAge();
		d.printAge();
		c.printAge();
		System.out.println();

		a.sound();
		d.sound();
		c.sound();
		System.out.println();

		a.action();
		d.action();
		c.action();

	}
}
