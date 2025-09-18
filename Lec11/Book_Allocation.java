package Lec11;

import java.util.Scanner;

public class Book_Allocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int nob = sc.nextInt();// number of books
			int nos = sc.nextInt();// number of Student
			int[] page = new int[nob];
			for (int i = 0; i < page.length; i++) {
				page[i] = sc.nextInt();
			}
			System.out.println(Minimumpage(page, nos));
		}

	}

	public static int Minimumpage(int[] page, int nos) {
		int lo = 0;
		int hi = 0;
		for (int i = 0; i < page.length; i++) {
			hi = hi + page[i];
		}
		int ans = 0;
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (isitpossible(page, nos, mid)) {
				ans = mid;
				hi = mid - 1;
			} else {
				lo = mid + 1;
			}
		}
		return ans;
	}

	public static boolean isitpossible(int[] page, int nos, int mid) {
		// TODO Auto-generated method stub
		int student = 1;
		int readapge = 0;
		for (int i = 0; i < page.length;) {
			if (readapge + page[i] <= mid) {
				readapge += page[i];
				i++;
			} else {
				student++;
				readapge = 0;
			}
			if (student > nos) {
				return false;
			}
		}
		return true;

	}

}
