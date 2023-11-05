package class01;

//포켓몬

// - 이름 String name
// - 이긴횟수 int win
// - 울음소리() hello() : 각각의 포켓몬 마다 고유한 소리를 출력 
// - 게임() game() :상대 포켓몬과 대결을 해서 내가 이겼는지 졌는지 boolean game(Pokemon pokemon)
// -> pokemonA.game(pokemonB)
// 			-> pokemonA.game(pokemonB) // 나를 기준으로 내가 이기면 true, 내가 지면 false.
// 				이긴횟수가 홀홀 작은값이 이김
//				이긴횟수가 짝짝 큰값이 이김
//				이긴횟수가 홀짝,짝홀 홀수가 이김
//				이긴횟수가 동일하다면 A가 이김(A > B)
// class 생성시 고려사항
// 1. abstract 일까?
// -> 판단 방법 
//  1) 이 클래스의 객체가 필요한가?
//  2) 추상메서드가 있나? ==> 오버라이딩을 강제해야 하는 메서드가 있나?
//							== 재정의 해야하는 메서드가 있나 ? 울음소리 ()

//2. 멤버변수 생성
//	1) private 일단 달아
//	2) getter, setter  일단 달아
//3. 생성자  - new를 통해 못만들 뿐이지 가질순 있다 .
//4. 메서드 
// 1)오버라이딩을 강제해야되나? => 추상메서드로 만들어야하나 ?
// 2) '기능'을 보고 , "INPUT,OUTPUT"을 생각하여 '메서드 시그니처' 작성
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
	// 1. 메서드 안만든거 있어~~ => 오버라이딩 강제되고있는 메서드(추상메서드)
	// => 1. 나도 추상클래스 하던지
	// => 2. 추상메서드 오버라이딩 해주던지 ◀
	// 2. super()를 호출하는 중이야~~ => 부모클래스에게는 기본생성자가 현재 없음
	// => 1. 부모클래스에 기본생성자 만들던지
	// => 2. 부모클래스의 다른생성자를 사용하던지 ◀

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

public class Test03 {

	public static void main(String[] args) {
		// 추상클래스라 객체를 생성할수 없다
		//		Pokemon pokemonB = new Pokemon("포켓몬",0); 
		Pika pika = new Pika("피카츄");
		Pika pika2 = new Pika("피카츄");
		Charmander cm = new Charmander("파이리");

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


// 1. 자식의 생성자를 컨트롤(잘 만들어낼수 있는가)
// 2. 오버라이딩 (추상메서드 오버라이딩)
// 3. 인자를 대체 해당 객체를 사용할수 있는가 

