package com.bit.day15;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class EX11 {
	public static void main(String[] args) {
		File file = new File("test03.bin");
		InputStream is = null;
		DataInputStream dis = null;
		try {
			is = new FileInputStream(file);
			dis = new DataInputStream(is);
			
			System.out.println(dis.read());
			System.out.println(dis.readInt());
			System.out.println(dis.readDouble());
			System.out.println(dis.readChar());
			System.out.println(dis.readBoolean());
			System.out.println(dis.readUTF());
			//순서에 맞지 않게 다른 형태로 읽어들이면 엉뚱하게 나오므로 조심해야함(자료형 바이트대로 읽으니)
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(dis != null) {dis.close();}
				if(is != null) {is.close();}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
