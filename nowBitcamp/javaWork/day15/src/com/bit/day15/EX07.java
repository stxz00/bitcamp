package com.bit.day15;

import java.awt.image.DataBufferDouble;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

//필터클래스
public class EX07 {
	public static void main(String[] args) {
		File file1 = new File("sample.jpg");
		File file2 = new File("copy\\copy07.jpg");
		
		InputStream is = null;
		OutputStream os = null;
		
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		byte[] buf = new byte[5];
		
		try {
			long before = System.currentTimeMillis();
			file2.createNewFile();
			is = new FileInputStream(file1);
			bis = new BufferedInputStream(is);
			os = new FileOutputStream(file2);
			bos = new BufferedOutputStream(os);
			/*
			while(true) {
				int su = bis.read();
				if(su == -1) {break;}
				bos.write(su);
				//사이즈 동일하게 출력된 것 확인됨
			}
			*/
			while(true) {
				int su = bis.read(buf);
				if(su == -1) {break;}
				bos.write(buf,0,su);
				//위보다 더 빨라짐 정확히 따지면 buf는 버퍼가 아님
				//일반적으로는 안쓰는게 성능이 좋음
				//바이트배열은 제어하기 쉽다(buf,0,3 이거)
			}
			long after = System.currentTimeMillis();
			System.out.println("복사완료 : " + (after - before) + "ms");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				//닫을 때 순서 있음(오류 출력) 꼭 지키기
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
