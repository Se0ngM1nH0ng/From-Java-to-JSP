package class04;

//문제 1번 5/10
class Point{
	int x;
	int y;
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	Point(int x){
		this.x = x;
		this.y = x;
	}

	Point(){
		this.x = 0;
		this.y = 0;
	}

	void move() {
		this.x=11;
		this.y=12;
		System.out.print("(" + this.x + ","+ this.y+ ")");
		System.out.print(" -> ");
		System.out.print("("+ (this.x + 1) + ",");
		System.out.println((this.y + 1) + ")");
	}
	void move(int num) {
		this.x=11;
		this.y=12;
		int cnt = 0;
		for (int i = 0; i < num; i++) {
			cnt++;
		}
		System.out.print("(" + this.x + ","+ this.y+ ")");
		System.out.print(" -> ");
		System.out.print("("+ (this.x + cnt) + ",");
		System.out.println((this.y + cnt)+ ")");
	}
	void move(int num , int num2) {
		this.x=11;
		this.y=12;
		int cnt = 0;
		int cnt2 = 0;
		for (int i = 0; i < num; i++) {
			cnt++;
		}
		for (int i = 0; i < num2; i++) {
			cnt2++;
		}
		System.out.print("(" + this.x + ","+ this.y+ ")");
		System.out.print(" -> ");
		System.out.print("("+ (this.x + cnt) + ",");
		System.out.println((this.y + cnt2) + ")");
	}
	void printInfo() {
		System.out.println("현재위치는 " + "(" +this.x +","+ this.y +") 입니다.");
	}
	
}




public class Test08 {

public static void main(String[] args) {
	

		Point p = new Point();
		Point p2 = new Point(10);
		Point p3 = new Point(2,3);
		
		p.move();
		p.move(3);
		p.move(4,5);
		
		p.printInfo();
		p2.printInfo();
		p3.printInfo();
		
		
}	
		
		
		
		
		
		
	}


