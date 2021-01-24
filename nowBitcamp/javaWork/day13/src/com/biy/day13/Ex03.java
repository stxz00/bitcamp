package com.biy.day13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex03 {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		
		map.put("key1", 1111);
		map.put("key2", 2222);
//		map.put(3333, 3333);
//		map.put("key3", "test");
		map.put("", 5555);
		map.put(null, 6666);
		map.put("key7", null); // 디폴트가 null이니 위 두 조건 모두 가능
		
		Set<String> keys = map.keySet();
		Iterator<String> ite = keys.iterator();
		while(ite.hasNext()) {
			String key = ite.next();
			System.out.println(key +" : " +map.get(key));
		}
		
		
	}
}
