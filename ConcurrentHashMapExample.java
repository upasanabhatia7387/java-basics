package com.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {

	public static void main(String[] args) {
		Map<String, String> coMap = new ConcurrentHashMap<>();
		coMap.put("abc", "hello");
		coMap.put("xyz", "welcome");
		coMap.put("pqr", "hows you");
		System.out.println(coMap);
		
		Iterator<String> itr = coMap.keySet().iterator();
		while(itr.hasNext()) {
			String key = itr.next();
			if (key.equals("abc")){
				coMap.remove(key);
			}
		}
		System.out.println("Concurrent Hashmap=" +coMap);
	}

}
