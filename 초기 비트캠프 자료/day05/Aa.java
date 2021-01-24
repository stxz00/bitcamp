package com.bit.day05;


class B{
	public static int a =1000; 
	
	public int b = 2;

	public char w = 'z';
	
	public String W = "ssSSSSSSS";
	
	public String p = new String("be");

}

class Aa{




	public static void main(String[] args){
	
	B c = new B();
		
	B d = new B();

	System.out.println(c.a == d.a);
	System.out.println(c.b == d.b);	
	System.out.println(c.w == d.w);	
	System.out.println(c.W == d.W);
	System.out.println(c.p == d.p);
	




 }
}