package com.inheritance;

public class A {
	
	A(){
		this(100);
		System.out.println("A constructor");
	}
	
	A(int x){
		System.out.println(x);
	}
	
	A(String x){
		this();
		System.out.println(x);
	}
}
