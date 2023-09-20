package class01;

public class Test02 {

	public static void main(String[] args) {

		int[] data = new int[3];
		for (int i = 0; i < 3; i++) {
			data[i]=i+1;
		}
		try {
			System.out.println(data[3]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("해당 인덱스는 없는 인덱스 입니다.");
		}
		finally {
			System.out.println("예외 발생여부와 무관하게 항상 수행되는 코드 ");
		}
		
		
	}

}
