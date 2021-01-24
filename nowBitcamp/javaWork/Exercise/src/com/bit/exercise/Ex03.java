package com.bit.exercise;

import java.io.File;
import java.io.IOException;

public class Ex03 {
	public static void main(String[] args) {
		File file = new File("My.txt");
		
	
			try {
				if(file.createNewFile()) {
					System.out.println("생성완료");
				}else {
					System.out.println("이미 같은 이름의 파일이 존재합니다");
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
		
		File file2 = new File("Myd");
		
		if(file2.mkdir()) {
			System.out.println("디렉터리 생성완료");
		}else {
			System.out.println("동일한 디렉터리 존재");
		}
	}
}
