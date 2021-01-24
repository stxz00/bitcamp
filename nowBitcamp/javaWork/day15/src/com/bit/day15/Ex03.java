package com.bit.day15;
//버퍼 설명
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class Ex03 {
	public static void main(String[] args) {
		File file = new File("test01.txt");
		byte[] buf = new byte[4];
		InputStream is = null;
		try {
			is = new FileInputStream(file);
			int su = is.read(buf);
			System.out.println(Arrays.toString(buf));
			System.out.println(su);
			//읽어들인 값을 쓴다 했지만 지금 buf는 읽었을 때 buf가 test에서 1바이트씩 읽어들인 갯수를 뜻함.
			su = is.read();
			System.out.println(su);
			su = is.read(); //읽어들일게 없으면 -1출력
			System.out.println(su);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(is != null) {is.close();}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
