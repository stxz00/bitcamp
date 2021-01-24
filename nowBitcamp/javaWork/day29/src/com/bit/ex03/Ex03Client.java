package com.bit.ex03;

import java.awt.Frame;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.CardLayout;

import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.awt.event.ActionEvent;

public class Ex03Client extends Frame {
	private JTextField tf;
	static JTextArea ta;
	static OutputStream os;
	static Ex03Client me;
	static String name;
	
	
	public Ex03Client() {
//		Ex03Client me = this;
		Socket sock=new Socket();
		CardLayout layout = new CardLayout();
		setLayout(layout);
		
		JPanel before = new JPanel();
		TextField id = new TextField();
		JButton btn = new JButton("입장");
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				name = id.getText();
				layout.next(me);
			}
		});
		before.add(id);
		before.add(btn);
		before.setLayout(new BorderLayout(0, 0));
		add(before);
		
		
		
		
		tf = new JTextField();
		ta = new JTextArea();

		tf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg = null;
				if(tf.getText().startsWith("/to ")) {
					msg = tf.getText();
				}else {
					msg = "/all " + tf.getText();
				}
				
			
				try {
					os.write(msg.getBytes());
					os.write("\n".getBytes());
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				tf.setText("");
			}
		});
		
		before.add(tf, BorderLayout.SOUTH);
		tf.setColumns(10);
		
		before.add(ta, BorderLayout.CENTER);
		
		setBounds(100,100,300,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex03Client();
		
		Socket sock=null;
		InputStream is=null;
		InputStreamReader isr=null;
		BufferedReader br = null;
		try {
			sock=new Socket("localHost",5000);
			
			is=sock.getInputStream();
			isr=new InputStreamReader(is);
			br = new BufferedReader(isr);
			os=sock.getOutputStream();
			//int su=-1;
			String msg = null;
			while((msg=br.readLine())!=null) { //모든 사용자가 
				if(msg.startsWith("/to " + name)) {
					
					msg = msg.substring(msg.indexOf(" ")+1);
					msg = msg.substring(msg.indexOf(" ")+1);
					
					ta.append(msg + "\n");
				}else if(msg.startsWith("/all ")) {
					msg = msg.substring(msg.indexOf(" ")+1);
					ta.append(msg +"\n");
				}
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
