package com.bit.tcp01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class BitServer extends Thread{
	Socket sock;
	
	public BitServer(Socket sock) {
		this.sock = sock;
	}
	
	@Override
	public void run() {
		InetAddress inet = sock.getInetAddress();
		String ip = inet.getHostAddress();
		
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		OutputStream os = null;
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		try {
			is = sock.getInputStream();
			os = sock.getOutputStream();
			isr = new InputStreamReader(is);
			osw = new OutputStreamWriter(os);
			br = new BufferedReader(isr);
			bw = new BufferedWriter(osw);
			
			String msg = null;
			while((msg = br.readLine()) != null) {	//클라이언트가 보낸 채팅을 읽고
				bw.write(ip + ">" + msg);			
				bw.newLine();
				bw.flush();
			}
			//서버는 그걸 다시 그냥 클라이언트에 보내고 있음 클라이언트에서 그걸 read했으니 본인이 보고있는것
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				
				if(bw != null) {bw.close();}
				if(osw != null) {osw.close();}
				if(os != null) {os.close();}
						
//				if(br != null) {br.close();}
//				if(isr != null) {isr.close();}
//				if(is != null) {is.close();}
				if(sock != null) {sock.close();}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	
	
	public static void main(String[] args) {
		int port = 5000;
		
		
		ServerSocket serv = null;
				
		try {
			serv = new ServerSocket(port);
			
			while(true) {
				System.out.println("대기중...");
				Socket sock = serv.accept();
				BitServer client = new BitServer(sock); //스레드를 상속받는 BitServer의 생성자로 받음
//				new BitServer(serv.accept()).start(); 어차피 이게 소켓이니까
				client.start();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(serv != null) {serv.close();}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	
}
