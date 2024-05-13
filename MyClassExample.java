package com.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class MyClassExample {

	public static void main(String[] args) {
		//HashSet
		//Set <String> set= new HashSet<String>();
		
		//LinkedHashSet
		//Set <String> set= new LinkedHashSet<String>();
		
		//TreeSet 
		//Set <String> set= new TreeSet<String>();
		
//		set.add("xyz");
//		set.add("abc");
//		set.add("pqr");
//		set.add(null);
//		set.add("cdf");
//		System.out.println(set);
		
//		Set<Employee> employees = new HashSet<>();
//		
//		Employee e1 = new Employee(101,"Allen",1234f, "NY");
//		Employee e2 = new Employee(101,"Allen",1234f, "NY");
//		
//		employees.add(e1);
//		employees.add(e2);
//		System.out.println(employees);
//		
//		System.out.println(e1.hashCode() + "," + e2.hashCode());
		
		//treeset
		Set<Employee> set = new TreeSet<>(new NameComparator());
		set.add( new Employee(101, "Upasana", 234f, "Pitts"));
		set.add( new Employee(102, "zSaloni", 234f, "Pitts"));
		System.out.println(set);
		
	}

}
