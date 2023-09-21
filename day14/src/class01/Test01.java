package class01;

// �̹� JAVA���� ������ Thread Ŭ������ �����ٰ� ���
// �ڵ带 ������ ����
// => ��� 
class Th01 extends Thread{

	@Override
	public void run() {
		for (int i = 1; i < 10; i++) {
			System.out.println("Thread 01 " + i);
		}
	}
	
}
class Th02 extends Thread{
	// �̽��� �ȳ��� ? �⺻�����ڰ� �����ֱ��� ? �̹�
	@Override
	public void run() {
		for (int i = 1; i < 10; i++) {
			System.out.println("Thread 02 " + i);
		}
	}
	
}
public class Test01 {

	public static void main(String[] args) {
		Th01 t1 = new Th01(); // ����
		// ������ �Ǹ� , ��� �����°� �� 
		Th02 t2 = new Th02();
		
		// ���θ��� �̿��ϴ� �� �ϳ��ϳ��� ������ ��� ���� 
		// ����
		t1.start(); // �� ���� �ѳ��� // ������ ��ü��, ���� !
		t2.start(); // �ʵ� ����  // -> run()�޼��带 �����Ŵ 
		
		// ������ ��ü���� ���� ���������� ���� �����ϰ� �ֱ���! --> ��͸� �����ϸ� �� 
		
//		��� 5�� ���� ��ǰ
//		t1(�����1) -> ��ٱ��Ͽ� 3�� ���� // ���� �ȵ� 
//		t2(�����2) -> 5���� ��� ����
		// ���� �����Ͱ� � �������� �߿��ѰŴ� 
		
		// start()�� ���� run()�� �����ϰ� �ǰ�, �־��� run()�� �����ϰ� �Ǹ� 
		// ���� ���°� ��
		// ������ �ִ� �޸𸮸� �� ���� ���� �Ѵ�. �ڱⰡ �����ϰ� �ִ� �޸𸮸� 
		// �ٽ� �����ش�.
		
		
		
		// ������ �����ֱ�(������ ����Ŭ)
		// ���� -> ��� -> ���� -> ����
		// ��� : �ڿ�(�޸�)�� �Ҵ���� ���ϵ��� ���Ƶ� ����
		// ��ǥ���� ������ ��ϻ���  : sleep
		
		  for(int i=1;i<=10;i++) {
		         System.out.println(i);
		         try {
		            Thread.sleep(1000); // 1000 == 1��
		         } catch (InterruptedException e) {
		            // TODO Auto-generated catch block
		            e.printStackTrace();
		         }
		      }

	}

}
