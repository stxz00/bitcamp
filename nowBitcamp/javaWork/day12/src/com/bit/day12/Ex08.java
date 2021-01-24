package com.bit.day12;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		// °è»ê±â
		Scanner sc = new Scanner(System.in);
		System.out.print(">");
		// 1+2, 5-3, 5*2, 5/2
		String input = sc.nextLine();
		String[] su = null;
/*
		if(input.indexOf('+')>0) {
			su = input.split("\\+");
		}
		if(input.indexOf('-')>0) {
			su = input.split("\\-");
		}
		if(input.indexOf('*')>0) {
			su = input.split("\\*");
		}
		if(input.indexOf('/')>0) {
			su = input.split("\\/");
		}
		
		int su1 = Integer.parseInt(su[0]);
		int su2 = Integer.parseInt(su[1]);
		
		if(input.indexOf('+')>0) {
		System.out.println(input + " = " + (su1 + su2));
		}
		if(input.indexOf('-')>0) {
			System.out.println(input + " = " + (su1 - su2));
		}
		if(input.indexOf('*')>0) {
			System.out.println(input + " = " + (su1 * su2));
		}
		if(input.indexOf('/')>0) {
			if(su1%su2==0) {
				System.out.println(input + " = " + (su1 / su2));
			}else {
				System.out.println(input + " = " + (1.0 * su1 / su2));
			}
			
		}
		
*/		
		char ch = '/';
		char[] arr = {'+','-','*','/'};
		int i = -1;
		for(i = 0; i < arr.length; i++) {
			su = input.split("\\"+arr[i]);
			if(su.length>1) {break;}
		}
		
		int su1 = Integer.parseInt(su[0]);
		int su2 = Integer.parseInt(su[1]);
		
		Number result = null;
		
		if(i == 0) {
			result = su1 + su2;
		System.out.println(input + " = " + (su1 + su2));
		}
		if(i == 1) {
			result = su1 - su2;
		}
		if(i == 2) {
			result = su1 * su2;
		}
		if(i == 3 && su1%su2==0) {
			result = su1 / su2;
		}else if(i == 3){
			result = 1.0 * su1 + su2;
		}

		System.out.println(input + " =  " + result);
		sc.close();
	}
}
