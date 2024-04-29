package com.multipleinheritance;

public class Child extends Parent1, Parent2{
	 Child (){
	//super();
	}
	
	void test() {
		//super();
	}
	
	public static void main(String args[]) {
		Child c=new Child();
		c.test();
	}
	
}
