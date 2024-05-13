package com.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapExample {

	public static void main(String[] args) throws InterruptedException {
		
		//Map<Employee, String> weakmap = new WeakHashMap<>();
		Map<Employee, String> weakmap = new HashMap<>();
		Employee e =new Employee(101, "Allen", 789f, "NJ");
		
		weakmap.put(e,"Hello");
		System.out.println(weakmap);
		e=null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(weakmap);
	}
	
	//over ride below code in Employee.java class since employee object is being destroyed
//	@Override
//	protected void finalize() throws Throwable{
//		System.out.println("Finalized Called");
//	}

}
