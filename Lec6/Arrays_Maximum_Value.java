package Lec6;

public class Arrays_Maximum_Value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 5, 1, 4, 11, 40, 51, 1, 15 };
		System.out.println(Maximum_Value1(arr));
	}
	public static int Maximum_Value2(int[] arr) {
		int max=Integer.MIN_VALUE;// -2^31
		for (int i = 0; i < arr.length; i++) {
			max=Math.max(max, arr[i]);
			
		}
		return max;

	}

	public static int Maximum_Value1(int[] arr) {
		int max=arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			
		}
		return max;

	}

}
