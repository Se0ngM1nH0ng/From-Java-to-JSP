package class01;

import java.util.Random;
import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
//		1. 369 ����
//		9 ¦ 33 ¦¦ 939 ¦¦¦
//		1~1000 �߿��� �������� ���� 1�� ����
//		[19] : ¦
//		�����Դϴ�!
//		[19] : 19
//		�����Դϴ�.....
//		[22] : 22
//		�����Դϴ�!

//		int num = 1~1000 �߿��� �������� ���� 1�� ����
//		[num] = ��������� �Է� �ޱ� .���ڿ��� ������Ѵ�. (¦�� ������ �ְ� ������ ������ �ִ�.)
//		String answer = " ";
		
		String str = "8888999";
		
		
		

//		int NUM = 1~1000�߿��� �������� ���� 1�� ����
//		[NUM] : INPUT�� �޾ƾ���! : ���ڿ��� �Է�
//
//		String ANS="";
//
//		if(NUM�� ���� �ڸ��� 3,6,9��?)
//			 ANS+="¦";
//		if(10 ?)
//			ANS+="¦";
//
//		if(ANS==INPUT)
//			�����Դϴ�!
//			else
//			�����Դϴ�.....
		
//		int num = 1~1000 �߿��� �������� ���� 1�� ����
		Random rand = new Random();
		int num = rand.nextInt(1000)+1;
		String answer = " ";
		int num2 = num % 10; // ���� �ڸ�
		int num3 = (num / 10) % 10; // ���� �ڸ�
		int num4 = num / 100; // ���� �ڸ�
		
		
		if(num2 == 3 || num2 == 6 || num2 == 9) {
			answer += "¦";
		}
		if(num3 == 3 || num3 == 6 || num3 == 9) {
			answer += "¦";
		}
		if(num4 == 3 || num4 == 6 || num4 == 9) {
			answer += "¦";
		}
		
		String result = answer;
		System.out.print(num);
		if(answer == result) {
			System.out.println(answer); 
			System.out.println("�����Դϴ�");
		} else {
			System.out.println("�����Դϴ�");
		}
		
//		2. 1�� ������ 3���Ұǵ�,
//		3�� �� �����̸� �̸��� �Է¹޾Ƽ�
//		�������� �����մϴ�!~~ ��ǰ�帮�ڽ��ϴ�!~~~
//		�̸��Է�) ��ȿ��
//		��ȿ��� �����մϴ�!~~ ��ǰ�帮�ڽ��ϴ�!~~~
		
//		������3�� �Ѵ� -> ���ڿ��� 3�� �Է¹ޱ�
		Scanner sc = new Scanner(System.in);
//		
//		1���ڵ带 �����Է¹޴´�.
//		
//		�Է��� �������� �����̸� �н� �����̸� -��- ó������ 
		String ans = sc.next();
		
		if(ans.equals(����)) {
			�н�
		}
		else {
			��
		}
//		��� �Է����� �𸣴� while ����
		
		
		while(true) {
		N = rand.nextInt(1000)+1;
		System.out.println("["+N+"]");
		String[] ans = new String[3];
		for (int i = 0; i < ans.length; i++) {
			System.out.println("������ �Է����ּ���");
			ans[i] = sc.next();
			if(ans[i] == result) {
				break;
			}else if(ans[i] != result) {
				System.out.println("-��-");
				continue;
			}
		}
			
				
		}
		
		if(result) {
			System.out.println("�����մϴ� �̸��� �Է��ϼ���");
			String message = sc.next();
			System.out.println(message + "�� �����մϴ� !");
		}
//		3���� ����� �̸��� �Է¹޴´�.
//	
//		3�� ������ �̸� �Է¹ޱ�
//		������ �����մϴ� !
		
		
		
		
	}	
	}		
		
		
		
		

