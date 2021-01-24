package com.bit.day06;

class Ex05{

	public static void  main(String[] args){
		
		String st1 = "ABCD";
		String st2 = new String();
		String st3 = new String(st1);
		byte[] arr1 = new byte[]{65,66,67,68};
		String st4 = new String(arr1);
		char[] arr2 = new char[]{'A','B','C','D'};
		String st5 = new String(arr2);

		byte[] arr3 = st1.getBytes(); //ABCD의 각 한 문자씩 바이트로 가짐
		char[] arr4 = st1.toCharArray();

		System.out.println(st1);
		System.out.println(st2);
		System.out.println(st3);
		System.out.println(st4);
		System.out.println(st5);
		
		for(int i = 0; i < arr3.length; i++){
			System.out.println(arr3[i]);
		}
		
		for(int i = 0; i < arr4.length; i++){
			System.out.println(arr4[i]);
		}
		System.out.println(st1.length());
	}
}

