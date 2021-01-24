package com.bit.day10;

public class Ex13 {
	public static void main(String[] args) {

		int[] lotto = new int[6];
		
			int ran = 0;
		// 중복값 검출
		for(int i = 0; i < lotto.length; i++) {	
			ran = (int)(Math.random()*45) +1;
			boolean boo = true;
			for(int j = 0; j < i; j++) {
				if(lotto[j] == ran) {
					i--;
					boo=false;
					break;
				}
			}
			if(boo) {lotto[i] = ran;}
		}
		int temp = 0;
		for(int i = 0; i < lotto.length-1; i++) {
			for(int j = i+1; j < lotto.length; j++) {
				if(lotto[i] > lotto[j]) {
					temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
		}
		
		System.out.println(java.util.Arrays.toString(lotto));
		
	
	}
}
