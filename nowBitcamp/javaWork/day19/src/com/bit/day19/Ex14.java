package com.bit.day19;

import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Ex14 {
	public static void main(String[] args) {
		File file = new File("test02.bin");
		
		OutputStream os = null;
		DataOutputStream dos = null;
		
		try {
			os = new FileOutputStream(file);
			dos = new DataOutputStream(os);
			
			dos.writeInt(1234);
			dos.writeDouble(3.14);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(dos != null) {dos.close();}
				if(os != null) {os.close();}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
}
