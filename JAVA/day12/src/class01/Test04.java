package class01;

import java.util.ArrayList;
import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {

		//�ߺ� ��� 
		ArrayList<Integer> datas = new ArrayList<Integer>();
		// �迭�� ������ ������ �־�� �ϴµ� �װ� �ȵǾ� �־ �Ϲ� �迭�� ������.
		// �÷����� ��� �ڳ�? �ٵ� �ߺ��� ��� �ؾ��ϴϱ� ? Array
		//������ �Է� (������ ���� �Ѵ� while)
		//0�� �Է��ϸ� ����  //�������� break;

		Scanner sc = new Scanner(System.in);
		int cnt = 0; // �Է� ���� 
		int sum = 0; // ���� �ʱ�ȭ
		double avg = 0.0; // ��� �ʱ�ȭ
		int num = 0;
		while(true){
			System.out.println("�����Է�) ");
			System.out.println("0�� �Է��ϸ� ���� �˴ϴ�.");
			num = sc.nextInt();

			if( num == 0) { // ���α׷� ���� 
				break;
			}
			sum += num;
			cnt ++;
		}

		// ���α׷� ���� �� ������� �Է��� �������� ��� ���
		avg = sum * 1.0 / cnt;
		
		System.out.println("����� " + avg + "�Դϴ�.");
		for (int i = 0; i < cnt; i++) { // ¦���� �������� ��ü�� �ѹ� ���ߵȴ�.
			datas.add(num); // ���� ������ �� ���� ������ !
		}
		if(  % 2 == 0 ) {
			System.out.println("¦���� " + cnt + "�� �Դϴ�");
			System.out.println(datas);
		} 



	}

}
