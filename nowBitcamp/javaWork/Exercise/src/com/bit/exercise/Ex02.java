package com.bit.exercise;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Ex02 {
	public static void main(String[] args) {
		File file = new File("..\\day14");
		
		System.out.println(file.list());
		String[] list = file.list();
		
		try {
			System.out.println(file.getCanonicalPath() + "\t 디렉터리\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String[] newList = new String[list.length+2];
		newList[0] = ".";
		newList[1] = "..";
		System.arraycopy(list, 0, newList, 2, list.length);
		
		int fcnt = 0;
		int dcnt = 0;
		int fl = 0;
		for(int i = 0; i < newList.length; i++) {
			File ff = new File(newList[i]);
			Long lm = ff.lastModified();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm");
			
			System.out.print(sdf.format(lm));
			
			if(ff.isDirectory()) {
				System.out.print("\t<DIR>\t\t ");
				dcnt++;
			}else {
				System.out.print("\t\t" + ff.length() + "\t");
				fcnt++;	
				fl += ff.length();
			}

			System.out.println(ff);
		}
		System.out.println("\t\t" + fcnt + "개 파일\t\t" + fl);
		System.out.println("\t\t" + dcnt + "개 디렉터리\t\t");
		
		
		File file2 = new File("C:\\Users\\stxz\\Desktop\\bitcamp\\javaWork\\day14\\google.gif");
		System.out.println(file2.isFile());
		System.out.println(file2.length());
		
		
	}
}
