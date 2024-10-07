package com.java.collections;

//public class Student implements Comparable<Student> {
public class Student {

	String name;
	int id;

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}

	public Student(String name, int id) {
		this.name = name;
		this.id = id;
	}

//	@Override
//	public int compareTo(Student st) {
//		if (st.id == this.id) {
//			return 0;
//		} else if (st.id < this.id) {
//			return 1;
//		} else {
//			return -1;
//		}
//	}

}
