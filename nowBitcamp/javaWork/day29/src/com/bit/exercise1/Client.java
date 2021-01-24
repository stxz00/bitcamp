package com.bit.exercise1;

import java.awt.FileDialog;
import java.awt.Frame;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) {
		Frame f = new Frame();
		f.setVisible(true);
		FileDialog fd = new FileDialog(f,"저장하기",FileDialog.SAVE);
		fd.setVisible(true);
		
		String path = fd.getDirectory() + fd.getFile() + ".png";
		
		File file = new File(path);
		
		try(Socket sock =  new Socket("localHost",5000);
			InputStream is = sock.getInputStream();
			OutputStream os = sock.getOutputStream();
			FileOutputStream fos = new FileOutputStream(file)){
			
			int su = -1;
			while((su = is.read()) != -1){
				fos.write(su);
			}
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
