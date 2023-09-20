package class04;

import java.util.Random;

abstract class Pokemon {
	private String name;
	private int win;

	Pokemon(String name) { // 추상클래스 생성자 소유 가능
		this.name = name;
		this.win = 0;
	}

	abstract void hello(); // 추상메서드는 {}가 없다. // 오버라이딩 강제

	boolean game(Pokemon pokemon) {
		if (this.win == pokemon.win) {
			System.out.println(this.name + " 승리 !");
			return true;
			// else로 실패를 안만든 이유: 위에서 승리에 안들어가면 다 실패가 뜨기 때문에
		} else if (this.win % 2 == 1) {
			if (pokemon.win % 2 == 1) {
				if (this.win < pokemon.win) {
					System.out.println(this.name + " 승리 !");
					return true;
				} else {
					System.out.println(this.name + " 패배 !");
				}
			}
		} else if (this.win % 2 == 0) {
			if (pokemon.win % 2 == 0) {
				if (this.win < pokemon.win) {
					System.out.println(this.name + " 승리 !");
					return true;
				} else {
					System.out.println(this.name + " 패배 !");
				}
			}
		} else if (this.win % 2 == 1 && pokemon.win % 2 == 0) {
			System.out.println(this.name + " 승리 !");
			return true;
		} else if (this.win % 2 == 0 && pokemon.win % 2 == 1) {
			System.out.println(pokemon.name + " 승리 !");
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
		this("피카츄");
	}

	Pika(String name) {
		super("피카츄");
	}

	@Override
	void hello() {
		System.out.println("피카피카");
	}

}

class Charmander extends Pokemon {

	Charmander() {
		this("파이리");
	}

	Charmander(String name) {
		super("파이리");
	}

	@Override
	void hello() {
		System.out.println("파아~~");
	}

}

class Player {
	final static int maxIndex = 3; // 최대 소지 포켓몬 갯수
	int preIndex; // 현재 소지하고 있는 포켓몬 갯수
	Pokemon[] data; // 포켓몬 배열에 저장

	Player() {
		this.preIndex = 1; // 기본으로 한마리 가지고 있음
		this.data = new Pokemon[maxIndex]; // 포켓몬을 3마리까지 저장할수 있음
		this.data[0] = new Pika(); // 첫번째 배열 값은 피카츄 기본값
	}

	void play() {
		Random rand = new Random();
		// 저장한 포켓몬 배열 에서 두마리를 랜덤으로 뽑기
		int n1 = rand.nextInt(this.preIndex);// 갖고있는 포켓몬개수만큼
		int n2 = rand.nextInt(this.preIndex);// 현재 존재하는 마리수까지
		// data[n1] data[n2]
		if (data[n1].equals(data[n2])) {
			// ★ 실제 equals()를 수행하는 주체(주어)
			System.out.println("두 포켓몬이 같습니다.");
		} else {
			data[n1].game(data[n2]);
		}

		if (data[n1].game(data[n2])) {
			data[n1].hello();
			System.out.println("승리 !");
		} else {
			data[n2].hello();
			System.out.println("승리 !");
		}
	}

	// 타입이랑 받아올 이름 쓰기
	void addPokemon(Pokemon pokemon) { // 내가 포켓몬을 저장받아야하니까
		// 포켓몬을 input 받으면 플레이어의 data 배열에 저장한다 :내 한글코딩
		// 내 player 안에 data 배열에 담을거다
		// player의 내 this.data[담을수 있는 포켓몬 개수만큼] = 입력 pokemon
		// this.data[담을수 있는 포켓몬은 늘려나가야 하기 때문에]
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
		// 추상클래스라 객체를 생성할수 없다
		//		Pokemon pokemonB = new Pokemon("포켓몬",0); 

		Player player = new Player();


		player.play();

		//객체를 만들었고 그 안에 data 배열에 포켓몬을 저장한다 
		// : player 안에 메서드를 만들어서 포켓몬 저장 

		//data 포켓몬데려와서 play()
		//player.data[0].play();
		
		player.addPokemon();


	}

}

// 1. 자식의 생성자를 컨트롤(잘 만들어낼수 있는가)
// 2. 오버라이딩 (추상메서드 오버라이딩)
// 3. 인자를 대체 해당 객체를 사용할수 있는가
