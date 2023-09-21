package class01;

//			ex )  ����ȭ �ϴ°� -> ���� �� Ƽ���� 
// ����ȭ :    ex ) ����ȭ ���ϴ� �� - > ��ٱ��� // ��ٱ��Ͽ� ��´ٰ� ����� ������ ����  
// ������� ���������� ���ϴ� �Ͽ��̱� ������ 
// �����ڿ��� � �����尡 �����ϰ� ������ ,
// �ٸ� �������� ������ ������� �Ѵ�.



class Person extends Thread{
	//thread.start() - > run()�޼��尡 ����
	Ticketting t=new Ticketting();

	@Override
	public void run() {
		t.pay();
	}


}
class Ticketting { // Person ��ü���� ������� �����ڿ��� Ƽ���� �����ϴ� ���� 
	static int ticket = 2; // ���� �ڿ� ��ǥ�� ������ 
	// �����ڿ�, Ŭ���� ���� // �������� �簣�ٸ� Ƽ���� �ִ��� ������ �����Ѵ�.
	synchronized void pay() { // �����ڿ��� �ǵ帮�� �갡 ������ 
		if(ticket>0) {
			System.out.println(Thread.currentThread().getName()+"���ż���!");
			ticket--;
		}
		else {
			System.out.println(Thread.currentThread().getName()+"���Ž��ФФ�...");
		}
		System.out.println("����Ƽ��: "+ticket);
	}
}


public class Test02 {

	public static void main(String[] args) {

		Person p = new Person(); // �����带 ��ӹ��� 
		Thread t1=new Thread(p,"ȫ�浿");
		Thread t2=new Thread(p,"�ƹ���");
		Thread t3=new Thread(p,"Ƽ��");

		t1.start();
		t2.start();
		t3.start();



		// ������ ���� �Ҽ� �ִ� �����带 ������� 
		//ȫ�浿�� Ƽ���� �������� 2�� �ƹ����� Ƽ���� ������ �ΰ� 
		//Ƽ�� ������ 1�� ���� �� ���� 
		// ����� �̸��� ��������� ���� ������ ��� �����忡 �̸��� �ο����� 







	}

}
