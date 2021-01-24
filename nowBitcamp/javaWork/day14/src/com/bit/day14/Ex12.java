package com.bit.day14;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex12 {
	public static void main(String[] args) {
		//한글은 2바이트 이므로 1바이트씩 읽으면 앞에있는 1바이트밖에 못읽기 때문에 잘못된 바이트숫자가 나오므로 x 그래서 while로 바이트를 하나씩 읽는게 아닌 배열로 한글문자를 하나씩 공간에 담아뒀다가 각 한 공간의 내용을 String으로 읽고 println 하는 것. 
		File file = new File("target04.bin");
		String msg = null;
		byte[] by = new byte[(int) file.length()];
		FileInputStream fis = null;
		try {
			fis= new FileInputStream(file);
			
			for(int i = 0; i < by.length; i++) {
				by[i] = (byte)(fis.read());
			}
			msg = new String(by);
			System.out.println(msg);
			
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			 try {
				if(fis != null) {fis.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
