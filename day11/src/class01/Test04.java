package class01;
/*
// class Pokemon
//  - String name
//  - int win �̱�Ƚ��
//  - void hello() : ������ ���ϸ󸶴� ������ �Ҹ��� ���
//  - boolean game(Pokemon pokemon)
//      -> pokemonA.game(pokemonB);
//         �̱�Ƚ���� ȦȦ �������� �̱�
//         �̱�Ƚ���� ¦¦ ū���� �̱�
//          �����ϴٸ� A�� �̱�(A>B)
//         �̱�Ƚ���� Ȧ¦,¦Ȧ Ȧ���� �̱�

// class ������
// 1. abstract�ϱ�?
//    1) �� Ŭ������ ��ü�� �ʿ��Ѱ�?
//    2) �߻�޼��尡 �ֳ�? == �������̵��� �����ؾ��ϴ� �޼��尡 �ֳ�?
//         == �������ؾ��ϴ� �޼��尡 �ֳ�?
// 2. ������� ����
//    1) private
//    2) getter,setter
// 3. ������
// 4. �޼���
//    1) �������̵�(������)�� �����ؾߵǳ�? => �߻�޼���� �������ϳ�?
//    2) '���'�� ����, "INPUT,OUTPUT"�� �����Ͽ� '�޼��� �ñ״�ó' �ۼ�
abstract class Pokemon{
   private String name;
   private int win;
   Pokemon(String name){ // �߻�Ŭ���� ������ ���� ����
      this.name=name;
      this.win=0;
   }
   abstract void hello();
   boolean game(Pokemon pokemon) { 
      if(this.win%2==1 && pokemon.win%2==1) {
         if(this.win<=pokemon.win) {
            this.win++;
            return true;
         }
         else {
            pokemon.win++;
            return false;
         }
      }
      else if(this.win%2==0 && pokemon.win%2==0) {
         if(this.win>=pokemon.win) {
            this.win++;
            return true;
         }
         else {
            pokemon.win++;
            return false;
         }
      }
      else {
         if(this.win%2==1) {
            this.win++;
            return true;
         }
         else {
            pokemon.win++;
            return false;
         }
      }
   }
   public String getName() {
      return name;
   }
   public void setName(String name) {
      this.name = name;
   }
   public int getWin() {
      return win;
   }
   public void setWin(int win) {
      this.win = win;
   }
}

class Pika extends Pokemon{
   Pika() {
      super("��ī��");
   }
   @Override
   void hello() {
      System.out.println("��ī��ī");
   }
   // 1. �޼��� �ȸ���� �־�~~ => �������̵� �����ǰ��ִ� �޼���(�߻�޼���)
   //    => 1. ���� �߻�Ŭ���� �ϴ���
   //       2. �߻�޼��� �������̵� ���ִ��� ��
   // 2. super()�� ȣ���ϴ� ���̾�~~ => �θ�Ŭ�������Դ� �⺻�����ڰ� ���� ����
   //    => 1. �θ�Ŭ������ �⺻������ �������
   //       2. �θ�Ŭ������ �ٸ������ڸ� ����ϴ��� ��
}
class Metamon extends Pokemon{
   Metamon() {
      super("��Ÿ��");
   }
   @Override
   void hello() {
      System.out.println("���䢪");
   }   
}

public class Test04 {
   public static void main(String[] args) {
      Pika pika=new Pika();
      Metamon m1=new Metamon();
      Metamon m2=new Metamon();
      
      pika.setWin( pika.getWin()+1 ); // == pika.win++;
      
      pika.game(m1);
      System.out.println(pika.getWin());
      m2.game(pika);
      System.out.println(pika.getWin());
      m1.game(pika);
      System.out.println(pika.getWin());
      m1.game(m2);
      System.out.println(m1.getWin());
      pika.game(m1);
      System.out.println(m1.getWin());
   }
}
*/