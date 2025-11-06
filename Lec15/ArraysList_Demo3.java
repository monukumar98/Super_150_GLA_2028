package Lec15;

import java.util.ArrayList;

public class ArraysList_Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ll = new ArrayList<>();
		// Add
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(11);
		ll.add(2);
		ll.add(30);
		int[] arr = new int[4];
		for (int x : arr) {
			System.out.print(x+" ");
		}
		System.out.println();
		for (int x : ll) {
			System.out.print(x+" ");
		}
	}

}
