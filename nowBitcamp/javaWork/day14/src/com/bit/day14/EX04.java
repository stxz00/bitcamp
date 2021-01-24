package com.bit.day14;

import java.io.File;

public class EX04 {
	public static void main(String[] args) {
		/*
		String path = "test05\\etc01";
		File file = new File(path);
		File parent = new File(file.getParent());
		parent.mkdir();
		if(file.mkdir()) {
			//디렉토리 생성
			System.out.println("디렉토리 생성 완료");
		}else {
			System.out.println("생성실패");
		}
		*/
		String path = "test05\\etc01";
		File file = new File(path);
		if(file.mkdirs()) {
			//디렉토리 생성
			System.out.println("디렉토리 생성 완료");
		}else {
			System.out.println("생성실패");
		}
		
	}
}
