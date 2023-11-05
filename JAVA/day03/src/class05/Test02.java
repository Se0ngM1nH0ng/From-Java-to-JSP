package class05;

import java.util.Random;

public class Test02 {

	public static void main(String[] args) {
		
		// 강사님 풀이
		/*
		[문제]
		1. 주석
		2. 한글풀이

		1) 이 배열의 이름은 data 이고
		2) 3~5개까지중에서 랜덤으로 크기를 결정
		   ex) 3 --->> [ _ _ _ ]
		3) data에 저장되는 정수는 100~105 사이의 랜덤수가 저장됨
		   ex) [ 102 100 100 ]
		4) A- 데이터가 홀수들의 총합
		5) B- 데이터가 짝수들의 평균

		console)
		 [ 102 100 100 ]
		 홀수총합 : 0
		 짝수평균 : 100.666667


		 */

		      Random rand=new Random();
		      int randNum=rand.nextInt(3)+3;
		      int[] data=new int[randNum];
		      
		      System.out.print("[ ");
		      for(int i=0;i<data.length;i++) {
		         data[i]=rand.nextInt(6)+100;
		         System.out.print(data[i]+" ");
		      }
		      System.out.println("]");
		      
		      int oSum=0; // 홀수 총합
		      int eSum=0; // 짝수 총합
		      int eCnt=0; // 짝수 개수
		      double eAvg; // 변수 3요소에 '값'은 없습니다!
		      
		      for(int v:data) { //forEach문
		         if(v%2==0) {
		            eSum+=v; //짝수면 짝수 총합에
		            eCnt++; // 짝수 개수
		         }
		         else {
		            oSum+=v; // 홀수 총합
		         }
		      }
		      
		      eAvg=eSum*1.0/eCnt; //짝수 평균
		      
		      System.out.println("홀수총합 : "+oSum);
		      System.out.println("짝수평균 : "+eAvg);
		      
		      
		      
		      
		      
		      
		      

	}

}
