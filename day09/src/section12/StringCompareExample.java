package section12;

import java.util.Scanner;

public class UpDownGame {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int count = 0;
		int matchValue = 0;
		int value = 0;

		matchValue = (int)(Math.random() * 30) + 1;
		while(count < 10) {
			System.out.println("���� ���� �Է� : ");
			value = scan.nextInt();

			// �ڵ带 �ۼ��غ����� 
			count++; // ī��Ʈ�� �÷��ִٰ� 
			if(value == matchValue) { // ���ڸ� ��������  while���� �ٷ� Ż�� !
				System.out.println(count + "�� ° ���� !");
				break; // ���ѷ��� �������� !
			}

		}

	}
}