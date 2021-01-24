package com.bit.day05;

class Ex03{
	public int su;
 	//생성자
	//객체 생성 시점에 하고 싶은
	//클래스명(매개변수, ...){}
	//앞에 static, 자료형 넣을 수 없다.
	// default생성자는 클래스에 생성자가 없을 때 자동으로 만들어짐(생략되어있음)
	// 단, 생성자가 존재하면 안만들어줌 bb = new Ex03(1), bb = new Ex03(1) 이미 정의되어 있는 생성자이름이 있으면 안만들어줌(단 한 번 생성)
	
	// 객체 생성 시 단 한 번 호출 가능.
	// 오버로드 가능
	public Ex03(){} 
	public Ex03(int a){
		su = a;
		System.out.println("객체 생성됐음");
	}

	

	public static void main(String[] args){
		Ex03 me = new Ex03(123);
		System.out.println("su = " +  me.su);
	
	}

}