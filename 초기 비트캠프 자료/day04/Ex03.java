package com.bit.day04;

class Ex03{
	//메서드 오버로드(면접 시 메서드 오버로드와 메서드 오버라이딩에 대해 많이 물어봄)
 public static void func01(){
	System.out.println("매개변수가없는");
}

 public static void func01(int a){
	System.out.println("인자하나 : " +"="+a);
 }

 public static void main(String[] args){
	Ex02.func01(2,3);
	com.bit.day04.Ex02.func01(2,3);
	com.bit.day04.Ex03.func01();
	Ex03.func01();
	func01();
	java.lang.System.out.println(); //println()메서드
	System.out.println(1234); //println(int a)메서드
	System.out.println();
	System.out.println(3.14); //println(double a)메서드
	System.out.println("출력"); //println(String a)메서드
 }
}