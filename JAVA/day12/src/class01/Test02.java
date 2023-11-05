package class01;

import java.util.HashSet;

public class Test02 {

	public static void main(String[] args) {
		// 추상클래스 Set
		// Set류의 부모클래스
		// Set 은 추상클래스 이기 때문에 new 로 만들수가 없다.
		HashSet data = new HashSet(); // 자식인 하위 클래스로 저장하면 된다.
		
		// 집합 (Set)
		// 1. 순서가 없음(index XXX)
		// 2. 중복 허용하지 않는다 XX ex ) 원카드 중복 없이 할때 사용됨
		// 3. 다양한 자료형 저장 가능
		// 			-> but, 이렇게 사용하지않음!!!
		//  		=> 제네릭 <> 함께 사용  
		data.add(10);
		data.add(10);
		data.add(10);
		data.add(1234);
		data.add(1);
		data.add(2);
		data.add(12);
		data.add(13);
		data.add(11));
		data.add("apple");
		
		System.out.println(data);
		System.out.println(data.size());
	}

}
