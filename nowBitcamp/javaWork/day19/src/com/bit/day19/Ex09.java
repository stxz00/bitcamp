package com.bit.day19;

public class Ex09 extends Object implements Cloneable{
	
	public static void main(String[] args) throws CloneNotSupportedException {
//		Object obj = new Object();
//		obj.clone(); protected·Î ¾ÈµÊ
		Ex09 me = new Ex09();
//		me.clone(); //cloneable·Î ¸·Èû
		Object obj2 = me.clone();
	}
}
