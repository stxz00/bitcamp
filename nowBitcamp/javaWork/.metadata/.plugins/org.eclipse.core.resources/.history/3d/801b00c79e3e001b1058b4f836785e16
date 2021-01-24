package com.bit.day07;

public class Ex06 throws Exception{

	public static void main(String[] args){
		Object obj = new Object();
		String msg = obj.toString();
		System.out.println(msg);
		
		Object obj2 = new Object();
		System.out.println(obj.equals(obj2)); //false
		Object obj3 = obj;
		System.out.println(obj.equals(obj3)); //true
		System.out.println(obj.hashCode());
		//object obj4 = obj.clone(); //clone은 protected이기 때문에 패키지 외 다른 패키지 접근 불가
		Ex06 me = new Ex06();
		Object obj4 = me.clone(); //protected는 다른 패키지라도 상속을 통해 가능해지니 me.clone이 가능해짐
		//System.out.println(obj4);
	}
}