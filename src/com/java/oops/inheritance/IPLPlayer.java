package com.java.oops.inheritance;

public class IPLPlayer extends Player {

//	**** Inherited Variables ****
//	String name;
//	int age;
//	Gender gender;

//	**** Additional Variables ****
	int runs;
	int matchesPlayed;
	boolean isAllRounder;
	int jerseyNo;

	public IPLPlayer(String name, int age, Gender gender, int runs, int matchesPlayed, boolean isAllRounder,
			int jerseyNo) {
		super(name, age, gender);// super keyword is used to access IMMEDIATE parent
		// USAGE 1: used to call parent constructor
		this.runs = runs;
		this.matchesPlayed = matchesPlayed;
		this.isAllRounder = isAllRounder;
		this.jerseyNo = jerseyNo;
	}

	@Override
	public String toString() {
		return "IPLPlayer [runs=" + runs + ", matchesPlayed=" + matchesPlayed + ", isAllRounder=" + isAllRounder
				+ ", jerseyNo=" + jerseyNo + ", name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}

}
