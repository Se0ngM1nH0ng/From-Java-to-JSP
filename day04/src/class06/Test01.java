package class06;

import java.util.Scanner;

public class Test01 {
	// 함수의 기본 단위
	// public : 공개범위 <-> private
	// static : "객체와 무관하게"
	// void : "아무것도 없음" 0이나 공백이 아님 
//	public static OUTPUT 함수명 (INPUT) {// 함수명은 "기능"을 유추할수 있게 만들어야 한다!
//		
//	}
	
	
//	함수 A유형(input  x , output o)
	public static void hello() {// 함수명은 "기능"을 유추할수 있게 만들어야 한다!
		System.out.println("안녕하세요 ! ");
	}
	// "함수를 정의(선언) 했다."
	
	
// 함수 B유형(input o , output x)
	public static void printStar(int num) {// 정수 넘버를 받으면 별을 찍어준다.
		for (int i = 0; i < num; i++) {
			System.out.println("★");
		}
	}
	
 public static void main(String[] args) {
	
	 
	 System.out.println("안녕하세요 !");
	 hello(); // ★ 함수사용의 핵심 ★ "함수를 호출(사용) 했다."
	
//	 printStar(); // 함수를 호출할때에는 input, output 을 정확히 맞춰서 사용해야한다!
	 printStar(5);
	 printStar(3);
	
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
}
