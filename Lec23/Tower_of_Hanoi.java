package Lec23;

public class Tower_of_Hanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		TOH(n, "A", "B", "C");
	}

	public static void TOH(int n, String src, String hlp, String des) {
		// TODO Auto-generated method stub
		if (n == 0) {
			return;
		}
		TOH(n - 1, src, des, hlp);
		System.out.println("Move " + n + "th disk form " + src + " to " + des);
		TOH(n - 1, hlp, src, des);
	}

}
