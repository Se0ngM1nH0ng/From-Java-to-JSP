package class01;

// [��� - ��ȭ]
class Poketmon2{
	String name;
	Poketmon2(){
		this("���ϸ�");
	}
	Poketmon2(String name){
		this.name = name;
	}
	void printInfo() {
		System.out.println("�� ���ϸ��� " +  this.name + "�Դϴ�.");
	}
	// �ֻ��� Ŭ���� Object �κ��� ��ӹ��� �޼����� equals()�� 
	// ��¦ �ٲ㼭 ���Ը��� ���缭 ����ϰ� ����!
	// -> �������̵� (�Ϸ��� �޼��� �ñ״�ó�� ���ƾ� �� )
	// -> �޼��� ������ -> �޼��� �ñ״�ó
	
	//��)
//	  void func(double d) { // int 10�� ���ڷ� ������
//	      d=10.0;
//	      int i=(int)d; // ����ȯ(ĳ����)
//	   }
	   
	
	
	
	@Override // ������̼� : ���α׷��� �����ϴ� �ּ�
	public boolean equals(Object obj) { // Object�� equals�� ������
		// equals ��� �޼��� 
		double d = 3; // 3.0
		// �ڵ�����ȯ
		// ��ĳ����
		
		Poketmon2 poketmon2 = (Poketmon2)obj;
		// ���������ȯ (���� ����ȯ)
		// �ٿ� ĳ����
		// ����� ����ȯ �ÿ��� ��ø� ����� �Ѵ�
		
		
		
		// ���� Object �� ���ϸ� �̸��� ������ �ִ� ��Ȳ�� �ƴϴ� 
		if(this.name.equals(poketmon2.name)) {// �� �̸��̶� ���� ����� �̸��̶� ���� ?
			return true;
		}
		
		return false;
	}
	 
}

class Pika extends Poketmon2{
	Pika(){
		super("��ī��"); // �ƹ��͵� ���� �����ڿ��� ���ϸ����� ���°� ���� �ȵ鶩?
	}
}

class Charmander extends Poketmon2{
	Charmander(){
		super("���̸�");
	}
}
public class Test01 {

	public static void main(String[] args) {

	Pika p1 = new Pika();	// ���ʿ� ��ü �񱳽ÿ� ���������� �ΰ��� ��ü�� ����?
							// ��� ����� �ȵ� ������ ��ü�� ������
	Pika p2 = new Pika();	// �ΰ��� ��ü�� ���� �ּҾ� ? xxxx
	Charmander c1 = new Charmander();	
		
	// ���� ��� ���ϸ��� Ű���ִ� Ű������� �ִ�.	
	// : ���ϸ�1���� , ���ϸ� 2������ Ű���ش�. 
	// -> ��ī�� ��ī�� -> �� o
	// -> ���̸� ��ī�� -> �� x
	
	// �� ���ϸ��� ������ ���� ? ����� 
	// p1, c1�� Ű������� �ð��! 
	// p1==c1�� ���� ���� ���� : �����ڿ� ����� ��ü�� �ɼ� ����!
	// ex) ���ڿ�
	// equals()�޼����(��ü�񱳽ÿ� ����) �ΰ��� ��ü�� ���� �ּ��϶��� True �� ���. 
	// p1.equals(p1) -> o
	// p1.equals(p2) -> x
	// ��ü�� ���ϴ� ��Ȳ�̶� �����ڴ� ���� // equals�� ���
	if(p1.equals(p2)) {//�� ������ ���� �ּҴ� ? ����� �����̶� �����ʴ� // p1�� c1�� ���� ���ϸ��̾�?
		// equals ��� �޼��带 ���� 
		// �ٽ� ���ƿͼ� ���ϸ� p1�� p2�� ��������.
		System.out.println("���� ȹ���߽��ϴ�!");
	}else {
		System.out.println("......");
	}
	
	// �� Object Ŭ����
	// JAVA���� �⺻�������ִ� �ֻ��� Ŭ���� 
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
