package class06;

public class Test03 {

	public static void main(String[] args) {
		int a=20;
		int b=30;
		int c=++a - b--;
		int d=a-- * ++c;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}

}