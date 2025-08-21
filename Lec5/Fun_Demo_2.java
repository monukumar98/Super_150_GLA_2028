package Lec5;

public class Fun_Demo_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		int a = 7;
		int b = 9;
//		int x = add(a, b);
//		System.out.println(x);
		System.out.println(add(b, a));
		System.out.println("Bye");

	}

	public static int add(int a, int b) {
		int c = a + b;
		return c - sub(c, a);
	}

	public static int sub(int a, int b) {
		int c = a - b;
		return c;
	}

}




