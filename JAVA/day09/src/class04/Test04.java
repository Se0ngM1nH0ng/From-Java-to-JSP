package class04;

class Animal { // 이름, 종, 나이
	String name; // 이름
	String type; // 종
	int age; // 나이

	Animal(String name, String type) { // 오버로딩
		this(name, type, 0);
	}

	Animal(String name, String type, int age) { // 이름, 종, 나이
		this.name = name;
		this.type = type;
		this.age = age;
	}

	void printAge() { // 나이출력
		System.out.print(this.name + "의 종은 " + this.type + " 이고, ");
		System.out.println(this.age + "살 입니다.");
	}

	void sound() { // 울음소리
		System.out.println(this.name + "의 울음소리 : 우엉우엉");
	}

	void action() { // 행동
		System.out.println(this.name + "는 앉기, 뛰기 가능합니다.");
	}
}

class Dog extends Animal { // 강아지 클래스
	Dog(String name, String type, int age) { // 상속
		super(name, type, age); // 부모클래스 가져오기
	}

	void sound() { // 울음소리 // 오버라이딩
		System.out.println(this.name + "의 울음소리 : 멍멍 !");
	}

	void action() { // 행동 // 오버라이딩
		System.out.println(this.name + "는 앉기, 뛰기, 구르기, 호출 가능합니다.");
	}
}

class Cat extends Animal { // 고양이 클래스
	Cat(String name, String type, int age) { // 상속
		super(name, type, age); // 부모클래스 가져오기
	}

	void sound() { // 울음소리 // 오버라이딩
		System.out.println(this.name + "의 울음소리 : 야옹 !");
	}

	void action() { // 행동 // 오버라이딩
		System.out.println(this.name + "는 앉기 , 할퀴기 가능합니다.");
	}
}

public class Test04 {
	public static void main(String[] args) {

		Animal a = new Animal("뽀삐", "시츄", 2);
		Dog d = new Dog("초코", "말티즈", 1);
		Cat c = new Cat("나비", "페르시안고양이", 3);

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
