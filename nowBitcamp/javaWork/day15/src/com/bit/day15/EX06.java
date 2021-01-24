package com.bit.day15;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class EX06 {
	public static void main(String[] args) {
		File src = new File("test01.txt");
		File dest = new File("copy\\copy01.txt");
		
		InputStream is = null;
		OutputStream os = null;
		byte[] buf = new byte[5];
		try {
			dest.createNewFile();
			is = new FileInputStream(src);
			os = new FileOutputStream(dest);
			
			while(true) {
//				int su = is.read(buf,0,3) 처음부터 버퍼의 읽어들일 수를 0 부터 3까지 제한할 수도 있음				
				int su = is.read(buf);
				System.out.println(su); 
				//5 5 5 2 -1
				//2에서 3이 남아버림
				if(su == -1) {break;}
				os.write(buf,0,su); //버퍼의 배열 0부터 남은 사이즈(su)만큼 출력
//				기존 결과
//				abcd
//				ABCD
//				efg
//				Efgg
//				E
//				남은 버퍼의 바이트 수 만큼 메모장 바이트도 늘음		
//				읽어들이는 수만큼 동적으로 수행하면 됨
//				남은 버퍼의 위험은 동영상 마지막 끝에 남은 바이트로 해킹 등의 코드를 넣어버릴 수 있으므로 꼭 해당 문제를 해결해야하기 때문에 이렇게 하는 것.
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
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
