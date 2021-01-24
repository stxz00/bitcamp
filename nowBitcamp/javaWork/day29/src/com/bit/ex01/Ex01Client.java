package com.bit.ex01;

import java.awt.FileDialog;
import java.awt.Frame;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ex01Client {

	public static void main(String[] args) {

		Frame f=new Frame();
		FileDialog dia=new FileDialog(f,"저장하기",FileDialog.SAVE);
		dia.setVisible(true);
		String path=dia.getDirectory()+dia.getFile();
		
		File file=new File(path);
		Socket sock=null;
		InputStream is=null;
		OutputStream fos=null;
		try {
			sock=new Socket("localhost",5000);
			is=sock.getInputStream();
			fos=new FileOutputStream(file);
			int su=-1;
			while((su=is.read())!=-1) {
				fos.write(su);
			}
			fos.close();
			is.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(sock!=null)sock.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		JLabel btn=new JLabel();
		btn.setIcon(new ImageIcon(file.getAbsolutePath()));
		f.add(btn);
		f.setBounds(100+1920,100,500,500);
		f.setVisible(true);
	}

}







