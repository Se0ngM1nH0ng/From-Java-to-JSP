package class01;

import java.util.ArrayList;

public class Test01 {

	public static void main(String[] args) {

//		int[] data = new int [3]; // data에는 주소가 들어가 있고 heap메모리에 3칸 배열을 만들었다
//		data[0]=10;
//		data[1]=20;
//		data[2]=30;
//		System.out.println(data);
//		
//		data[3]=40;  // 3칸으로 고정해놨기때문에 넣을수 없다
//		System.out.println(data[3]); 
		
		
		// 향상된 배열 == 배열리스트
		// 객체 지향 언어라서 객체가 사용하는 언어를 많이 씀
		// 1. 데이터를 마음대로 저장가능 
		// 2. toString() 오버라이딩 되어있다 //예쁘게 출력된다.
		// 3.add(), remove(), clear(), size(), get()..과 같은 다양한 기능의 메서드를 기본제공
		// 4. 서로 다른 자료형(타입)들도 저장은 가능
		//   	=> 그러나, 반드시, 서로 같은 자료형만 취급 해야한다 실무에선 !!
		//     => 못쓰게 막아놓던지 .. 그래서 " 강제성" 을 부여하여 사용한다!!!
		// ★ 제네릭 <> : 일반화 라고도 번역이 되는데 ,,, 배열리스트에 저장될 타입을 강제 
		// ex) <String> , <Integer> ,,, 등등
		// 제네릭은 클래스를 사용하기 때문에 wrapper 클래스 로 사용해야한다.
		// 값을 감싸는 클래스 
		ArrayList<Integer> data = new ArrayList<Integer>(); //C + S + O import
		data.add(10);
		data.add(0, 20); // 인덱스 0번에 20넣기 
		data.add(0, 30); // 인덱스 0번에 30넣기 // 한칸씩 뒤로 밀림
		data.clear();
		data.add(10);
		System.out.println(data.isEmpty()); // 이거 비어있니? T/F
		System.out.println(data); // toString이 오버라이딩 되어 있다 
		System.out.println(data.get(0));
		data.remove(0);
		System.out.println(data.size());
		
//		data.add("사과");
		data.add(10);
//		data.add(3.14);
		System.out.println(data);
		
		
		
		
		
		
		
	}

}
