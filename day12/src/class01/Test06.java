package class01;

import java.util.ArrayList;
import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> data=new ArrayList<Integer>();

		while(true) {
			System.out.print("입력) ");
			int num=sc.nextInt();
			if(num==0) {
				break;
			}
			data.add(num);
		}

		int sum=0;
		/*
      for(int i=0;i<data.size();i++) {
         sum+=data.get(i);
      }
		 */
		for(int v:data) {
			sum+=v;
		}
		double avg=sum*1.0/data.size(); //Array배열에 사이즈,크기
		System.out.println("평균: "+avg);

		// 처음부터 끝까지 돌면서
		// data의 모든 요소를 확인할거야~ 배열크기가 자꾸 변화하니까 언제 까지 할지 모른다
		// [ a b c ] 요소 b를 삭제
		// [ a c ] 삭제한 인덱스부터 재확인!
//		for(int i=0;i<data.size();i++) {
//			if(data.get(i)%2==1) { // 배열리스트에 기본제공되는 인덱스번호값 불러오기 
//				data.remove(i);
//				i--;
//			}
//		}
		
		int index=0; // 인덱스 번호
		while(index<data.size()) { // 인덱스번호가 data의 사이즈 만큼 돌때
			if(data.get(index)%2 ==1) {//삭제해야하는일이 발생했다면 //홀수일때
				data.remove(index); // 삭제한다
				continue; // 아래로 가면 안된다.
			}
			index++;
		}
		System.out.println(data);

	
	}
}