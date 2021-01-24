package com.bit.day14;

import java.io.File;

public class Ex06 {
	public static void main(String[] args) {
		String oldName = "target02.txt";
		String newName = "target03.txt";
		
		File oldFile = new File(oldName);
		File newFile = new File(newName);
		
		if(oldFile.renameTo(newFile)) {
			//이름변경 또한 파일을 넣어야 함
			System.out.println("rename..");
		}else {
			System.out.println("fail..");
		}
		
		// 만약 두 개의 파일이 존재하고 있는 경우 하나의 파일 내용까지 덮어지게 되고 두개의 파일이 존재하게 될 것. -> 난수이용 다음 Ex07에서 설명
	}
}
