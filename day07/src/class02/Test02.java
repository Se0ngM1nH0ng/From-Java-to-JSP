package class02;

// 1. ��ü���� ���� "����"�ϴ� ���
//    static �ٿ��� Ŭ���� ������ ����
//    this xxx
// 2. ��ü��ε� �迭�� �����Ҽ�����
class Game {
	String name; // �𷡼������� �ϴ� ����̸�
	static int res=100; // �����ڿ�. �𷡼�
	Game(String name){
		this.name=name;
		System.out.println(this.name+"�� ����!");
	}
	boolean game(int cnt) { // this == �ڱ��ڽŰ�ü
		res-=cnt;
		if(res<=0) {
			System.out.println(this.name+"�� �й�...");
			return false;
		}
		System.out.println(this.name+"�� ����! ������: "+res);
		return true;
	}
}

public class Test02 {
	public static void main(String[] args) {

		Game g1=new Game("�Ƹ�");
		Game g2=new Game("�ƹ���");
		Game g3=new Game("Ƽ��");
		Game g4=new Game("�ҳ�");
		
		// ��ü�� ����� �迭
		// : ��ü�迭
		Game[] data=new Game[3];
		data[0]=new Game("�Ƹ�");
		data[1]=new Game("�ƹ���");
		data[2]=new Game("Ƽ��");

		int i=0;
		while(true) {
			
			if(!data[i++].game(5)) {
				break;
			}
			
			if(i==data.length) {
				i=0;
			}
			
		}

		// ù��°���� ���������� ���ư��鼭
		// ������� ������ �Ұǵ�,
		// ���� �й��ߴٸ� ��������










	}
}

		 
//		 while(true) {
//		 g1.game(80);// �����ڿ��̾��� ������ ���� �̹� �������� �׷����̴�.
//		 if(!g.game(5)) { //���� ?
//			 break;
//		 }
//		 g2.game(15);
//		 if(!g2.game(5)) {
//			 break;
//		 }
//		 g3.game(7);
//		 if(!g3.game(5)) {
//			 break;
//		 }
		 
		 
		 
		 
		 
		 //while �ȿ� �ٸ� ���ǹ� �ȿ� break;�� while �� ���� ������ �ȵȴ�.
		 
		 // �ѱ��ڵ�
		// ù��°���� ���������� ���ư��鼭 
		// ������� ������ �Ұǵ�, // �й� �ϱ� �������� �ȸ���ǵ� 
		// ���� �й��ߴٸ� �������� 
	
	
		 
		 
		 
		