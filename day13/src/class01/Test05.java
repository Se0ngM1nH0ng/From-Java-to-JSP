package class01;
// ����� Ǯ��

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		ArrayList<Integer> data=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);

		final int CNT=3;
		while(data.size()<CNT){
			int num; // �� SCOPE �̽�
			try {
				System.out.print("�����Է�) ");
				num=sc.nextInt();
			}
			catch(InputMismatchException e) {
				sc.nextLine();
				System.out.println("������ ����� �Է����ּ���!");
				continue;
			}
			data.add(num);
		}
		System.out.println(data);

		int i=0;
		while(i<data.size()) {
			if(data.get(i)<=0) {
				data.remove(i);
				continue;
			}
			i++;
		}
		System.out.println(data);

		int maxIndex=0;
		int max=data.get(0);
		for(i=1;i<data.size();i++) {
			if(data.get(i)>max) {
				max=data.get(i);
				maxIndex=i;
			}
		}
		System.out.println("�ִ밪= "+max);
		System.out.println("�ε���= "+maxIndex);
		data.remove(maxIndex);

		int sum=0;
		for(int v:data) {
			sum+=v;
		}
		double avg=sum*1.0/data.size();
		System.out.println("����= "+sum);
		System.out.println("���= "+avg);


	}

}
}

}
