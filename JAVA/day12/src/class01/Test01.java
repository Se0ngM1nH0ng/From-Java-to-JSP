package class01;

import java.util.ArrayList;

public class Test01 {

	public static void main(String[] args) {

//		int[] data = new int [3]; // data���� �ּҰ� �� �ְ� heap�޸𸮿� 3ĭ �迭�� �������
//		data[0]=10;
//		data[1]=20;
//		data[2]=30;
//		System.out.println(data);
//		
//		data[3]=40;  // 3ĭ���� �����س��⶧���� ������ ����
//		System.out.println(data[3]); 
		
		
		// ���� �迭 == �迭����Ʈ
		// ��ü ���� ���� ��ü�� ����ϴ� �� ���� ��
		// 1. �����͸� ������� ���尡�� 
		// 2. toString() �������̵� �Ǿ��ִ� //���ڰ� ��µȴ�.
		// 3.add(), remove(), clear(), size(), get()..�� ���� �پ��� ����� �޼��带 �⺻����
		// 4. ���� �ٸ� �ڷ���(Ÿ��)�鵵 ������ ����
		//   	=> �׷���, �ݵ��, ���� ���� �ڷ����� ��� �ؾ��Ѵ� �ǹ����� !!
		//     => ������ ���Ƴ����� .. �׷��� " ������" �� �ο��Ͽ� ����Ѵ�!!!
		// �� ���׸� <> : �Ϲ�ȭ ��� ������ �Ǵµ� ,,, �迭����Ʈ�� ����� Ÿ���� ���� 
		// ex) <String> , <Integer> ,,, ���
		// ���׸��� Ŭ������ ����ϱ� ������ wrapper Ŭ���� �� ����ؾ��Ѵ�.
		// ���� ���δ� Ŭ���� 
		ArrayList<Integer> data = new ArrayList<Integer>(); //C + S + O import
		data.add(10);
		data.add(0, 20); // �ε��� 0���� 20�ֱ� 
		data.add(0, 30); // �ε��� 0���� 30�ֱ� // ��ĭ�� �ڷ� �и�
		data.clear();
		data.add(10);
		System.out.println(data.isEmpty()); // �̰� ����ִ�? T/F
		System.out.println(data); // toString�� �������̵� �Ǿ� �ִ� 
		System.out.println(data.get(0));
		data.remove(0);
		System.out.println(data.size());
		
//		data.add("���");
		data.add(10);
//		data.add(3.14);
		System.out.println(data);
		
		
		
		
		
		
		
	}

}
