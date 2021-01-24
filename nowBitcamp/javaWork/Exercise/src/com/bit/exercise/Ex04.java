package com.bit.exercise;

import java.io.File;
import java.io.IOException;

public class Ex04 {
	public static void main(String[] args) {
		File file = new File("test01.txt");
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		File file2 = new File("test02.txt");
		if(file.renameTo(file2)) {
			System.out.println("이름 변경 완료");
		}else {
			System.out.println("이미 해당 이름으로 변경");
		}
		
		
	}
}
