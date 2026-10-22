package Lec53;

import java.util.Arrays;

public class Coin_Change_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int amount = 5;
		int[] coins = { 1, 2, 5 };
		int[][] dp = new int[coins.length][amount + 1];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}
		System.out.println(Coin_Change(coins, amount, 0, dp));
	}

	public static int Coin_ChangeBU(int[] coins, int amount) {
		int[][] dp = new int[coins.length + 1][amount + 1];
		for (int i = 0; i < dp.length; i++) {
			dp[i][0] = 1;
		}
		for (int i = 1; i < dp.length; i++) {// coins
			for (int am = 1; am < dp[0].length; am++) {
				int inc = 0, exc = 0;
				if (coins[i - 1] >= am) {
					inc = dp[i][am - coins[i - 1]];
				}
				exc = dp[i - 1][am];
				dp[i][am] = inc + exc;
			}

		}
		return dp[dp.length - 1][dp[0].length - 1];
	}

	public static int Coin_Change(int[] coins, int amount, int i, int[][] dp) {
		if (amount == 0) {
			return 1;
		}
		if (i == coins.length) {
			return 0;
		}
		if (dp[i][amount] != -1) {
			return dp[i][amount];
		}
		int inc = 0, exc = 0;
		if (coins[i] <= amount) {
			inc = Coin_Change(coins, amount - coins[i], i, dp);
		}
		exc = Coin_Change(coins, amount, i + 1, dp);
		return dp[i][amount] = inc + exc;
	}

}
