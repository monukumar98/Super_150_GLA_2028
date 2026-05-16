package Lec38;

public class All_SubArray_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 4, 6, 7 };
		int n = arr.length;
		// frq*ai
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (i + 1) * (n - i) * arr[i];
		}

		// sum=0
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(sum);
	}

}
