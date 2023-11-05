package view;

import java.util.ArrayList;
import java.util.Scanner;

import model.MovieVO;

public class View {

	private static Scanner sc=new Scanner(System.in);
	
	public String getName() {
		System.out.println("��ȭ�� �̸��� �Է��ϼ���.");
		System.out.print("�Է�) ");
		String name=sc.nextLine();
		return name;
	}
	public int getNum() {
		System.out.println("��ȭ�� ��ȣ�� �Է��ϼ���.");
		System.out.print("�Է�) ");
		int num=sc.nextInt();
		sc.nextLine();
		return num;
	}
	public void printMovie(MovieVO mVO) {
		System.out.println("=== �� ȭ �� �� ===");
		if(mVO==null) {
			System.out.println("����!");
			return;
		}
		System.out.println(mVO);
	}
	
	public void printMenu() {
		System.out.println("��ȭ ���α׷��Դϴ�.");
		System.out.println("���� �����͸� ũ�Ѹ��մϴ�...");
	}
	
	public void printTrue() {
		System.out.println("�۾� ����!");
	}
	public void printFalse() {
		System.out.println("�۾� ����.....");
	}
	
	public void printMovieList(ArrayList<MovieVO> mdatas) {
		System.out.println("=== �� ȭ �� �� ===");
		if(mdatas.size()==0) {
			System.out.println("����!");
			return;
		}
		for(MovieVO mdata:mdatas) {
			System.out.println(mdata);
		}
	}
	
}
