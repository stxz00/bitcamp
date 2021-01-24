/*
Q1.
★★★
★★★
★★★

Q2.
abc
def
ghi

Q3.
123
456
789

Q4.
123
234
345

Q5.
★
★★
★★★


Q6.
a
bc
def

Q7.
a
ab
abc

*/

package com.bit.day04;

class Ex08{

 public static void main(String[] args){
	
	System.out.println("-----------------Q1-------------------");
	
	String star= "★★★";
	int i = 0;
	while(++i <= 3){
		System.out.println(star);
	}
	System.out.println();
	
	boolean boo = true;
	
	int count = 1;
	while(boo){
		System.out.println(star);
		
		if(count ==3){
			boo = false;
		}
		count ++;
	}
	
	System.out.println("-----------------Q2-------------------");
	int alphabet = 'a';
	i = 0;
	while(++i <= 3){
		int j = 0;
		while(++j <=3){
			System.out.print((char)alphabet);
			alphabet++;
		}
		System.out.println();
	}

		System.out.println();
	
	boo = true;
	count = 1;
	alphabet = 'a';
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
	System.out.println("-----------------Q3-------------------");
	i = 0;
	int su = 1;
	while(++i <= 3){
		int j = 0;
		while(++j <=3){
			System.out.print(su);
			su++;
		}
		System.out.println();
	}
	
	System.out.println();
	
	boo = true;
	count = 1;
	i = 1;
	while(boo){
		for(int j = 1; j <=3; j++){
			System.out.print(i);
			i++;
		}
		System.out.println();
		if(count ==3){
			boo = false;
		}
		count++;
	}
	System.out.println("-----------------Q4-------------------");
	i = 0;
	su = 1;
	while(++i <= 3){
		int j = 0;
		while(++j <=3){
			System.out.print(su);
			
			if(j ==3){
				su--;
			}else{
				su++;
			}
		}
		System.out.println();
	}
	
	System.out.println();
	
	boo = true;
	count = 1;
	i = 1;
	while(boo){
		for(int j = 1; j <=3; j++){
			System.out.print(i);
			if(j ==3){
				i--;
			}else{
				i++;
			}
		}
		System.out.println();
		
		if(count ==3){
			boo = false;
		}
		
		count++;
	}

	System.out.println("-----------------Q5-------------------");
	boo = true;
	count = 1;
	String star2 = new String();
	while(boo){
		star2 = star2 + "★";
		System.out.println(star2);
		
		if(count ==3){
			boo = false;
		}
		count++;
	}

		boo = true;
	System.out.println();
	
	count = 1;
	int star21 = '★';
	while(boo){
		for(int j= 1; j <= count; j++){
			System.out.print((char)star21);
		}
		System.out.println();

		if(count ==3){
			boo = false;
		}
		count++;
	}

	System.out.println("-----------------Q6-------------------");
	alphabet = 'a';
	boo = true;
	count = 1;
	
	while(boo){
		for(int j= 1; j <= count; j++){
			System.out.print((char)alphabet);
			alphabet++;
		}
		System.out.println();
		if(count ==3){
			boo = false;
		}
		count++;
	}

 }
}

