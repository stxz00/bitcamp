package com.bit.day15;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
//바이트어레이스트림
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class EX13 {
	public static void main(String[] args) {
		File file = new File("test01.txt");
		InputStream is = null;
		ByteArrayOutputStream baos = null;
		BufferedOutputStream bos = null;
		try {
			is = new FileInputStream(file);
			baos = new ByteArrayOutputStream();
			bos = new BufferedOutputStream(baos);
			while(true) {
				int su = is.read();
				if(su == -1) {break;}
				bos.write(su); 
				//그동안에는 기능을 장착했지만
				//이것은 임시적으로 저장할 필요가 있을 때 사용하는 것
				//그동안 배열 수를 정해서 했지만 이건 그럴 필요 없이 넣음
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(bos != null) {bos.close();}
				if(baos != null) {baos.close();}
				if(is != null) {is.close();}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		File copy = new File("copy\\copy06.txt");
		OutputStream os = null;
		ByteArrayInputStream bais = null;
		byte[] buf = baos.toByteArray();
		//임시저장한 것을 배열로 만듬
		try {
			os = new FileOutputStream(copy);
			bais = new ByteArrayInputStream(buf);
			while(true) {
				int su = bais.read();
				if(su == -1) {break;}
				os.write(su);
			}
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				
				if(bais != null) {bais.close();}
				if(os != null) {os.close();}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
