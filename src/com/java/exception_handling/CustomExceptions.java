package com.java.exception_handling;

import java.util.Scanner;

public class CustomExceptions {

	public static void main(String[] args) {

		System.out.println("Enter your age for voting Eligiblity");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();

		try {
			validateAge(age);
		} catch (InvalidVotingAge e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			sc.close();
		}
	}

	private static void validateAge(int age) throws InvalidVotingAge {

		if (age < 0 || age > 150) {
			throw new InvalidVotingAge("Invalid input");
		} else if (age < 18) {
			throw new InvalidVotingAge("Under Age");
		}

	}

}

class InvalidVotingAge extends Exception {// 1

	public InvalidVotingAge(String message) {// 2
		super(message);
	}

}
