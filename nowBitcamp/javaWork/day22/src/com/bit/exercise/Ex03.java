package com.bit.exercise;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Ex03 {
	public static void main(String[] args) {
		
		File file = new File("copy\\copyZip.exe");
		
		String spec = "https://www.7-zip.org/a/7z1900.exe";
		
		URL url = null;
		
		URLConnection conn = null;
		
		InputStream is = null;
		BufferedInputStream bis = null;
		
		OutputStream os = null;
		BufferedOutputStream bos = null;
		
		try {
			file.createNewFile();
			url = new URL(spec);
			conn = url.openConnection();
			
			is = conn.getInputStream();
			bis = new BufferedInputStream(is);
			
			os = new FileOutputStream(file);
			bos = new BufferedOutputStream(os);
			
			int su = -1;
			while((su = bis.read()) != -1) {
				bos.write(su);
			}
			
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(bis != null) {bis.close();}
				if(is != null) {is.close();}
				if(bos != null){bos.close();}
				if(os != null) {os.close();}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
				
	}
}
