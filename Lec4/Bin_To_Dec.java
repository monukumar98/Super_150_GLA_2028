package Lec4;

public class Bin_To_Dec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10011;
		int sum = 0;
		int mul = 1;
		while (n > 0) {
			int rem = n % 10;
			sum = sum + rem * mul;
			mul = mul * 2;
			n = n / 10;

		}
		System.out.println(sum);
	}

}
