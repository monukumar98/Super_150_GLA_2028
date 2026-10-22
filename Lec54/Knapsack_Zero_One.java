package Lec54;

import java.util.Arrays;

public class Knapsack_Zero_One {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] wt = { 1, 2, 3, 2, 2 };
		int[] value = { 8, 4, 0, 5, 3 };
		int cap = 4;
		int[][] dp = new int[wt.length][cap + 1];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}
		System.out.println(Knapsack(wt, value, cap, 0, dp));
	}

	public static int Knapsack(int[] wt, int[] value, int cap, int i, int[][] dp) {
		if (i == wt.length || cap == 0) {
			return 0;
		}
		if (dp[i][cap] != -1) {
			return dp[i][cap];
		}
		int inc = 0, exc = 0;
		if (cap >= wt[i]) {
			inc = value[i] + Knapsack(wt, value, cap - wt[i], i + 1, dp);
		}
		exc = Knapsack(wt, value, cap, i + 1, dp);
		return dp[i][cap] = Math.max(inc, exc);
	}

}
