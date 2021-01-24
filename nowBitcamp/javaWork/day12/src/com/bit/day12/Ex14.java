package com.bit.day12;

import java.util.HashMap;

//그동안 노란색 표시가 났던건 제네릭 안썼다고 표시해준 것
public class Ex14 {
	public static void main(String[] args) {
		// key-(중복x, 중복하면 값이 바뀜), val(중복o) 쌍으로
		// key는 set타입, val은 list와 가까움
		java.util.Map map = new HashMap();
		map.put("key1", "val1");
		map.put("key2", "val2");
		map.put("key3", "val3");
		map.put("key4", 1234);
		map.put("key5", 3.14);
		map.put(1234, "val6");
		map.put(11.11, "val7");
		map.put(null, "val8");
		map.put("key9", null);
		map.put("key2", 4321); // 중복된 키를 입력하면 값이 수정됨!
		map.put("key3", "val1");
		map.remove("key1"); //삭제를 해도 null이 나옴(당연히 이제 키가 삭제되어 없으니까)
		
		System.out.println(map.get("key1"));
		System.out.println(map.get("key2"));
		System.out.println(map.get("key3"));
		System.out.println(map.get("key4"));
		System.out.println(map.get("key5"));
		System.out.println(map.get(1234));
		System.out.println(map.get(11.11));
		System.out.println(map.get(null));
		System.out.println(map.get("key9"));
		System.out.println(map.get("key10"));
		//없는 키를 호출하면 오류 호출이 아닌 null을 반환 null은 그냥 의미가 별로 없다고 생각하기
		
		
		// remove(key) 하면 값만 null이 됨
		// remove(key,value) 하면 키 밸류 둘 다 삭제
		// replace(key,value, 새로운 value) 교체, 정확한 체크로 바꿀 수 있는 것
		
		
	}
}
