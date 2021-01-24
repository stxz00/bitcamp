package com.bit.day10;

import java.util.Scanner;

public class EX04Of2 {
	public static void main(String[] args) {
		//주말과제
		// 1+2 -> 3
		// 5-2 -> 3 
		// 2*6 -> 6
		// 5/2 -> 2.5
		
		int a,b;
		
		Scanner sc = new Scanner(System.in);
		
		a = Integer.parseInt(sc.nextLine());
		b = Integer.parseInt(sc.nextLine());
		
		Number c = func01(a,b);
		System.out.println("a = " + a + ", b = " + b + "일 때 c = " + c);
		
		Number d = func02(a,b);
		System.out.println("a = " + a + ", b = " + b + "일 때 c = " + d);
		
		Number e = func03(a,b);
		System.out.println("a = " + a + ", b = " + b + "일 때 c = " + e);
		
	}
	
	public static Number func01(int a, int b) {
		Number su = null;
		
		if(a < b) {
			if(b % a == 0 && a != 0) {
				su = b;
			}else {
				su = a + b;
			}
		}else{
			if(a%b != 0 && b != 1) {
				su = 1.0 * a / b;
			}else {
				su = a - b;
			}
		}
		return su;
	}
	
	// 개인공부
	// 2+1 -> 3
	// 4-6 -> 6
	// 6*2 -> 36
	// 2/5 -> 5
	// 1+1 -> 100

	public static Number func02(int a, int b) {
		Number su = null;
		
		if(a > b) {
			if(a % b == 0 && b > 1) {
				su = a*a;
			}else {
				su = a+b;
			}
		}else if(a < b) {
			if(b % a == 0 && a > 1) {
				su = b-a;
			}else {
				su = b;
			}
		}else if(a == b) {
			su = 100;
		}
		return su;
	}
	
	
	// 개인공부
	// 5+9 -> 9
	// 7-2 -> 5
	// 6*2 -> 4
	// 2/4 -> 0.5
	
	public static Number func03(int a, int b) {
		Number su;
		if(a % b == 0) {
			su = b*b;
		}else {
			if(a < b && a > 2) {
				su = b;
			}else if(a%b != 0 && b >2) {
				su = 1.0 * a/b;
			}else {
				su = a-b;
			}
		}
		return su;
	}
	
}
