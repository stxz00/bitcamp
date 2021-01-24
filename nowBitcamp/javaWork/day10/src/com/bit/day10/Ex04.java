package com.bit.day10;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		
		//주말과제
		// 1+2 -> 3
		// 5-2 -> 3 
		// 2*6 -> 6
		// 5/2 -> 2.5
		
		
		Number su1 = new Integer(1111);
		Number su2 = new Double(3.14);
		System.out.println(su1.intValue() + su2.doubleValue());
		
		Scanner sc;
		sc = new Scanner(System.in);
		int a,b;
		a = Integer.parseInt(sc.nextLine());
		b = Integer.parseInt(sc.nextLine());
		Number c = func(a,b);
		System.out.println(a+"/"+b+"="+ c);
		
	}
	
	public static Number func(int a, int b) {
		Number su;
		if(a%b == 0) {
			su = new Integer(a/b);
		}else {
			su = new Double(1.0*a/b);
		}
		return su;
	}
}
