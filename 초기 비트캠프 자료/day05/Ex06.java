package com.bit.day05;
//this의 생략

class Ex06{
	public int su =2222;

/* 원칙적으로 아래를 출력하려면 이래야하는데 
	public void func01(Ex06 a){
		System.out.println(a.su);
	}

	public static void main(String[] args){
		Ex06 me = new Ex06();
		//System.out.println(me.su);
		me.func01(me);
	}
*/
/*	사실 this가 생략되어 있음.
	public void func01(){
		System.out.println(this.su);
	}

	public static void main(String[] args){
		Ex06 me = new Ex06();
		//System.out.println(su);
		me.func01();
	}

*/

/*
	
	System.out.println(this.su)
	

	public static void main(String[] args){
		Ex06 me = new Ex06();
		//System.out.println(su);
		me.func01();
	}

*/

/*
	public void func01(){
	int su = 2;

	System.out.println(this.su);
	System.out.println(su);
	}

	public static void main(String[] args){
		Ex06 you = new Ex06();	
		Ex06 me = new Ex06();
		//System.out.println(me==me);
		me.func01();
	}
*/
	public Ex06 func02(){
	System.out.println("func02 run...");
	return this;

	}

	public void func01(){
	int su = 2222;
	//this.func02();
	System.out.println(this.su);

	}

	public static void main(String[] args){
		Ex06 you = new Ex06();	
		Ex06 me = new Ex06();
		//System.out.println(me==me);
		//System.out.println(me.su);
		me.func02().func02().func02();
	}


}