package Lec54;

import java.util.Arrays;

public class Edit_Distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "FOOD";
		String t = "MONEY";
		int[][] dp = new int[s.length()][t.length()];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}
         System.out.println(Min_Ops(s, t, 0, 0, dp));
	}

	public static int Min_Ops(String s, String t, int i, int j, int[][] dp) {
		if (i == s.length()) {
			return t.length() - j;
		}
		if (j == t.length()) {
			return s.length() - i;
		}
		if (dp[i][j] != -1) {
			return dp[i][j];
		}
		int ans = 0;
		if (s.charAt(i) == t.charAt(j)) {
			ans = Min_Ops(s, t, i + 1, j + 1, dp);// dp[i-1][j-1]
		} else {
			int D = Min_Ops(s, t, i + 1, j, dp);// dp[i-1][j]
			int R = Min_Ops(s, t, i + 1, j + 1, dp);// dp[i-1][j-1]
			int I = Min_Ops(s, t, i, j + 1, dp);// dp[i][j-1]
			ans = Math.min(R, Math.min(D, I)) + 1;
		}
		return dp[i][j] = ans;

	}

}
