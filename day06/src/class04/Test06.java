package class04;

//�ڵ��� �ڵ����ּ���!
class Car {
	int nowSpeed;
	int maxSpeed;
	String name;
	Car() {
		this.name = "����";
		this.nowSpeed = 0;
		this.maxSpeed = 120;
	}

	Car(String name) {
		this.name = name;
		this.nowSpeed = 0;
		this.maxSpeed = 120;
	}

	Car(String name, int maxSpeed) {
		this.name = name;
		this.nowSpeed = 0;
		this.maxSpeed = maxSpeed;
	}

	void speedUp() {
		this.nowSpeed+=100;
		if(this.nowSpeed>this.maxSpeed) {
	         this.nowSpeed=this.maxSpeed;
	         System.out.println("����!");
	      }
		}
		
	

	void speedDown() {
		this.nowSpeed-=5;
	      if(this.nowSpeed<=0) {
	         this.nowSpeed=0;
	         System.out.println("����...");
	      }
	}

	void printInfo() {
		System.out.print(this.name + " ���� ����");
		System.out.println(" [" + this.nowSpeed + " / " + this.maxSpeed + "] �Դϴ�.");
	}
}

public class Test06 {

	public static void main(String[] args) {
		
		Car car = new Car();
		Car car2 = new Car("ȫ�浿");
		Car car3 = new Car("�ƹ���", 200);
		
		car.printInfo();
		car2.printInfo();
		car3.printInfo();
		

//		System.out.println(car.speedUp(23));
		
		
		
		
	}

}
