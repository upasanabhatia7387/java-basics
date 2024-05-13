package com.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MyHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Map <Employee, String> m = new HashMap<>();
		Map <Employee, String> m = new TreeMap<>(new NameComparator());
		
		m.put(new Employee(101, "Allen", 7865f, "USA"),"1");
		//m.put(null, "1");
		m.put(new Employee(102, "Allennn", 7862225f, "USAaaa"),"3");
		m.put(new Employee(103, "All", 2225f, "aaa"),"4");
		System.out.println(m);
		
		Set s = m.keySet();
		Iterator itr = s.iterator();
		while (itr.hasNext()) {
			Employee key = (Employee) itr.next(); //down casting
			String value = m.get(key);
			System.out.println("key-"+key);
			System.out.println("Value-"+value);
		}
	}

}
