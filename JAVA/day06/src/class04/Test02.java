package class04;

//Ŭ����
class Book {
// �������
	String title;
	int price;

	Book(String t,int p){
	      title=t;
	      price=p;
	      System.out.println(title+" �����Ϸ�!");
	   }
	
// �޼���
	void printInfo() {
		System.out.println(title + "��(��) " + price + "���Դϴ�.");
	}
}

public class Test02 {
	public static void main(String[] args) {

		// ��ü��
		// �Լ��� ������ �ؾ߸� ����ؾߵǴµ�
				// ������ ���ߴµ��� ���� �ִ� �����ڰ� �ִ�.
				// �⺻ ������
		Book b1 = new Book(); // ���������ʾƵ� �⺻������ �����Ǵ� ������
		Book b2 = new Book(); // �⺻(����Ʈ)������ : ���ھ���
		// ������(�Լ�)
		// 1. Ŭ������ �̸��� ����
		// 2. ��ü�� �����Ҽ�������
		// 3. new �����ڿ� �Բ� ���

		// �ùٸ��� ����ϰ� �ʹٸ�?
		b1.title = "�����";
		b1.price = 7800;
		b1.printInfo();

		// 15~23���α��� �Լ��� �� 4��
		// �Լ� 1��
		// �޼��� 1��
		// ������ 2��

	}

}
