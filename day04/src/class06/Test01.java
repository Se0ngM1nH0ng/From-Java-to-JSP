package class06;

import java.util.Scanner;

public class Test01 {
	// �Լ��� �⺻ ����
	// public : �������� <-> private
	// static : "��ü�� �����ϰ�"
	// void : "�ƹ��͵� ����" 0�̳� ������ �ƴ� 
//	public static OUTPUT �Լ��� (INPUT) {// �Լ����� "���"�� �����Ҽ� �ְ� ������ �Ѵ�!
//		
//	}
	
	
//	�Լ� A����(input  x , output o)
	public static void hello() {// �Լ����� "���"�� �����Ҽ� �ְ� ������ �Ѵ�!
		System.out.println("�ȳ��ϼ��� ! ");
	}
	// "�Լ��� ����(����) �ߴ�."
	
	
// �Լ� B����(input o , output x)
	public static void printStar(int num) {// ���� �ѹ��� ������ ���� ����ش�.
		for (int i = 0; i < num; i++) {
			System.out.println("��");
		}
	}
	
 public static void main(String[] args) {
	
	 
	 System.out.println("�ȳ��ϼ��� !");
	 hello(); // �� �Լ������ �ٽ� �� "�Լ��� ȣ��(���) �ߴ�."
	
//	 printStar(); // �Լ��� ȣ���Ҷ����� input, output �� ��Ȯ�� ���缭 ����ؾ��Ѵ�!
	 printStar(5);
	 printStar(3);
	
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
}
