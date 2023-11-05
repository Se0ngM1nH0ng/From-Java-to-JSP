package class06;

public class Test02 {
	
	public static void func(int a) {
		a=100;
		System.out.println("func()입니다. a= "+a);
	}
	
	public static void main(String[] args) {
				
		int a=10;
		System.out.println("a= "+a);
		func(a);
		System.out.println("a= "+a);
		func(++a); // 전위가 먼저 올라가므로 
		System.out.println("a= "+a);
		
		
	}
}
