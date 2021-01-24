package com.bit.day15;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Ex10 {
	public static void main(String[] args) {
		File file = new File("test03.bin");
		//기본형 단위로 데이터를 처리하는 기능
		OutputStream os = null;
		DataOutputStream dos = null;
		try {
			file.createNewFile();
			os = new FileOutputStream(file);
			dos = new DataOutputStream(os);
			dos.write(97);
			dos.writeInt(1234);
			dos.writeDouble(3.14);
			dos.writeChar('@');
			dos.writeBoolean(true);
			dos.writeUTF("문자열");
			System.out.println("작성끝...");
			//내용은 그대로 나오지 않음(깨짐)
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(dos != null) {dos.close();}
				if(os != null) {os.close();}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
