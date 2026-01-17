package Lec20;

public class Replace_Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "cat";
		Replace(s, "");

	}

	public static String Replace1(String ques) {
		if (ques.length() == 0) {
			return "";
		}
		char ch = ques.charAt(0);
		if (ch == 'a') {
			return 'o' + Replace1(ques.substring(1));
		} else {
			return ch + Replace1(ques.substring(1));
		}
	}

	public static void Replace(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		char ch = ques.charAt(0);
		if (ch == 'a') {
			Replace(ques.substring(1), ans + 'o');
		} else {
			Replace(ques.substring(1), ans + ch);
		}

	}

}
