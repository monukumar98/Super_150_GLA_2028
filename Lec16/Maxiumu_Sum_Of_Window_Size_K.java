package Lec16;

public class Maxiumu_Sum_Of_Window_Size_K {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 4, 6, 7, 1, 8, 2, 3, 4 };
		int k = 3;
		System.out.println(Maxiumu_Sum(arr, k));

	}

	public static int Maxiumu_Sum(int[] arr, int k) {
		int ans = 0, sum = 0;
		// 1st window ka answer
		for (int i = 0; i < k; i++) {
			sum += arr[i];
		}
		ans = sum;
		for (int i = k; i < arr.length; i++) {
			sum += arr[i];// window grow
			sum = sum - arr[i - k]; // window shrink
			ans = Math.max(ans, sum);// answer
		}
		return ans;
	}

}








