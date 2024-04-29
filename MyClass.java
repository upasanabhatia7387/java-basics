package com.demo;

class Test{
	public static void test() {
		System.out.println("test test");
	
}
}
	
public class MyClass{
	public static int test() {
		System.out.println("my class test");
		return 100;
		}
	
	public static void main(String args[]) { //JVM will start the execution from here
		System.out.println("main");
		
		int z[]= {1,2,3,4,5,6,7};
		for (int i=0;i<z.length;i++) {
			System.out.println(z[i]);
		}
		
		int x=test(); //call of test method
		System.out.println(x);
		Test.test();
	}
//JVM will end the execution here
}