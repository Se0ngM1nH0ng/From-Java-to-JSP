package class01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		// �������� �Է��� 3�� �Ҷ� ���� ��� 

		Scanner sc = new Scanner(System.in);

		int i =0; // ���� ����
		while(true) {
			try {
				System.out.println("���� �Է�) ");
				int num = sc.nextInt();
				System.out.println("num= " + num);
			}
			catch(InputMismatchException e){
				sc.nextLine(); // ���ۿ� �����ִ� �����Ⱚ�� �����ϴ� �ڵ� 
				System.out.println("�����θ� �Է��ϼž� �մϴ� �̤�...");
				continue; // �ٽ� ó������ 
			}
			i++; // Ƚ��ī��Ʈ
			if(i == 3) { // 3 �̻� ä�������� Ż��
				break;
			}
		}
		
		
		
		int i =0; // ���� ����
		while(i<3) {
			try {
				System.out.println("���� �Է�) ");
				int num = sc.nextInt();
				System.out.println("num= " + num);
				
				i++;
			}
			catch(InputMismatchException e){
				sc.nextLine(); // ���ۿ� �����ִ� �����Ⱚ�� �����ϴ� �ڵ� 
				System.out.println("�����θ� �Է��ϼž� �մϴ� �̤�...");
				
			}
		}
		
	}
}
