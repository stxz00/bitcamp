package com.bit.day15;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class EX05 {
	public static void main(String[] args) {
		//복사완료 : 3505ms (기본)사이즈 오차 없음
		byte[] buf = new byte[64]; // n개씩 받아서 읽어들이고 받을 수
		//복사완료 : 1063ms; 5일때  사이즈 +2 바이트정도
		//복사완료 : 152ms; 64일때	사이즈 +12 바이트정도
		//버퍼를 쓰면 수가 클수록 복사된 jpg의 사이즈가 커짐
		//
		
		
		File src = new File("sample.jpg");
		File dest = new File("copy\\copy01.jpg");
		
		InputStream is = null;
		OutputStream os = null;
		
		try {
			System.out.println("복사시작");
			long before = System.currentTimeMillis();
			if(dest.exists()) {dest.createNewFile();}
			is = new FileInputStream(src);
			os = new FileOutputStream(dest);
			
			while(true) {
				int su = is.read(buf); //바이트 배열로 읽음
				if(su == -1) {break;}
				os.write(buf); //바이트 배열로 씀
			}
			long after = System.currentTimeMillis();
			System.out.println("복사완료 : " + (after - before) + "ms");
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
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
