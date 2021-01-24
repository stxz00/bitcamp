package com.bit.day19;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex12 {
	
	public static void main(String[] args) {
		// ByteStream - 1byte
		File file = new File("text02.txt");
		InputStream is = null;
		File result = new File("text01.txt");
		
		
		OutputStream os = null;
		/*
		try {
			is = new FileInputStream(file);
			os = new FileOutputStream(result);
			while(true) {
				int su = is.read();
				if(su == -1) {break;}
				os.write(su);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(is != null) {is.close();}
				if(os != null) {os.close();}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		*/
		byte[] by = new byte[(int) file.length()];
		try {
			is = new FileInputStream(file);
			os = new FileOutputStream(result);
			int i = 0;
			while(true) {
				int su = is.read();
				if(su == -1) {break;}
				by[i++] = (byte)su;
				os.write(su);
			}
			System.out.print(new String(by));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(is != null) {is.close();}
				if(os != null) {os.close();}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
