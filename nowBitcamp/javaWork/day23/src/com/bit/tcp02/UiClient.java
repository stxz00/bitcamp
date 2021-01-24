package com.bit.tcp02;

import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;
 
public class UiClient extends Frame implements ActionListener{
	
	static BufferedWriter bw = null;
	
	
	public UiClient(){
		TextField tf= new TextField();
		tf.addActionListener(this);
		add(tf);
		setBounds(100,100,300,60);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		UiClient me = new UiClient();
		
		Scanner sc = new Scanner(System.in);
		
		String ip = "localHost";
		int port = 5000;
		
		Socket sock = null;
		OutputStream os = null;
		OutputStreamWriter osw = null;
		
		
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
				try {
					System.out.println(br.readLine());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
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

	@Override
	public void actionPerformed(ActionEvent e) {
		String msg = ((TextField)e.getSource()).getText();
		try {
			bw.write(msg);
			bw.newLine();
			bw.flush();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		((TextField)e.getSource()).setText("");
		
	}
}
