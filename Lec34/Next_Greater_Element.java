package Lec34;

import java.util.Stack;

public class Next_Greater_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 4, 5, 2, 10 };
	}

	public static void NGE(int[] arr) {
		Stack<Integer> st = new Stack<>();
		int[] ans = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			while (!st.isEmpty() && arr[i] > arr[st.peek()]) {
				ans[st.pop()] = arr[i];
			}
			st.push(i);
		}
		while (!st.isEmpty()) {
			ans[st.pop()] = -1;
		}
		for (int i = 0; i < ans.length; i++) {
			System.out.println(arr[i] + " " + ans[i]);
		}
	}

}
