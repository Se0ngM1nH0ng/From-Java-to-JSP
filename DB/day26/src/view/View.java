package view;

import java.util.ArrayList;
import java.util.Scanner;

import model.MemberVO;
import model.ProductVO;

public class View {
	private static Scanner sc=new Scanner(System.in);

	// ������ �������� �����ֱ�
	public int printMenu() {
		System.out.println("=== �޴� ===");
		System.out.println("1. ��ǰ������");
		System.out.println("2. ��ǰ�˻�"); // �ǽ�(�̸�,�������� �˻��ϱ�)
		System.out.println("3. ��ǰ����");
		System.out.println("4. ȸ������");
		System.out.println("5. �α���");
		System.out.println("6. �α׾ƿ�");
		System.out.println("7. ȸ���������"); // �ǽ�
		System.out.println("8. ȸ��Ż��");
		System.out.println("9. ���α׷� ����");
		System.out.print("�Է�) ");
		int action=sc.nextInt();
		return action;
	}

	// ��ǰ������
	public void printList(ArrayList<ProductVO> pdatas) {
		System.out.println("=== ������ ===");
		if(pdatas.isEmpty()) {
			System.out.println("����� ����Ʈ ����!");
			return;
		}
		for(ProductVO pdata:pdatas) {
			System.out.println(pdata);
		}
	}

	// ��ǰ����
	public int getNum() {
		System.out.print("��ǰ��ȣ�Է�) ");
		int num=sc.nextInt();
		return num;
	}
	public void printData(ProductVO pdata) {
		if(pdata==null) {
			System.out.println("����� ������ ����!");
			return;
		}
		System.out.println(pdata);
	}

	public void printTrue() {
		System.out.println("����!");
	}
	public void printFalse() {
		System.out.println("����.....");
	}

	// ȸ������
	// �α���
	public MemberVO signin() {
		System.out.print("���̵��Է�) ");
		String mid=sc.next();
		System.out.print("��й�ȣ�Է�) ");
		String mpw=sc.next();
		MemberVO mVO=new MemberVO(mid,mpw);
		return mVO;
	}

//============================================================
	
	// ����������

	// B. �������ġ�� , ����
	// ��� ��ġ��, ��� ���氡�� ! ----> �̰� ������ 
	//		��ư�� �������ϱ� ��? �ƴϳ� ? �̰� �ƴ϶�
	//				>> ��ư���Ŀ� Ȯ�ΰ���
	//				>> DB�� �ʿ�
	//				>> �鿣��
	//		��ư�� ������ ���� ������ ���ٸ� ��ư ��ü�� ��Ȱ��ȭ �ȴ� .
	//				>> ����Ʈ 

	//		���� ����� �ٸ� ���ο� ����� ���;� ������ �ִ� 
	//		��Ʈ�ѷ��� DB���� ���� ���� 


	// if(���� �Է��� ����� ��������� �ٸ���)

	// ȸ���������
	public String funcA(MemberVO mVO) { //input���� ����� ������ ����
		// A. ���� �α����� ____��,
		//    ����Է��غ�����!~~ (Ȯ������)
		System.out.println(mVO.getMid()+"�� ����Է�) "); // ___�� ����� ���� �������� 
		String mpw=sc.next();
		return mpw; // ��й�ȣ ��ȯ���ֱ�
	}
	
	public String funcB(String mpw) { // input���� ������� ����� ���� 
		// B. �������ġ��, ����
		//    �����ġ��, ������氡��! << funcB() ----> �̰� �ϴ��� 
		
		while(true) { // ������� �������� �𸣹Ƿ�
			System.out.print("������ ����Է�) ");
			String newMpw=sc.next();
			if(!newMpw.equals(mpw)) { // �� ��й�ȣ�� �ߺ��� ���� �ƴҽ� 
				return newMpw; // ���ο� ��й�ȣ ��ȯ���� 
			}
		}
	}
	
//============================================================

	// �̸�,�������� �˻��ϱ�
	
	
	// �̸�, ������ �信�� �� ���� �ϰ� �Ѿ�� �Ѵ�. 
	// �� ȭ�鿡�� �ٰ��� ó�� 
	// ����ڰ� � ������ ������ �信�� ��~~~ ������ �ѹ��� ������

	//			���� �Ѱ��ϼ��� �ְ� ��ϼ��� �ְ� �𸣱� ������ 
	//			pVO�� ��ȯ�� ����� �Ѵ�. 

	public ProductVO funcC() {
		ProductVO pVO=new ProductVO();
		String searchCondition="";

		System.out.println("Q. �̸����� �˻��ҷ���?");
		System.out.print("1.YES  2.NO ) ");
		int num=sc.nextInt();
		if(num==1) { 
			searchCondition+="�̸�";
			System.out.print("�˻��� �̸��Է�) ");
			String name=sc.next();
			pVO.setName(name);
		}

		System.out.println("Q. �������� �˻��ҷ���?");
		System.out.print("1.YES  2.NO ) ");
		num=sc.nextInt();
		if(num==1) { 
			searchCondition+="����";
			System.out.print("�˻��� ���������Է�) ");
			int min=sc.nextInt();
			System.out.print("�˻��� �ְ����Է�) ");
			int max=sc.nextInt();
			pVO.setPrice(min);
			pVO.setTmpNum(max);
		}

		if(searchCondition.equals("")) {
			searchCondition+="�̸�"; // �� ������ ������ ����Ʈ�� �̸��̴�.
		}
		pVO.setSearchCondition(searchCondition);
		return pVO;
	}





























	// ====================================================








}
