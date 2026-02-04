package Lec21;

import java.util.*;

public class Generate_Parentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		List<String> ll = new ArrayList<>();
		Parentheses(n, 0, 0, "", ll);
		System.out.println(ll);
	}

	public static void Parentheses(int n, int open, int closed, String ans, List<String> ll) {
		// TODO Auto-generated method stub
		if (open == n && closed == n) {
			//System.out.println(ans);
			ll.add(ans);
			return;
		}
		if (open > n || closed > open) {
			return;
		}
		Parentheses(n, open + 1, closed, ans + "(", ll);
		Parentheses(n, open, closed + 1, ans + ")", ll);

	}

}
