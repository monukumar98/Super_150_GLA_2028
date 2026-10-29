package Lec55;

//Given n wines in a row, with integers denoting the cost of each wine respectively
//Each year you can sell the first or the last wine in the row. Let the initial profits from the wines be P1, P2, P3…Pn. In the Yth year,
//the profit from the ith wine will be Y*P[i]. The goal is to calculate the maximum profit that can be earned by selling all the wines.
//Suppose, wine array denotes the initial cost of each wine in the first year.
//wine[] = [2, 3, 5, 1, 4]
public class Wine_Problems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] wine = { 2, 3, 5, 1, 4 };
		int[][] dp = new int[wine.length][wine.length];
		System.out.println(maximum_profit(wine, 0, wine.length - 1, 1, dp));

	}

	public static int maximum_profit(int[] wine) {
		int[][] dp = new int[wine.length][wine.length];
		int year = wine.length;
		for (int i = 0; i < dp.length; i++) {
			dp[i][i] = wine[i] * year;
		}
		year--;
		for (int gap = 1; gap < dp.length; gap++) {
			for (int j = gap; j < dp.length; j++) {
				int i = j - gap;
				int f = wine[i] * year + dp[i + 1][j];
				int l = wine[j] * year + dp[i][j - 1];
				dp[i][j] = Math.max(f, l);
			}
			year--;
		}
		return dp[0][dp.length - 1];
	}

	public static int maximum_profit(int[] wine, int i, int j, int year, int[][] dp) {
		if (i > j) {
			return 0;
		}
		if (dp[i][j] != 0) {
			return dp[i][j];
		}
		int f = wine[i] * year + maximum_profit(wine, i + 1, j, year + 1, dp);
		int l = wine[j] * year + maximum_profit(wine, i, j - 1, year + 1, dp);
		return dp[i][j] = Math.max(f, l);

	}

}
