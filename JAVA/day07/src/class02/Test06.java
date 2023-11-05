import java.util.Scanner;

//class명 : Student -> class Student {}
//멤버변수
//- 인스턴스 변수 : 이름, 점수
//- 클래스 변수(static)
//생성자
//메서드
//- 학생생성 => 유효성 검사 필수
//- 학생목록출력
//- 학생1명출력
//- 학생점수변경 => 유효성 검사 필수
//- 프로그램 종료 => main안에 짤 예정

//main - 팀장예정
//1. 목차생성
//   === 학생부 프로그램 ===
//   1. 학생생성
//   2. 학생목록출력
//   3. 학생1명출력
//   4. 학생점수변경
//   5. 프로그램 종료

//2. 스케너
//3. 멤버변수
//- 목차선택 입력값 => 유효성 검사 필수
//- 학생부 == Student배열[3]
//- 추가로 입력값이 있을 때 사용할 변수

class Student {

	String name; // 학생 이름
	int score; // 학생 점수

	public Student(String name, int score) { // 학생생성
		this.name = name;
		this.score = score; 
	}

	void printStudent() { // 학생 1명 출력 메소드
		System.out.println(this.name +"학생 "+ this.score + "점");
	}

	void changeScore() { // 학생 점수 변경 메소드

	}

} // Student

public class Test06 {
	public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

      Student[] stu = new Student[3];
      int select; // 처음 선택값 받은 뒤 변경하지 말 것!
      int index = 0; // 입력된 학생 수 확인용
      int tmp; // 추가로 입력값을 받아야 할 때 얼마든지 변경해도 되는 함수

      while (true) { // 무한반복
         System.out.println("==== 학생부 프로그램 ====");
         System.out.println("1. 학생 생성");
         System.out.println("2. 학생목록 출력");
         System.out.println("3. 학생 1명 출력");
         System.out.println("4. 학생 점수 변경");
         System.out.println("5. 프로그램 종료");

         select = sc.nextInt(); // 목차 선택값 입력 --> 변경하면 안됨

         if (select == 1) { // 학생생성
        	 
        	 if(index == 0) {
        		 System.out.println("입력된 값이 없습니다");
        		 continue;
        	 }
        	 for (int i = 0; i < stu.length; i++) {
        		 System.out.println("학생의 이름을 입력해주세요");
        		 String name = sc.next();
        		 System.out.println("학생의 점수를 입력해주세요");
        		 int score = sc.nextInt();
        		 stu[i] = new Student(name, score);
			}
         }
         
         if (select == 2) { // 학생목록출력
            if(index == 0) {
            	System.out.println("학생의 정보가 없습니다");
            	continue;
            }
            System.out.println("===학생목록===");
            for (int i = 0; i < stu.length; i++) {
				System.out.println((i+1) + "번.");
            	stu[i].printStudent(); // 정보 불러오기
			}
        	
         }
         
         if (select == 3) { // 학생1명 출력
            if(index == 0) {
            	System.out.println("학생 목록에 없습니다");
            }
            System.out.println("학생의 번호를 선택 해주세요");
            int num = sc.nextInt();
            stu[num-1].printStudent();
         }
         
         if (select == 4) { // 학생점수변경

         }
         
         if (select == 5) { // 프로그램 종료
            System.out.println("프로그램을 종료합니다");
            break; // 반복 종료
         } 
         
         if (select > 5 || select < 1) { // 입력값이 잘못되었을때
            System.out.println("잘못된 입력값입니다");
            System.out.println("다시 입력해 주십시오");
         }
         
      } // while

   }

// main