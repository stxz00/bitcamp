package com.bit.exercise;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList11 {
	public static void main(String[] args) {
		
		File file = new File("ArrayList.txt");
		ArrayList<String> data = new ArrayList<>();
		FileInputStream fis = null;
		if(file.exists()) {
			try {
					fis = new FileInputStream(file);
					byte[] by = new byte[(int) file.length()];
					for(int j = 0; j < by.length; j++) {
						by[j] = (byte) fis.read();
					}
					String ss = new String(by);
					String[] data2 = ss.split("\n");
					for(int j = 0; j < data2.length; j++) {
							data.add(data2[j]+"\n");
					}
				
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				try {
					if(fis != null) {fis.close();}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		System.out.println("학생 성적 프로그램 ArrayList ver");
		System.out.println("------------------------------------");
		
		String main = "1.보기 2.입력 3.수정 4.삭제 0.종료\n>";
		String menu = "------------------------------------\n";
		menu += "학점\t국어\t영어\t수학\n";
		menu += "------------------------------------";
		
		Scanner sc = new Scanner(System.in);
		int input = 0;
		while(true) {
			System.out.print(main);
			input = Integer.parseInt(sc.nextLine());
			if(input == 0) {
				FileOutputStream fos = null;
				try {
					fos = new FileOutputStream(file);
					
					for(int i = 0; i< data.size(); i++) {
						String ss = data.get(i);
						byte[] by = ss.getBytes();
						for(int j = 0; j < by.length; j++) {
							fos.write(by[j]);
						}
					}
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
					try {
						if(fos!= null) {fos.close();}
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				break;
				}
			if(input == 1) {
				System.out.print(menu);
				for(int i = 0; i < data.size(); i++) {
					System.out.print(data.get(i));
				}
			}
			if(input == 2) {
				System.out.print("학번 > ");
				String stu = sc.nextLine() + "\t";
				System.out.print("국어 > ");
				stu += sc.nextLine() + "\t";
				System.out.print("영어 > ");
				stu += sc.nextLine() + "\t";
				System.out.print("수학 > ");
				stu += sc.nextLine() + "\n";
				data.add(stu);		
			}
			if(input == 3) {
				System.out.print("수정할 학번 > ");
				int set = Integer.parseInt(sc.nextLine());
				for(int i = 0; i < data.size(); i++) {
					int num = data.get(i).indexOf("\t");
					int ID = Integer.parseInt(data.get(i).substring(0, num));
					if(set == ID) {
						String stu = set + "\t";
						System.out.print("국어 > ");
						stu += sc.nextLine() + "\t";
						System.out.print("영어 > ");
						stu += sc.nextLine() + "\t";
						System.out.print("수학 > ");
						stu += sc.nextLine() + "\n";
						data.set(i, stu);
						break;
					}
				}
			}
			if(input == 4) {
				System.out.print("삭제할 학번 > ");
				int remove = Integer.parseInt(sc.nextLine());
				for(int i = 0; i < data.size(); i++) {
					int num = data.get(i).indexOf("\t");
					int ID = Integer.parseInt(data.get(i).substring(0, num));
					if(remove == ID) {
						data.remove(i);
						break;
					}
				}
			}
			
		}
		System.out.println("이용해주셔서 감사합니다");
		
	}
}
