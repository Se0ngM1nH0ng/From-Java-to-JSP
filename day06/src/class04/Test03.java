package class04;

//Point 1. �������� vs �������
//Point 2. ��������� ���Կ����� ��� xxx
//       -> �����ڸ� �����Ͽ� �ذ�!
class Circle{ // �� ��ü�� ���� ���ּ���
	String name; // �̸��̶� �������� �پ��� 
	int radius;
	double PI;
	double result; 
	// ����� �������
	
	
	
	// ������
	// 1, input
	// 2, output xxxx -> �翬�� ��ü�̱� ������ �Ⱦ�
	//������ ��ü���� output�Ⱦ� 
	// 3, �������Լ��� == Ŭ������
	// �ڡڡڡڡڡ� �������� �������� �ڡڡڡڡڡ�
	// : ��������� ������ �ʱ�ȭ �ϱ� ���ؼ� ����� !!
	
	Circle(String name, int radius){
		this.name=name;
		this.radius=radius;
		this.PI=3.14;
		this.result=this.radius*this.radius*this.PI;
		System.out.println(this.name+"��(��) �����Ϸ�!");
	}
	
	
	
	void printInfo() {
		System.out.println(name + "�� ���̰� " + result + "�Դϴ�.");
	}   // ���� : ���������� �ǹ�
		// �Ķ�: �������
}

public class Test03 {

	public static void main(String[] args) {

		// �����ڰ� 1���� �����ϰԵǸ�, 
		// ���̻� �⺻�����ڴ� �������� �ʽ��ϴ�..
		Circle a1 = new Circle("ȫ",10);
		Circle a2 = new Circle("����", 20);
		
		a1.name = "ȫ"; // ������� ���¸� ���������� !
		
		a1.radius = 10;
		a2.name = "����";
		a2.radius = 20;
		
		a1.printInfo();
		a2.printInfo();
		
		
		
		
		
		
	}

}
