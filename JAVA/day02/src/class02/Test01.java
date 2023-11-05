package class02;

public class Test01 {

	public static void main(String[] args) {
		
//		동일한 수행을 "여러번" 호출(사용)해야 할때 활용
		
//		int i = 0 ;
//		while(i < 3) {
//			// 조건식이 참일때 수행
//			System.out.println("안녕하세요!");
//			
//			i++;
//			
//		} // 닫는 블록에 닿으면, while(조건식)으로 처음으로 돌아간다.
//		  // 닫는 블록 } 를 뚫고 나가는일은 결코 없다 !!
//		  // 다시 처음으로 . false를 만나야 괄호 밖으로 나간다.
		
		
		int data = 10;
		while(data > 5) {//조건식이 false가 될때 까지 돈다.
			System.out.println("현재 data: " + data);
			data -= 3; // data = data - 3;
		}
		
		System.out.println("최종 data : " + data);
		
		
		
		
	}

}
