package com.bit.day05;

class Ex07{
	public int su = 1111;
	
	public Ex07(){
		//su =2222;
		//this(a)에서 this는 생성자Ex07(a)를 가리킴 
		//즉 생성자 호출(디폴트 생성자가 인자 하나인(Ex07(int su)) 생성자를 호출하는 것
		this(2222); // 생성자가 생성자를 호출 생성자가 두 번 찍히는 게 아니라 
			 //객체는 이미 생성된 시점에서 하고자 하는 일을 하는것
		//this()가 들어간 생성자는 생성자가 만들어지지 않음 this()가 들어간 생성자의 최상단에 존재함.
		//this()가 없는 생성자가 진짜 생성자가 만들어지는 곳임
		System.out.println(this); //생성자 me 메모리주소값
		System.out.println(this.su);
	}
	public Ex07(int su){
		this. su = su;
		System.out.println(this.su);
	}

	
	public static void main(String[] args){
		Ex07 me =new Ex07();
		System.out.println(me.su);
		
		Ex07 you =new Ex07(22);
		System.out.println(you.su);
		
		
	}

}