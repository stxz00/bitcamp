package com.bit.day14;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex10 {
	public static void main(String[] args) {
		File srcFile = new File("target03.txt");
		File tarFile = new File("test01\\copy2");
//확장자를 짓지 않으면 그냥 파일로 나오고 이는 컴퓨터는 010101로 똑같이 읽으므로 메모장으로 변환하면 나옴
//		File srcFile = new File("google.gif");
//		File tarFile = new File("test01\\target03.gif");
		//test01\\target03.txt는 010101로 나오고
		//지금은 010101을 가지고 화면을 출력 둘 다 컴퓨터는 뭘하든 똑같이 0101로 읽음 그래서 다른 확장자로 해도 메모장을 켜서 보면 그 소스가 나오는 것
		InputStream is;
		OutputStream os;
		try {
			tarFile.createNewFile();
			
			is = new FileInputStream(srcFile);
			os = new  FileOutputStream(tarFile);
			while(true) {
				int su = is.read();
				if(su == -1) {break;}
				os.write(su);
			}
			is.close();
			os.close();
			System.out.println("복사완료");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
