package class04;

import java.util.Scanner;

// JAVA �� �⺻���� == class

//���Ƿ� ���� Ŭ���� , ���Ϸ� ���� Ŭ������ public�� ������ ���� ���Ƿ� ���� class�� ���ϼ� ����.



// ������ �̷��� : '�л�' �ڵ�����
// �л��̶�� �⺻������ ������ �ؼ� class�� ����
class Student{//  Ŭ������ �빮�ڷ� , ��� Ŭ���� �빮��
	String name;
	int score;
	
	// 1 .���� : ������� , �ʵ�, �Ӽ� ex) ��ī�� ���� 
	// �л��� �λ� �Ҽ� ����
	
	// static == "��ü�� �����ϰ�"
	// ���� �̰��� ��ü�� ������ �ֱ⶧���� �Ⱥٴ´� 
	void hello() {
		System.out.println("�ȳ�, �� " + name + "��.");
	} //�޼ҵ�ȿ� ���� name�� �������� �ʾҴµ� 
	 //���� ��ü �� ���� �Ӽ����̶� name�� ���� �ִ�.
	// �޼ҵ�� �Լ����� �־�(��ü)�� ����� !
	
	// 2. ����(���) : �޼��� , ����Լ�  ex) �鸸��Ʈ, ����ġ��  
}

public class Test01 {

	public static void main(String[] args) {

//		hello(); // ���� ��ī�� �Ȱ��� �ֱ� ������ �鸸��Ʈ�� ������
				// ���� ���� ��� �׼��� ����´�.
		
		int num = 10;
		double d = 3.14;
		Scanner sc = new Scanner(System.in);
		String str = new String ("apple");
		String a = "apple";
		String b = "banana";
		String c = "kiwi";
		
		// ex) ���̰��� �츮�� ���̰��� �ְ� ����� ���̰��� �ִ�.
		
		
		//��װ� �� �ٸ��ֵ����� ������ �ʿ��ϴ�
		Student student1 = new Student(); //<- ��ü�� ��������
		Student student2 = new Student();
		//Ŭ������ ���� ��ü�� �����Ҷ����� -> �ؾ�� ������� �ؾƲ�� �غ��Ҷ���				
		//Ŭ����    ��ü = new ������();
		//new ������()�� �ݵ�� �ʿ��ϸ�
		// ��üȭ (�ν��Ͻ�ȭ)
		
		Student student3 = new Student();
		// Ŭ������ �ڷ���, �ؾƲ(10�� �԰� ���� ����� ��Ʋ�� �ϳ� �缭 10����´�.)�� ���� 
		// ��ü�� ����, �ؾ�� ���� 
		// 
		
		
		// new�� ����ϰ� �־ heap�޸� ������ ����� ���� 
		// �װͿ� �ּҸ� ����ϰ� �ִ� ��Ȳ 
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
		
		
		// . ������� ������
		student1.name = "�ƹ���";
		student1.score = 97;
		student2.name = "Ƽ��";
		student2.score = 13;
		student3.name = "�Ƹ�";
		student3.score = 56;
		
		
		
		
		
		
		
		
	}

}
