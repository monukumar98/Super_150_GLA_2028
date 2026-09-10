package Lec47;

import java.util.Arrays;
import java.util.Scanner;

public class BUSYMAN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Pair[] arr = new Pair[n];
		for (int i = 0; i < n; i++) {
			int st = sc.nextInt();
			int et = sc.nextInt();
			arr[i] = new Pair(st, et);
		}
		Arrays.sort(arr, (a, b) -> a.et - b.et);
		int activitie =1;
		int end=arr[0].et;
		for (int i = 1; i < arr.length; i++) {
			if(arr[i].st>=end) {
				activitie++;
				end=arr[i].et;
			}
		}
		System.out.println(activitie);

	}

	static class Pair {
		int st;
		int et;

		public Pair(int st, int et) {
			// TODO Auto-generated constructor stub
			this.st = st;
			this.et = et;
		}
	}
}
