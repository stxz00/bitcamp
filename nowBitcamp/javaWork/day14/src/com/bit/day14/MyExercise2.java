package com.bit.day14;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class MyExercise2 {
	public static void main(String[] args) {
		
		String students = new String();
		
		
		File file = new File("My\\me.txt");
		
		byte[] by;
		
		File dir = new File(file.getParent());
		dir.mkdir();
		FileOutputStream fos = null;
		FileInputStream fis = null;
		
		if(file.exists()) {
			by = new byte[(int) file.length()];
			try {
				fis = new FileInputStream(file);
				for(int i = 0; i < by.length; i++) {
					by[i] = (byte) fis.read();
				}
				students = new String(by);
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					if(fis != null) {fis.close();}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
		}
		
		
		

		String main = "학생성적관리프로그램(ver 0.6.0)";
		System.out.println(main);
		String title = "-----------------------------------------\n";
		title += "학번\t국어\t영어\t수학\t합계\t\n";
		title += "-----------------------------------------";
		String menu = "1.보기 2.입력 3.수정 4.삭제 0.종료\n>";
		
		
		Scanner sc = new Scanner(System.in);
		int input = 0;
		while(true) {
			System.out.print(menu);
			input = Integer.parseInt(sc.nextLine());
			
			if(input == 0) {

				try {
					fos = new FileOutputStream(file);
					by = students.getBytes();
					for(int i = 0; i < by.length; i++) {
						fos.write(by[i]);
					}

				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}finally {
					try {
						if(fos != null) {fos.close();}
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				

				break;}
			if(input == 1) {
				System.out.print(title);
				System.out.println(students);
				
			}else if(input == 2) {
				System.out.print("학번 >");
				int num = Integer.parseInt(sc.nextLine());
				students += "\n" +num;
				System.out.print("국어 >");
				int kor = Integer.parseInt(sc.nextLine());
				students += "\t" +kor;
				System.out.print("영어 >");
				int eng = Integer.parseInt(sc.nextLine());
				students += "\t" +eng;
				System.out.print("수학 >");
				int math = Integer.parseInt(sc.nextLine());
				students += "\t" +math;
				
				int sum = kor + eng + math;
				students += "\t" + sum;
				

			}else if(input == 3) {
				System.out.print("수정할 학번>");
				String num = sc.nextLine();
				
				int first = students.indexOf("\n" + num + "\t");
				if(first == -1) {
					System.out.println("존재하지 않는 학번입니다");
					continue;
					}
				String willSet = new String();
				
				try {
					int last = students.indexOf("\n",first+1);
					willSet = students.substring(first,last);
					
					String setStu = new String();
					setStu += "\n" + num;
					System.out.print("국어 >");
					int kor = Integer.parseInt(sc.nextLine());
					setStu += "\t" +kor;
					System.out.print("영어 >");
					int eng = Integer.parseInt(sc.nextLine());
					setStu += "\t" +eng;
					System.out.print("수학 >");
					int math = Integer.parseInt(sc.nextLine());
					setStu += "\t" +math;
					
					int sum = kor + eng + math;
					setStu += "\t" + sum;
					
					students = students.replace(willSet, setStu);
					
				}catch(StringIndexOutOfBoundsException e) {
					willSet = students.substring(first,students.length());
					
					String setStu = new String();
					setStu += "\n" + num;
					System.out.print("국어 >");
					int kor = Integer.parseInt(sc.nextLine());
					setStu += "\t" +kor;
					System.out.print("영어 >");
					int eng = Integer.parseInt(sc.nextLine());
					setStu += "\t" +eng;
					System.out.print("수학 >");
					int math = Integer.parseInt(sc.nextLine());
					setStu += "\t" +math;
					
					int sum = kor + eng + math;
					setStu += "\t" + sum;
					
					students = students.replace(willSet, setStu);
					
				}
				
				
				
			}else if(input == 4) {
				System.out.print("삭제할 학번>");
				String num = sc.nextLine();
				int first = students.indexOf("\n" + num + "\t");
				if(first == -1) {
					System.out.println("존재하지 않는 학번입니다");
					continue;
					}
				int last = 0;
				String removeStu = new String();
				
				try {
					last = students.indexOf("\n", first+1);
					removeStu = students.substring(first,last);
				}catch(StringIndexOutOfBoundsException e) {
					last = students.indexOf(students.length());
					removeStu = students.substring(first,last);
				}
				students = students.replace(removeStu, "");
			}
			
			
		}
		System.out.println("이용해주셔서 감사합니다");
		
		
		
	}
}
