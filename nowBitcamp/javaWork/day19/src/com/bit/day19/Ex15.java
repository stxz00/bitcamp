package com.bit.day19;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Ex15 {
	public static void main(String[] args) {
		File file = new File("test02.bin");
		
		InputStream is = null;
		DataInputStream dis = null;
		
		try {
			is = new FileInputStream(file);
			dis = new DataInputStream(is);
			/*
			System.out.println(dis.readInt());
			System.out.println(dis.readDouble());
			*/
			System.out.println(dis.readLine());
			System.out.println(dis.readLine());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
