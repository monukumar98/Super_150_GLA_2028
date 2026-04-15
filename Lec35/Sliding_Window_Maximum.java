package Lec35;

import java.util.ArrayDeque;
import java.util.Deque;

public class Sliding_Window_Maximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 3, -1, -3, 5, 3, 6, 7 };
		int k = 3;
		int [] a=Sliding_Window(nums, k);
		
	}

	public static int[] Sliding_Window(int[] num, int k) {
		int[] ans = new int[num.length - k + 1];
		Deque<Integer> dq = new ArrayDeque<>();
		int j = 0;
		// 1st window ka answer calculate krna hai
		for (int i = 0; i < k; i++) {
			while (!dq.isEmpty() && num[dq.getLast()] < num[i]) {
				dq.removeLast();
			}
			dq.add(i);

		}
		ans[j++] = num[dq.getFirst()];

		for (int i = k; i < num.length; i++) {
			// 1. grow
			while (!dq.isEmpty() && num[dq.getLast()] < num[i]) {
				dq.removeLast();
			}
			dq.add(i);

			// 2. shrink
			if(dq.getFirst()==i-k) {
				dq.removeFirst();
			}

			// 3. ans calculate
			ans[j++] = num[dq.getFirst()];
		}
		return ans;
	}

}






