package com.bit.day10;

import java.util.Random;

public class Ex16 {
	public static void main(String[] args) {
		
		
		int[] lotto;
		lotto = new int[45];
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = i + 1;
		}
		// mix
		Random random = new Random();
		int temp = 0;
		for(int i = 0; i < 100000; i++) {
			int ran = random.nextInt(44)+1;
			temp = lotto[0];
			lotto[0] = lotto[ran];
			lotto[ran] = temp;
		}
		
		
		for(int i = 0; i < 6; i++) {
			System.out.println(lotto[i]);
		}
		
	}
}
