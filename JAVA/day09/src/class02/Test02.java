package class02;

class Person{
   String name; // �θ� Ŭ���� �̸�
   Person(String name){ // ������ �̸� �ʱ�ȭ
      this.name=name;
      System.out.println("Person() ������ ȣ��Ϸ�!");
   }
   void hello() {
      System.out.println("�ȳ��ϼ���! :D");
   }
}
class Student extends Person{ // �ڽ�Ŭ���� 
   int score;
   Student(String name,int score){
      super(name); // �θ�Ŭ������ �ٸ� �����ڸ� ȣ��
      this.score=score; 
      System.out.println("Student() ������ ȣ��Ϸ�!");
   }
   void printInfo() {
      System.out.println(this.name+"�л� "+this.score+"��");
   }
}
public class Test02 {
   public static void main(String[] args) {
      Student stu=new Student("ȫ�浿",100);
      stu.printInfo();
   }
}