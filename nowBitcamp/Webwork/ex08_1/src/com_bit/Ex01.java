package com_bit;

public class Ex01 {
	public static void func01(int ... a) { //a는 배열이 되어버림!
		System.out.println("func01()..."+a.length);
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
	}
	public static void func02(int[] a) {
		System.out.println("func01()..."+a.length);
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
	}
	
	public static void main(String[] args) {
		func01();
		func01(1);
		func01(1,2);
		func01(1,2,3);
		func02(new int[] {});
		func02(new int[] {1});
		func02(new int[] {1,2});
		func02(new int[] {1,2,3});
		
		
	}

}
