package com.bit.day04;

class Ex05{
 public static void main(String[] args){
	
	/*
	for(int j = 1; j < 10; j++){
		for(int i = 2; i < 10; i++){
		System.out.print(i + "x" + j + " = " + i*j + " ");
		} //outter i end
		System.out.println();
	} // outter for j end
	
	*/
	
	int dan = 2;
	int su = 1;
	boolean boo = true;
	while(boo){
		System.out.print(dan + " x " + su + " = " + dan*su + " ");
		
		if(dan == 9 && su == 9){
			boo = false;	// or break;	
		}else if(dan == 9){
			System.out.println();
			dan = 1;
			su++;
		}
		dan++;	
	}
 } // main end
} // class end
