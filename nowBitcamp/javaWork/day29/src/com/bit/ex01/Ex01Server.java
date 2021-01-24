package com.bit.ex01;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex01Server extends Thread {
	Socket sock;
	@Override
	public void run() {

		InputStream is=null;
		OutputStream os=null;
		InputStream fis=null;
		try {
			is=sock.getInputStream();
			os=sock.getOutputStream();
			File file=new File("temp.zip");
			fis=new FileInputStream(file);
			int su=-1;
			while((su=fis.read())!=-1) {
				os.write(su);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
		try {
			fis.close();
			os.close();
			is.close();
		} catch (IOException e) {
		}
		}
	}

	public static void main(String[] args) {
		ServerSocket serve=null;
		try {
			serve=new ServerSocket(5000);
			while(true) {
				Socket sock = serve.accept();
				Ex01Server thr = new Ex01Server();
				thr.sock=sock;
				thr.start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(serve!=null)serve.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}








