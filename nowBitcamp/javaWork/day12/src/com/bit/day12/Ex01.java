package com.bit.day12;

import java.util.ArrayList;

//자료구조 : 자료를 구조하는 것
//최소한의 자료구조 : 변수 (여러 개의 값을 구조하는 게 아니라 자료구조라고 하지는 않음)
//배열 : 자료구조
//배운 것들인 알고 있는 자료들을 가공해서 구조화 한것임 
//선형구조(순서O),비선형구조(순서X)
//선형구조 : 중복 가능, 비선형구조 : 중복 가능, 불가능 둘 다
//선형구조 : 제어력 있는 것 List, 없는 것 : stack, queue 등
//비선형구조 : 순서라는 게 없을 순 없음. 구현하기 위해서 중복을 허용하지 않음 -> 중복값 검사를 통해 자료를 넣고 순서를 구현.

public class Ex01 {
	public static void main(String[] args) {
		// 컬렉션 프로임워크 - 동적할당 자료구조
		// 순서o, 제어권o - 선형자료구조

		java.util.ArrayList list = new ArrayList();
		list.add("첫번째");
		list.add("다섯번째");
		list.add("두번째");
		list.add("세번째");
		list.add("네번째");
		
		
		System.out.println(list.get(0));
		System.out.println(list.get(2));
		System.out.println(list.get(1));
		System.out.println(list.get(3));
		System.out.println(list.size());
		System.out.println("-------------------");
		list.set(1, "5번째");
		System.out.println("-------------------");
		list.remove(1);
		System.out.println("-------------------");
		for(int i = 0; i < 4; i++) {
			System.out.println(list.get(i));
		}
		/*
		 * 제어권은 나에게 있으니 언제든 원하는 대로 불러오는 게 가능함
		for(int i = 0; i < 4; i+=2) {
			System.out.println(list.get(i));
		}
		*/
	}
}
