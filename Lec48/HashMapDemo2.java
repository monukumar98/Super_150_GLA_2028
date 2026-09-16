package Lec48;

import java.util.*;

public class HashMapDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>();
		// put
		map.put("Ankit", 87);
		map.put("Raj", 55);
		map.put("Manish", 67);
		map.put("Ankita", 65);
		map.put("Shiva", 47);
		map.put("Pooja", 76);
		map.put("Gopal", 67);
		map.put("Ankita", 55);
		System.out.println(map);
//		Set<String> s=map.keySet();
//		for(String x:s) {
//			System.out.println(x+" "+map.get(x));
//		}
		for(String x:map.keySet()) {
			System.out.println(x+" "+map.get(x));
		}
	}

}
