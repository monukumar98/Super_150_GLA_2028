package Lec30;

import java.util.Scanner;

public class Chessboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("\n"+Count_Chessboard(0, 0, n - 1, n - 1, ""));

	}

	public static int Count_Chessboard(int cr, int cc, int er, int ec, String ans) {
		if (cr > er || cc > ec) {
			return 0;
		}
		if (cr == er && cc == ec) {
			System.out.print(ans + "{" + cr + "-" + cc + "}" + " ");
			return 1;
		}
		int c = 0;
		// Knight
		c += Count_Chessboard(cr + 2, cc + 1, er, ec, ans + "{" + cr + "-" + cc + "}K");
		c += Count_Chessboard(cr + 1, cc + 2, er, ec, ans + "{" + cr + "-" + cc + "}K");
		// Rook
		if (cr == 0 || cc == 0 || cr == er || cc == ec) {
			// horizontally
			for (int i = 1; i <= ec; i++) {
				c += Count_Chessboard(cr, cc + i, er, ec, ans + "{" + cr + "-" + cc + "}R");
			}
			// Vertically
			for (int i = 1; i <= er; i++) {
				c += Count_Chessboard(cr + i, cc, er, ec, ans + "{" + cr + "-" + cc + "}R");
			}

		}
		// bishop
		if (cr == cc || cr + cc == ec) {
			for (int i = 1; i <= ec; i++) {
				c += Count_Chessboard(cr + i, cc + i, er, ec, ans + "{" + cr + "-" + cc + "}B");

			}
		}
		return c;

	}

}
