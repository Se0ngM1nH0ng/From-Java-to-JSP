package class01;


// �� this() : �Ẹ��
class Point {
   // 1.������� 2.�޼��� 3.������
   int x;
   int y;
   Point(){ // : ������� �ʱ�ȭ
      this.x=0;
      this.y=0;
      // this(0,0); �� �ٸ� ������ ���ðǵ� �̰� �̿��Ұž� 
   }
   Point(int x){
      this.x=x; // �Է��� ���� �ϳ��� �Ѵ� ���� ��� �Ѵ� �Ͽ��� 
      this.y=x;
      // this(x,x); 
   }
   Point(int x,int y){
      this.x=x;
      this.y=y;
   }
   void move() {
      this.x++; // ��ĭ�� �̵��ϴϱ� ++; ������
      this.y++;
   }
   void move(int x) {
      this.x+=x; // �Է��� ����ŭ�� �̵��ϴϱ� ��ø
      this.y+=x;
   }
   void move(int x,int y) {
      this.x+=x;// ���� x�� x��� y�� y��� ��ø
      this.y+=y;
   }
   void printInfo() {
      System.out.println("������ġ�� ("+this.x+","+this.y+")�Դϴ�.");
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