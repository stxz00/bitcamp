package com.bit.day05;

class Ex08{

 public static void main(String[] args){
	System.out.println("Q1.");
	for(int i=0; i<3; i++){
		for(int j=0; j<3; j++){
			System.out.print("★");
		}
		System.out.println();
	}
	System.out.println("--------------------");
	boolean boo = true;
	int count = 1;
	int alphabet = 'a';
	while(boo){
		for(int j = 1; j <=3; j++){
			System.out.print((char)alphabet);
			alphabet++;
		}

		System.out.println();
		if(count ==3){
			boo = false;
		}
		
		count ++;
	}
	System.out.println("--------------------");
	System.out.println("Q3.");
	for(int i = 1; i < 10; i++){
		System.out.print(i);
		if(i % 3 == 0){
			System.out.println();
		}
	}
	System.out.println("--------------------");
	System.out.println("Q3.");
	int su = 1;
	for(int i =0; i<3; i++){
		for(int j = 0; j < 3; j++){
			System.out.print(su++);
		}
		System.out.println();
	}
	System.out.println("--------------------");
	System.out.println("Q4.");
	for(int i = 0; i < 3; i++){
		for(int j = 1; j < 4; j++){
		System.out.print(j+i);
		}
		System.out.println();
	}
		System.out.println();
	int temp = 3;
	for(int i = 1; i< 6; i++){
		System.out.print(i);	
		if(i !=5 && temp == i){
			System.out.println();
			i-=2;
			temp++;
		}
	}


	System.out.println();
	System.out.println("--------------------");
	System.out.println("Q4.");
	// 1 2 3 -> 1+0/ 2+0/ 3+0 -> 1+3*0/ 2+0/ 3+0
	// 4 5 6 -> 1 + 3/ 2 + 3/ 3 + 3/ -> 1 + 3*1/ 2 + 3*1/ 3 + 3*1/
	// 7 8 9 -> 1 + 3  + 3/ 2 + 3 + 3/ 3 + 3 + 3/ -> 1 + 3 *2/ 2 + 3*2/ 3 + 3*2/
	
	for(int j = 0 ; j <= 6; j += 3){
		
		for(int i = 1; i < 4; i ++){
			System.out.print(i+j);
		}
		System.out.println();
	}
	System.out.println();
	for(int j = 0; j <= 2; j++){
		for(int i = 1; i < 4; i ++){
			System.out.print(i+3*j);
		}
		System.out.println();
	}

	System.out.println("--------------------");
	System.out.println("Q5.");
	char mark = '★';
	for(int j = 1; j < 4; j++){
		for(int i = 0; i <j; i++){
			System.out.print(mark);
		}
		System.out.println();
	} 
	System.out.println("--------------------");
	System.out.println("Q6.");
	mark = 65;
	for(int j = 1; j < 4; j++){
		for(int i = 0; i <j; i++){
			System.out.print(mark++);
		}
		System.out.println();
	} 

	System.out.println("--------------------");
	// 0 1 2 3 4 5 6 7 8
	//★@★★@★★★@
	// 1(1+0) 4(1+3) 8(1+3+4) 13(1+3+4+5)
	mark = '★';
	int a = 1;
	int b = 3;
	for(int i = 0; i < 14; i++){
		if(i == a){
			System.out.println();
			a += b++;
		}else{
			System.out.print(mark);
		}
		
	}
	System.out.println("--------------------");
	// 1 2 3 4 5 6 7 8 9 10 11
	//★★★★★★★★★★
	// @   @     @         @
		
		int x = 1;
		int y = 2;
		for(int i = 1; i < 11; i++){
			System.out.print(mark);
			if(i==x){
				System.out.println();
				x = i + y++;
			}
		}
	// 0 1 2 3 4 5 6 7 8 9 10 1 2 3
	//★@★★@★★★@★★★★@
	



 }
}