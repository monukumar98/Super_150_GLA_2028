package Lec53;

public class Uncrossed_Lines {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = { 1, 4, 2 };
		int [] nums2 = { 1, 2, 4 };
	}
	public static int LCSBU(int [] s1, int [] s2) {
		int[][] dp = new int[s1.length + 1][s2.length + 1];
		for (int i = 1; i < dp.length; i++) {
			for (int j = 1; j < dp[0].length; j++) {
				if (s1[i-1] == s2[j-1]) {
					dp[i][j] = 1 + dp[i - 1][j - 1];
				}
				else {
					int f1 = dp[i-1][j];
					int f2 = dp[i][j-1];
					dp[i][j]=Math.max(f1, f2);
				}
			}
		}
		return dp[dp.length-1][dp[0].length-1];

	}

}
