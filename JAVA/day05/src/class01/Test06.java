package class01;

import java.util.Random;
import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
//		1. 369 게임
//		9 짝 33 짝짝 939 짝짝짝
//		1~1000 중에서 랜덤으로 정수 1개 생성
//		[19] : 짝
//		정답입니다!
//		[19] : 19
//		오답입니다.....
//		[22] : 22
//		정답입니다!

//		int num = 1~1000 중에서 랜덤으로 정수 1개 생성
//		[num] = 사용자한테 입력 받기 .문자열을 써줘야한다. (짝이 들어갈수도 있고 정수가 들어갈수도 있다.)
//		String answer = " ";
		
		String str = "8888999";
		
		
		

//		int NUM = 1~1000중에서 랜덤으로 정수 1개 생성
//		[NUM] : INPUT을 받아야함! : 문자열을 입력
//
//		String ANS="";
//
//		if(NUM의 일의 자리가 3,6,9야?)
//			 ANS+="짝";
//		if(10 ?)
//			ANS+="짝";
//
//		if(ANS==INPUT)
//			정답입니다!
//			else
//			오답입니다.....
		
//		int num = 1~1000 중에서 랜덤으로 정수 1개 생성
		Random rand = new Random();
		int num = rand.nextInt(1000)+1;
		String answer = " ";
		int num2 = num % 10; // 일의 자리
		int num3 = (num / 10) % 10; // 십의 자리
		int num4 = num / 100; // 백의 자리
		
		
		if(num2 == 3 || num2 == 6 || num2 == 9) {
			answer += "짝";
		}
		if(num3 == 3 || num3 == 6 || num3 == 9) {
			answer += "짝";
		}
		if(num4 == 3 || num4 == 6 || num4 == 9) {
			answer += "짝";
		}
		
		String result = answer;
		System.out.print(num);
		if(answer == result) {
			System.out.println(answer); 
			System.out.println("정답입니다");
		} else {
			System.out.println("오답입니다");
		}
		
//		2. 1의 게임을 3번할건데,
//		3번 다 정답이면 이름을 입력받아서
//		ㅁㅁㅁ님 축하합니다!~~ 상품드리겠습니다!~~~
//		이름입력) 김효경
//		김효경님 축하합니다!~~ 상품드리겠습니다!~~~
		
//		게임을3번 한다 -> 문자열을 3번 입력받기
		Scanner sc = new Scanner(System.in);
//		
//		1번코드를 세번입력받는다.
//		
//		입력을 받은값이 정답이면 패스 오답이면 -끝- 처음으로 
		String ans = sc.next();
		
		if(ans.equals(정답)) {
			패스
		}
		else {
			끝
		}
//		몇번 입력할지 모르니 while 쓰기
		
		
		while(true) {
		N = rand.nextInt(1000)+1;
		System.out.println("["+N+"]");
		String[] ans = new String[3];
		for (int i = 0; i < ans.length; i++) {
			System.out.println("정답을 입력해주세요");
			ans[i] = sc.next();
			if(ans[i] == result) {
				break;
			}else if(ans[i] != result) {
				System.out.println("-끝-");
				continue;
			}
		}
			
				
		}
		
		if(result) {
			System.out.println("축하합니다 이름을 입력하세요");
			String message = sc.next();
			System.out.println(message + "님 축하합니다 !");
		}
//		3번다 정답시 이름을 입력받는다.
//	
//		3번 정답자 이름 입력받기
//		ㅁㅁㅁ 축하합니다 !
		
		
		
		
	}	
	}		
		
		
		
		

