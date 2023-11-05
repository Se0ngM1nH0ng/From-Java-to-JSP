package class02;

import java.util.Random;
import java.util.Scanner;

class Poketmon {
	String name;// 포켓몬 이름
	int level; // 포켓몬마다 레벨이 다 다르다.

	static int exp;

	Poketmon(String name) {
		this.name = name;
//		this.level = level;
	}

	Poketmon(String name, int level) {
		this.name = name;
		this.level = level;
		System.out.println(this.name + " Lv" + this.level + " 포켓몬 생성완료!");

	}

	void printInfo() {
		System.out.println();
		System.out.print(this.name + " Lv" + this.level + ". ");
		System.out.println("[" + Poketmon.exp + "/100]");
	}

	void game() {
		Random rand = new Random();
		int randNum = rand.nextInt(2);// 랜덤을 0,1이 나오게 돌렸을때
		if (randNum == 1) {
			System.out.println("성공 !");
			Poketmon.exp += rand.nextInt(101) + 50; // 랜덤 50~150 경험치 증가
		} else {
			System.out.println("실패 !");
			Poketmon.exp += 10; // 경험치 10 증가
		}

		if (Poketmon.exp >= 100) { // 경험치가 100 넘어가면
			Poketmon.exp = 100;
			level++; // 레벨이 올라간다.
			System.out.print(this.name + " Lv" + this.level + "로 레벨업!");
			System.out.println();
		}

	}
}

public class Test04 {

	public static void main(String[] args) {

//		Poketmon po = new Poketmon("피카츄", 5);
//		Poketmon po2 = new Poketmon("파이리", 4);
//		Poketmon po3 = new Poketmon("꼬부기", 3);
		int N = 3;
		Poketmon[] datas = new Poketmon[N];

		String name = null; // 이름 초기값
		int num = 0; // 레벨 입력값

		int i = 0;
		while (i < 3) {
			Scanner sc = new Scanner(System.in);
			for (i = 0; i < datas.length; i++) { // 이름 입력받기
				System.out.println((i + 1) + "번째" + " 포켓몬 이름을 입력해주세요 !");
				name = sc.next();
				System.out.println("레벨도 입력해주세요 !");
				num = sc.nextInt();

				datas[i] = new Poketmon(name, num);// 이름과 레벨 받기
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
//			포켓몬의 이름과 레벨을 
//			세마리 각각 입력받아서
//			포켓몬 세마리를 만든다 
//			게임 진행 !
