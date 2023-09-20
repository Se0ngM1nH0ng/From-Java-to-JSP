package class05;

import java.util.Random;
import java.util.Scanner;

//���ϸ� Ŭ������ �ֽ��ϴ�.
//�� Ŭ������ ���ϸ� ��ü���� �����Ұ̴ϴ�.
//���ϸ� ��ü���� 3���� �����ҿ����Դϴ�. >> "�̸��� ������ ����ڷκ��� �Է¹ް�, ����ġ�� 0~10�߿��� ��������"
//���ϸ��� �̸�,����,����ġ�� �ֽ��ϴ�.
//po.printInfo(); --> ��ü�� po
//   -> ��ī�� Lv5. [5/100]
//���α׷��� �����ϰ� ���۽�ų�����Դϴ�. --> while
//������ ���ϸ� ��ü���� game()�� �����մϴ�.
//����ġ�� 100�̵ɶ����� ������ 1�� �����մϴ�.
//   ���� 1 ������, "��ī��, ������!" ������ ������ּ���.
//po.game(); ==> ���д� �ݹ�
//   -> ������ ����ġ�� 50~150�߿��� ������ŭ ����
//   -> ���н� ����ġ�� 10����
//+) po.game()�� ������� ���۽�Ű�� ���
//+++) po.game()�� �Է¹޾Ƽ� ���۽�Ű�� ���

// ����
// Ŭ������ ���ϸ�
// �������
// - �ν��Ͻ� ���� : �̸�, ����, ����ġ
// - Ŭ���� ���� : �ִ����ġ, �ִ뷹��(?)
// �޼���
// - �ν��Ͻ� �޼��� : ��ü���� ���, ���Ӹ޼���(����ġ), ������ �޼���(�������)
//����
// ���� , ����
// ���� = ����ġ ����, �������
// ���� = ����ġ 10, �������
// ������ �޼ҵ� = ����������
// ��ü���� : 3����
// ��ü�� : po
// �ݺ��� : while
// +�߰�
// �ΰ��� ĳ���͸� ��Ʋ�ؼ� ���и� ������ ��� ���

class Pokemon {

   String name; // �̸�
   int lev; // ����
   int exp; // ����ġ
   static int maxExp = 100; // �ִ����ġ
//   static int maxLev = 100; // �����Ѱ�
   
   
   public Pokemon() {
      Scanner sc = new Scanner(System.in);
      System.out.print("�̸��Է� : ");
      this.name = sc.nextLine(); // �̸�����
      
      System.out.print("���� �Է� : ");
      this.lev = sc.nextInt(); // ��������
      sc.nextLine();
      
      this.firstExp(); // ����ġ ����
//      this.printInfo(); // ����â ��� ->> ��� �Է¹ް� ���� ������� �ٲ�
      
      sc.close();
   }

   public Pokemon(int num) {
      this("�Ƹ����콺", num); // �̽��� ���� -> ���ü� ����...
   }

   public Pokemon(String name) {
      this(name, 100); // �̽��� ���� ����¥�� -> ���ü� ����...
   }

   public Pokemon(String name, int lev) {
      this.name = name; // �̸�����
      this.lev = lev; // ��������
      this.firstExp(); // ����ġ ����
//      this.printInfo(); // ����â ��� ->> ��� �Է¹ް� ���� ������� �ٲ�
   }

   void printInfo() { // ����â �޼���
      System.out.println(this.name + " Lv." + this.lev + " [" + this.exp + "/" + Pokemon.maxExp + "]");
   }

   void firstExp() { // �ʱ� ����ġ ����
      Random rand = new Random();
      this.exp = rand.nextInt(11);
   }

   void expUp(int exp) { // ����ġ �߰�
      this.exp += exp;

      if (this.exp >= (Pokemon.maxExp * 2)) { // ����ġ�� ���ؼ� 2����ŭ�� ���
         this.levUp();
         this.levUp();
      } else if (this.exp >= Pokemon.maxExp) { // �������� ������
         this.levUp();
      }
   }
   
   // ����� Ǯ��
//   void expUp(int exp) { // ����ġ �߰�
//      this.exp += exp;
//      
//      while (this.exp > Pokemon.maxExp) { // ����ġ�� ����ġ �� �ȿ� �� ������
//         this.levUp();
//      }
//   }

   void levUp() { // ����ġ�� ������ �������ϴ� �޼���
      System.out.println("���� ��!"); // ������ ���
      this.lev++; // ��������
      this.exp -= 100; // ����ġ ����
   }

   void game() { // ����
      Random rand = new Random(); // ������ü
      if (rand.nextInt(2) == 0) { // ��������
         System.out.println("�й�...");
         this.expUp(10);
         this.printInfo(); // ���� �� ����â ���
      } else {
         System.out.println("�¸�!");
         this.expUp(rand.nextInt(101) + 50); // ����ġ ��������
         this.printInfo();
      }
   }

   void battle() { // ���������
      // ���� ĳ���� ����
      // ���� �ȿ��� �����ؾ��ҰŰ�����?
   }

}

public class TodayFinalExercise {
   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

      Pokemon[] po = new Pokemon[3];
//      po[0] = new Pokemon("��ī��"); // -> 100��¥�� ��ī��
//      po[1] = new Pokemon("��ī����");
//      po[2] = new Pokemon("��ũ����");
//      po[0] = new Pokemon(); // -> 100��¥�� �Ƹ����콺

      System.out.println("�Է¹޴� ���ϸ����~");
      System.out.println("������ ����ġ�� ����Դϴ�");
      System.out.println("��� ����� �����̿���~");
      System.out.println("�������� ���ϸ��� �Է����ּ���");
      System.out.println("�̸��� �����Դϴ�(������ ��Ҹ�:�̸��� ������ ��ȿ���˻縦 �Ҽ��� ����....)");
      System.out.println("������ ������ 0�� �ƴϸ� �˴ϴ�(���Ѿ���)");

      for (int i = 0; i < po.length; i++) { // �ݺ�
         System.out.println("�̸��� �Է����ּ���");
         String name = sc.nextLine();
         int level = 0;

         System.out.println(name + "(��)�� �Ͻðڽ��ϱ�?");
         System.out.println("�����̸� 1�� �Է����ּ���");
         int tmp = sc.nextInt();
         sc.nextLine();

         if (tmp != 1) {
            System.out.println("�ٽ� �Է����ּ���");
            i--;
            continue;
         }

         while (true) {
            System.out.println("������ �Է����ּ���");
//         System.out.println("��� : �̻��ϰ� �Է��ϸ� �̸����� �ٽ� �Է��ؾ��մϴ�"); // �Ƹ��� ����� �� ����߾� ������
            
            level = sc.nextInt();
            sc.nextLine();

//         if (level <= 0) { // ���� ��ȿ�� �˻�
//            System.out.println("�߸��Է��ϼ̽��ϴ�");
//            System.out.println("�ٽ� �Է����ּ���");
//            i--; // Ƚ������
//            continue;
//         }
            
            if (level >= 0) {
               break;
            }
            System.out.println("�߸��Է��ϼ̽��ϴ�");
            System.out.println("�ٽ� �Է����ּ���");
         }

         po[i] = new Pokemon(name, level); // ����
         System.out.println("�ԷµǾ����ϴ�");
      }

      System.out.println("��� �Է��� �Ϸ�Ǿ����ϴ�");
      // �������
      for (int i = 0; i < po.length; i++) {
         po[i].printInfo();
      }

      while (true) {

         System.out.println();
         System.out.println("������ �÷����� ĳ���͸� �����ϼ���");
         for (int i = 0; i < po.length; i++) {            
            System.out.println((i+1) + ". " + po[i].name);
         }
         System.out.print("�����Է� : ");

         int sel = sc.nextInt()-1;
         sc.nextLine();

         if (sel < -1 || sel > 2) { // ��ȿ�� �˻�
            System.out.println("�߸��Է��ϼ̽��ϴ�");
            continue;
         } else if (sel == -1) { // ����
            System.out.println("������ �����մϴ�");
            break;
         }

         System.out.println(po[sel].name + "���� ������ �մϴ�");
         po[sel].game();

      }

      sc.close(); // ��ĳ�� ����
   } // main
}