package com.bit.day10;

//Class Class 클래스의 정보를 담고 있는 클래스 클래스

public class Ex10 {
		int su = 1234;
	public static void main(String[] args) {
		
	
		Object obj = new Object();
		Class clz = obj.getClass(); //클래스의 주소값 리턴
		System.out.println(clz.getName()); //문자열 파일 위치 java.lang.Object
		System.out.println(obj);
		System.out.println(obj.hashCode());
		System.out.println(Integer.toHexString(obj.hashCode()));
		
		//toString() 설명 getClass().getName() + '@' + Integer.Integer.toHexString(obj.hashCode());
		Ex10 me = new Ex10();
		System.out.println(me.su);
		String data = "com.bit.day10.Test08"; //주소
		try {
			Class clzz = Class.forName(data); //getname과 반대로 data 클래스를 불러옴
			Object obj2 = clzz.newInstance();
			Test08 you = (Test08)obj2; 
			//정보를 가지고 클래스를 만들어서 객체를 만들고 있음(new Ex10없이도 만든것)
			System.out.println(you.test);
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
				e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		Class cls = com.bit.etc10.Ex01.class;
		
		
	}
}
