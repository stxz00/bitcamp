package com.bit.day14;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex02 {
	public static void main(String[] args) {
		String path = ".";
		File root = new File(path);
		String[] names = root.list();
		String[] list = new String[names.length + 2];
		list[0] = "."; 
		list[1] = "..";
		System.arraycopy(names, 0, list, 2, names.length);
		
		for(int i = 0; i < list.length; i++) {
			File target = new File(list[i]);
			Long time = target.lastModified();
			Date date = new Date(time);
			/*
			DateFormat df = DateFormat.getDateInstance();
			String day = df.format(date);
			System.out.print(day);
			*/
			String ptn = "yyyy-MM-dd a hh:mm";
			SimpleDateFormat sdf = new SimpleDateFormat(ptn);
			String day = sdf.format(date);
			System.out.print(day + "\t");
			if(target.isDirectory()) {
				System.out.print("<DIR>\t\t");
			}else {
				System.out.print("\t" + target.length()+"\t");
			}
			
			System.out.println(list[i]);
			
		}
	}
}
