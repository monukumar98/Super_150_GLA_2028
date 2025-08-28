package Lec6;

public class Arrays_Swap_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int[] arr = new int []{ 10, 20, 30, 40, 50 };
		int[] arr = { 10, 20, 30, 40, 50 };
		System.out.println(arr[0]+" "+arr[1]);
		Swap(arr[0], arr[1]);
		System.out.println(arr[0]+" "+arr[1]);
	}

	public static void Swap(int a, int b) {
		// TODO Auto-generated method stub
		int temp = a;
		a = b;
		b = temp;

	}

}
