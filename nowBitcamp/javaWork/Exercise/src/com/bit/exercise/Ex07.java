package com.bit.exercise;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex07 {
	public static void main(String[] args) {
		File file = new File("A.txt");
		FileOutputStream fos = null;
		FileInputStream fis = null;
		
		try {
			fos = new FileOutputStream(file);
			fis = new FileInputStream(file);
			
			String kor = "문자열 출력";
			byte[] by = kor.getBytes();
			byte[] by1 = new byte[by.length];
			for(int i = 0; i < by.length; i++) {
				fos.write(by[i]);
				by1[i] = (byte)fis.read();
			}
			String read = new String(by1);
			System.out.println(read);

		} catch (FileNotFoundException e) {
	
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(fos != null) {fos.close();}
				if(fis != null) {fis.close();}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
		
	
	}
}
