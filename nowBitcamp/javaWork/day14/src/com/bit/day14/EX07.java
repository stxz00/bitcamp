package com.bit.day14;

import java.io.File;
import java.io.IOException;

public class EX07 {
	public static void main(String[] args) {
		String prefix = "target03"; //접두 경로
		String suffix = ".txt";		//접미 확장자
	//c:\Users\계정\AppData\Local\Temp
	//C:\Users\stxz\AppData\Local\Temp
		try {
			File file = File.createTempFile(prefix, suffix);
			//createTempFile임시파일 만드는거
	// 새로운 임시파일을 파일 이름에 prefix와 suffix를 붙여 directory 폴더에 생성한다.
			try {
				Thread.sleep(3000); //출력시간 지연 1000당 1초
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			file.delete();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//임시파일은 운영체제에서 30일 후면 알아서 지움
		//시크릿창을 예로들면 창을 닫자마자 임시파일 다 지우는것
		//임시파일을 지운다 해도 0101010 같은 자료들이 남아 있음
		//엑셀 강제종료 된 후 다시 키면 불러오는 파일이 임시파일을 갖다가 붙여 넣은 것
		
	}
}
