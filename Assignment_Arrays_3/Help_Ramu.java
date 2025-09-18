package Assignment_Arrays_3;

import java.util.Scanner;

public class Help_Ramu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int c1 = sc.nextInt();
			int c2 = sc.nextInt();
			int c3 = sc.nextInt();
			int c4 = sc.nextInt();
			int no_of_rickshaws = sc.nextInt();
			int no_of_cabs = sc.nextInt();
			int[] rickshaws = new int[no_of_rickshaws];
			int[] cabs = new int[no_of_cabs];
			for (int i = 0; i < rickshaws.length; i++) {
				rickshaws[i] = sc.nextInt();
			}
			for (int i = 0; i < cabs.length; i++) {
				cabs[i] = sc.nextInt();
			}
		}
	}

	public static int minimum_sum(int[] rickshaws, int[] cabs, int c1, int c2, int c3, int c4) {
		int cost_rickshaws = 0;
		for (int i = 0; i < rickshaws.length; i++) {
			cost_rickshaws += Math.min(rickshaws[i] * c1, c2);
		}
		cost_rickshaws = Math.min(cost_rickshaws, c3);
		int cost_cabs = 0;
		for (int i = 0; i < cabs.length; i++) {
			cost_cabs += Math.min(cabs[i] * c1, c2);
		}
		cost_cabs = Math.min(cost_cabs, c3);
		int total = cost_cabs + cost_rickshaws;
		return Math.min(total, c4);
	}
}
