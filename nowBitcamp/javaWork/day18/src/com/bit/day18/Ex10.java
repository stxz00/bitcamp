package com.bit.day18;

import java.awt.Button;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

//툴킷

public class Ex10 extends Frame{
	
	public Ex10() {
		
		JButton btn = new JButton(); // 버튼 이미지 넣기
		
		File file = new File("imgs\\image.png");
	
		InputStream is = null;
		byte[] arr = new byte[(int)file.length()];
		try {
			is = new FileInputStream(file);
			for(int i = 0 ; i < arr.length; i++) {
				arr[i] = (byte) is.read();
			}
		} catch(IOException e){
			e.printStackTrace();
		} finally {
			try {if(is != null) {is.close();}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
		Toolkit tool = Toolkit.getDefaultToolkit();

//		Image img = tool.createImage(arr);
		
		Image img = tool.createImage("imgs\\image.png");
		
		Icon icon = new ImageIcon(img);
		
		btn.setIcon(icon);
		add(btn);
		
		int locX = 0, locY = 0;
		//내 사이즈는 운영체제한테 부탁해야하는데 
		//tookit은 추상클래스
		
//		tool.beep(); // 음향장치에 삐- 하는 소리를 냄
		Dimension dim = tool.getScreenSize();
		//단일의 객체내의 컴퍼넌트의 폭과 높이를 정수 정밀도로를 캡슐화
		System.out.println(dim.width + "x" + dim.height); //int
		System.out.println(dim.getWidth() + "x" + dim.getHeight()); //double
		setSize(500,300);
		
		Dimension dim2 = getSize();
		//프레임창의 사이즈
		
		
		locX = dim.width/2 - dim2.width/2;          //-500/2; 
		//스크린사이즈의 절반에 setSize의 절반을 빼면 중앙이다
		locY = dim.height/2 - dim2.height/2;           //- 300/2;
		
		setSize(500,300);
		setLocation(locX,locY);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Ex10 me = new Ex10();
	}
}
