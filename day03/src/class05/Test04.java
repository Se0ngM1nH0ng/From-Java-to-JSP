package class05;

import java.util.Random;

public class Test04 {

	public static void main(String[] args) {
		// 중복없이 데이터 생성하기
		int[] data=new int[3];

	      Random rand=new Random();
	      int index=0; // 현재위치
	      while(true) {
	         if(index == data.length) { // 배열이 가득찼다면
	            break;
	         }

	         data[index]=rand.nextInt(10)+1;

	         boolean flag=false;

	         for(int i=0;i<index;i++) { // 처음부터 지금까지 중복이 있니
	            if(data[index]==data[i]) { // 특별한 일 : 중복발생
	               flag=true;
	            }
	         }

	         if(flag) {
	            continue;
	         }


	         index++;
	      }

	      for(int v:data) {
	         System.out.println(v);
	      }


			
			
			
			
		}
		
		
		
		
		
		
		
		
	}


