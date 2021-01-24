package com.bit.exercise;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex06 {
	public static void main(String[] args) {
		File file = new File("ABCD.txt");
		
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream(file);
			
			byte[] ABCD = new byte[4];
			ABCD[0] = 65;
			ABCD[1] = 66;
			ABCD[2] = 67;
			ABCD[3] = 68;
			
			for(int i = 0; i < ABCD.length; i++) {
				fos.write(ABCD[i]);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(fos != null) {fos.close();}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream(file);
			
			while(true) {
				int su = fis.read();
				if(su == -1) {
					break;
				}
				System.out.print((char)su);
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(fis != null) {fis.close();}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
}
