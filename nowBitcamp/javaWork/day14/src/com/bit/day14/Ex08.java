package com.bit.day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Ex08 {
	public static void main(String[] args) {
		File file = new File("target01.txt");
		// 바이트 단위 스트림
		// 1byte Stream (input) 1바이트 체계로 읽어 들임
		java.io.InputStream is; //읽어들임, 추상클래스
		try {
				is = new java.io.FileInputStream(file); 
				//파일없는지 꼭 해야하기 때문에 트라이캐치가 필수됨
				while(true) {
					int su = is.read(); //바이트 단위를 int로 반환
					//IOException 필수체크
					if(su == -1) {break;}
					System.out.println(su);
					//개행 /r/n 각각 하나의 문자로 읽어짐 윈도우만 /r 포함, 다른 운영체제는 \n 인 10 만 출력
					//항상 0101010 이렇게 바이트 단위로 생각할 것
				}
				is.close();
				//IOException 필수체크
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
