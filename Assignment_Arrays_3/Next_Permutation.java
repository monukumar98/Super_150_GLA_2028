package Assignment_Arrays_3;

public class Next_Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3 };

	}

	public static void Permutation(int[] arr) {
		// step -1 find p
		int p = -1;
		for (int i = arr.length - 2; i >= 0; i--) {
			if (arr[i] < arr[i + 1]) {
				p = i;
				break;
			}

		}
		if (p == -1) {
			Reverse(arr, 0, arr.length - 1);
			return;
		}
		// Setp -2 find 2
		int q = -1;
		for (int i = arr.length - 1; i > p; i--) {
			if (arr[i] > arr[p]) {
				q = i;
				break;
			}

		}
		// step -3 swap p and q index value
		int temp = arr[p];
		arr[p] = arr[q];
		arr[q] = temp;
		// step - 4 reverse p+1 to n-1 index
		Reverse(arr,p+1,arr.length-1);
	}

	public static void Reverse(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}

	}

}
