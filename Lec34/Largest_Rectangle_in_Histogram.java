package Lec34;

import java.util.Stack;

public class Largest_Rectangle_in_Histogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 1, 5, 6, 2, 3 };

	}

	public static int Largest_Rectangle(int[] arr) {
		Stack<Integer> st = new Stack<>();
		int ans = 0;
		for (int i = 0; i < arr.length; i++) {
			while (!st.isEmpty() && arr[i] < arr[st.peek()]) {
				int r = i;
				int h = arr[st.pop()];
				if (st.isEmpty()) {
					ans = Math.max(ans, h * r);
				} else {
					int l = st.peek();
					ans = Math.max(ans, h * (r - l - 1));
				}
			}
			st.push(i);

		}
		int r = arr.length;
		while (!st.isEmpty()) {
			int h = arr[st.pop()];
			if (st.isEmpty()) {
				ans = Math.max(ans, h * r);
			} else {
				int l = st.peek();
				ans = Math.max(ans, h * (r - l - 1));
			}
		}
		return ans;

	}

}
