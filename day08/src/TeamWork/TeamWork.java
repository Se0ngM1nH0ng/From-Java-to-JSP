package TeamWork;

import java.util.Scanner;

class Student {

   int num; // �л� ��ȣ
   String name; // �л� �̸�
   int score; // �л� ����

   public Student(int num, String name, int score) { // �л� ����
      this.num = num;
      this.name = name;
      this.score = score;
   }

   void printStudent() { // �л� 1�� ��� �޼���
      System.out.println(this.num + "�� " + this.name + " " + this.score + "��");
   }

   void changeScore(int score) { // �л� ���� ���� �޼���
      this.score = score;
   }

   int printScore() { // main���� �л� �������� �������� �޼���
      return this.score;
   }

} // Student

public class TeamWork {
   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

      Student[] stu = new Student[3];
      int select; // ���ð� ����뵵
      int index = 0; // �Էµ� �л� �� Ȯ�ο�

      while (true) { // ���ѹݺ�
         System.out.println("==== �л��� ���α׷� ====");
         System.out.println("1. �л���� ���");
         System.out.println("2. �л� 1�� ���");
         System.out.println("3. ���α׷� ����");
         System.out.println("====================");

         select = sc.nextInt(); // ���� ���ð� �Է�
         sc.nextLine(); // ����ó��

         if (select == 1) { // �л�������
            if (index == 0) { // �Էµ� �л��� ������
               System.out.println("����� �л������ �����ϴ�!");
               continue; // ó������
            }

            System.out.println("=== �л���� ===");
            for (int i = 0; i < index; i++) { // ��ϵ� �л��� ��ŭ
               stu[i].printStudent(); // �л� ��� ���
            }
            System.out.println("==============");
         } // �л� ��� ��� �Ϸ�

         else if (select == 2) { // �л�1�� ���
            int num = 0;
            if (index == 0) { // �Էµ� �л��� ������
               System.out.println("����� �л������ �����ϴ�!");
               continue; // ó������
            }

            System.out.print("�л���ȣ�� �Է����ּ��� : ");
            num = sc.nextInt() - 1; // �л� �ε�����ȣ
            sc.nextLine(); // ���� �Է°� ó�� == ���� ó��

            if (num >= stu.length || num < 0) { // �Է¹�ȣ�� ��ȿ���� ���� ��
               System.out.println("�ش� ��ȣ�� ��ȿ���� ���� ��ȣ�Դϴ�");
               continue; // ó������
            } else if (num >= index) { // �Է¹�ȣ�� �������� ���� ��
               System.out.println((num + 1) + "�� �л��� ������ �������� �ʽ��ϴ�");
               continue; // ó������
            }
            stu[num].printStudent(); // �л� ���� ��� �޼���
         }

         else if (select == 3) { // ���α׷� ����

            System.out.println("���α׷��� �����մϴ�");
            break; // �ݺ� ����
         }

         else if (select == 777) { // ������ ���
            int count = 0; // ��й�ȣ Ʋ�� Ƚ��

            while (true) { // ��й�ȣ �Է� �ݺ���

               System.out.print("Password : "); // ��й�ȣ
               int password = sc.nextInt(); // �ӽú���
               sc.nextLine(); // ����ó��

               if (password == 1234) { // ������ ���
                  System.out.println("������ ����Դϴ�.");

                  while (true) { // ������ ������
                     System.out.println();
                     System.out.println("==== �л��� ���α׷� ������ ��� ====");
                     System.out.println("1. �л� ����");
                     System.out.println("2. �л���� ���");
                     System.out.println("3. �л� ���� ����");
                     System.out.println("4. ������ ��� ����");
                     System.out.println("==============================");

                     System.out.print("�Է� : ");
                     select = sc.nextInt(); // �Է°�
                     sc.nextLine(); // ����ó��

                     if (select == 1) { // �л�����
                        String name; // �̸� �ӽú���
                        int score; // ���� �ӽú���

                        while (true) {
                           if (index == stu.length) {// �л��� ���� �ִ� �л��� ���� ����
                              System.out.println("�л��� 3������� ���� �� �ֽ��ϴ�..");
                              break;// ����
                           }
                           System.out.println((index + 1) + "�� �л��� �̸��� �Է����ּ���");
                           System.out.print("�Է� : ");
                           name = sc.next();// �л� �̸� �Է�
                           sc.nextLine(); // ����ó��

                           while (true) {// �л��̸� ��ȿ�� �˻�
                              int tmp;

                              System.out.println("���� " + name + " �л����� �Ͻðڽ��ϱ�?");
                              System.out.println("1) �� 2) �ƴϿ�");
                              tmp = sc.nextInt();
                              sc.nextLine(); // ����ó��

                              if (tmp == 1) {// ��
                                 break;
                              } else if (tmp == 2) {// �ƴϿ�
                                 name = "";
                                 System.out.println("�̸��� �ٽ� �Է����ּ���");
                                 break;
                              } else { // �Է°��� �߸��Ǿ��ٸ�
                                 System.out.println("�߸��� �Է��Դϴ�");
                                 System.out.println("�ٽ� �Է����ּ���...");
                                 continue;// �߸��� �Է��̶�� �� �ƴϿ� �ٽ� �����
                              } // end if
                           } // end while

                           if (name.equals("")) { // �̸��� ������ִٸ� �Էºκ����� ���ư���
                              continue; // �ٽ� �̸� �Է¹ޱ�
                           }

                           while (true) {
                              System.out.println("������ �Է����ּ���.");
                              System.out.print("�Է� : ");
                              score = sc.nextInt(); // ���� �Է� ����
                              sc.nextLine(); // ����ó��

                              if (score < 0 || score > 100) {// ������ ��ȿ�� �˻�

                                 System.out.println("������ 0�� �̸� �Ǵ� 100���� �ʰ��� �� �����ϴ�..");
                                 continue; // �ٽ� �Է�

                              } else {
                                 break;
                              } // ���� ��ȿ�� �˻� �Ϸ�

                           } // end while
                           stu[index] = new Student(index + 1, name, score);// ��ȣ, �̸��� ������ ��ü �迭�� ����

                           stu[index].printStudent(); // �л��������
                           System.out.println( // ����� �л��� �ȳ�
                                 (index + 1) + "�� �ԷµǾ��ֽ��ϴ�. ������ " + (3 - (index + 1)) + "�� ��ŭ �Է��� �� �ֽ��ϴ�.");
                           index++;// ���� ���� -> �ε��� �� ����
                           break;
                        } // end while

                     } // �л� ���� �Ϸ�

                     else if (select == 2) { // �л�������
                        if (index == 0) { // �Էµ� �л��� ������
                           System.out.println("����� �л������ �����ϴ�!");
                           continue; // ó������
                        }

                        System.out.println("=== �л���� ===");
                        for (int i = 0; i < index; i++) { // ��ϵ� �л��� ��ŭ
                           stu[i].printStudent(); // �л� ��� ���
                        }
                        System.out.println("==============");
                     } // �л� ��� ��� �Ϸ�

                     else if (select == 3) { // �л���������

                        if (index == 0) { // �Էµ� �л��� ������
                           System.out.println("���� ������ �л������ �����ϴ�!");
                           continue; // ó������
                        }
                        while (true) {
                           System.out.println("�� �� �л��� ������ �����Ͻðڽ��ϱ�?");
                           for (int i = 0; i < index; i++) { // �л� ���� ���
                              stu[i].printStudent();
                           }
                           int cnt = sc.nextInt(); // �� ��° �л��� ������ ������
                           sc.nextLine(); // ����ó��

                           if (cnt <= 0 || cnt > stu.length) { // ���� �������� ���� ���̳�, �迭 ������ �Ѵ´ٸ�
                              System.out.println("��ȿ���� ���� ���Դϴ�");
                              System.out.println("�ٽ� �������ּ���");
                              continue; // �ٽ� ����
                           } else if (cnt > index) { // �������� ���� �迭��ȣ
                              System.out.println("�л� ������ �����ϴ�");
                              System.out.println("�ٽ� �������ּ���");
                              continue;
                           }

                           int score = stu[cnt - 1].printScore(); // ���� �ҷ�����
                           System.out.println(cnt + " �� �л��� ���� ������ " + score + " �Դϴ�.");
                           while (true) {
                              System.out.println("�� ������ �����Ͻðڽ��ϱ�?");

                              int change = sc.nextInt(); // ����� �Է�
                              sc.nextLine(); // ����ó��

                              if (change < 0 || change > 100) { // ���� ��ȿ�� Ȯ��
                                 System.out.println("������ 0~100�� �����Դϴ�.");
                                 System.out.println("�ٽ� �������ּ���");
                                 continue;
                              }
                              stu[cnt - 1].changeScore(change); // ���� �� ����
                              score = stu[cnt - 1].printScore(); // ���� �ҷ����� --> ������ ����� �Ǿ����� Ȯ��

                              System.out.println(cnt + " �� �л��� ������ " + score + "�� ����Ǿ����ϴ�.");

                              break;
                           }
                           break;
                        }

                     } // �����ڸ�� 3

                     else if (select == 4) { // �����ڸ�� ����
                        System.out.println("�����ڸ�带 �����մϴ�");
                        break;
                     }

                     else { // �Է°��� �߸��Ǿ�����
                        System.out.println("�߸��� �Է°��Դϴ�");
                        System.out.println("�ٽ� �Է��� �ֽʽÿ�");
                     } // �����ڸ�� ���� ����
                  } // ������ ������ ����
                  break; // ��й�ȣ �Է� �����ϰ� ó������

               } else { // ������ password �� Ʋ���� ��
                  System.out.println("Wrong password");
                  count++; // ù��° �Է� Ʋ������ 1
               } // �����ڸ�� ���ӽ���

               if (count == 3) { // ��й�ȣ�� 3ȸ Ʋ�ȴٸ�
                  System.out.println("ó������ ���ư��ϴ�");
                  count = 0;
                  break; // �ݺ�����
               }
            } // ��й�ȣ �Է� �ݺ�

         } else { // �Է°��� �߸��Ǿ�����
            System.out.println("�߸��� �Է°��Դϴ�");
            System.out.println("�ٽ� �Է��� �ֽʽÿ�");
         } // ����ڸ�� ���� ����

      } // while
      sc.close(); // ���ɳ� ����
   } // main

} // class