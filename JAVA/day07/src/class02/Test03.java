package class02;

import java.util.Random;

class Home{// Home�� ������ ��ü
	String name;			//�� ��ü���� ������ �̸�(name)�� ����
				//Home�� ������ ��ü���� �����ϴ� ���°� ����//== money// money�� 10000������

	static int money = 10000;// Ŭ���� ������ ���⼭ �ʱ�ȭ �ϴ°��� �����ϴ�.
	
	Home(String name){
		this.name = name;
		System.out.println(this.name + "�� �ȳ��ϼ���");
	}
	//person.use(5000);<- �갡 ��ü�� ���� : �ҹ��ڷ� �����ϰ� ,�ڿ� .�� �پ
	boolean use(int cnt) {
		System.out.println("���� �ܾ�: " + money);
		System.out.println("���� �ܾ�: " + money +" " + this.name + " ���� ����߽��ϴ�.");
		if(Home.money<=money) {
			System.out.println(this.name + "�� ���� �����ϴ�..! ���� !");
			return false;
		}
		Home.money -= cnt;// ���� ����� �Ǹ� �ȵǴϱ� ������ ���� ������ ���´�.
						// �̰� ������ ������ �����;� �ϴ°� ����
		// Ŭ���� �����ΰ��� �����ֱ� ���� ���� !! ���ų� �Ⱦ��ų�
		return true;
	}
}

public class Test03 {

	public static void main(String[] args) {
		
		Home person = new Home("ȫ�浿");
		Home person2 = new Home("�浿����");
		Home person3 = new Home("�浿�ƺ�");
		
		Home[] datas = new Home[3];
		datas[0]=new Home("ȫ�浿");
		datas[1]=new Home("�浿����");
		datas[2]=new Home("�浿�ƺ�");
		
		while(true) {
			person.use(1000);
			if(!(person.use(1000))) {// �����ڿ��� 0���ϸ� �̸�����ϰ� 
				break;
			}
			person2.use(1000);
			if(!(person.use(1000))) {
				break;
			}
			person3.use(1000);
			if(!(person.use(1000))) {
				break;
			}
		}
		 Random rand=new Random(); // ������ �������� �ִ�.
	      int i=0;
	      while(true) {
	         int randMoney=(rand.nextInt(50)+1)*100;
	         if(!datas[i++].use(randMoney)) {
	            break;
	         }
	         if(i==datas.length) {
	            i=0;
	         }
	      }

		
		
		
		
		
		
		
		
		
		
	}

}
