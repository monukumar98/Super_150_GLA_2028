package Lec6;

public class Linear_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 3, 4, 6, 7, 9 };
		int item = 6;
		System.out.println(Search(arr, item));
	}
	public static int Search(int[] arr, int item) {
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==item) {
				return i;
			}			 
			
		}
		return -1;
		
	}
}
