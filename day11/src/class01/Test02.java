package class01;

// "���ϸ�" ��ü�� ���°� �ƴѰ���?
// "��ī��, ���̸�" ��ü�� ������ �Ǵ°� �ƴѰ��� ?

// [ �߻� Ŭ���� ] // Ŭ�������� ������ �Ǵ� ���� ��ǥ 
// "��üȭ �ϴ°��� ��ǥ�� �ƴ϶�,
// ���踦 �ϴ°��� ��ǥ���� Ŭ������" 
// " Ŭ�������� ������ �Ǵ°��� ��ǥ ���� ������ ��üȭ�� �Ҽ��� x "
abstract class Shape{
	   String name;
	   double area;
	   abstract void draw(); // �߻�޼���
	}
	class Rect extends Shape{
	   @Override
	   void draw() {
	      System.out.println("�׸� �׸���");
	   }
	}
	class Circle extends Shape{
	   @Override
	   void draw() {
	      System.out.println("�� �׸���");
	   }   
	}
	class Tri extends Shape{
	   @Override
	   void draw() {
	      System.out.println("���� �׸���");
	   }
	}

public class Test02 {

	public static void main(String[] args) {
		Circle c = new Circle();
		// ��üȭ�� �ȵȴٴ°� new�� ������. �����ڸ� �������� ������ ���� 
		c.draw();
	}

}
