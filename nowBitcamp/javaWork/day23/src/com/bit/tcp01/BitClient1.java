package com.bit.tcp01;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.Scanner;

public class BitClient1 {
	
	public static void main(String[] args) {
		System.out.println("client start...");
		
		String ip = "localHost"; //내 주소
		int port = 5000; // 포트번호
		
		//방화벽 - 고급설정 - 우클릭, 새규칙 - 포트번호 - 5000
		
		//저번꺼는 소켓이 바로 바인딩 된거고 이거는 풀어서 얘기함
		SocketAddress endpoint = null; //소켓이 사용할 주소
		endpoint = new InetSocketAddress(ip, port); 
		Socket sock = new Socket();
		OutputStream os = null;
		OutputStreamWriter osw = null;
		PrintWriter pw = null;
		try {
//			sock = new Socket(ip,port);
			sock.connect(endpoint); //접속시도
			System.out.println("서버에 접속됨");
			os = sock.getOutputStream();
			osw = new OutputStreamWriter(os);
			pw = new PrintWriter(osw);
			
			Scanner sc = new Scanner(System.in);
			
			while(true) {
				pw.println(sc.nextLine());
				pw.flush(); //버퍼를 밀어줘야 함
				
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(pw != null) {pw.close();}
				if(osw != null) {osw.close();}
				if(os != null) {os.close();}
				if(sock != null) {sock.close();}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
}
