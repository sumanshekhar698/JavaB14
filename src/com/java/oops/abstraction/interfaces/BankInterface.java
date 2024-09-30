package com.java.oops.abstraction.interfaces;

//this is more strict than abstract class
//no concrete methods are allowed
abstract public interface BankInterface {// You can only have abstract methods in interface

	
	String REGULATORY_BODY = "RBI";// any variable in in the interface public static final
	
	long withdrawMoney(long amount);// Abstract fn/methods

	abstract long depositMoney(long amount);
	
	//JDK8
	
	static boolean paymentStatus() {//you can have concrete statci methods in interfaces
		return false;
		
	}
	
	
	default long paymentDuration() {//you can have concrete statci methods in interfaces
		return 1L;
		
	}

}
