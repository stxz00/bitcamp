package com.bit.day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class EX04 {
	public static void main(String[] args) {
		File file = new File("test01.txt");
		
		OutputStream os = null;
		String msg = "abcd\nABCD\nefg\nEfg";
		byte[] by = msg.getBytes();
		
		try {
			os = new FileOutputStream(file);

			os.write(by); //받은 버퍼를 출력
			//윈도우 10 아래 버전은 가끔 개행 표시를 ▣로 표시해버림
			os.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(os != null){os.close();}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
