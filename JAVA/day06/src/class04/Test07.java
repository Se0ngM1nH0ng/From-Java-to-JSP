package class04;

class Car2{
   String name;
   int speed;
   int max;

   Car2(){
      this.name="무명";
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
   } //인자가 가장 많은것들을 써놓고 나머지가 this()를 쓴다.

   void printInfo() {
      System.out.println(this.name+"님의 차는 ["+this.speed+"/"+this.max+"]입니다.");
   }
   void speedUp() {
      this.speed+=100;
      if(this.speed>this.max) {
         this.speed=this.max;
         System.out.println("과속!");
      }
   }
   void speedUp(int speed) { // 오버로딩 //메소드를 두개 씀
      this.speed+=speed;
      if(this.speed>this.max) {
         this.speed=this.max;
         System.out.println("과속!");
      }
   }
   void speedDown() {
      this.speed-=5;
      if(this.speed<=0) {
         this.speed=0;
         System.out.println("정지...");
      }
   }
}
public class Test07 {

   public static void main(String[] args) {
      
      Car2 c1=new Car2();
      Car2 c2=new Car2("홍길동");
      Car2 c3=new Car2("아무무",200);
      
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