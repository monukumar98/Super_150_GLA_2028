package Lec50;

import java.util.HashMap;

public class Continuous_Subarray_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 23, 2, 4, 6, 7 };
		int k = 6;
	}

	public static boolean Subarray_Sum(int[] nums, int k) {
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(0, -1);
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum = (sum + nums[i]) % k;
			if (map.containsKey(sum)) {
				if (i - map.get(sum) > 1) {
					return true;
				}
			} else {
				map.put(sum, i);
			}
		}
		return false;
	}

}
