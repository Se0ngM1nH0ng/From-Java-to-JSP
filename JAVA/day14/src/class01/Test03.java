package class01;

// �����尡 ������ ������ ���� �и��� �ִµ� �����ϱ� 
class FamilyBank extends Thread{ // �̹� �ڹپȿ� �⺻������ ������
								// �ϳ��� ��ü�� ���� ���� 
								// �����带 ���� ��� �ϴ��� 
				// �츮�� ���°� �ƴ϶� 
				// �츮��ü�� �ϳ��ϳ��� �����尡 �ȴ�. ������ 
	Family fb = new Family(); // �����ڸ� ���� �ǹ� �� ��� �밭 ����� 
	@Override
	public void run() { // run �޼��带 �� ����� �� 
		fb.pay();
	}
	
}
class Family{ // �����ڿ��� ���� 
	static int bank = 10000;
	
	synchronized void pay() { // ����ȭ : ���� ���µ����� ���������� 
		if(bank > 0) { 		// �����尡 ��������� �̸��� �����ִٴ� �� 
			System.out.println(Thread.currentThread().getName() + " ��� ����");
			bank -= 5000;
		}else {
			System.out.println(Thread.currentThread().getName() + " ��� ����");
		}
		System.out.println("���� �ݾ�: " + bank);
	}
	
	
}

public class Test03 {

	public static void main(String[] args) {
		FamilyBank f = new FamilyBank();
		Thread t1 = new Thread(f, "�ƺ�");
		Thread t2 = new Thread(f, "����");
		Thread t3 = new Thread(f, "��");
		
		t1.start();
		t2.start();
		t3.start();
		
		
		
	}

}
