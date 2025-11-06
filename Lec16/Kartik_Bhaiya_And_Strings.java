package Lec16;

public class Kartik_Bhaiya_And_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abaaaababaaababa";
		int k = 2;
		int flipa = Maximum_len(str, k, 'a');
		int flipb = Maximum_len(str, k, 'b');
		System.out.println(Math.max(flipa, flipb));

	}

	public static int Maximum_len(String str, int k, char ch) {
		int si = 0, ei = 0, flip = 0, ans = 0;
		while (ei < str.length()) {
			// window grow
			if (str.charAt(ei) == ch) {
				flip++;
			}
			// window shrink
			while (flip > k) {
				if (str.charAt(si) == ch) {
					flip--;
				}
				si++;
			}
			// ans update
			ans = Math.max(ans, ei - si + 1);
			ei++;
		}
		return ans;

	}
}
