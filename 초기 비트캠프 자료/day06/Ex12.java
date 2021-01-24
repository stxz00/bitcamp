package com.bit.day06;

//뭐가 있는지만 알면 됨.

class Ex12{

	public static void main(String[] args){
		String msg = "java Web Framework";
		System.out.println(msg.contains("Web")); //true
		System.out.println(msg.startsWith("java")); // 뭘로 시작하는지
		System.out.println(msg.endsWith("java")); // 뭘로 끝나는지
		System.out.println(msg.endsWith("work")); // 뭘로 끝나는지
		String msg2 = "abcd";
		char[] arr1 = new char[10];
		
		msg2.getChars(1,3,arr1,4); // 2번째부터 3번째까지 arr1에 4번째부터부터 넣기
		for(int i = 0; i < arr1.length; i++){
			System.out.println(arr1[i]);
		}

		/*
		byte[] arr2 = new byte[msg2.length()];
		msg.getBytes(0,msg2.length(),arr2,0);
		for(int i = 0; i < arr2.length; i++){
			System.out.println(arr2[i]);
		}
		*/

		System.out.println(msg.toUpperCase()); //모두 대문자로
		System.out.println(msg.toLowerCase()); //모두 소문자로
		String msg3 = "        a b cd      ";
		System.out.println("#####" + msg3 + "#####");
		System.out.println("#####" +msg3.trim() + "#####"); //.trim() 앞뒤로 공백을 지워줌(검색창 같은)
		
		String msg4 = "java,web,db,framework";
		String[] sts = msg4.split (","); //★★★많이 씀 문자열 , 기준으로 짤라줌 java,web,db,,,,,framework 이면 ,,,쪽에 각 공백문자를 넣어줌
		for(int i = 0; i < sts.length; i++){
			System.out.println(sts[i]); //java web db framework
		} 
	}
}
