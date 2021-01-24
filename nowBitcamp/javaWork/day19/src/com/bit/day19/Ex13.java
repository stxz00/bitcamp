package com.bit.day19;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex13 {
	// 필터클래스 - io 기능을 더해줌
	// 디자인패턴 - 데코레이터 패턴(Decorator Pattern)
	public static void main(String[] args) {
		File src = new File("a.png");
		File dest = new File("copy\\copy01.png");
		File path = new File(dest.getParent());
		path.mkdir();
		InputStream is = null;
		OutputStream os = null;
		
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {	
			dest.createNewFile();
			is = new FileInputStream(src);
			os = new FileOutputStream(dest);
			
			bis = new BufferedInputStream(is);
			bos = new BufferedOutputStream(os);
			
			int su = 1;
			while((su = bis.read()) != -1) {
				su = bis.read();
				bos.write(su);
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(bis != null) {bis.close();}
				if(bos != null) {bos.close();}
				if(is != null) {is.close();}
				if(os != null) {os.close();}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
}
