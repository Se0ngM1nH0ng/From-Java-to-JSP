package class04;

import java.util.Random;
import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();

		int N = 4;
		String[] mName = new String[N];
		mName[0] = "����";
		mName[1] = "����";
		mName[2] = "����";
		mName[3] = "����";

		int[] mPrice = new int[N];
		for (int i = 0; i < mPrice.length; i++) {
			mPrice[i] = (rand.nextInt(6)+10)*100; //1000~1500
		}

		int[] mCnt = new int[N];
		for (int i = 0; i < mCnt.length; i++) {
			mCnt[i] = rand.nextInt(4); // 0~3
		}
		
		while (true) {
			System.out.println("1.���� 2. ���� ");
			System.out.println("�Է�) ");
			int action = sc.nextInt();
			
			
			if (action == 2) {
				System.out.println("�̿����ּż� �����մϴ� !");
				System.out.println();
				break;
			} else if (action < 1 || action > 2) {
				System.out.println("�߸��� �Է°��Դϴ� .");
				System.out.println("�ٽ� Ȯ�����ּ��� !");
				System.out.println();
				continue;
			}
			int num;
			while (true) {
				System.out.println("===�޴���====");
				System.out.println("� ������ ���ðڽ��ϱ� ?");
				System.out.println("[]��ȣ ���� ���� �����ִ� ����Դϴ�.");
				for (int i = 0; i < mName.length; i++) {
					System.out.print((i + 1) + "-" + mName[i] + "[");
					if (mCnt[i] == 0) {
						System.out.print("������");
					} else {
						System.out.print(mCnt[i]);
					}
					System.out.print("]" + " " );
				}
				System.out.println();
				System.out.println("===========");
				System.out.println("�����Ͻ� ��ǰ�� ��ȣ�� �Է��ϼ��� !");
				num = sc.nextInt();
				
			
//				1~4���� �̰� ��� �־����!
//				(1<=num && num <= N) && (mCnt[num - 1]>0)
				if((1<=num && num <= N) && (mCnt[num - 1]>0) ) {// �����Է��̶��
					break;
				}
				
				if(num <1 || N < num) {
					System.out.println("���� ��ǰ");
				}else if(mCnt[num - 1] == 0) {
					System.out.println("��� ��� ���� �Ұ�");
				}
				
				
			}
			int cnt; // ���������� Ư��
			while (true) { // ��ȿ�� �˻� : ������ ������ �����̰ų�, ����� ������ �ȵ�!
				System.out.println("������ ��ǰ�� " + mName[num - 1] + "�Դϴ�.");
				System.out.println("����: " + mPrice[num - 1] + "��  ���: " + mCnt[num - 1] + "��");
				System.out.print("������ ������ �Է�) ");
				cnt = sc.nextInt();

				if (0 <= cnt && cnt <= mCnt[num - 1]) {
					break;
				}

				System.out.println("�߸��� �Է��Դϴ�!");
				System.out.println("�ٽ� �Է����ּ���!~~");
				System.out.println();
			}
			 int res = mPrice[num-1]*cnt;
	         int money;
	         System.out.println("�ݾ�: "+res+"��");
	         
	         
	         while(true) {
	            System.out.print("�� �Է�) ");
	            money=sc.nextInt();
	            if(res<=money) {
	               break;
	            }
	            System.out.println("�߸��� �Է��Դϴ�!");
	            System.out.println("���� �Է����ּ���!");
	            System.out.println();
	         }

	         res=money-res;
	         if(res!=0) {
	            System.out.println("�Ž����� "+res+"�� ��ȯ �Ϸ�!");
	         }
	         System.out.println("���� ����!");
	         System.out.println();

		
		
		
	}
}
}
