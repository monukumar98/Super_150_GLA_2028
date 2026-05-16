package Lec37;

public class Merge_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 7, 5, 3, 9, 4 };
		int[] ar = Sort(arr, 0, arr.length - 1);
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}

	}

	public static int[] Sort(int[] arr, int si, int ei) {

		if (si == ei) {
			int[] a = new int[1];
			a[0] = arr[si];
			return a;
		}
		int mid = (si + ei) / 2;
		int[] f = Sort(arr, si, mid);
		int[] s = Sort(arr, mid + 1, ei);
		return Merge_Two_Array(f, s);

	}

	public static int[] Merge_Two_Array(int[] arr1, int[] arr2) {
		int[] ans = new int[arr1.length + arr2.length];
		int i = 0, j = 0, k = 0;
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				ans[k++] = arr1[i++];
			} else {
				ans[k++] = arr2[j++];
			}
		}
		while (i < arr1.length) {
			ans[k++] = arr1[i++];
		}
		while (j < arr2.length) {
			ans[k++] = arr2[j++];
		}
		return ans;
	}

}
