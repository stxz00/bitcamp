package com.bit.exercise;

import java.awt.BorderLayout;
import java.awt.CheckboxMenuItem;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;

public class Memojang extends Frame implements Runnable{
	
	TextArea ta = new TextArea();
	
	//새파일 저장버튼부터  만들기
	FileDialog fd1 = new FileDialog(this,"다른 이름으로 저장",FileDialog.SAVE);
	FileDialog fd2 = new FileDialog(this,"열기",FileDialog.LOAD);
	String path = new String();
	String fileName = new String();
	
	boolean boo = false;
	boolean window = false;
	
	
	Dialog di1 = new Dialog(this);
	Font font = new Font(Font.SANS_SERIF,Font.BOLD,15);
	Color col = new Color(240,240,240); //라이트그레이
	Toolkit tool = Toolkit.getDefaultToolkit();
	Dimension dim1 = tool.getScreenSize();
	
	
	Memojang(){
		
		
		
		MenuItem mi1 = new MenuItem("새로 만들기(N)");
		
		
		
		
		mi1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				closing();
			}
		});
		
		MenuItem mi2 = new MenuItem("새 창(W)");
		mi2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Memojang m1 = new Memojang();
				add(m1);
			}
		});
		MenuItem mi3 = new MenuItem("열기(O)");
		mi3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				fd2.setVisible(true);
				path = fd2.getDirectory() + fd2.getFile();
				load();
				boo = true;
				fileName = fd2.getFile();
				setTitle(fileName);
				
			}
		});
		MenuItem mi4 = new MenuItem("저장(S)");
		mi4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(boo) {
					save();
				}else {
					fd1.setVisible(true);
					path = fd1.getDirectory() + fd1.getFile();
					save();
					fileName = fd1.getFile();
					setTitle(fileName);
					setEnabled(true);
					boo = true;
				}
			}
		});
		MenuItem mi5 = new MenuItem("다른 이름으로 저장(A)");
		mi5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				fd1.setVisible(true);
				path = fd1.getDirectory() + fd1.getFile();
				save();
				fileName = fd1.getFile();
				if(path.equals(null)) {
					setTitle(fileName);
				}
				setEnabled(true);
				boo = true;
			}
		});
		MenuItem mi6 = new MenuItem("페이지 설정(U)"); /////////////////////////////////////
		MenuItem mi7 = new MenuItem("인쇄(P)");		////////////////////////////////////
		MenuItem mi8 = new MenuItem("끝내기(X)");
		
		Menu m1 = new Menu("파일(E)");
		m1.add(mi1);
		m1.add(mi2);
		m1.add(mi3);
		m1.add(mi4);
		m1.add(mi5);
		m1.addSeparator();
		m1.add(mi6);
		m1.add(mi7);
		m1.addSeparator();
		m1.add(mi8);
		
		Menu m2 = new Menu("편집(E)");
		
		MenuItem mi11 = new MenuItem("실행취소(U)");
		mi11.setEnabled(false);
		MenuItem mi12 = new MenuItem("잘라내기(T)");
		mi12.setEnabled(false);
		MenuItem mi13 = new MenuItem("복사(C)");
		MenuItem mi14 = new MenuItem("붙여넣기(P)");
		MenuItem mi15 = new MenuItem("삭제(L)");
		mi15.setEnabled(false);
		MenuItem mi16 = new MenuItem("Bing으로 검색(S)");
		MenuItem mi17 = new MenuItem("찾기(F)");
		MenuItem mi18 = new MenuItem("다음 찾기(N)");
		MenuItem mi19 = new MenuItem("이전 찾기(V)");
		MenuItem mi20 = new MenuItem("바꾸기(R)");
		MenuItem mi21 = new MenuItem("이동(G)");
		MenuItem mi22 = new MenuItem("모두 선택(A)");
		MenuItem mi23 = new MenuItem("시간/날짜(D)");
		mi23.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Date date = new Date();
				SimpleDateFormat sdf = new SimpleDateFormat("aa hh:mm yyyy-MM-dd");
				String time = sdf.format(date);
				String fore = ta.getText();
				ta.setText(fore + time);
			}
		});
		
		m2.add(mi11);
		m2.addSeparator();
		m2.add(mi12);
		m2.add(mi13);
		m2.add(mi14);
		m2.add(mi15);
		m2.addSeparator();
		m2.add(mi16);
		m2.add(mi17);
		m2.add(mi18);
		m2.add(mi19);
		m2.add(mi20);
		m2.add(mi21);
		m2.addSeparator();
		m2.add(mi22);
		m2.add(mi23);
		
		Menu m3 = new Menu("서식(O)");
		
		CheckboxMenuItem mi31 = new CheckboxMenuItem("자동 줄 바꿈(W)");
		MenuItem mi32 = new MenuItem("글꼴(F)");
		m3.add(mi31);
		m3.add(mi32);
		
		Menu m4 = new Menu("보기(V)");
		Menu mi33 = new Menu("확대하기/축소하기(W)");
		MenuItem mi34 = new MenuItem("확대(I)");
		MenuItem mi35 = new MenuItem("축소(O)");
		MenuItem mi36 = new MenuItem("축소(O)");
		MenuItem mi37 = new MenuItem("확대하기/축소하기 기본 값 복원");
		mi33.add(mi34);
		mi33.add(mi35);
		mi33.add(mi36);
		mi33.add(mi37);
		
		CheckboxMenuItem cbm = new CheckboxMenuItem("상태표시줄(S)",true);
		
		m4.add(mi33);
		m4.add(cbm);
		
		Menu m5 = new Menu("도움말(H)");
		MenuItem mi38 = new MenuItem("도움말 보기(H)");
		MenuItem mi39 = new MenuItem("피드백 보내기(F)");
		MenuItem mi40 = new MenuItem("메모장 정보(A)");
		
		m5.add(mi38);
		m5.add(mi39);
		m5.addSeparator();
		m5.add(mi40);
		
		
		MenuBar mb = new MenuBar();
		
		
		mb.add(m1);
		mb.add(m2);
		mb.add(m3);
		mb.add(m4);
		mb.add(m5);
		
		setMenuBar(mb);
		

		add(ta);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				if(ta.getText().length() == 0) {
					dispose();
				}
				window = true;
				closing();
			}
		});
		
		setTitle("제목없음 - Windows 메모장");
		
		setBounds(100,100,500,800);
		setVisible(true);
	}
	
	
	
	final void save() {
		
		File file = new File(path);
		OutputStream os = null;
		BufferedOutputStream bos = null;
		OutputStreamWriter osw = null;
		PrintWriter pw = null;
		try {
			os = new FileOutputStream(file);
			bos = new BufferedOutputStream(os);
			osw = new OutputStreamWriter(bos);
			pw = new PrintWriter(osw);
			
			pw.println(ta.getText());
			
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} finally {
			try {
				if(pw != null) {pw.close();}
				if(osw != null) {osw.close();}
				if(bos != null) {bos.close();}
				if(os != null) {os.close();}
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
	
	final void load() {
			
			File file = new File(path);
			InputStream is = null;
			InputStreamReader isr = null;
			BufferedReader br = null;
			
			
			try {
				is = new FileInputStream(file);
				isr = new InputStreamReader(is);
				br = new BufferedReader(isr);
				
				String text = new String();
				
				while(true) {
					String line = br.readLine();
					if(line == null) {break;}
					text += line + "\n";
				}
				
				ta.setText(text);
				setTitle(fileName);
				
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				try {
					if(br != null) {br.close();}
					if(isr != null) {isr.close();}
					if(is != null) {is.close();}
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
	
	final void closing() {
		if(ta.getText().length() != 0) {
			di1.setLayout(new BorderLayout());
			
			Panel p1 = new Panel();
			Label la = new Label("변경 내용을 저장하시겠습니까?");
			p1.setBackground(Color.white);
			la.setFont(font);
			p1.add(la);
			
			Panel p2 = new Panel();
			
			JButton btn1 = new JButton("저장(S)");
			btn1.setBackground(col);
			btn1.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					fd1.setVisible(true);
					path = fd1.getDirectory() + fd1.getFile();
					save();
					ta.setText("");
					setEnabled(true);
					di1.dispose();
					boo = false;
					if(window) {
						dispose();
					}
				}
			});
			JButton btn2 = new JButton("저장 안 함(N)");
			btn2.setBackground(col);
			btn2.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent arg0) {
					ta.setText("");
					setTitle("제목없음 - Windows 메모장");
					setEnabled(true);
					di1.dispose();
					boo = false;
					if(window) {
						dispose();
					}
				}
			});
			JButton btn3 = new JButton("취소");
			btn3.setBackground(col);
			btn3.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent arg0) {
					setEnabled(true);
					di1.dispose();
				}
			});
			p2.add(btn1);
			p2.add(btn2);
			p2.add(btn3);
			
			di1.add(p1,BorderLayout.CENTER);
			di1.add(p2,BorderLayout.SOUTH);
			
			di1.addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent e) {
					setEnabled(true);
					di1.dispose();
				};
			});
			
			di1.setTitle("메모장");
			di1.setBounds(dim1.width/2 - 370/2, dim1.height/2 - 135/2,370,135);
			di1.setVisible(true);
			setEnabled(false);
		}
	}
	
	
	@Override
	public void run() {
		try {
			Thread.sleep(30000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	
		di1.setLayout(new BorderLayout());
		
		Panel p1 = new Panel();
		Label la = new Label("임시 파일을 저장하시겠습니까?");
		p1.setBackground(Color.white);
		la.setFont(font);
		p1.add(la);
		
		Panel p2 = new Panel();
		
		JButton btn1 = new JButton("저장(S)");
		btn1.setBackground(col);
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String prefix = "memojang";
				String suffix = ".bin";
				File file = null;
				try {
					file = File.createTempFile(prefix, suffix);
					
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				String tempPath = file.getPath();
				
				File file2 = new File(tempPath);
				
				OutputStream os = null;
				BufferedOutputStream bos = null;
				PrintStream ps = null;
				try {
					os = new FileOutputStream(file2);
					bos = new BufferedOutputStream(os);
					ps = new PrintStream(bos);
					
					ps.println(ta.getText());
					
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} finally {
					try {
						if(ps != null) {ps.close();}
						if(bos != null) {os.close();}
						if(os != null) {os.close();}
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}

				setEnabled(true);
				di1.dispose();
				
			}
		});
		JButton btn2 = new JButton("저장 안 함(N)");
		btn2.setBackground(col);
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				ta.setText("");
				setTitle("제목없음 - Windows 메모장");
				setEnabled(true);
				di1.dispose();
				boo = false;
				if(window) {
					dispose();
				}
			}
		});
		JButton btn3 = new JButton("취소");
		btn3.setBackground(col);
		btn3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				setEnabled(true);
				di1.dispose();
			}
		});
		p2.add(btn1);
		p2.add(btn2);
		p2.add(btn3);
		
		di1.add(p1,BorderLayout.CENTER);
		di1.add(p2,BorderLayout.SOUTH);
		
		di1.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				setEnabled(true);
				di1.dispose();
			};
		});
		
		di1.setTitle("메모장");
		di1.setBounds(dim1.width/2 - 370/2, dim1.height/2 - 135/2,370,135);
		di1.setVisible(true);
		setEnabled(false);
		
	}
	
	public static void main(String[] args) {
		Memojang me = new Memojang();
		Thread thr = new Thread(me);
		thr.start();
	}
	
}
