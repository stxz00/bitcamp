package com.bit.tcp01;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.Scanner;

public class BitClient {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String ip = "localHost";
		int port = 5000;
		
		Socket sock = null;
		OutputStream os = null;
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		try {
			sock = new Socket(ip,port);
			
			os = sock.getOutputStream();
			osw = new OutputStreamWriter(os);
			bw = new BufferedWriter(osw);
			
			is = sock.getInputStream();
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
						
			while(true) {
				System.out.print(">>>");
				String msg = sc.nextLine();
				bw.write(msg);
				bw.newLine();
				bw.flush();
				System.out.println(br.readLine()); //클라이언트가 서버에 쏜 것을 클라이언트만 보고 있음
				
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(bw != null) {bw.close();}
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
