package Lec24;

public class Coin_Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coin = { 2, 3, 5 };
		int ammount = 8;

	}

	public static void Permutation(int[] coin, int ammount, String ans) {
		if (ammount == 0) {
			System.out.println(ans);
			return;
		}

		for (int i = 0; i < coin.length; i++) {
			if (ammount >= coin[i]) {
				
				Permutation(coin, ammount - coin[i], ans + coin[i]);
			}

		}

	}

}
