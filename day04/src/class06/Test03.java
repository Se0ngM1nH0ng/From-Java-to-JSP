package class06;

public class Test03 {

	public static void printGrade(int score) {
	      if(score<0 || 100<score) { // 유효성 검사
	         System.out.println("점수가 유효하지않습니다! 확인이 필요합니다!");
	         return; // 함수를 즉시종료하겠습니다. // 여기서 멈춤
	      }

	      char grade='C'; // 나머지 점수의 등급을 기본값을 C로 맞춤
	      
	      if(80<=score) { // 점수가 80이상이면
	         grade='A'; // 등급이 A이다 
	      }
	      else if(60<=score) {// 점수가 60이상이면 
	         grade='B'; // 등급이 B이다
	      }
	      
	      System.out.println(score+"점은 "+grade+"등급입니다.");
	   } // ㅁㅁ 점은 ㅁㅁ 등급이다 !
	
   public static void main(String[] args) {

      printGrade(811);
      printGrade(81);
      printGrade(68);
      printGrade(1);

   }
}