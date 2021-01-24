package com.bit.day14;

import java.io.File;
import java.io.IOException;

public class Ex03 {
	public static void main(String[] args) {
		
//		File file = new File(".\\test03\\target03.txt");
		//지정된 경로를 찾을 수 없음 디렉토리 만들어야함
		/*
		File file = new File(".\\test03\\target03.txt");
		File parent = new File(file.getParent()); // 상위인 test03 이 됨
		parent.mkdir();
		try {
			if(file.createNewFile()){
				System.out.println("생성완료");
			}else {
				System.out.println("동일명 파일 존재");
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		*/
		
		File file = new File(".\\test03\\target03.txt");
		
		file.mkdirs();
		try {
			if(file.createNewFile()){
				System.out.println("생성완료");
			}else {
				System.out.println("동일명 파일 존재");
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}
