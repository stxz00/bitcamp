package com.bit.day12;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Ex13 {
	public static void main(String[] args) {
		// 로또 번호 생성기(ver 0.3.0)
		Random ran = new Random();
		Set lotto = new TreeSet();
		while(lotto.size()<6) {
			lotto.add(ran.nextInt(45)+1); 
		}
		Object[] note = lotto.toArray();
		System.out.println(Arrays.toString(note));
	}
}
