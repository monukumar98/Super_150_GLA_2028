package Lec5;

public class Fun_Demo_3 {
	static int val = 100;;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		int a = 7;
		int b = 9;
		System.out.println(val);
		System.out.println(add(b, a));
		System.out.println(val);
		System.out.println("Bye");

	}

	public static int add(int a, int b) {
		int c = a + b;
		int val = 80;
		Fun_Demo_3.val = Fun_Demo_3.val - 5;
		return c - sub(c, a);
	}

	public static int sub(int a, int b) {
		int c = a - b;
		return c;
	}

}
