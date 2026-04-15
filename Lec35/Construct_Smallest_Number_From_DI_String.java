package Lec35;

import java.util.Stack;

public class Construct_Smallest_Number_From_DI_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pattern = "IIIDIDDD";
		System.out.println(Construct_Smallest_Number(pattern));
	}

	public static String Construct_Smallest_Number(String pattern) {
		Stack<Integer> st = new Stack<>();
		int[] ans = new int[pattern.length() + 1];
		int c = 1;
		for (int i = 0; i <= pattern.length(); i++) {
			if (i == pattern.length() || pattern.charAt(i) == 'I') {
				ans[i] = c++;
				while (!st.isEmpty()) {
					ans[st.pop()] = c++;
				}
			} else {
				st.push(i);
			}
		}
		String str = "";
		for (int x : ans) {
			str = str + x;
		}
		return str;

	}

}
