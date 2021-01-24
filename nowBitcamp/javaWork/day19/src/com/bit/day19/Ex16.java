package com.bit.day19;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.File;

public class Ex16 {
	public static void main(String[] args) {
		File file = new File("test02.bin");
		
		OutputStream os = null;
		PrintStream ps = null;	
		
		try {
			os = new FileOutputStream(file);
			ps = new PrintStream(os);
			os.write("9999".getBytes());
			ps.println(4321);
			ps.println(4.14);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(ps != null) {ps.close();}
				if(os != null) {os.close();}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
