package com.demo.Poly;

public abstract class MyClass {
	
	int firstIndex;
	int lastIndex;
	
	public MyClass() {
		
	}
	
	public MyClass(int firstIndex, int lastIndex) {
		super();
		this.firstIndex=firstIndex;
		this.lastIndex=lastIndex;
	}
	
	abstract void test(); //abstract method
	
	void test1() {//concrete method
		System.out.println(firstIndex + "," + lastIndex);
		
	}
}
