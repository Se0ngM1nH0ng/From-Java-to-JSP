package class01;

public class Test01 {

	public static void main(String[] args) {
		
		// 별찍기 3번문제
		for (int a = 0; a < 3; a++) {

			for (int i = 0; i < 2 - a; i++) {
				System.out.print(" ");
			}

			for (int j = 0; j <= 2 * a; j++) {
				System.out.print("*");
			}
			System.out.println();

		}
	}

}
