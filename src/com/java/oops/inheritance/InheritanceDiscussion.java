package com.java.oops.inheritance;

public class InheritanceDiscussion {

	public static void main(String[] args) {

		O o = new O();
//		System.out.println(o.x);
		o.sayX();

	}

}

class M {
	int x = 10;
	
	void sayX() {//fn/methods also gets inherited
		System.out.println(x);
	}
}

class N extends M {
	int x = 11;
	
	
	@Override // ReDefining the functionality of a fn [Method Overriding]
	void sayX() {//fn/methods also gets inherited
		System.out.println(x + " :X");
	}
}

class O extends N {
	int x = 12;
	
	@Override // ReDefining the functionality of a fn [Method Overriding]
	void sayX() {//fn/methods also gets inherited
		System.out.println(x + " :X");
		System.out.println(super.x + " :Super X");// super can access IMMEDIATE parent
		super.sayX();//Method Overriding :: sayX is also a kind of a Polymorphism
		
//		[Method Overloading :: Compiletime Polymorphism]	
//		[Method Overriding :: Runtime Polymorphism]
	}
}
