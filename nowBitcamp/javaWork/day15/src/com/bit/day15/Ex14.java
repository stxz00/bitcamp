package com.bit.day15;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//문자스트림
public class Ex14 {
	public static void main(String[] args) {
		File file = new File("test01.txt");
		
		// 2바이트씩 읽음 2바이트씩인지라 홀수바이트 나오면 문재는 있을 수 잇음
		// char은 음수가 없으니까 0~256 중에 없다는 표시로 int값은 0이 나옴
		java.io.Reader rd = null;
		char[] cbuf = new char[5];
		BufferedReader br = null;
		try {
			rd = new FileReader(file);
			br = new BufferedReader(rd);
			/*
			while(true) {
				int su = rd.read();
				if(su == -1) {break;}
				System.out.print((char)su);
			}
			*/
			while(true) {
				//int su = br.read(cbuf);
				//if(su == -1) {break;}
				//System.out.print(new String(cbuf,0,su));
				String msg = br.readLine(); //1문장 읽음
				if(msg == null) {break;}
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
				if(rd != null) {rd.close();}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
