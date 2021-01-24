package com.bit.day12;

import java.util.Enumeration;
import java.util.Vector;

public class Ex07 {
	public static void main(String[] args) {
		//Vector
		//stack이 상속받는 Vector
		//list를 상속받음
		//쓸일이 거의 없음
		//Vector는 Array로 만들어짐
		//순서가 없다지만 배열로 만들었기 때문에 순서가 있음
		Vector vec1 = new Vector(); 
		vec1.addElement("첫번째");
		vec1.addElement("두번째");
		vec1.addElement("세번째");
		vec1.addElement("네번째");
		
		System.out.println(vec1.elementAt(0));
		System.out.println(vec1.elementAt(1));
		System.out.println(vec1.elementAt(2));
		System.out.println(vec1.elementAt(3));

		
		System.out.println("-------------");
		/*
		System.out.println(vec1.lastElement()); //네번째
		vec1.remove(vec1.size()-1);
		System.out.println(vec1.lastElement()); //세번째
		*/
		Enumeration eles = vec1.elements(); //Enumeration으로 순서를 만듬
		while(eles.hasMoreElements()) {
		System.out.println(eles.nextElement());
		}
		
	}
}
