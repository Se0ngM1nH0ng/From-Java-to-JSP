package class04;

//자동차 코딩해주세요!
class Car {
	int nowSpeed;
	int maxSpeed;
	String name;
	Car() {
		this.name = "무명";
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
	         System.out.println("과속!");
	      }
		}
		
	

	void speedDown() {
		this.nowSpeed-=5;
	      if(this.nowSpeed<=0) {
	         this.nowSpeed=0;
	         System.out.println("정지...");
	      }
	}

	void printInfo() {
		System.out.print(this.name + " 님의 차는");
		System.out.println(" [" + this.nowSpeed + " / " + this.maxSpeed + "] 입니다.");
	}
}

public class Test06 {

	public static void main(String[] args) {
		
		Car car = new Car();
		Car car2 = new Car("홍길동");
		Car car3 = new Car("아무무", 200);
		
		car.printInfo();
		car2.printInfo();
		car3.printInfo();
		

//		System.out.println(car.speedUp(23));
		
		
		
		
	}

}
