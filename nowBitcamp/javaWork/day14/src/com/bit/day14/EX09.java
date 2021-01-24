package com.bit.day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class EX09 {
	public static void main(String[] args) {
		File file = new File("target02.txt");
		java.io.OutputStream os;
		
		try {
			os = new FileOutputStream(file);
			os.write(65);
			os.write(66);
			os.write(67);
			os.write(68);
			
			os.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
