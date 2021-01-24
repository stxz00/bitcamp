/*
Q1. "ABCD" -> "abcd"

Q2. 주민번호 체크기
      java com.bit.day06.Ex06 200101-4234567
      당신은 1살 여성입니다.
      java com.bit.day06.Ex06 990101-1234567
      당신은 22살 남성입니다.
*/

package com.bit.day06;

class Ex06{

	public static void main(String[] args){
		System.out.println("Q1. 다음을 소문자로만 출력하세요.");

/*		String a1 = "ABCD";
		
		char[] b1 = a1.toCharArray();
		
		byte c = 'a'-'A';
		
		for(int i = 0; i < b1.length; i++){
			System.out.print((char)(b1[i]+c));
		}
		System.out.println();
		
		String s = args[0];
		System.out.println(s);
*/
		String st1 = "ABCD";
		
		char[] ch1 = st1.toCharArray();
		for(int i = 0; i < ch1.length; i++){
			ch1[i] = (char)(ch1[i]+('a'-'A'));
			
		}
		String st2 = new String(ch1);
		System.out.println(st2);

		System.out.println("-------------------");
/*	실패함	
		System.out.println(args[0]);

		String a = args[0];
		char[] bb = a.toCharArray(); 
		System.out.println(bb[0]);
		System.out.println(bb[1]);
		if(bb[0] == 9){
			System.out.print("당신은" + (121-((int)bb[0]*10 + (int)bb[1])) + "살");
			
			if(bb[7] == '3'){
				System.out.println("남성입니다.");
			}else{
				System.out.println("여성입니다.");
			}
				
		}else{
			System.out.print("당신은" + (21-(int)(bb[0] + bb[1])) + "살");
			if(bb[7] == 1){
				System.out.println("남성입니다.");
			}else{
				System.out.println("여성입니다.");
			}
		}
*/
		

		
	
	
	}
}