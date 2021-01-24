package com.bit.day09;

import java.util.Random;

public class Ex11past{

	public static void notPrize(){
		System.out.println("당첨되지 않았습니다.");
	}
	

	public static void main(String[] args){
		
		Random random = new Random();
	
		int myNumber;
		int prizeNumber;
		int[] me = new int[6];
		int[] prize = new int[6];
		int count = 8;

		myNumber = random.nextInt(45)+1;
		prizeNumber = random.nextInt(45)+1;

		me[0] = myNumber;
		prize[0] = prizeNumber;


		for(int j = 1; j < me.length; j++){
			boolean boo = true;
			while(boo){
				myNumber = random.nextInt(45)+1;
				for(int k = 0; k <= j-1; k++){
					if(me[k] == myNumber){
						myNumber = random.nextInt(45)+1;
						k = 0;
					} // if end
					
				} //for end
				me[j] = myNumber;
				boo = false;
			} // while end

			boo = true;
			while(boo){
				prizeNumber = random.nextInt(45)+1;
				for(int k = 0; k <= j-1; k++){
					if(prize[k] == prizeNumber){
						prizeNumber = random.nextInt(45)+1;
						k = 0;
							
					} // if end
						
				} // for end
				prize[j] = prizeNumber;
				boo = false;
			} //while end
		} // int for end
				

		for(int j = 0; j < me.length; j++){
			
			for(int i = 0; i < me.length; i++){
				if(prize[j] == me[i]){
					count--;
				}
			} 
			
		} 
		
		int bonusNumber = random.nextInt(45) + 1;
		for(int i = 0; i < prize.length; i++){
			if(prize[i] == bonusNumber){
				bonusNumber = random.nextInt(45) + 1;
				i = 0;
			}
		}

		int bonusPrize = 0;
		for(int i = 0; i < me.length; i++){
			if(me[i] == bonusNumber){
				bonusPrize++;
			}
		}

		System.out.println("로또 534252회차(자동)");
		System.out.println("-------------------------");

		System.out.println("당첨번호");
		System.out.println(prize[0] + "  " +prize[1] + "  " +prize[2] + "  " +prize[3] + "  " +prize[4] + "  " +prize[5] + "  보너스" + bonusNumber);

		System.out.println("내 번호");
		System.out.println(me[0] + "  " +me[1] + "  " +me[2] + "  " +me[3] + "  " +me[4] + "  " +me[5]);
		System.out.println("-------------------------");
		

		if(count >= 6){
			notPrize();
		}else if(count == 2){
			System.out.println("1등에 당첨되셨습니다!");
		}else if(count == 3){
			if(bonusPrize == 1){
			System.out.println("2등에 당첨되셨습니다!");
			}else{
				System.out.println("3등에 당첨되셨습니다!");
			}
		}else{
			System.out.println(count + "등에 당첨되셨습니다.");	
		}


	} //main end
} //class end