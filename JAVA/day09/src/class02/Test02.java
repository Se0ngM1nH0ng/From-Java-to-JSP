package class02;

class Person{
   String name; // 부모 클래스 이름
   Person(String name){ // 생성자 이름 초기화
      this.name=name;
      System.out.println("Person() 생성자 호출완료!");
   }
   void hello() {
      System.out.println("안녕하세요! :D");
   }
}
class Student extends Person{ // 자식클래스 
   int score;
   Student(String name,int score){
      super(name); // 부모클래스의 다른 생성자를 호출
      this.score=score; 
      System.out.println("Student() 생성자 호출완료!");
   }
   void printInfo() {
      System.out.println(this.name+"학생 "+this.score+"점");
   }
}
public class Test02 {
   public static void main(String[] args) {
      Student stu=new Student("홍길동",100);
      stu.printInfo();
   }
}