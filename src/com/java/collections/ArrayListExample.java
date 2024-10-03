package com.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {

//		Collections only hold Objects , they don't hold primitive of Data

//		Collections DataStructure
		/*
		 * - It can grow and shrink
		 * - Searching Slow
		 */
		ArrayList list = new ArrayList();
		list.add(43);
		list.add("Hey");
		list.add(true);

		System.out.println(list);
		list.remove(0);
		System.out.println(list);

		ArrayList<Integer> listOfNums = new ArrayList<Integer>();// <Integer> is called Generics
		listOfNums.add(43);
		listOfNums.add(54);
		listOfNums.add(54);
		listOfNums.add(54);
		listOfNums.add(423);
		listOfNums.add(22);

//		1. using classic for loop NOT RECOMMEND

		for (int i = 0; i < listOfNums.size(); i++) {// Horrible Way
//			listOfNums.add(6);
			System.out.print(listOfNums.get(i) + " ");
		}

		System.out.println();
//		2. enhanced for loop/ foreach loop
		for (int num : listOfNums) {// AutoUnboxing
//			listOfNums.add(6);//java.util.ConcurrentModificationException
			System.out.print(num + " ");
		}

		System.out.println();
//		3. Using Iterator
//		TODO Find if we can iterate in  reverse order using Iterator
		Iterator<Integer> itr = listOfNums.iterator();

		while (itr.hasNext()) {// 43 54 54 54 423 22
			Integer num = itr.next();
			System.out.print(num + " ");
		}

//		4. Streams JDK8
		System.out.println();
		listOfNums.stream().forEach(System.out::println);// :: method reference operator

		System.out.println();
		listOfNums.stream().filter(num -> num % 2 == 0).forEach(System.out::println);// :: method reference operator

//		listOfNums.clear();
		boolean empty = listOfNums.isEmpty();

		List<Integer> listOfNums2 = List.of(43, 23, 23, 100, 101);//Immutable
		
		listOfNums.addAll(listOfNums2);
		System.out.println(listOfNums);
		
//		Collections.sort(listOfNums);//ASC
		System.out.println(listOfNums);
		
		Collections.sort(listOfNums,Collections.reverseOrder());//DSC
//		List<Integer> reversed = listOfNums.reversed();
//		System.out.println(reversed);
		System.out.println(listOfNums);
		
		Collections.shuffle(listOfNums);//PROJECT
		System.out.println(listOfNums);

	}

}
