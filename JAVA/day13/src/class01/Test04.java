package class01;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {

		ArrayList<Integer> data = new ArrayList<Integer>();

		Scanner sc = new Scanner(System.in);
		//������ �Է� 10���� �ɶ� ���� ���
		
		int cnt = 0;
		while(cnt<10){
			// ����ڰ� �߸��� �Է��� ������	
			try {
				System.out.println("���� �Է�) ");
				int num = sc.nextInt();
				System.out.println("num= " + num);
				data.add(num);
				cnt++;
			}
			catch(InputMismatchException e){
				sc.nextLine(); // ���ۿ� �����ִ� �����Ⱚ�� �����ϴ� �ڵ� 
				System.out.println("�����θ� �Է����ּ���");
				
			}
		}

		// �Է��� �������� ��� ��� 
		System.out.println(" �Է��� ���� ");
		for(int i =0; i<data.size(); i++){
			data.get(i);
			// ���߿��� 0������ �������� ��� ���� 
			if(data.get(i) <=0) {
				data.remove(i);
			}
		}
		System.out.println();
		System.out.println("0 ������ �� ����");
		System.out.println(data);
		

		//���߿��� ���� ū ������ ����� �ε��� �ѹ� ��� 
		//data[0] ù��°�� ���� ū���̶�� ���� 
		// �ִ밪 �˰���
		int max = data.get(0);
		int maxIndex = 0;

		for(int i = 1 ; i<data.size(); i++){
			if(max<data.get(i)){
				max = data.get(i);
				maxIndex = i;
			}
		}

		//���� ū ������ �����ϰ� ���� �������� �հ� ��� ��� 
		//���� ū ������ ���� 
		for(int i =0; i<data.size(); i++){
			data.get(i);
		} 
		System.out.println("����ū�������ִ°��� "+ "[" + (maxIndex+1) + "] ��");
		data.remove(maxIndex);

		//���� �������� �� �� ��� ��� 
		int index = 0; // ���� �ε��� ����
		int sum = 0; // ����
		double avg = 0.0;
		for(int i =0; i<data.size(); i++){
			sum += data.get(i); // �������� �� ���ϱ�
			index ++; // ī��Ʈ ���ֱ� 
		} 
		avg = sum * 1.0 / index;
		System.out.println("���� �������� ���� " + sum + "�Դϴ�.");
		System.out.println("����� "+avg + " �Դϴ�");





	}

}

