package com.innerclass;

interface myInterface{
	public void test();
}

//If not used anonymous class then we accessed by below method the interface
//as we dont create objects of interface genrally
//normal method
//class MyClass implements myInterface{
//
//	@Override
//	public void test() {
//		// TODO Auto-generated method stub
//		
//	}
//	
//}

public class AnonymousInnerClassTest {

	public static void main(String[] args) {
		myInterface mi = new myInterface(){

			@Override
			public void test() {
				// TODO Auto-generated method stub
				System.out.println("Anonymous inner class");
				
			}
			
			
		};
		mi.test();
		

	}

}
