package com.bit.day04;

class Ex07{
	// 클래스의 구성요소 2. 변수(전역변수)
	// static 변수, 클래스변수...
	public static String su144; //참조변수의 디폴트 값은 null
	public static Ex07 e; //클래스도 참조변수
	// 인스턴스변수, 멤버필드
	public int su2;
	public static int su1 = 5;
	public void func01(){
		// 지역변수 > 전역변수 (우선순위가 지역변수임)
		int su1 = 1111;
		int su2 = 2222;
		System.out.println(su1);
		System.out.println(su2);
	}

 public static void main(String[] args){
	System.out.println(su144);
	System.out.println(5);
	Ex07 me = new Ex07(); // 인스턴스 변수 또한 static  -> non-static접근 : 참조변수 생성	
	System.out.println(me.su2);
	me.func01();
	System.out.println(e);

 } 
}