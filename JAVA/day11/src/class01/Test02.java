package class01;

// "포켓몬" 객체는 없는것 아닌가요?
// "피카츄, 파이리" 객체만 있으면 되는거 아닌가요 ?

// [ 추상 클래스 ] // 클래스들의 기준이 되는 것이 목표 
// "객체화 하는것이 목표가 아니라,
// 설계를 하는것이 목표였던 클래스들" 
// " 클래스들의 기준이 되는것이 목표 였기 때문에 객체화를 할수가 x "
abstract class Shape{
	   String name;
	   double area;
	   abstract void draw(); // 추상메서드
	}
	class Rect extends Shape{
	   @Override
	   void draw() {
	      System.out.println("네모 그리기");
	   }
	}
	class Circle extends Shape{
	   @Override
	   void draw() {
	      System.out.println("원 그리기");
	   }   
	}
	class Tri extends Shape{
	   @Override
	   void draw() {
	      System.out.println("세모 그리기");
	   }
	}

public class Test02 {

	public static void main(String[] args) {
		Circle c = new Circle();
		// 객체화가 안된다는게 new를 못쓴다. 생성자를 가질수는 있음에 유의 
		c.draw();
	}

}
