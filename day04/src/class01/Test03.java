package class01;

import java.util.Random;
import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {

//			[���Ǳ� ���α׷� �ۼ��ϱ�]
//			1. ��ǰ�� 4��
//			2. �̸��� ���ϵ�
//			3. ����, ���� �������� ����
//			4. 1.����, 2. ����
//			5. ��ǰ ����� ���� �Բ� ���
//			��, '��� ���� ��ǰ�� ������� �ʽ��ϴ�'
//			
//			1 �Է½� -> �����?
//			2 �Է½� -> ��� ��� ���Ű� �Ұ����մϴ�
//			4 �Է½� -> ���� ��ǰ�Դϴ�!
//			
//			6. �׿ܿ��� ��� ���������� �����ϰ� �������ּ��� ~

//			��ǰ 4�� ���� ���� ���ϱ�
//			�޴� ���� ���� ����
//			����, ���� ���� ���� ����
//			���� , ���� ��ư �����
//		
//			��ǰ��� �����
//			��� �����
//			�ѱݾ� �ȳ�
//			����� �� �Է� �ޱ�
//			�Ž����� �����
//			���� �Բ� ���
//			

		Scanner sc = new Scanner(System.in);
		Random rand = new Random();

		int N = 4; // ��ǰ����
		String[] mName = new String[N]; // ��ǰ ��� ����� [N]�ε��� �� ��ŭ
		mName[0] = "����";
		mName[1] = "����";
		mName[2] = "����";
		mName[3] = "����";

		int[] mPrice = new int[N]; // ������ �������� 
		for (int i = 0; i < mPrice.length; i++) {
			mPrice[i] = (rand.nextInt(5)+1) * 100;
		}

		int[] mCnt = new int[N]; // ��� ��������
		for (int i = 0; i < mCnt.length; i++) {
			mCnt[i] = rand.nextInt(5) + 1;
		}

		// ���� ,���� �Ұ��� �� �����
		while (true) {
			System.out.println("1.���� 2. ���� ");
			System.out.println("�Է�) ");
			int action = sc.nextInt(); // ���� ���� ���� ���ڸ� �Է� �޴´�.
			
			if (action == 2) {
				System.out.println("�̿����ּż� �����մϴ� !");
				System.out.println();
				break; // ��� Ż��
			} else if (action < 1 || action > 2) { // ��ȿ�� �˻�
				System.out.println("�߸��� �Է°��Դϴ� .");
				System.out.println("�ٽ� Ȯ�����ּ��� !");
				System.out.println();
				continue;
			}
			
		
		
//		�޴��� ��� �����
//		�޴��ǰ�, ��� ���� ����ֱ�
//		��� ==0 �϶� ������ ������ֱ�
		int num;
		while (true) {
			System.out.println("===�޴���====");
			System.out.println("� ������ ���ðڽ��ϱ� ?");
			System.out.println("[]��ȣ ���� ���� �����ִ� ����Դϴ�.");
			for (int i = 0; i < mName.length; i++) {
				System.out.print((i + 1) + "-" + mName[i] +"[" +mCnt[i]);
				if (mCnt[i] == 0) {
					System.out.println("������");
				}// else {
				//	System.out.print(mCnt[i]);
				//}
				System.out.println("]" + " ");
			}
			System.out.println();
			System.out.println("===========");
			System.out.println("�����Ͻ� ��ǰ�� ��ȣ�� �Է��ϼ��� !");
			num = sc.nextInt(); // ������ ��ǰ ��ȣ �Է³ֱ�

			if (1 <= num && num <= N) {// ����ȿ� ���� ��� 
				break;
			}

			// �Էµ� ���� 1���� N���̰� �ƴϸ� ���
			System.out.println("���� ��ǰ��ȣ�Դϴ� !");
			System.out.println("�ٽ� �Է����ּ��� !");
			System.out.println();
		}

		// ��ǰ
		int cnt;
		int product;
		while (true) { //��ǰ ��ȣ���� �ε��� ��ȣ�� 0���� �����ϱ� ������ -1 ���ش�.
			System.out.println("������ ��ǰ��" + mName[num - 1] + "�Դϴ�."); //��ǰ�̸�
			System.out.println("����: " + mPrice[num - 1] + "��");
			System.out.println("���: " + mCnt[num - 1] + "��");
			System.out.println("������ ������ �Է����ּ���");
			cnt = sc.nextInt(); // ��ǰ�� ���� ���� ��� �ȳ��Ͽ��� ������ ���� �Է¹ޱ�
			// ������ ����
			product = mCnt[num - 1] - cnt;
			
			if(product > 0) {
				System.out.println("���� ���� !");
				break;
			}else if(product == 0) {
				System.out.println("��� �����ϴ�.");
				System.out.println("�ٽ� �Է����ּ��� !");
				
			}
			
			System.out.println("�߸��� �Է��Դϴ�");
			System.out.println("�ٽ� �Է����ּ��� !");

		}
			System.out.println("���ż���");
			System.out.println("���� ���� : " + product + "�Դϴ�.");
			// �� �ݾ�
			int result = (mPrice[num - 1]) * cnt;
			int money;
			System.out.println("�ݾ��� :" + result + "�� �Դϴ�.");
		
			// ���� �ݾ�
			while(true) {
				System.out.println("�ݾ��� �Է��ϼ���.");
				money = sc.nextInt();
				if(result <= money) {
					break;
				}
				System.out.println("�ݾ��� �����մϴ� !");
				System.out.println("���� �ٽ� �������ּ��� !");
			}
		
			// �Ž�����
			result = money - result;
			System.out.println("�Ž������� " + result + "�Դϴ�.");
			
			// ��� ����
			product -= cnt;
			
		}
		
	}

}
