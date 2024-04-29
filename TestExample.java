package com.demo;

public class TestExample {
	public static void main(String args[]) {
		//constructor
		Employee e = new Employee(101,"ggg",12233);
		
//		e.setId(101);
//		e.setName("uppu");
//		e.setMobile(1222);
		System.out.println(e.getId()+ "," +e.getName()+","+ e.getMobile());
		
		//setters and getters
		Employee e1 = new Employee();
		
		e1.setId(100);
		e1.setName("bhatia");
		e1.setMobile(1111);
		System.out.println(e1.getId()+ "," +e1.getName());
}

}

