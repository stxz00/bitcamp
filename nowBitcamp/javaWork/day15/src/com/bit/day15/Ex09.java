package com.bit.day15;
import java.io.BufferedOutputStream;
//다중필터
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class Ex09 {
	public static void main(String[] args) {
		String msg = "다중필터장착";
		File file = new File("test02.txt");
		
		OutputStream os = null;
		BufferedOutputStream bos = null;
		PrintStream ps = null;
		
		try {
			os = new FileOutputStream(file);
			bos = new BufferedOutputStream(os);
			ps = new PrintStream(bos);
			ps.print(msg);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(ps != null) {ps.close();} // ps 자체에 클로즈가 장착되어 있음
				if(bos != null) {bos.close();}
				if(os != null) {os.close();}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		/*
		try {
			os = new FileOutputStream(file);
			ps = new PrintStream(os);
			bos = new BufferedOutputStream(ps);
			bos.write(msg.getBytes());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(bos != null) {bos.close();}
				if(ps != null) {ps.close();} 
				if(os != null) {os.close();}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		*/
		
	}
}
