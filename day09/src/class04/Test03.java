package class04;

import java.util.Random;

class Poketmon {
	String name;
	int exp;
	int lv;
	String sound;// 오버라이딩을 더 줄여서
	// String 울음소리를 멤버변수에 정의해서 오버라이딩을 없애볼수 있다
	static Random rand = new Random();

	Poketmon() { // 지정하지않는 경우에는 디폴트로 "포켓몬"이 설정됨
		this("포켓몬");
	}

	Poketmon(String name) { // 이름을 사용자가 지정할수도있고,
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

	// 모듈화 하기
	// 코드가 아무리 짧아도 반복되면 모듈화를 사용하는게 좋다
	void gameT() {
		this.exp += (rand.nextInt(41) + 10);
		System.out.println(this.name + ", 성공!");
	}

	void gameF() {
		this.exp += 10;
		System.out.println(this.name + ", 실패...");
	}

	void lvUp() { // 레벨업 하는 메서드도 만듬
		while (this.exp >= 100) {
			this.exp -= 100;
			this.lv++;
			System.out.println(this.name + ", 레벨업!");
		}
	}

	void hello() { // 울음소리 하나만 지정하기
		// 오버 라이딩 : 상속 o, 메서드 시그니처 동일
		System.out.println(this.name + ": " + this.sound); // 포켓몬 : 울음소리
	}

	void printInfo() { // 출력
		System.out.println(this.name + "는 Lv." + this.lv + " [" + this.exp + "/100]");
	}
}

class Pika extends Poketmon {
	Pika() { // 기본생성자 일때 레벨저장하기 !
		this(5);
	}

	Pika(int lv) {// 생성자에서 무조건 인자가 많은거 부터 작성한다 , 인자가 있는거부터
		super("피카츄");
		this.lv = lv;
		this.sound = "피카피카";
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
		super("파이리"); // super("파이리");
		this.lv = lv; // this.level = level; 레벨을 이 레벨로 바꿔줘
		this.sound = "파아~~~";
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
		Pika p1 = new Pika(); // 피카츄,5,0
		Pika p2 = new Pika(10); // 피카츄,10,0

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
