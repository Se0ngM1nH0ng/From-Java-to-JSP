package class06;

import java.util.Scanner;

public class Test07 {
//	[1] �� ��� : ���� 90�ۼ�Ʈ 1�� ���
//	Q1) � ������ �ԷµǾ����� , ¦������ �ƴ��� �Ǻ��ϴ� �Լ�
//	input : int 1��
//	output : boolean ¦�� ���� �ƴ���
	
	public static boolean isEven(int num) {
		if(num % 2 == 0) {
			return true; // �Լ� ��� ���� �� true������ �ٷ� ��
		}
		return false;
	}
	
//	[2]�� ���
//	Q2) main�� �����Ǿ��ִ� ����� �� func()�� �켱 �ְ� ����!
	public static int checkMinus(int num, int b) {
		if(num < 0) {
			b++;
		}
		return b;
	}
	// �ϼ��� ��ɵ��� ������ �ϳ��ϳ� �и��س��� �۾�
	// == ���ȭ, ������Ʈȭ
	// : �ڵ� ���뼺�� ������ ---->> �������� ����(��������)
	
	public static int negativeNumber(int num) {
		int b = 0;
		if(num < 0) {
			b++;
		}
		return b;
	}
	
//	[1]
//	Q3) � ������ 0�̴�? �׷� ���α׷� ���� �����̾�..
//			���α׷� ���� �ȳ� ��Ʈ ������� !!
//	INPUT : int 1�� 
//	OUTPUT: boolean
	
	public static boolean check(int num) {
	
		if(num == 0) {
			System.out.println("0�� �ԷµǾ� ���� ");
			System.out.println();
		}
		
		return false; // ���� ������� 
	}

	public static void main(String[] args) {
		
//		[ ���� ]
//				1. main()���� ������ 10�� �Է��ҿ����Դϴ�.// ������� 0�� �Է����� �𸣹Ƿ� while��
//				2. if(¦����?) a++;
//				3. if(������?) b++;
//				4. 10�� �Է¿Ϸ��߽��ϴ�. a=��,b=���Դϴ�.
//				5. ����, �Էµ� ������ 0�̶�� ���α׷��� ����
//				   3�� �Է¿Ϸ��߽��ϴ�. a=2,b=1�Դϴ�.
//				+) �Լ��� Ȱ���ؼ� �ش� ������ �ذ����ּ���!~~
//				   �Լ��� �ִ� 3������ Ȱ���Ҽ��ֽ��ϴ�.
//		Scanner sc = new Scanner(System.in);
//
//		xxxxx int[] num = new int[10];// xxxxxx ����� �Էµɰ� ������ �ƿ� �𸣴ϱ� �迭 xxx ��������
		int a = 0; //�̵� a++ �Ұ� �ʱ�ȭ
		int b = 0; //�̵� b++ �Ұ� �ʱ�ȭ
		int count = 0; // ��� üũ
		while (count<10) {
			System.out.println((count+1) + "�� ������ �Է����ּ���");
			// ����� ���Ǽ��� ���
			// UI/UX
			int num = sc.nextInt();
				if (check(num)) {// num == 0
					break;
				}

			}
			count++;
			
			if(isEven(num)) { //num %2 == 0
				a++;
			}
			
			b = checkMinus(num,b); // �Լ� ������ ���� �޸� ������ ���� ���� �ʱ� ������ 
								// �ݵ�� ���ϰ��� b�� ���ش� 
								// ���￡ ��� b�� �λ꿡 ��� b�� ���� �ٸ��� .
//			if(num <0 ) {
//				b++;
//			}
		}

		
		System.out.println(count + "�� �Է¿Ϸ��߽��ϴ�.");
		System.out.println("¦�� : " + a );
		System.out.println("���� : " + b );
		
	
	
	}

}
