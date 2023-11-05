package class01;

// 이미 JAVA에서 구현한 Thread 클래스를 가져다가 사용
// 코드를 재사용할 예정
// => 상속 
class Th01 extends Thread{

	@Override
	public void run() {
		for (int i = 1; i < 10; i++) {
			System.out.println("Thread 01 " + i);
		}
	}
	
}
class Th02 extends Thread{
	// 이슈가 안났네 ? 기본생성자가 숨어있구나 ? 이미
	@Override
	public void run() {
		for (int i = 1; i < 10; i++) {
			System.out.println("Thread 02 " + i);
		}
	}
	
}
public class Test01 {

	public static void main(String[] args) {
		Th01 t1 = new Th01(); // 생성
		// 생성이 되면 , 즉시 대기상태가 됨 
		Th02 t2 = new Th02();
		
		// 쇼핑몰을 이용하는 고객 하나하나가 스레드 라고 생각 
		// 수행
		t1.start(); // 너 일해 켜놓고 // 스레드 객체야, 일해 !
		t2.start(); // 너도 일해  // -> run()메서드를 실행시킴 
		
		// 스레드 객체들은 현재 독립적으로 일을 수행하고 있구나! --> 요것만 이해하면 됨 
		
//		재고가 5개 남은 상품
//		t1(사용자1) -> 장바구니에 3개 담음 // 구매 안됨 
//		t2(사용자2) -> 5개를 즉시 구매
		// 현재 데이터가 어떤 상태인지 중요한거다 
		
		// start()로 인해 run()을 수행하게 되고, 주어진 run()을 수행하게 되면 
		// 데드 상태가 됨
		// 가지고 있던 메모리를 다 해제 해지 한다. 자기가 점유하고 있던 메모리를 
		// 다시 돌려준다.
		
		
		
		// 스레드 생명주기(라이프 사이클)
		// 생성 -> 대기 -> 수행 -> 데드
		// 블록 : 자원(메모리)을 할당받지 못하도록 막아둔 상태
		// 대표적인 스레드 블록상태  : sleep
		
		  for(int i=1;i<=10;i++) {
		         System.out.println(i);
		         try {
		            Thread.sleep(1000); // 1000 == 1초
		         } catch (InterruptedException e) {
		            // TODO Auto-generated catch block
		            e.printStackTrace();
		         }
		      }

	}

}
