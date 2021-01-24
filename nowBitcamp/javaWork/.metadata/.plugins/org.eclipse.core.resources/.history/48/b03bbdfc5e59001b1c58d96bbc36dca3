package com.bit.ex03;

import java.awt.Frame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
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
	
	public Ex03Client() {
		Socket sock=new Socket();
		JPanel panel = new JPanel();
		add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		tf = new JTextField();
		ta = new JTextArea();

		tf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg=tf.getText();
				try {
					os.write(msg.getBytes());
					os.write("\n".getBytes());
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				
			}
		});
		
		panel.add(tf, BorderLayout.SOUTH);
		tf.setColumns(10);
		
		panel.add(ta, BorderLayout.CENTER);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex03Client();
		
		Socket sock=null;
		InputStream is=null;
		InputStreamReader isr=null;
		try {
			sock=new Socket("192.168.0.13",5000);
			
			is=sock.getInputStream();
			isr=new InputStreamReader(is);
			os=sock.getOutputStream();
			int su=-1;
			while((su=isr.read())!=-1) {
				ta.append((char)su+"");
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}









