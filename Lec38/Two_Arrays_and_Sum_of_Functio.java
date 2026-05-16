package Lec38;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Two_Arrays_and_Sum_of_Functio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		Integer[] b = new Integer[n];
		long mod = 998244353;
		for (int i = 0; i < b.length; i++) {
			long x = sc.nextLong();
			a[i] = x*(i + 1) * (n - i) ;
		}
		for (int i = 0; i < b.length; i++) {
			b[i] = sc.nextInt();
		}
		Arrays.sort(a);
		Arrays.sort(b, Collections.reverseOrder());
		long sum = 0;
		for (int i = 0; i < b.length; i++) {
			sum = (sum + (a[i] % mod) * b[i]) % mod;
		}
		System.out.println(sum);
	}

}
