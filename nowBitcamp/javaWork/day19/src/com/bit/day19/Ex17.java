package com.bit.day19;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ex17 {
	public static void main(String[] args) {
		File file = new File("text01.txt");
		
		Reader fr = null;
		BufferedReader br = null;
		
		try {
			fr= new FileReader(file);
			br = new BufferedReader(fr);
			int su = 1;
			/*
			while((su = fr.read()) != -1) {
				System.out.print((char)su);
			}
			*/
			String msg = null;
			while((msg = br.readLine()) != null) {
				System.out.println(msg);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			try {
				if(br != null) {br.close();}
				if(fr != null) {fr.close();}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
}
