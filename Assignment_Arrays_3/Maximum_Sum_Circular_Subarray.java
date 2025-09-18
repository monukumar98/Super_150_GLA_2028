package Assignment_Arrays_3;

public class Maximum_Sum_Circular_Subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, -2, 3, -2 };
	}

	public static int Maximum_Circular_Sum(int[] arr) {
		int Linear_Maximum_Sum = Kadanes_Algorithm(arr);
		int total_sum = 0;
		for (int i = 0; i < arr.length; i++) {
			total_sum += arr[i];
			arr[i] = arr[i] * -1;
		}
		int Circular_Sum = total_sum + Kadanes_Algorithm(arr);
		if(Circular_Sum==0) {
			return Linear_Maximum_Sum;
		}
		return Math.max(Linear_Maximum_Sum, Circular_Sum);

	}

	public static int Kadanes_Algorithm(int[] arr) {
		int ans = Integer.MIN_VALUE;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			ans = Math.max(ans, sum);
			if (sum < 0) {
				sum = 0;
			}
		}
		return ans;

	}
}
