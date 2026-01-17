package Lec19;

public class fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		System.out.println(fac(n));

	}

	public static int fac(int n) {
		// Base Case
		if (n == 0) {
			return 1;
		}
		int f = fac(n - 1);// SP
		return f * n;

	}

}
