package class01;

import java.util.HashSet;

public class Test02 {

	public static void main(String[] args) {
		// �߻�Ŭ���� Set
		// Set���� �θ�Ŭ����
		// Set �� �߻�Ŭ���� �̱� ������ new �� ������� ����.
		HashSet data = new HashSet(); // �ڽ��� ���� Ŭ������ �����ϸ� �ȴ�.
		
		// ���� (Set)
		// 1. ������ ����(index XXX)
		// 2. �ߺ� ������� �ʴ´� XX ex ) ��ī�� �ߺ� ���� �Ҷ� ����
		// 3. �پ��� �ڷ��� ���� ����
		// 			-> but, �̷��� �����������!!!
		//  		=> ���׸� <> �Բ� ���  
		data.add(10);
		data.add(10);
		data.add(10);
		data.add(1234);
		data.add(1);
		data.add(2);
		data.add(12);
		data.add(13);
		data.add(11));
		data.add("apple");
		
		System.out.println(data);
		System.out.println(data.size());
	}

}
