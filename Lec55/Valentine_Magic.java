package Lec55;

import java.util.Arrays;

public class Valentine_Magic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] boys = { 2, 11, 3 };
		int[] girls = { 5, 7, 3, 2 };
		Arrays.sort(boys);
		Arrays.sort(girls);
		System.out.println(min_diff(boys, girls, 0, 0));

	}

	public static int min_diff(int[] boys, int[] girls, int i, int j) {
		if (i == boys.length) {
			return 0;
		}
		if (j == girls.length) {
			return 999999;
		}
		int sel = Math.abs(boys[i] - girls[j]) + min_diff(boys, girls, i + 1, j + 1);
		int rej = min_diff(boys, girls, i, j + 1);
		return Math.min(sel, rej);

	}

}
