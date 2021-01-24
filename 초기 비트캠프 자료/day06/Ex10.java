/*

가위, 바위, 보 게임(ver 0.1.0)
-------------------------------
1.가위	2.바위	3.보

java com.bit.day05.Ex14 1

당신 : 가위
컴퓨터 : 바위
당신이 졌습니다.
*/

package com.bit.day06;

class Ex10{

	public static void main(String[] args){
		String input = args[0];
		System.out.println("가위, 바위, 보 게임(ver 0.1.0)");
		System.out.println("-------------------------------");
		System.out.println("1.가위	2.바위	3.보");
		switch(input){
			case "1" :
				System.out.println("당신 : 가위");
				break;
			case "2" :
				System.out.println("당신 : 바위");
				break;
			case "3" :
				System.out.println("당신 : 보");
				break;
		}
		// 0*10<= ran <1*10+1 0~9.99999 +1
		
		// 1, 2, 3
		int com = 0;
		do{
		double ran = Math.random();
		com = (int)(ran*10+1);
		}while(com>3);
		
		if(com == 1){
			System.out.println("컴퓨터 : 가위");
		}else if(com == 2){
			System.out.println("컴퓨터 : 바위");
		}else if(com == 3){
			System.out.println("컴퓨터 : 보");	
		}
		
		int me = Integer.parseInt(input);
		
		if(me == com){
			System.out.println("비김");
		}else if((me ==1 && com ==3) || (me ==2 && com ==1) || (me ==3 && com ==2)){
				System.out.println("이겼음");
		}else{
			System.out.println("졌음");
		}

		/*
		if(me == 1){
			if(com == 1){
				System.out.println("비김");
			}else if(com == 2){
				System.out.println("졌음");
			}else if(com == 3){
				System.out.println("이겼음");
			}
		}else if(me == 2){
			if(com == 1){
				System.out.println("이겼음");
			}else if(com == 2){
				System.out.println("비겼음");
			}else if(com == 3){
				System.out.println("졌음");
			}
		}else if(me == 3){
			if(com == 1){
				System.out.println("이겼음");
			}else if(com == 2){
				System.out.println("졌음");
			}else if(com == 3){
				System.out.println("비겼음");
			}
		}
		*/
		

	}
}