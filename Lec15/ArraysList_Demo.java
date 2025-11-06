package Lec15;
import java.util.*;
public class ArraysList_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ll = new ArrayList<>();
		System.out.println(ll.size());
		// Add 
		ll.add(10);
		ll.add(20);
		ll.add(30);
		System.out.println(ll);
		ll.add(1, -7);// 
		System.out.println(ll);
		// get
		System.out.println(ll.get(1));
		// remove
		System.out.println(ll.remove(0));
		System.out.println(ll);
		// update
		ll.set(1, 110);
		System.out.println(ll);
		Collections.sort(ll);
		System.out.println(ll);
	}

}









