package Lec19;

public class First_Occr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 4, 2, 4, 2 };
		int item = 4;

	}

	public static int Index(int[] arr, int item, int i) {
		if (i == arr.length) {
			return -1;
		}
		if (arr[i] == item) {
			return i;

		}

		return Index(arr, item, i + 1);

	}

}
