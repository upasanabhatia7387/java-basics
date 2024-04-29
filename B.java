package com.inheritance;

//public class B extends A{
//	B(){
//		super("Hello");
//		System.out.println("B Constructor");
//	}
//}

//static, IIB, SIB

public class B {

	static {
		System.out.println("static block");
	}

	B() {
		//this(10); //super;
		// IIB calling statement
		System.out.println(" B Constructor");

	}

	

	B(int x) {
		System.out.println(x);
	}

	{
		System.out.println("IIB");
	}
	{
		System.out.println("IIB-1");
	}

	public static void main(String[] args) {
		System.out.println("main");
		B b1 = new B();
		//B b2 = new B(10);
	}
}
