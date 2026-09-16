package Lec48;

import java.util.*;

public class HashMapDemo {

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
//		map.put(null, 55);
		System.out.println(map);
//		// get
//		System.out.println(map.get("Rahul"));
//		System.out.println(map.get("Pooja"));
//		// containsKey
//		System.out.println(map.containsKey("Rahul"));
//		System.out.println(map.containsKey("Pooja"));
//		// remove
//		System.out.println(map.remove("Rahul"));
//		System.out.println(map.remove("Pooja"));
//		System.out.println(map);
		TreeMap<String, Integer> map1 = new TreeMap<>();
		// put
		map1.put("Ankit", 87);
		map1.put("Raj", 55);
		map1.put("Manish", 67);
		map1.put("Ankita", 65);
		map1.put("Shiva", 47);
		map1.put("Pooja", 76);
		map1.put("Gopal", 67);
		map1.put("Ankita", 55);
		// map1.put(null, 55);
		System.out.println(map1);
		LinkedHashMap<String, Integer> map2 = new LinkedHashMap<>();
		// put
		map2.put("Ankit", 87);
		map2.put("Raj", 55);
		map2.put("Manish", 67);
		map2.put("Ankita", 65);
		map2.put("Shiva", 47);
		map2.put("Pooja", 76);
		map2.put("Gopal", 67);
		map2.put("Ankita", 55);
		map2.put(null, 55);
		System.out.println(map2);
	}

}
