package com.java.oops.inheritance;

public class RolesOfInheritance {

}
//R0: A Parent class can have multiple Child Class

//R1: Cyclic Inheritance is NOT Possible 

//class A extends B{
//	
//}
//
//
//class B extends A{
//	
//}

//R2: Multiple Inheritance is NOT Possible 

class X {
}

//R3: class A  extends Object{//Object class
class A {// Object class

}

//class B extends A,X {// A child cannot have 2 parents DIAMOND PROBLEM
//
//}

//R4: MultLevel Inheritance is Possible

class B extends A {

}

class C extends B {

}

//R5: Inheritance works only from top to bottom
