package com.bit.day12;
//출력하는 방법
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Ex15 { 
	public static void main(String[] args) {		
		//Map은 collection을 상속받지 않는다!
		
		java.util.Map map = new HashMap();
		map.put("key1", "val1");
		map.put("key2", "val2");
		map.put("key3", "val3");
		map.put("key4", "val4");
		map.put("key5", "val5");
		
		Set entrys = map.entrySet();
		Iterator ite = entrys.iterator();
		// Entry : 묶음
		while(ite.hasNext()) {
			java.util.Map.Entry entry = (Entry)ite.next();
			System.out.print(entry.getKey() + ":");
			System.out.println(entry.getValue());
		}
		System.out.println("---------------------");
		//다들 아래 씀
		Set keys = map.keySet(); //키를 셋으로 얻음
		ite = keys.iterator();
		while(ite.hasNext()) {
			String key = (String)ite.next();
			System.out.println(key + ":" + map.get(key));
		}
		
	}
}
