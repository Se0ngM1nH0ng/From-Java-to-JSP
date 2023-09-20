package class08;

public class TestTask {

	public static void main(String[] args) {
//		1. 월이 저장된 데이터(==변수)가 있습니다.
//		3,4,5 -> 봄
//		6,7,8 -> 여름
//		9,10,11 -> 가을
//		12,1,2 -> 겨울
//		이라고 console에 출력해주세요
		
//		int month = 1;
//		
//		
//		if(3 <= month && month <= 5 ) {
//			System.out.println("봄");
//		}else if(6 <= month && month <= 8) {
//			System.out.println("여름");
//		}else if(9 <= month && month <= 11) {
//			System.out.println("가을");
//		}else {
//			System.out.println("겨울");
//		}
		

//		2. 나이가 저장된 변수가있습니다.
//		나이가 8~19이면 1000원
//		20~65이면 2000원
//		나머지는 무료!
//		라고 출력해주세요.
		
//		int age = 10;
//		
//		if(8 <= age && age <= 19) {
//			System.out.println("1000원");
//		}else if(20 <= age && age <= 65) {
//			System.out.println("2000원");
//		}else {
//			System.out.println("무료");
//		}

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
//		값을 구하는거죠!!
		
//		네네 근데 시간은 1-12이고 분은 1-60이니까 if문 쓸것
		
		int hour = 1;
		int minute = 10;
		int hour2 = 1;
		int minute2 = 20;
		int result = hour - hour2;
		int result2 = minute - minute2;
		
		if(result <= 0) {
			result += 12;
		}
		
		if(result2 <= 0) {
			result2 += 60;
		}
		
		System.out.println(hour + "시" + minute + "분의 " 
		+ hour2 + "시간" + minute2 + "분 전 시간은" + (result) + "시" + (result2) + "분입니다.");
		
		
		
		

	}

}
