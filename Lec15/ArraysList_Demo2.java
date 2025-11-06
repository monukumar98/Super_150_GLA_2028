package Lec15;

import java.util.ArrayList;

public class ArraysList_Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ll = new ArrayList<>();
		System.out.println(ll.size());
		// Add
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(11);
		ll.add(2);
		ll.add(30);
		System.out.println(ll);
		for (int i = 0; i < ll.size(); i++) {
			System.out.print(ll.get(i) + " ");
		}
		System.out.println();
	}

}
