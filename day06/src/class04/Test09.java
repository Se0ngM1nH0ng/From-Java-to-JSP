package class04;

import java.util.Random;

// ���� 2�� 5/10

class Student2 { // Ŭ���� �̸��� �ߺ��Ǽ��� �ȵȴ�!!
	String name;
	int[] score;
	double avg;
	char grade;
	int test;
	int total;

	Student2(String name) {
		this.name = name;
		this.test = 2;
		// this(name,2);
	}

	Student2(String name, int test) {
		this.name = name;
		this.test = test;
	}

	void printInfo() {
		System.out.println(this.name + "�� ������ " + this.test + "�� ���ϴ�.");
	}

	void randNum() {
		this.score = new int[4];
		Random rand = new Random();
		int cnt = 0;
		int total = 0;
		System.out.println(name);
			for (int j = 0; j < this.score.length; j++) {
				this.score[j] = rand.nextInt(100) + 1;
				
				System.out.println((j + 1) + "�� ����" + this.score[j] + "��");
				total += this.score[j];
				cnt++;
			}
		
		avg = total * 1.0 / cnt;
		System.out.print("���" + avg + "��");
	}

	void gradeNum() {
		      
			if(80<= avg) { // ������ 80�̻��̸�
		         grade='A'; // ����� A�̴� 
		      }
		      else if(60<=avg) {// ������ 60�̻��̸� 
		         grade='B'; // ����� B�̴�
		      }else {
		    	 grade = 'C';
		      }
		      
		      System.out.println(" ["+grade+"]");
		      System.out.println();
		   }
	void test() {
		System.out.println(name + "�� ������� ����...");
		
	}

}

public class Test09 {

	public static void main(String[] args) {

		Student2 student = new Student2("����");
		Student2 student2 = new Student2("����", 4);

		student.printInfo();
		student2.printInfo();

		student.randNum();
		student.gradeNum();
		student2.randNum();
		student2.gradeNum();
		student.test();
		student.randNum();
		student.gradeNum();
	}

}
