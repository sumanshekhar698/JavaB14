package com.java.map;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExamples {

	public static void main(String[] args) {
//		ORDER IS NOT MAINTAINED
//		NO DUPLICATE KEYS ARE ALLOWED
//		DUPLICATE VALUES ARE ALLOWED

//		K:V

//		1: Suman
//		2: Nina
//		7: Ravi

		
//		Hashing on Keys :: Keys should be immutable
		HashMap map0 = new HashMap();//<K:V> --> Entry

		HashMap<Integer, String> map = new HashMap<Integer, String>();//<K:V> --> Entry
		map.put(3, "Mary");
		map.put(13, "John");
		map.put(4, "Toni");
		map.put(6, "Mary");
		map.put(4, "Tony");
		
		System.out.println(map);
		
		
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry.getKey() + " | " + entry.getValue());
		}


		System.out.println(map.containsKey(4));//SEARCHING IS VERY FAST
		
		if (map.containsKey(4)) {
			System.out.println(map.get(4));//FETCHING OF A VALUE AGAINST A KEY IS VERY FAST
//			get will give a null if the key is not there
		}
		
		System.out.println(map.containsValue("John"));//TODO SEARCHING OF A VALUE ??


	}

}
