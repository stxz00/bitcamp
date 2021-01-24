package com.bit.day10;

import java.util.Arrays;
import java.util.Random;

class Ball02{
	final int su;
	boolean check;
	
	public Ball02(int su) {
		this.su = su;
		check = false;
	}
	
}

public class EX18 {
	public static void main(String[] args) {
		Ball02[] box = new Ball02[45];
		int[] note = new int[6];
		
		for(int i = 0; i < box.length; i++) {
			box[i] = new Ball02(i+1);
		}
		
		Random ran = new Random();
		
		int cnt = 0;
		
		while(true) {
			if(cnt == 6) {break;}
			
			int su = ran.nextInt(45);
			Ball02 ball = box[su];
			if(ball.check) {
				//´Ù½Ã 
				continue;
			}else {
				ball.check = true;
			}
			note[cnt++] = ball.su;
		}
		System.out.println(Arrays.toString(note));
		
	}
}
