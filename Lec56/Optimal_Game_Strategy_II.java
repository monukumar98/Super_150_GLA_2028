package Lec56;

public class Optimal_Game_Strategy_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4 };
		System.out.println(f(arr, 0, arr.length - 1));
	}

	private static int f(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		if (i >= j) {
			return 0;
		}
		if (i + 1 == j) {
			return Math.max(arr[i], arr[j]);
		}
		int x = arr[i] + Math.min(f(arr, i + 2, j), f(arr, i + 1, j - 1));
		int y = arr[j] + Math.min(f(arr, i + 1, j - 1), f(arr, i, j - 2));
		return Math.max(x, y);
	}

}
