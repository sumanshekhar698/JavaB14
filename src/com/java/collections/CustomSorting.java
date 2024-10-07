package com.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CustomSorting {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("John", 5));
		list.add(new Student("Amy", 7));
		list.add(new Student("Jill", 2));
		list.add(new Student("Max", 5));
		list.add(new Student("Ava", 3));
		list.add(new Student("Ana", 10));
		list.add(new Student("May", 15));

		Collections.sort(list, (st1, st2) -> {
			if (st1.id == st2.id) {
				return 0;
			} else if (st1.id > st2.id) {
				return 1;
			} else {
				return -1;
			}
		});

		list.forEach(System.out::println);

	}

}

class IdSorter implements Comparator<Student> {

	@Override
	public int compare(Student st1, Student st2) {
		if (st1.id == st2.id) {
			return 0;
		} else if (st1.id > st2.id) {
			return 1;
		} else {
			return -1;
		}
	}

}

class NameSorter implements Comparator<Student> {

	@Override
	public int compare(Student st1, Student st2) {
		return st1.name.compareTo(st2.name);
	}

}