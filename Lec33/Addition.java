package Lec33;

public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(2, 7));
		System.out.println(add(2, 7, 9));
		System.out.println(add(2, 7, 19.9));
		System.out.println(add(2, 7, 9, 2, 2, 2, 2, 2, 2, 2, 1, 2, 2, 2, 1));

	}

	public static int add(int a, int b) {
		return a + b;
	}

	public static int add(int a, int b, int c) {
		return a + b + c;
	}

	public static int add(int a, int b, double c) {
		return (int) (a + b + c);
	}

	public static int add(int x, int... a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		return sum;
	}

}
