package com.bit.exercise;

import java.io.File;
import java.io.IOException;

public class EX05 {
	public static void main(String[] args) {
		File file = new File("test03.bin");
		String file2 = new String("test0");
		String file3 = new String("bin");
		try {
			File temp = file.createTempFile(file2, file3);
			
			Thread.sleep(5000);
			
			temp.delete();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
