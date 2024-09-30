package com.java.oops.abstraction.interfaces;

interface X {

	void foo1();
}

public interface A {

	void foo1();
}

interface B extends A {
	void foo2();

}

class M {

}

class Sample extends M implements A, B {

	@Override
	public void foo1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void foo2() {
		// TODO Auto-generated method stub
		
	}

}
