package com.bit.day09;

public class Ex03 {
	public static void main(String[] args) {
		int su = 0;
		try {
		    su = func01(su);
		}catch(ArithmeticException e) {		
		}
		   System.out.println("su : " + su);
	
		
	}
	

	

	
	public static int func01(int a) throws ArithmeticException {
		int b =0;
//		try {
			b= 10/a;
//		} catch(ArithmeticException e) {
			
//		}
		return b;
	}
	

}
