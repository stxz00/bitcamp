package com.bit.day22;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Writer;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Ex05 {
	
	public static void main(String[] args) {
//		File file = new File("copy/naver.html");
		File file = new File("copy/7z.exe");
		
		java.net.URLConnection conn = null;
		
		//url로부터 접속상태를 받는 것 connection은 접속
		
		String spec = "https://www.7-zip.org/a/7z1900.exe"; //"https://www.naver.com/";  //"https://google.com";
		// 저렇게 되어있어도 /a/문서에 7z1900.exe 를 굳이 만들지 않고 다른 곳에 만들어도 됨. 
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
//		Writer fw = null;
//		PrintWriter pw = null;
		
		OutputStream os = null;
		
		URL url = null;
		try {
			File parent = new File(file.getParent());
			parent.mkdir();
			file.createNewFile();
//			fw = new FileWriter(file);
//			pw = new PrintWriter(fw);
			os = new FileOutputStream(file);
			
			
			url = new URL(spec); //프로토콜 생략 불가능
			conn = url.openConnection(); //url로부터 접속받음
			//System.out.println(conn); //서버는 웹페이지에서 보여주는걸 가져주는 게 아니라 페이지 소스를 받아오는것!
			is = conn.getInputStream(); 
			isr = new InputStreamReader(is,"utf-8"); //한글 안깨지게 utf-8 적용
			br = new BufferedReader(isr);
			
//			String msg = null;
//			while((msg = br.readLine()) != null) {
//				pw.println(msg); //소스 출력
//			}
			
			int su = 1;
			while((su = is.read()) != -1) {
				os.write(su);
			}
			
			System.out.println("크롤링 끝...");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(os != null) {os.close();}
//				if(pw != null) {pw.close();}
//				if(fw != null) {fw.close();}
//				if(br != null) {br.close();}
//				if(isr != null) {isr.close();}
				if(is != null) {is.close();}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

//이처럼 웹서버가 하는 역할은 파일을 요청하든 문서를 요청하든 010101만 읽어주고 내 컴퓨터가 받아적는 것