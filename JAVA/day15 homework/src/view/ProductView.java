package view;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import model.ProductVO;

public class ProductView {
	private static final int maxMenuNum = 5;
	private static Scanner sc=new Scanner(System.in);


	public void printProduct() { // ���� ���ǥ ���
		System.out.println("=== ��� ===");
		System.out.println("1. �����߰�");
		System.out.println("2. ���������");
		System.out.println("3. ����");
		System.out.println("4. ���� ����");
		System.out.println("5. ���α׷� ����");
	}

	// ������� �Է��� ����
	public int getMenuNum() {
		while(true) {
			System.out.print("�Է�) ");
			int menuNum=tryCatch();
			if(1<=menuNum && menuNum<=maxMenuNum) {
				return menuNum; // "��ȿ�� �˻�" == ������� �Է°� �˻�
								// ��� �־� ? ���� �̰Ŵ� ��ȿ�� �˻簡 ���� // ��� �˻�� DAO
								// ����ڰ� �Է��� ���� ���� �Ǵ��� �Ǵ��ϴ°� ��ȿ���˻�
								// Ÿ���� �ùٸ��� �̷��� �Ǵ��� ��ȿ�� �˻�
								// : ������� �Է°��� ���Ͽ� �ڷ���(Ÿ��), ���� ���� Ȯ���ϴ°� 
			}else {
				System.out.println("��ȿ���� ���� �����Դϴ�.");
				System.out.println("�ٽ� �Է����ּ���.");
			}
		}
	}

	// ����ڰ� �Է��� ���� �̸��� ����
	public String getMenuName() {
		System.out.println("���� �̸��� �Է����ּ���.");
		String name = sc.next();
		sc.nextLine();
		return name;
	}
	// ����ڰ� �Է��� ������ ����
	public int getMenuPrice() {
		System.out.println("���� ���� �Է� ) ");
		int price = tryCatch();
		return price;	
	}
		// ����ڰ� �Է��� ��� ����
		public int getMenuCnt() {
			System.out.println("���� ��� �Է� ) ");
			int cnt = tryCatch();
			return cnt;
		}



		// �߰��ϷḦ �ȳ����ִ� ���
		public void printInfo() {
			System.out.println("���� ���� ��ϿϷ�!");
		}
		// ���� �߰� �ȳ� ��Ʈ
		public void printInfo_C_Start() {
			System.out.println("���Ḧ �߰��մϴ�.");
		}


		// ���� �߰� ������Ʈ
		public void printInfo_C_End() {
			System.out.println("���� �߰��� �Ϸ��߽��ϴ�.");
		}

		// ��������� 
		public void printMenuList(ArrayList<ProductVO> datas) {
			if(datas.size() < 1) {
				System.out.println("����� �����ϴ� !");
				return;
			}
			System.out.println("=== ���� ������ ===");
			for(ProductVO v : datas) {
				System.out.println(v);
			}
		}


		// ���� �ȳ���Ʈ
		public void printInfo_U_Start() {
			System.out.println("���� �������� �̵��մϴ�.");
			return;

		}

		// ���� ��ȣ �Է�
		public int getProductNum () {
			System.out.println("���� ��ȣ�� �Է����ּ��� !");
			int num = tryCatch();
			return num;
		}
		// ���� ���� �Է� 
		public int sellCnt() {
			System.out.println("������ ������ �Է����ּ���.");
			int cnt = tryCatch();
			return cnt;

		}


		// ���� ���� ��Ʈ
		public void printInfo_U_End() {
			System.out.println("���� ���� !");
		}

		// ������� �ȳ� ��Ʈ
		public void printInfo_D_Start() {
			System.out.println("������� �������� �̵��մϴ�.");
			return;

		}

		// ���� ��ȣ �Է�

		// ���� ���� �Ϸ� ��Ʈ
		public void printInfo_D_End() {
			System.out.println("������� ���� !");
		}

		// ���α׷� ���� ��Ʈ
		public void printInfo_Program_End() {
			System.out.println("���α׷��� ���� �մϴ�...");
		}

		public void printFalse() {
			System.out.println("���� ���� !");
		}

		public void printReturn() {
			System.out.println("�ٽ� �޴��� ���ư��ϴ�.");
		}

		public static int tryCatch() { // ��ȣ ���� trycatch �޼���
			while (true) {
				try {
					int action = sc.nextInt();
					sc.nextLine();
					return action;
				} catch (InputMismatchException e) {
					System.out.println("���ڸ� �Է����ּ��� !");
					sc.nextLine();
				}
			}
		}








	}
