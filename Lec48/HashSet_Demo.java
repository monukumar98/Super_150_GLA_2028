package Lec48;

import java.util.*;

public class HashSet_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> set = new HashSet<>();
		set.add(1);
		set.add(5);
		set.add(7);
		set.add(-2);
		set.add(9);
		set.add(5);
//		set.add(null);
		System.out.println(set);
//		// contains
//		System.out.println(set.contains(19));
//		System.out.println(set.contains(9));
//		// remove
//		System.out.println(set.remove(9));
//		System.out.println(set.remove(19));
//		System.out.println(set);
		TreeSet<Integer> set1 = new TreeSet<>();
		set1.add(1);
		set1.add(5);
		set1.add(7);
		set1.add(-2);
		set1.add(9);
		set1.add(5);
		// set1.add(null);
		System.out.println(set1);
		LinkedHashSet<Integer> set2 = new LinkedHashSet<>();
		set2.add(1);
		set2.add(5);
		set2.add(7);
		set2.add(-2);
		set2.add(9);
		set2.add(5);
//		set2.add(null);
		System.out.println(set2);
		// loops
		for(int x:set) {
			System.out.print(x+" ");
		}
		System.out.println();
	}

}
