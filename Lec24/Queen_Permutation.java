package Lec24;

public class Queen_Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		boolean[] board = new boolean[n];
		int tq = 2;
		Permutation(board, tq, "", 0);

	}

	public static void Permutation(boolean[] board, int tq, String ans, int qpsf) {
		if (qpsf == tq) {
			System.out.println(ans);
			return;
		}

		for (int i = 0; i < board.length; i++) {
			if (board[i] == false) {
				board[i] = true;// mei yaha pe apne side se queen placed kr diya hai
				Permutation(board, tq, ans + "b" + i + "q" + qpsf, qpsf + 1);
				board[i] = false;// mei yaha pe apne side se queen remove kr diya hai UNDO

			}
		}
	}

}
