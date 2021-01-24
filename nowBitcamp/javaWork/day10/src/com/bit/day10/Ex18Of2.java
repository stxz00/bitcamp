package com.bit.day10;

import java.util.Arrays;
import java.util.Random;

public class Ex18Of2 {
	final int su;
	boolean boo = false;
	Ex18Of2(int a){
		su = a;
	}
	
	
	public static void main(String[] args) {
		Ex18Of2[] ball = new Ex18Of2[45];
		
		for(int i = 0; i < ball.length; i++) {
			Ex18Of2 box = new Ex18Of2(i+1);
			ball[i] = box;
		}
		
		int[] pick = new int[6];
		
		int count = 0;
		int su3 = 0;
		Random ran = new Random();
		
		while(true) {
			if(count == 6) {break;}
			
			for(int i = 0; i < pick.length; i++) {
				int su2 = ran.nextInt(45);
				
				if(ball[su2].boo) {
					continue;
				}else {
					pick[i] = ball[su2].su; 
					ball[su2].boo = true;
					count++;
				}
			}
		}
		
		for(int i = 0; i < pick.length-1; i++) {
			for(int j = i; j < pick.length; j++ ) {
				if(pick[i] > pick[j]) {
					su3 = pick[i];
					pick[i] = pick[j];
					pick[j] = su3;
				}
			}
		}
		
		System.out.println(Arrays.toString(pick));
		
				
	}
}
