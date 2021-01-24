package com.bit.exercise;

import java.io.File;

public class Ex01 {
	public static void main(String[] args) {
		
	
		File file = new File("C:\\Users\\stxz\\Desktop\\bitcamp\\javaWork\\day14\\target04.bin");
		
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		System.out.println(file.canExecute());
		
		
	
	}
}
