package class06;

// 연습문제1) 
// 1. abs()라는 함수가 있습니다. // 함수명
// 2. 정수를 넣으면, 넣은 정수의 절대값을 반환해주는 기능을 수행합니다.
// 3. 해당함수를 선언(정의)해주세요!~~ // 정수를 넣으면 = input, 반환 = return

public class Test05 {
   
//   public static int abs(int num) {
//      if(num<0) {
//         num*=(-1);
//      }      
//      return num;
//      
//      // return num>0? num:num*(-1);
//   }
   
   
   public static int abs(int num) {
	   if(num < 0) {
		   num *= (-1);
	   }
	   return num;
   }
   
   public static void main(String[] args) {
      
      

   }
}