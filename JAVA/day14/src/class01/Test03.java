package class01;

// 스레드가 웹에서 등장할 일이 분명히 있는데 이해하기 
class FamilyBank extends Thread{ // 이미 자바안에 기본적으로 들어가있음
								// 하나의 객체로 봐도 무방 
								// 스레드를 언제 사용 하는지 
				// 우리가 쓰는게 아니라 
				// 우리자체가 하나하나의 스레드가 된다. 웹에서 
	Family fb = new Family(); // 생성자를 만들 의미 가 없어서 대강 만든거 
	@Override
	public void run() { // run 메서드를 꼭 써줘야 함 
		fb.pay();
	}
	
}
class Family{ // 공유자원인 돈이 
	static int bank = 10000;
	
	synchronized void pay() { // 동기화 : 내가 쓰는동안은 접근하지마 
		if(bank > 0) { 		// 쓰레드가 멤버변수로 이름을 갖고있다는 점 
			System.out.println(Thread.currentThread().getName() + " 출금 성공");
			bank -= 5000;
		}else {
			System.out.println(Thread.currentThread().getName() + " 출금 실패");
		}
		System.out.println("남은 금액: " + bank);
	}
	
	
}

public class Test03 {

	public static void main(String[] args) {
		FamilyBank f = new FamilyBank();
		Thread t1 = new Thread(f, "아빠");
		Thread t2 = new Thread(f, "엄마");
		Thread t3 = new Thread(f, "나");
		
		t1.start();
		t2.start();
		t3.start();
		
		
		
	}

}
