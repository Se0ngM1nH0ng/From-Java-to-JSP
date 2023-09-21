package class01;

//			ex )  동기화 하는것 -> 계좌 나 티켓팅 
// 동기화 :    ex ) 동기화 안하는 것 - > 장바구니 // 장바구니에 담는다고 딴사람 막을순 없다  
// 스레드는 독립적으로 일하는 일원이기 때문에 
// 공유자원을 어떤 스레드가 점유하고 있을때 ,
// 다른 스레드의 접근을 막아줘야 한다.



class Person extends Thread{
	//thread.start() - > run()메서드가 수행
	Ticketting t=new Ticketting();

	@Override
	public void run() {
		t.pay();
	}


}
class Ticketting { // Person 객체들이 사람들이 공유자원인 티켓을 구해하는 로직 
	static int ticket = 2; // 공유 자원 매표소 같은곳 
	// 공유자원, 클래스 변수 // 누구든지 사간다면 티켓이 있는지 없는지 봐야한다.
	synchronized void pay() { // 공유자원을 건드리는 얘가 문제다 
		if(ticket>0) {
			System.out.println(Thread.currentThread().getName()+"구매성공!");
			ticket--;
		}
		else {
			System.out.println(Thread.currentThread().getName()+"구매실패ㅠㅠ...");
		}
		System.out.println("남은티켓: "+ticket);
	}
}


public class Test02 {

	public static void main(String[] args) {

		Person p = new Person(); // 스레드를 상속받은 
		Thread t1=new Thread(p,"홍길동");
		Thread t2=new Thread(p,"아무무");
		Thread t3=new Thread(p,"티모");

		t1.start();
		t2.start();
		t3.start();



		// 각각의 일을 할수 있는 스레드를 만들었다 
		//홍길동이 티켓을 보았을땐 2개 아무무가 티켓을 봤을땐 두개 
		//티모가 봤을땐 1개 여서 또 구매 
		// 사람의 이름을 멤버변수로 선언 한적이 없어서 스레드에 이름을 부여해줌 







	}

}
