package class04;

import java.util.Random;

class Pokemon {
	String name;
	int exp;
	int level;

//	Pokemon() { // 지정하지 않는 경우에는 디폴트로 "포켓몬"이 설정된다.
//		this("포켓몬");
//	}
	
	Pokemon(String name) { // 이름을 사용자가 지정 할수도 있고 
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
			System.out.println("성공 !");
			this.exp += rand.nextInt(41) + 10;
		} else {
			System.out.println("실패...!");
			this.exp += 10;
		}

		while (this.exp >= 100) { // 경험치가 100이 넘어가면
			System.out.println(this.name + ", 레벨업!");
			this.level++; // 레벨업
			this.exp -= 100; // 레벨업 되고 경험치는 다시 초기화 되어야 하므로 -100 해주기
		}

	}

	void printChat() { // 대화

	}

	void print() { // 상태출력
		System.out.print(this.name + "는 Lv. " + this.level);
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
		System.out.println("성공 !");
		this.exp += rand.nextInt(41) + 10;
		System.out.println("경험치 상승");
		System.out.println();

		while (this.exp >= 100) { // 경험치가 100이 넘어가면
			System.out.println(this.name + ", 레벨업!");
			this.level++; // 레벨업
			this.exp -= 100; // 레벨업 되고 경험치는 다시 초기화 되어야 하므로 -100 해주기
		}

	}

	void printChat() { // 대화
		System.out.println("대화 : 피카피카");
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
			System.out.println("성공 !");
			this.exp += rand.nextInt(41) + 10;
			System.out.println("경험치 상승");
			System.out.println();
		} else {
			System.out.println("실패...!");
			this.exp += 10;
		}
		while (this.exp >= 100) { // 경험치가 100이 넘어가면
			System.out.println(this.name + ", 레벨업!");
			this.level++; // 레벨업
			this.exp -= 100; // 레벨업 되고 경험치는 다시 초기화 되어야 하므로 -100 해주기
		}

	}

	void printChat() { // 대화
		System.out.println("대화 : 파아~~");
	}
}

public class Test02 {

	public static void main(String[] args) {

		Pikachu pika1 = new Pikachu("피카츄1", 0, 5);
		Pikachu pika2 = new Pikachu("피카츄2", 0, 6);
		Pairi ppp = new Pairi("파이리", 0, 5);

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
