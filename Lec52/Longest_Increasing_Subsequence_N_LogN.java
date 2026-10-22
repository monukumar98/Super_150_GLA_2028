package Lec52;

public class Longest_Increasing_Subsequence_N_LogN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 0, 8, 4, 2, 12, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15 };
		System.out.println(LIS(arr));
	}

	public static int LIS(int[] arr) {
		int n = arr.length;
		int[] dp = new int[n];
		dp[0] = arr[0];
		int len = 1;
		for (int i = 1; i < arr.length; i++) {
			if (dp[len - 1] < arr[i]) {
				dp[len] = arr[i];
				len++;
			} else {
				int idx = BinarySearch(dp, 0, len - 1, arr[i]);
				dp[idx]=arr[i];
			}
		}
		return len;
	}

	private static int BinarySearch(int[] dp, int i, int j, int item) {
		// TODO Auto-generated method stub
		int ans = 0;
		while (i <= j) {
			int mid = (i + j) / 2;
			if (dp[mid] >= item) {
				ans = mid;
				j = mid - 1;
			} else {
				i = mid + 1;
			}
		}
		return ans;

	}
}
