package com.java.basics;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

		// SoftdrinkVendingMachine

		boolean flag = true;
		loop1: while (flag) {
			System.out.println(
					"\nEnter 0 to EXIT\nEnter 1 for Coke\nEnter 2 for ButterMilk\nEnter 3 for Frooti\nEnter 4 for Water");
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();

			switch (choice) {

			case 1:
				System.out.println("Enjoy your coke");
				break;
			case 2: {
				System.out.println("Enjoy your Butter Milk");
				break;
			}
			case 3:
				System.out.println("Enjoy your Frooti");
				break;
			case 0:
//				flag = false;
				System.out.println("THANK YOU!!");
				break loop1;
//				System.exit(8);

			case 4:
				System.out.println("Enjoy your Water");
				break;
			default:
				System.out.println("Invalid Option");
//				break;
			}
		}

		System.out.println("ENDD");

	}

}
