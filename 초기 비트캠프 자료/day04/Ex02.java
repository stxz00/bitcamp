package com.bit.day04;

class Ex02{
 public static void main(String[] args){
	int a, b, c;
	a = 100;
	b = 10;
	c = 1234;
	
	func01(20, 30);
	System.out.println(a+"+" + b + "!=" + c);
 }
 public static void func01(int a, int b){
	int c = a+b;
	func02();
	System.out.println(a+"+" + b + "=" + c);	
 } 

 public static void func02(){
	int a = 2;
	int b= 3;
	System.out.println(a+"x"+b+"="+a*b);
	}

}
