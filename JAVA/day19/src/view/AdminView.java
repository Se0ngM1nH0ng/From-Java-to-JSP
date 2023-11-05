package view;

import java.util.ArrayList;
import java.util.Scanner;

import model.MemberVO;

// ȸ��������
public class AdminView {
	private static Scanner sc=new Scanner(System.in);

	public int printAdminMenu() {
		System.out.println();
		System.out.println("=== �� �� �� �� �� ===");
		System.out.println("1. ȸ��������");
		System.out.println("2. �����ڸ�� ����");
		System.out.print("�Է�) ");
		return sc.nextInt();
	}
	public void printMemberList(ArrayList<MemberVO> mdatas) { // mdatas������ �����´�
		System.out.println();
		if(mdatas.isEmpty()) { // Ȥ�� ������ ����ִ� ? 
			System.out.println("=== ������ ȸ���� �����ϴ� ===");
			return;
		}
		System.out.println("=== ȸ �� �� �� ===");
		for(MemberVO mdata:mdatas) {
			System.out.println(mdata);
		}
	}
	public void printAdminEnd() {
		System.out.println();
		System.out.println("=== �� �� �� �� �� �� �� ===");
	}
}
