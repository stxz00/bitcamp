package com.bit.day14;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex11 {
	public static void main(String[] args) {
		String msg = "문자열 작성합니다"; //17바이트 띄어쓰기 1바이트
		byte[] by = msg.getBytes();
		File file = new File("target04.bin");
		FileOutputStream fos = null;
		try {
			file.createNewFile();
			fos = new FileOutputStream(file);
			
			for(int i = 0; i < by.length; i++) {
				fos.write(by[i]);
			}
			System.out.println("작성완료");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(fos != null) {fos.close();} //초기화 해달라는 오류
				//if를 쓰지 않으면 null인 상황에서 닫으면 IOException 오류가 또 나니까
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
