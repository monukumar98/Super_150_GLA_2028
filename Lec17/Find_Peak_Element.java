package Lec17;

public class Find_Peak_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 1, 3, 5, 6, 4 };

	}

	public static int Peak_Element(int[] arr) {
		long max = Long.MIN_VALUE;
		int pi = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				pi = i;
			}
		}
		return pi;

	}

	public static int Peak_Element2(int[] arr) {
		int lo = 0, hi = arr.length - 1, ans = arr.length - 1;
		while (lo < hi) {
			int mid = (lo + hi) / 2;
			if (arr[mid] > arr[mid + 1]) {
				ans = mid;
				hi = mid;
			} else {
				lo = mid + 1;
			}
		}
		return ans;

	}
}
