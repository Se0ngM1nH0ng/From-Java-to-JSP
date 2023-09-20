package class01;


// ※ this() : 써보기
class Point {
   // 1.멤버변수 2.메서드 3.생성자
   int x;
   int y;
   Point(){ // : 멤버변수 초기화
      this.x=0;
      this.y=0;
      // this(0,0); 나 다른 생성자 들어올건데 이거 이용할거야 
   }
   Point(int x){
      this.x=x; // 입력한 값이 하나라서 둘다 같이 상승 한다 하여서 
      this.y=x;
      // this(x,x); 
   }
   Point(int x,int y){
      this.x=x;
      this.y=y;
   }
   void move() {
      this.x++; // 한칸씩 이동하니까 ++; 후위형
      this.y++;
   }
   void move(int x) {
      this.x+=x; // 입력한 수만큼만 이동하니까 중첩
      this.y+=x;
   }
   void move(int x,int y) {
      this.x+=x;// 각자 x는 x대로 y는 y대로 중첩
      this.y+=y;
   }
   void printInfo() {
      System.out.println("현재위치는 ("+this.x+","+this.y+")입니다.");
   }
}

public class Test01 {
   public static void main(String[] args) {

      Point p1 = new Point();
      Point p2 = new Point(10);
      Point p3 = new Point(1,2);

      p1.move();
      p1.printInfo();
      
      p2.move(-5);
      p2.printInfo();
      
      p3.move(3, 4);
      p3.printInfo();
      
      
      
      
      
      
      
      
      
      
      
   }
}