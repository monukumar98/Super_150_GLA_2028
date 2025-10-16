package Lec13;

public class Print_SubString_length_wise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hello";
		printAll(s);

	}

	public static void printAll(String s) {
		for (int len = 1; len <= s.length(); len++) {
			for (int j = len; j <= s.length(); j++) {
				int i = j - len;
				System.out.println(s.substring(i, j));
			}
		}
	}

}
