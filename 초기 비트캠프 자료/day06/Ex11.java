package com.bit.day06;

//매우 필수 무조건 외워야함.

class Ex11{
	
	public static void main(String[] args){
		String msg = "ABCD abcd Abc";
		for(int i = 0; i < msg.length(); i++){
			char ch1 = msg.charAt(i);
			System.out.println(ch1);
		}
		
		
		String result = msg.concat("추가");
		System.out.println(result);
		System.out.println(msg);
		System.out.println(msg.equals("ABCD abcd Abc")); //true
		int su1 = msg.indexOf('A'); //가장 먼저 처음에 등장하는 문자의 위치를 출력함
		su1 = msg.indexOf('A',1); //시작점 0건너뛰고 1번째부터 가장 먼저 처음에 등장하는 문자의 위치를 출력함
		su1 = msg.indexOf("AB"); // 0
		su1 = msg.indexOf("abC"); // -1 없다는 뜻
		su1 = msg.indexOf("Ab",2); //10 -> 세는 것은 처음부터임
		System.out.println(su1); 
		String msg2 = new String();
		System.out.println(msg2 == null); // null검사는 이렇게 해야함
		System.out.println(msg2.equals(""));
		System.out.println(msg2.isEmpty()); // 비어있는지 확인하는 방법 2가지, msg2가 아예 null이면 null오류가 뜸
		System.out.println(msg.lastIndexOf('D')); // 해당 문자의 맨 뒤쪽에서부터 찾음
		System.out.println(msg.length());
		System.out.println(msg.replace('C','@')); // 모든 C를 @로 바꿈
		System.out.println(msg); // C가 @로 바뀌지 않았음. 자기가 바뀌는게 아닌 새로운 객체를 만든걸로 반환한다 하면 됨.
		System.out.println(msg.replace("c", "$")); //모든 c를 $로 바꿈
		System.out.println(msg.replace("abc", "ab@")); //모든 c가 바뀌지 않게 앞 몇글자 포함해서 @로 바꿈 사실 그 글자 모두 바뀌는 거지만 안바꿀 글자를 그대로 써서 안바뀌는 것처럼 함
		System.out.println(msg.replaceFirst("c","#")); //먼저 오는 것만 바꿈
		System.out.println(msg.substring(5)); // 몇 번째부터 출력
		System.out.println(msg.substring(5,9)); // 6번째부터 9까지 출력(포인터가 9이므로 9전까지 출력하는것) abcd
		System.out.println(msg.substring(0,2)); // AB
		
		String msg3 = String .valueOf(1234); // 괄호 안의 값들을 문자열로 바꿔줌.(.value() 앞에 자료형 써주면 그 자료형으로 값을 반환해주는 것임)
		// Integer.valueOf(String)은 new Integer()으로 객체를 반환하고 parseInt(String)은 int 기본 자료형을 반환합니다.
		System.out.println(msg3);
		char[] chs = {'a','b','c'};
		System.out.println(new String(chs));
		System.out.println(String.valueOf(chs)); 
	}	
}