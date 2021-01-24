package com.bit.exercise;

import java.awt.image.DataBufferDouble;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;
import java.net.URLConnection;

public class Ex05 {
	public static void main(String[] args) {
		
		String spec = "175.192.123.116";
		
		Socket sock = null;
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader bis = null;
		
		try {
			sock = new Socket(spec, 5000);
			is = sock.getInputStream();
			System.out.println("접속완료");
			isr = new InputStreamReader(is);
			bis = new BufferedReader(isr);
			String su = null;
			while((su = bis.readLine()) != null) {
				System.out.println(su);
			}
			
			
			System.out.println("끝마짐");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(bis != null) {bis.close();}
				if(isr != null) {isr.close();}
				if(is != null) {is.close();}
				if(sock != null) {sock.close();}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
