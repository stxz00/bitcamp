package com.bit.day09;

public class EX11Of1 {
	public static void main(String[] args) {
		// 로또 번호 생성기(0.1.0)
		////////////////////////////////
		// 1~45
		// 랜덤 6개 숫자
		// 중복x
		// sort
		java.util.Scanner sc;
		sc = new java.util.Scanner(System.in);
		
		System.out.println("로또 번호 생성기(0.1.0)");
		System.out.println("------------------------");
		
		System.out.print("구매할 횟수 : ");
		int lotto = Integer.parseInt(sc.nextLine());
		int money = 0;
		money -= lotto * 1000;
		int number;


		int[] prizeNumber = new int[6];
		int[][] myNumber = new int[lotto][6];
		int bonusNumber;
		int count = 0;
		
		boolean bonusprize = false;
		
		while(true) {
			
			for(int i = 0; i < prizeNumber.length; i++) {
				while(true) {
					number = (int)(Math.random()*100);
					if(number >0 && number < 45) {
						break;
					}
				}
				
				for(int j = 0; j <= i; j++) {

					if(number == prizeNumber[j]) {
						while(true) {
							number = (int)(Math.random()*100);
							if(number >0 && number < 45) {
							break;
							}
						}	
						j = 0;
					}
				}
				prizeNumber[i] = number;
			}
			
			for(int i = 0; i < prizeNumber.length; i++) {
				for(int j = 1; j < prizeNumber.length; j++) {
					if(prizeNumber[j-1] > prizeNumber[j]) {
						int a = prizeNumber[j-1];
						int b = prizeNumber[j];
						prizeNumber[j-1] = b;
						prizeNumber[j] = a;
					}
				}
			}
			
			
			while(true) {
				number = (int)(Math.random()*100);
				if(number >0 && number < 45) {
					break;
				}
			}
				
			for(int i = 0; i < prizeNumber.length; i++) {
				if(number == prizeNumber[i]) {
					while(true) {
						number = (int)(Math.random()*100);
						if(number >0 && number < 45) {
							break;
						}
					}
					i = 0;
				}
			}
			bonusNumber = number;	

			
			for(int k = 0; k < myNumber.length; k++) {
				for(int i = 0; i < myNumber[i].length; i++) {
					while(true) {
						number = (int)(Math.random()*100);
						if(number >0 && number < 45) {
							break;
						}
					}
				
					for(int j = 0; j <= i; j++) {
						if(number == myNumber[k][j]) {
							while(true) {
								number = (int)(Math.random()*100);
								if(number >0 && number < 45) {
									break;
								}
							}	
							j = 0;
						}
					}
					
					myNumber[k][i] = number;
				}
			}	
			for(int k = 0; k < myNumber.length; k++) {
				for(int i = 0; i < myNumber[k].length; i++) {
					for(int j = 1; j < myNumber[k].length; j++) {
						if(myNumber[k][j-1] > myNumber[k][j]) {
							int a = myNumber[k][j-1];
							int b = myNumber[k][j];
							myNumber[k][j-1] = b;
							myNumber[k][j] = a;
						}
					}
				}
			}
			break;
		}	
		
		System.out.println("당첨번호");
		
		for(int a : prizeNumber) {
			System.out.print(a + "\t");
		}
		System.out.print("보너스 " + bonusNumber + "\n");
		
		System.out.println();
		
		System.out.println("내 번호");
		
		System.out.println("-------------------------------------------------------------");
		for(int j = 0; j < myNumber.length; j++) {
			for(int i = 0; i < myNumber[j].length; i++) {
				if(prizeNumber[i] == myNumber[j][i]) {
					count++;
				}
				if(myNumber[j][i] == bonusNumber) {
					bonusprize = true;
				}
				System.out.print(myNumber[j][i] + "\t");
			}
			System.out.println();
			System.out.println("맞은 개수 : " + count + " 보너스 : " + bonusprize);
			if(count == 6) {
				System.out.println("1등에 당첨되셨습니다");
				money += 2000000000;
			}else if(count == 5 && bonusprize == true) {
				System.out.println("2등에 당첨되셨습니다");
				money += 50000000;
			}else if(count == 5) {
				System.out.println("3등에 당첨되셨습니다");
				money += 1500000;
			}else if(count == 4) {
				System.out.println("4등에 당첨되셨습니다");
				money += 50000;
			}else if(count == 3) {
				System.out.println("5등에 당첨되셨습니다");
				money += 5000;
			}else {
				System.out.println("당첨되지 않았습니다");
			}
			System.out.println("-------------------------------------------------------------");
			count = 0;
			bonusprize = false;
		}
			System.out.println("내 돈 : " + money);
		sc.close();
	}
}
