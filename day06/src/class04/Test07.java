package class04;

class Car2{
   String name;
   int speed;
   int max;

   Car2(){
      this.name="����";
      this.speed=0;
      this.max=120;
   }
   Car2(String name){
      this.name=name;
      this.speed=0;
      this.max=120;
   }
   Car2(String name,int max){
      this.name=name;
      this.speed=0;
      this.max=max;
   } //���ڰ� ���� �����͵��� ����� �������� this()�� ����.

   void printInfo() {
      System.out.println(this.name+"���� ���� ["+this.speed+"/"+this.max+"]�Դϴ�.");
   }
   void speedUp() {
      this.speed+=100;
      if(this.speed>this.max) {
         this.speed=this.max;
         System.out.println("����!");
      }
   }
   void speedUp(int speed) { // �����ε� //�޼ҵ带 �ΰ� ��
      this.speed+=speed;
      if(this.speed>this.max) {
         this.speed=this.max;
         System.out.println("����!");
      }
   }
   void speedDown() {
      this.speed-=5;
      if(this.speed<=0) {
         this.speed=0;
         System.out.println("����...");
      }
   }
}
public class Test07 {

   public static void main(String[] args) {
      
      Car2 c1=new Car2();
      Car2 c2=new Car2("ȫ�浿");
      Car2 c3=new Car2("�ƹ���",200);
      
      c1.printInfo();
      c2.speedDown();
      c2.printInfo();
      c3.speedUp(50);
      c3.speedUp(30);
      c3.printInfo();
      c3.speedUp(20);
      c3.printInfo();
      
      
      
      
      
      
      
      
      
      
      
      
   }

}