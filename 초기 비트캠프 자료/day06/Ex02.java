package com.bit.day06;

class Ex02{

	public static void main(String[] args){
		String st1 = "java";
		String st2 = "java";
		String st3 = args[0];
		if(st1 ==  st2){
			System.out.println("st1 == st2"); //true
		}else{
			System.out.println("st1 != st2");
		}
		
		if(st1 ==  st3){
			System.out.println("st1 == st3"); //false
		}else{
			System.out.println("st1 != st3");
		}
		
		switch(st1){
			case "java" : 
				System.out.println("st1 == st3");	//true
				break;
			default : 
				System.out.println("st1 != st3");
				break;
		}

		//swich문이 value값을 나타냄!(switch의 특성임! case에 st1 같은 건 안됨. 값이 아니라 주소이므로! )
		
		switch(args[0]){
			case "java" : 
				System.out.println("st1 == st3");	//ture
				break;
			default : 
				System.out.println("st1 != st3");
				break;
		}
	}
}