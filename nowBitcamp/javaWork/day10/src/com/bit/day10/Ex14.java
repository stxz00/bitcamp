package com.bit.day10;

import java.util.Arrays;
import java.util.Random;

public class Ex14 {
	public static void main(String[] args) {
		// ¡Ú
		// ¡Ú¡Ú
		// ¡Ú¡Ú¡Ú
		// ¡Ú¡Ú¡Ú¡Ú
		Random random = new Random();
		int[] lotto = new int[6];
		for(int i = 0; i <lotto.length; i++) {
			int su = random.nextInt(45)+1;
			boolean boo = true;
			for(int j = 0; j <= i; j++) {
//				System.out.print("¡Ú");
				if(su == lotto[j]) {
					i--;
					boo = false;
					break;
				}
			}
//			System.out.println();
			if(boo) {lotto[i] = su;}
		}
		System.out.print(Arrays.toString(lotto));
	}
}
