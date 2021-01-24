package com.bit.exercise;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class HashSet11 {
	public static void main(String[] args) {
		
		File file = new File("Hashset.txt");
		HashSet<String> data = new HashSet<>();
		
		FileInputStream fis = null;
		if(file.exists()) {
			try {
				byte[] copy = new byte[(int) file.length()];
				fis = new FileInputStream(file);
				
				for(int i = 0; i < file.length(); i++) {
					copy[i] = (byte) fis.read();
				}
				String copy2 = new String(copy);
				String[] copy3 = copy2.split("\n");
				for(int i = 0; i < copy3.length; i++) {
					data.add(copy3[i] + "\n");
				}
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				try {
					if(fis != null) {fis.close();}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
		System.out.println("학생 성적 프로그램 HashSet ver.");
		System.out.println("------------------------------------");
		
		String main ="1.보기 2.입력 3.수정 4.삭제 0.종료\n>";
		String menu = "------------------------------------\n";
		menu +="학번\t국어\t영어\t수학\n";
		menu += "------------------------------------";
		String input = "0";
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print(main);
			input = sc.nextLine();
			if(input.equals("0")) {
				FileOutputStream fos = null;
				try {
					fos = new FileOutputStream(file);
					Iterator<String> ite = data.iterator();
					while(ite.hasNext()) {
						String stu = ite.next();
						byte[] by = stu.getBytes();
						for(int i = 0; i < by.length; i++) {
							fos.write(by[i]);
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
						if(fos != null){fos.close();}
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				break;
				}
			if(input.equals("1")) {
				System.out.println(menu);
				
				for(int i = 0; i < data.size(); i++) {
					
				}
				

				Iterator<String> ite = data.iterator();
				while(ite.hasNext()){
					String student = ite.next();
					System.out.print(student);
				}
				
				
				
			}
			if(input.equals("2")) {
				String stu = new String();
				System.out.print("학번>");
				stu += sc.nextLine() + "\t";
				System.out.print("국어>");
				stu += sc.nextLine() + "\t";
				System.out.print("영어>");
				stu += sc.nextLine() + "\t";
				System.out.print("수학>");
				stu += sc.nextLine() + "\n";
				data.add(stu);
			}
			if(input.equals("3")) {
				System.out.print("수정할 학번>");
				input = sc.nextLine();
				Iterator<String> ite = data.iterator();
				String student = null;
				while(ite.hasNext()) {
					student = ite.next();
					int last = student.indexOf("\t");
					String studentID = student.substring(0,last);
					if(input.equals(studentID)) {
						break;
					}
					if(!ite.hasNext()) {
						System.out.println("학번이 존재하지 않습니다");
					}
				}
				data.remove(student);
				String stu = new String();
				stu += input + "\t";
				System.out.print("국어>");
				stu += sc.nextLine() + "\t";
				System.out.print("영어>");
				stu += sc.nextLine() + "\t";
				System.out.print("수학>");
				stu += sc.nextLine() + "\n";
				data.add(stu);
				
				
				
			}
			if(input.equals("4")) {
				System.out.print("삭제할 학번>");
				input = sc.nextLine();
				Iterator<String> ite = data.iterator();
				String student = null;
				while(ite.hasNext()) {
					student =  ite.next();
					int last = student.indexOf("\t");
					String studentID = student.substring(0,last);
					if(input.equals(studentID)) {
						break;
					}
					if(!ite.hasNext()) {
						System.out.println("학번이 존재하지 않습니다");
					}
				}
				data.remove(student);
			}
		}
		System.out.println("이용해주셔서 감사합니다");
		sc.close();
	}
}
