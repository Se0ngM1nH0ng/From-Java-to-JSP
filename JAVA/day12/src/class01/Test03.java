package class01;

import java.util.HashSet;
import java.util.Random;

public class Test03 {

	public static void main(String[] args) {

		//������ ���� 
		Random rand = new Random();

		//�ߺ��� �����ϰ� //HashSet
		HashSet<Integer> data = new HashSet<Integer>();
		 
		 
		int num =0; //������
		int cnt = 0; //�������� ����

		//10�� ���� (��, 1~15 ����)
		for (int i = 0; i < 10; i++) {
			num = rand.nextInt(15)+1;
			data.add(num); // �÷����� ��ü�� �޼��� Ȱ��
			cnt ++;	
		}

		System.out.println("�������� " + cnt + "�� �����Ǿ���,");
		System.out.println(data);
		System.out.println("�Դϴ�.");
		
		
	}

}
