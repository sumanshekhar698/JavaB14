package com.java.oops.inheritance;

public class Player {
	
	String name;
	int age;
	Gender gender;
	
	
	public Player(String name, int age, Gender gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	
	public Player() {
		System.out.println("Player() <<");
		System.out.println("Player() >>");
	}


	public String toString() {
		return "Player [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
	
	
	

}
