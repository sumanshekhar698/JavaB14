package com.java.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class HashSetExample {

	public static void main(String[] args) {

//		NO DUPLICATES ARE ALLOWED
//		The ORDER IS NOT MAINTAINED
//		SEARCHING IS VERY FAST

		int[] arr = { 32, 23, 23, 23, 23, 23, 23232, 232, 2, 23, 32, 23 };
		
		HashSet<Integer> set = new HashSet<Integer>();//TODO LinkedHashset
		
		for (Integer integer : arr) {
			set.add(integer);
		}
		
		System.out.println(set);
		
//		boxed() int --> Integer 
		Set<Integer> set2 = Arrays.stream(arr).boxed().collect(Collectors.toSet());
		System.out.println(set2);
		
		
		boolean ans = set.contains(2);//Internally it uses Hashing
		System.out.println(ans);
		

	}

}
