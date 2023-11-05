package class04;

import java.util.Random;

// 문제 2번 5/10

class Student2 { // 클래스 이름은 중복되서는 안된다!!
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
		System.out.println(this.name + "는 시험을 " + this.test + "번 봅니다.");
	}

	void randNum() {
		this.score = new int[4];
		Random rand = new Random();
		int cnt = 0;
		int total = 0;
		System.out.println(name);
			for (int j = 0; j < this.score.length; j++) {
				this.score[j] = rand.nextInt(100) + 1;
				
				System.out.println((j + 1) + "번 시험" + this.score[j] + "점");
				total += this.score[j];
				cnt++;
			}
		
		avg = total * 1.0 / cnt;
		System.out.print("평균" + avg + "점");
	}

	void gradeNum() {
		      
			if(80<= avg) { // 점수가 80이상이면
		         grade='A'; // 등급이 A이다 
		      }
		      else if(60<=avg) {// 점수가 60이상이면 
		         grade='B'; // 등급이 B이다
		      }else {
		    	 grade = 'C';
		      }
		      
		      System.out.println(" ["+grade+"]");
		      System.out.println();
		   }
	void test() {
		System.out.println(name + "는 재시험을 본다...");
		
	}

}

public class Test09 {

	public static void main(String[] args) {

		Student2 student = new Student2("럭스");
		Student2 student2 = new Student2("유미", 4);

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
