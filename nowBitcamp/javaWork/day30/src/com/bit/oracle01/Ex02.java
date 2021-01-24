package com.bit.oracle01;

import java.security.KeyStore.Entry;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

class Lec<K,V>{
	K a;
	V v;
}

public class Ex02 {
	
	public static void main(String[] args) {
		Properties prop = System.getProperties();
		//시스템에 대한 정보를 가져옴 
		//properties는 언어가 다르더라도 지원 가능 
		
//		Enumeration<Object> em =prop.elements();
//		while(em.hasMoreElements()) {
//			System.out.println(em.nextElement());
//		}
		
//		Set<java.util.Map.Entry<Object,Object>> set = prop.entrySet();
//		Iterator<java.util.Map.Entry<Object,Object>> ite = set.iterator();
//		while(ite.hasNext()) {
//			java.util.Map.Entry<Object,Object> entry = ite.next();
//			System.out.println(entry.getKey()+">>>"+entry.getValue());
//		}
		//키값을 알면 이렇게 안해도 되나
		//키값을 모르니 이렇게 하는 것.
		//엔트리로 next해서 getkey와 getvalue를 둘 다 받을 수 있는것!
		
		System.out.println(prop.get("java.home"));
		//C:\Program Files\Java\jdk1.8.0_271\jre
		
		//Properties IO와 자료구조 Map의 특징을 둘 다 가짐,
	
	}
}
