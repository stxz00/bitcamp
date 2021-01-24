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

class Ex14{
	public static void win(){
		System.out.println("당신이 이겼습니다.");
	}

	public static void lose(){
		System.out.println("당신이 졌습니다.");
	}


	public static void main(String[] args){

		System.out.println("가위, 바위, 보 게임(ver 0.1.0)");
		System.out.println("-------------------------------");
		
		int myNumber = Integer.parseInt(args[0]);


		
		boolean boo = true;
		while(boo){
			
			if(myNumber == 1 || myNumber == 2 || myNumber == 3){
				if(myNumber == 1){
					System.out.println("당신 : 가위");
				}else if(myNumber == 2){
					System.out.println("당신 : 바위");
				}else{
					System.out.println("당신 : 보");
				} // in if end


				double ran = Math.random();
				int computer = (int)(ran *100/30);
				

				System.out.print("컴퓨터 : ");
				if(computer == 0){
					System.out.println("가위");
				}else if(computer == 1){
					System.out.println("바위");
				}else{
					System.out.println("보");
					computer = 2;
				} // in if end
		
				if(myNumber == 1 && computer == 1){
					lose();
				}else if(myNumber == 1 && computer == 2){
					win();
				}else if(myNumber == 2 && computer == 0){
					win();
				}else if(myNumber == 2 && computer == 2){
					lose();
				}else if(myNumber == 3 && computer == 0){
					lose();
				}else if(myNumber == 3 && computer == 1){
					win();
				}else{
					System.out.println("비겼습니다.");
				} // in if end					

				boo = false;
			}else{
					System.out.println("잘못 입력하셨습니다.");
					boo = false;
			} // if end
		} // while end
		
	} //main end
}//class end
