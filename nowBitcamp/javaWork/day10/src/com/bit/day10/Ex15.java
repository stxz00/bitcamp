package com.bit.day10;

import java.util.Arrays;

public class Ex15 {
	public static void main(String[] args) {
		//도형으로 생각하라
		int[] lotto = {6,2,4,1,5,3};
	
		int temp = 0;
	
		for(int i = 0; i < lotto.length -1; i++) {
			for(int j = 1+i ; j < lotto.length; j++) {
				if(lotto[i] > lotto[j]) {
					temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(lotto));
	}
}
