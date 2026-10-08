package Lec50;

import java.util.HashMap;

public class Subarray_Sum_Equals_K {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 1, 1 };
		int k = 2;
	}

	public static int Subarray_Sum(int[] nums, int k) {
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(0, 1);
		int sum=0;
		int count=0;
		for (int i = 0; i < nums.length; i++) {
			sum=sum+nums[i];
			if(map.containsKey(sum-k)) {
				count+=map.get(sum-k);
			}
			if(map.containsKey(sum)) {
					map.put(sum, map.get(sum)+ 1);
			}
			else {
			map.put(sum, 1);
			}
		}
		return count;
	}

}
