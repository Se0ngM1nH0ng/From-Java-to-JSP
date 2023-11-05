package class01;

public class Test03 {

	public static void main(String[] args) {
//		3. 3시 30분의 1시간 20분 전 시간은 2시 10분입니다.
//		int a=3;
//		int b=30;
//
//		int a=1;
//		int b=10;
//		--->> 1시 10분의 1시간 20분 전 시간은 11시 50분입니다.
		
//		3시 30분으로 가정하면
//		int hour = 3;
//		int minute = 30;
//		으로 변수 잡아서
//		각각 1시간이랑 20분을 빼서
//		값을 구한다
		
//		근데 시간은 1-12이고 분은 1-60이니까 if문 쓸것
		
//		int hour = 1, minute = 10;
//		int hour2 = 1,  minute2 = 20;
//		int result = hour - hour2, result2 = minute - minute2;
		
//		
//		if(result <= 0) {
//			result += 12;
//		}
//		
//		if(result2 <= 0) {
//			result2 += 60;
//		}
//		
//		System.out.println(hour + "시" + minute + "분의 " 
//		+ hour2 + "시간" + minute2 + "분 전 시간은" + (result) + "시" + (result2) + "분입니다.");
		
		
//		강사님 풀이
		
//	      int h=1; // 시간 담을 변수
//	      int m=10; // 분 담을 변수 
//	      
//	      
//	      System.out.println(h+"시 "+m+"분의 1시간 20분 전 시간은");
//	      
//	      // 1시간 20분전 <연산먼저>
//	      h--; // 후위 감소
//	      m=m-20; // m-=20; 복합대입연산자
//	      
//	      if(m<0) {
//	         m+=60;
//	         h--;
//	      }
//	      
//	      
//	      if(h<1) {
//	         h+=12; // h = h+12;
//	      }
//	      
//	      
//	      System.out.println(h+"시 "+m+"분입니다.");
	      
	      
	   
	
		
	
	}
}
