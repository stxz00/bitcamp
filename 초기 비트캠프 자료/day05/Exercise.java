/*

가위, 바위, 보 게임(ver 0.1.0)
-------------------------------
1.가위	2.바위	3.보

java com.bit.day05.Ex14 1

당신 : 가위
컴퓨터 : 바위
당신이 졌습니다.
*/

package com.bit.day05;

class Exercise{
	
	public static void win(){
		System.out.println("당신이 이겼습니다.");
	}
	public static void lose(){
		System.out.println("당신이 졌습니다.");
	}
	public static void draw(){
		System.out.println("비겼습니다.");
	}
	

	public static void main(String[] args){


	System.out.println("가위, 바위, 보 게임(ver 0.1.0)");
	System.out.println("-------------------------------");
	System.out.println("1.가위	2.바위	3.보");	
	int selectNumber = Integer.parseInt(args[0]);
	
	if(selectNumber == 1 || selectNumber == 2 || selectNumber == 3){

		int computerNumber = (int)(Math.random() * 100)/30;
	
		computerNumber++;
		if(computerNumber == 4){
			computerNumber--;
		}
		
		System.out.print("당신 : ");
		
		if(selectNumber == 1){
			System.out.println("가위");
		}else if(selectNumber == 2){
			System.out.println("바위");
		}else{
			System.out.println("보");
		}
		System.out.print("컴퓨터 : ");
		
		if(computerNumber == 1){
			System.out.println("가위");
		}else if(computerNumber == 2){
			System.out.println("바위");
		}else{
			System.out.println("보");
		}


		if(selectNumber == 1 && computerNumber == 2){
			lose();
		}else if(selectNumber == 1 && computerNumber == 3){
			win();
		}else if(selectNumber == 2 && computerNumber == 3){
			lose();
		}else if(selectNumber == 2 && computerNumber == 1){
			win();
		}else if(selectNumber == 3 && computerNumber == 1){
			lose();
		}else if(selectNumber == 3 && computerNumber == 2){
			win();
		}else{
			draw();
		}

	}else{
		System.out.println("잘못 입력하셨습니다. 1, 2 ,3 으로만 입력해주세요.");
	}
	


	} // main end
} // class end