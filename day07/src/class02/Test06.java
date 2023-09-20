import java.util.Scanner;

//class�� : Student -> class Student {}
//�������
//- �ν��Ͻ� ���� : �̸�, ����
//- Ŭ���� ����(static)
//������
//�޼���
//- �л����� => ��ȿ�� �˻� �ʼ�
//- �л�������
//- �л�1�����
//- �л��������� => ��ȿ�� �˻� �ʼ�
//- ���α׷� ���� => main�ȿ� © ����

//main - ���忹��
//1. ��������
//   === �л��� ���α׷� ===
//   1. �л�����
//   2. �л�������
//   3. �л�1�����
//   4. �л���������
//   5. ���α׷� ����

//2. ���ɳ�
//3. �������
//- �������� �Է°� => ��ȿ�� �˻� �ʼ�
//- �л��� == Student�迭[3]
//- �߰��� �Է°��� ���� �� ����� ����

class Student {

	String name; // �л� �̸�
	int score; // �л� ����

	public Student(String name, int score) { // �л�����
		this.name = name;
		this.score = score; 
	}

	void printStudent() { // �л� 1�� ��� �޼ҵ�
		System.out.println(this.name +"�л� "+ this.score + "��");
	}

	void changeScore() { // �л� ���� ���� �޼ҵ�

	}

} // Student

public class Test06 {
	public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

      Student[] stu = new Student[3];
      int select; // ó�� ���ð� ���� �� �������� �� ��!
      int index = 0; // �Էµ� �л� �� Ȯ�ο�
      int tmp; // �߰��� �Է°��� �޾ƾ� �� �� �󸶵��� �����ص� �Ǵ� �Լ�

      while (true) { // ���ѹݺ�
         System.out.println("==== �л��� ���α׷� ====");
         System.out.println("1. �л� ����");
         System.out.println("2. �л���� ���");
         System.out.println("3. �л� 1�� ���");
         System.out.println("4. �л� ���� ����");
         System.out.println("5. ���α׷� ����");

         select = sc.nextInt(); // ���� ���ð� �Է� --> �����ϸ� �ȵ�

         if (select == 1) { // �л�����
        	 
        	 if(index == 0) {
        		 System.out.println("�Էµ� ���� �����ϴ�");
        		 continue;
        	 }
        	 for (int i = 0; i < stu.length; i++) {
        		 System.out.println("�л��� �̸��� �Է����ּ���");
        		 String name = sc.next();
        		 System.out.println("�л��� ������ �Է����ּ���");
        		 int score = sc.nextInt();
        		 stu[i] = new Student(name, score);
			}
         }
         
         if (select == 2) { // �л�������
            if(index == 0) {
            	System.out.println("�л��� ������ �����ϴ�");
            	continue;
            }
            System.out.println("===�л����===");
            for (int i = 0; i < stu.length; i++) {
				System.out.println((i+1) + "��.");
            	stu[i].printStudent(); // ���� �ҷ�����
			}
        	
         }
         
         if (select == 3) { // �л�1�� ���
            if(index == 0) {
            	System.out.println("�л� ��Ͽ� �����ϴ�");
            }
            System.out.println("�л��� ��ȣ�� ���� ���ּ���");
            int num = sc.nextInt();
            stu[num-1].printStudent();
         }
         
         if (select == 4) { // �л���������

         }
         
         if (select == 5) { // ���α׷� ����
            System.out.println("���α׷��� �����մϴ�");
            break; // �ݺ� ����
         } 
         
         if (select > 5 || select < 1) { // �Է°��� �߸��Ǿ�����
            System.out.println("�߸��� �Է°��Դϴ�");
            System.out.println("�ٽ� �Է��� �ֽʽÿ�");
         }
         
      } // while

   }

// main