package com.bit.exercise;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.FileDialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex01 extends Frame implements WindowListener, ActionListener, MouseListener {
	
	MenuItem mi1 = new MenuItem("새파일");
	MenuItem mi2 = new MenuItem("열기");
	MenuItem mi3 = new MenuItem("저장");
	MenuItem mi4 = new MenuItem("종료");
	Menu m1 = new Menu("파일");
	
	MenuItem mi5 = new MenuItem("정보");
	Menu m2 = new Menu("도움말");
	
	TextArea ta = new TextArea();
	
	boolean boo = false;
	String path = new String();
	
	
	Dialog dia1 = new Dialog(this);
	Button btn1 = new Button("예");
	Button btn2 = new Button("아니오");
	
	Dialog dia2 = new Dialog(this);
	Button btn3 = new Button("확인");

	Ex01(){
		dia2.setLayout(new FlowLayout());
		
		dia2.add(new Label("해남이(가) 작성하였습니다"));
		
		btn3.addMouseListener(this);
		dia2.add(btn3);
		
		
		
		dia1.setVisible(false);
		
		m1.add(mi1);
		m1.addSeparator();
		m1.add(mi2);
		m1.add(mi3);
		m1.addSeparator();
		m1.add(mi4);
		m2.add(mi5);
		
		mi1.addActionListener(this);
		mi2.addActionListener(this);
		mi3.addActionListener(this);
		mi4.addActionListener(this);
		mi5.addActionListener(this);
		
		MenuBar mb = new MenuBar();
		mb.add(m1);
		mb.add(m2);
		
		add(ta);
		
		addWindowListener(this);
		
		setMenuBar(mb);
		
		setTitle("제목없음");
		setLocation(100,100);
		setSize(500,500);
		setVisible(true);
	}
	public static void main(String[] args) {
		Ex01 me = new Ex01();
	}
	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosed(WindowEvent arg0) {
		
		
	}
	@Override
	public void windowClosing(WindowEvent arg0) {
		dia1.setLayout(new GridLayout(2,1));
		
		dia1.add(new Label("저장하고 종료하시겠습니까?"));
		Panel p1 = new Panel();
		
		btn1.addMouseListener(this);
		
		
		btn2.addMouseListener(this);
		
		p1.add(btn1);
		p1.add(new Label("    "));
		p1.add(btn2);
		dia1.add(p1);
		dia1.setSize(175,120);
		dia1.setLocation(this.getX() + this.getWidth()/2 - dia1.getWidth()/2,
				this.getY() + this.getHeight()/2 - dia1.getHeight()/2);
		dia1.setVisible(true);
		setEnabled(false);
		
	}
	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(mi1.equals(e.getSource())) {
			ta.setText("");
			setTitle("제목없음");
			boo = false;
		}else if(mi2.equals(e.getSource())) {
			load();

		}else if(mi3.equals(e.getSource())) {
			save(boo);

		}else if(mi4.equals(e.getSource())) {
			dispose();
		}else if(mi5.equals(e.getSource())) {
			
			
			dia2.setSize(170,95);
			dia2.setLocation(this.getX() + this.getWidth()/2 - dia1.getWidth()/2,
					this.getY() + this.getHeight()/2 - dia1.getHeight()/2);
			dia2.setVisible(true);
			setEnabled(false);
		}
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		if(btn1.equals(e.getSource())){
			save(false);
			dispose();
		}else if (btn2.equals(e.getSource())){
			dispose();
		}
		
		if(btn3.equals(e.getSource())) {
			setEnabled(true);
			dia2.setVisible(false);
		}
	}
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
	public void load() {
		FileDialog fd = new FileDialog(this,"파일 열기",FileDialog.LOAD);
		fd.setLocation(200,200);
		fd.setVisible(true);
		
		path = fd.getDirectory() + fd.getFile();
		
		File file = new File(path);
		
		InputStream is = null;
		BufferedInputStream bis = null;
		ByteArrayOutputStream baos = null;
		try {
			is = new FileInputStream(file);
			bis = new BufferedInputStream(is);
			baos = new ByteArrayOutputStream();
			
			while(true) {
				int input = bis.read();
				if(input == -1) {break;}
				baos.write(input);
			}
			byte[] by = baos.toByteArray();
			String open = new String(by);
			System.out.println(open);
			ta.setText(open);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} finally {
			try {
				if(baos != null) {baos.close();}
				if(bis != null) {bis.close();}
				if(is != null) {is.close();}
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		setTitle(fd.getFile());
	}
	
	public void save(boolean boo) {
		if(!boo) {
			FileDialog fd = new FileDialog(this,"다른 이름으로 저장", FileDialog.SAVE);
			fd.setLocation(200,200);
			fd.setVisible(true);
			
			path = fd.getDirectory() + fd.getFile();
			setTitle(fd.getFile());
		}
			
		File file = new File(path);
		
		OutputStream os = null;
		BufferedOutputStream bos = null;
		
		byte[] by = ta.getText().getBytes();
		try {
			os = new FileOutputStream(file);
			bos = new BufferedOutputStream(os);

			for(int i = 0; i < by.length; i++) {
				bos.write(by[i]);
			}
			this.boo = true;
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} finally {
			try {
				if(bos != null) {bos.close();}
				if(os != null) {os.close();}
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
}
