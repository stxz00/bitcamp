package com.bit.day14;

import java.io.File;
import java.text.SimpleDateFormat;

public class MyExercise {
	public static void main(String[] args) {
		File file = new File(".");
		System.out.println(file.getAbsolutePath() + "\t 디렉터리");
		
		String[] arr1 = file.list();
		
		String[] arr = new String[arr1.length+2];
		
		arr[0] = ".";
		arr[1] = "..";
		System.arraycopy(arr1, 0, arr, 2, arr1.length);
		
		int fileCnt = 0;
		int byteSum = 0;
		int dirCnt = 0;
		for(int i = 0; i < arr.length; i++) {
			File fi = new File(arr[i]);
			Long time = fi.lastModified();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm");
			String fiTime = sdf.format(time);
			System.out.print(fiTime);
			if(fi.isDirectory()) {
				System.out.println("\t<DIR>\t\t" + fi);
				fileCnt++;
				byteSum += fi.length();
			}else {
				System.out.println("\t\t" + fi.length() + "\t" + fi);
				dirCnt++;
			}
			
		}
		System.out.println("\t\t" + fileCnt + "개 파일" + "\t\t" + byteSum + " 바이트");
		System.out.println("\t\t" + dirCnt + "개 디렉터리");
	}
}
