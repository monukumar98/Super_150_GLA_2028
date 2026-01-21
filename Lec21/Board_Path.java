package Lec21;

public class Board_Path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		Path(n, 0, "");

	}

	public static void Path(int n, int curr, String ans) {
		if (curr == n) {
			System.out.println(ans);
			return;
		}
		if (curr > n) {
			return;
		}
		for (int dice = 1; dice <=3; dice++) {
			Path(n, curr + dice, ans + dice);
		}
//		Path(n, curr + 1, ans + 1);
//		Path(n, curr + 2, ans + 2);
//		Path(n, curr + 3, ans + 3);

	}

}
