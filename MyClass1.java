package com.demo.Poly;

public class MyClass1 extends MyClass{
	
	public MyClass1() {
		super(1,50);
		firstIndex=100;
		lastIndex=200;
	}

	@Override
	public void test() {
		
		System.out.println(firstIndex + "," + lastIndex);
	}

}
