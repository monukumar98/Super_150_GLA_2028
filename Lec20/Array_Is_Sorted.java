package Lec20;

public class Array_Is_Sorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {2,3,5,8,7};
		System.out.println(Is_Sorted(arr, 0));

	}
	public static boolean Is_Sorted(int [] arr,int i) {
		if(i==arr.length-1) {
			return true;
		}
		if(arr[i]>arr[i+1]) {
			return false;
		}
		return Is_Sorted(arr, i+1);
	}

}
