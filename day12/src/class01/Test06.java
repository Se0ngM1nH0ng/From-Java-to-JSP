package class01;

import java.util.ArrayList;
import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> data=new ArrayList<Integer>();

		while(true) {
			System.out.print("�Է�) ");
			int num=sc.nextInt();
			if(num==0) {
				break;
			}
			data.add(num);
		}

		int sum=0;
		/*
      for(int i=0;i<data.size();i++) {
         sum+=data.get(i);
      }
		 */
		for(int v:data) {
			sum+=v;
		}
		double avg=sum*1.0/data.size(); //Array�迭�� ������,ũ��
		System.out.println("���: "+avg);

		// ó������ ������ ���鼭
		// data�� ��� ��Ҹ� Ȯ���Ұž�~ �迭ũ�Ⱑ �ڲ� ��ȭ�ϴϱ� ���� ���� ���� �𸥴�
		// [ a b c ] ��� b�� ����
		// [ a c ] ������ �ε������� ��Ȯ��!
//		for(int i=0;i<data.size();i++) {
//			if(data.get(i)%2==1) { // �迭����Ʈ�� �⺻�����Ǵ� �ε�����ȣ�� �ҷ����� 
//				data.remove(i);
//				i--;
//			}
//		}
		
		int index=0; // �ε��� ��ȣ
		while(index<data.size()) { // �ε�����ȣ�� data�� ������ ��ŭ ����
			if(data.get(index)%2 ==1) {//�����ؾ��ϴ����� �߻��ߴٸ� //Ȧ���϶�
				data.remove(index); // �����Ѵ�
				continue; // �Ʒ��� ���� �ȵȴ�.
			}
			index++;
		}
		System.out.println(data);

	
	}
}