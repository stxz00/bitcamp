package com.bit.tcp01;
//에코서버
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;

public class BitServer1 extends Thread{
	 Socket sock;

	public static void main(String[] args) {
		String ip = "localHost"; //로컬호스트를 통해 서버를 열었으면 클라이언트도 로컬호스트만 접근이 가능함 그러므로 외부 클라이언트 접근 시엔 로컬호스트 말고 해야함
		int port = 5000;
	    SocketAddress endpoint=null;
	    endpoint=new InetSocketAddress(ip, port);
	    ServerSocket serv=null;
	      try {
	         serv=new ServerSocket();
	         serv.bind(endpoint);
	         System.out.println("접속대기중...");
	         while(true) {   
	            BitServer1 client=new BitServer1();
	            client.sock=serv.accept();
	            client.start();
	         }
	      } catch (IOException e) {
	         e.printStackTrace();
	      } finally {
	         try {
	            if(serv!=null) {serv.close();}
	         } catch (IOException e) {
	            e.printStackTrace();
	         }
	      }

	   }
	   
	   @Override
	   public void run() {
	      InputStream is=null;
	      InputStreamReader isr=null;
	      BufferedReader br=null;
	      
	      try {
	         is=sock.getInputStream();
	         isr=new InputStreamReader(is);
	         br=new BufferedReader(isr);
	         
	         while(true) {
	            System.out.println(br.readLine());
	         }
	      } catch (IOException e) {
	         e.printStackTrace();
	      } finally {
	         try {
	            if(br!=null) {br.close();}
	            if(isr!=null) {isr.close();}
	            if(is!=null) {is.close();}
	            if(sock!=null) {sock.close();}
	         } catch (IOException e) {
	            e.printStackTrace();
	         }
	      }
	   }

	}