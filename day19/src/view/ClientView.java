package view;

import java.util.ArrayList;
import java.util.Scanner;

import model.MemberVO;
import model.ProductVO;

// ȸ������C,�α���R,�α׾ƿ�R,����������U,ȸ��Ż��D
// ������,��ϰ˻�_�̸�,��ϰ˻�_����
public class ClientView {
	private static Scanner sc=new Scanner(System.in);

	public int printClientMenu01() { // �α��� ��� 
		// �α��� ���� ���� ����ڴ� ��ǰ�� ������ �� ����.
		System.out.println();
		System.out.println("=== �� �� �� �� �� �� ===");
		System.out.println("1. ȸ������");
		System.out.println("2. �α���");
		System.out.println("3. ���α׷� ����");
		System.out.print("�Է�) ");
		return sc.nextInt(); 
	}
	public MemberVO signUp() { // ȸ�������� �ÿ� �ȳ� ����� �ϴ°� 
		System.out.println();
		System.out.println("=== ȸ �� �� �� ===");
		System.out.print("���̵��Է�) ");
		String mid=sc.next();
		System.out.print("��й�ȣ�Է�) ");
		String mpw=sc.next();
		System.out.print("�̸��Է�) ");
		String name=sc.next(); // ���̵� ��й�ȣ �̸� ���� �Է��ؼ� 
		return new MemberVO(mid,mpw,name); // �װ��� ���� �ϴ°� ���� 
		// vo�� �ܼ� �ڷ����̴� ~ view���� Ȱ�밡��, DAO�� view���� ȣ�� �ȵ� 
	}
	public void signUpTrue() {
		System.out.println();
		System.out.println("ȸ������ ����!");
	}
	public void signUpFalse() {
		System.out.println();
		System.out.println("ȸ������ ����...");
	}
	public String getMpw() { // ��й�ȣ�� �Է� �޴´� // ȸ��Ż��� �ѹ��� ��й�ȣ Ȯ���� ���ؼ�
		System.out.println();
		System.out.println("=== �� �� �� ȣ Ȯ �� ===");
		System.out.print("��й�ȣ�Է�) ");
		String mpw=sc.next();
		return mpw;
	}
	public String printMpw(MemberVO mVO) { // �Է°��� mVO�� ������ �ؿ��� mVO�� ����� �� �ִ�!
		System.out.println();
		System.out.println("=== �� �� �� �� �� ===");
		System.out.println(mVO.getName()+"���� ���� ��й�ȣ�� ["+mVO.getMpw()+"]�Դϴ�.");

		while(true) { // �ùٸ� ��й�ȣ�� �Է� �Ҷ� ���� 
			System.out.print("�� ��й�ȣ�Է�) ");
			String mpw=sc.next();
			if(!mpw.equals(mVO.getMpw())) { // �� ��й�ȣ�� ��ġ���� ������ !
				return mpw;
			}
		}		
	}
	public void printFalse() {
		System.out.println();
		System.out.println("��й�ȣ ����ġ...");
	}
	public void printMemberDeleteTrue() {
		System.out.println();
		System.out.println("ȸ��Ż�� ����!");
	}
	public void printMemberDeleteFalse() {
		System.out.println();
		System.out.println("ȸ��Ż�� ����...");
	}
	public void printMemberUpdateTrue() {
		System.out.println();
		System.out.println("��й�ȣ ���� ����!");
	}
	public void printMemberUpdateFalse() {
		System.out.println();
		System.out.println("��й�ȣ ���� ����!");
	}

	public MemberVO signIn() {
		System.out.println();
		System.out.println("=== �� �� �� ===");
		System.out.print("���̵��Է�) ");
		String mid=sc.next();
		System.out.print("��й�ȣ�Է�) ");
		String mpw=sc.next();
		return new MemberVO(mid,mpw,null); // �̸��� ���� �ʿ�� ���� .
	}

	public void signInTrue() {
		System.out.println();
		System.out.println("�α��� ����!");
	}
	
	public void signInFalse() {
		System.out.println();
		System.out.println("�α��� ����...");
	}
	
	public void printClientEnd01() {
		System.out.println();
		System.out.println("=== �� �� �� �� �� �� ===");
	}
							//vo Ÿ�Կ� �Ұ��ϱ� ������ model�� ����� ���� �ƴϴ�. DAO�� ��� ���� ���°�
	public int printClientMenu02(MemberVO mVO) { // �α��� �ϸ� ������ ���� 
		System.out.println();
		System.out.println("=== �� �� �� �� �� ===");
		System.out.println(" ���� �α����� ������̸� ["+mVO.getName()+"]"); 
		System.out.println("1. �α׾ƿ�(����ڸ�� ����)");
		System.out.println("2. ����������");
		System.out.println("3. ȸ��Ż��(����ڸ�� ����)");
		System.out.println("4. ��ǰ������");
		System.out.println("5. ��ǰ��ϰ˻�_�̸����� �˻�");
		System.out.println("6. ��ǰ��ϰ˻�_�������� �˻�");
		System.out.println("7. ��ǰ�˻�_�ְ� �˻�"); // �ϳ��� �˻�
		System.out.println("8. ��ǰ�˻�_������ �˻�");
		System.out.print("�Է�) ");
		return sc.nextInt();
	}

	public ProductVO getSearchFilter() { // �������� �ְ� ���� �ΰ��� �Է¹��� 
		System.out.println();
		System.out.println("=== �� �� �� �� �� �� ===");
		System.out.print("���������Է�) ");
		int minPrice = sc.nextInt();
		System.out.print("�ְ����Է�) ");
		int maxPrice = sc.nextInt();
		// ���ڰ� �ΰ��� ��ȯ�ϴ� ������ ���ϱ� ������
		//pVO�� ��Ƽ� �Ѱ��ش�.
		// �Ⱦ��� ������ Ȱ���Ͽ� minPrice�� maxPrice �� �ΰ� �ѹ��� �Ѱ��ش�.		
		ProductVO pVO=new ProductVO(0,"���Ͱ˻�",minPrice,maxPrice);
		// searchCondition
		return pVO;
	}

	public String getSearchContent() {// �׷��ٸ� �˻��� ������ 
		System.out.println();
		System.out.println("=== �� �� �� �� �� �� ===");
		System.out.print("�˻����Է�) ");
		String name=sc.next();
		return name;

	}

	public void printProduct(ProductVO pVO) {
		System.out.println();
		if(pVO==null) {
			System.out.println("=== �� �� �� �� ǰ �� �� ===");
			return;
		}
		System.out.println("=== �� ǰ �� �� ===");
		System.out.println(pVO);
	}

	public void printProductList(ArrayList<ProductVO> pdatas) {//���� ����� ����ϰ� ���� ����̾�  //����� �־�� �����ٰ� �ƴϳ�  ����� �޾ƾ� �����ش�.
		System.out.println();
		if(pdatas.isEmpty()) { // Ȥ�� ����ִ� ? // ��������Ǽ����(UI/UX)
			System.out.println("=== �� �� �� �� ǰ �� �� ===");
			return;
		}
		System.out.println("=== �� ǰ �� �� �� �� ===");
		for(ProductVO data:pdatas) {
			System.out.println(data); // .toString()�� �ڵ�ȣ��˴ϴ�!
		}
	}
	public void logout() {
		System.out.println();
		System.out.println("=== �� �� �� �� ===");
	}
	public void printClientEnd02() {
		System.out.println();
		System.out.println("=== �� �� �� �� �� �� �� ===");
	}
}
