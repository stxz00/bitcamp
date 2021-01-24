package com.bit.day15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;

public class EX16 {
	public static void main(String[] args) {
		File file = new File("Ex16.bin");
		
		
		//문자스트림
		//학생성적관리프로그램(ver 0.7.0);
		//1. 보기 2. 입력 3. 수정 4. 삭제 0. 종료
		System.out.println("학생성적관리프로그램(ver 0.7.0)");
		System.out.println("-------------------------------------");
		String main = "1. 보기 2. 입력 3. 수정 4. 삭제 0. 종료 >";
		String table="-------------------------------------";
	    table+="\n학번\t이름\t국어\t영어\t수학";
	    table+="\n-------------------------------------";
	    Scanner sc = new Scanner(System.in);
	    int input = 0;
	    while(true) {
	    	System.out.print(main);
	    	input = sc.nextInt();
	    	if(input == 0) {
	    		break;
	    	}
	    	if(input == 1) {
	    		System.out.println(table);
	    		
	    		Reader rd = null;
	    		BufferedReader br = null;
	    		try {
					rd = new FileReader(file);
					br = new BufferedReader(rd);
					while(true) {
						String str = br.readLine();
						if(str == null) {break;}
						System.out.println(str);
					}
					
					
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
					try {
						if(rd != null) {rd.close();}
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
	    		

	    	}else if(input == 2) {
	    		System.out.print("학번 > ");
	    		int num = sc.nextInt();
	    		sc.nextLine();
	    		System.out.print("이름 > ");
	    		String name = sc.nextLine();
	    		System.out.print("국어 > ");
	    		int kor= sc.nextInt();
	    		System.out.print("영어 > ");
	    		int eng = sc.nextInt();
	    		System.out.print("수학 > ");
	    		int math = sc.nextInt();
	    		
	    		
	    		Writer wt = null;
	    		BufferedWriter bw = null;
	    		Reader rd = null;
	    		BufferedReader br = null;
	    		
	    		try {
	    			file.createNewFile();
	    			rd = new FileReader(file);
	    			br = new BufferedReader(rd);
	    			String old = new String();
	    			while(true) {
	    				String  old1 = br.readLine();
	    				if(old1 == null) {break;}
	    				old += old1 + "\n";
	    			}

					wt = new FileWriter(file);
					bw = new BufferedWriter(wt);
					bw.write(old);
					bw.write(""+num);
					bw.write("\t");
					bw.write(name);
					bw.write("\t");
					bw.write(""+kor);
					bw.write("\t");
					bw.write(""+eng);
					bw.write("\t");
					bw.write(""+math);
					bw.newLine();
					
				} catch (IOException e) {
					e.printStackTrace();
				} finally {
					try {
						if(bw != null) {bw.close();}
						if(wt != null) {wt.close();}
					} catch (IOException e) {
						e.printStackTrace();
					}
				}

	    	}else if(input == 3) {
	    		System.out.print("수정할 학번 > ");
	    		input = sc.nextInt();
	    		
	    		Writer wt = null;
	    		BufferedWriter bw = null;
	    		Reader rd = null;
	    		BufferedReader br = null;
	    		try {
	    			file.createNewFile();
	    			rd = new FileReader(file);
	    			br = new BufferedReader(rd);
	    			String old = new String();
	    			while(true) {
	    				String  old1 = br.readLine();
	    				if(old1 == null) {break;}
	    				
	    				int last = old1.indexOf("\t");
	    				String stuNum = old1.substring(0,last);
	    				if(stuNum.equals(""+input)) {
	    					sc.nextLine();
	    					System.out.print("이름 > ");
	    		    		String name = sc.nextLine();
	    					System.out.print("국어 > ");
	    		    		int kor= sc.nextInt();
	    		    		System.out.print("영어 > ");
	    		    		int eng = sc.nextInt();
	    		    		System.out.print("수학 > ");
	    		    		int math = sc.nextInt();
	    		    		String set = stuNum + "\t" + name + "\t" + kor + "\t" + eng + "\t" + math + "\n";
	    		    		old += set;
	    				}else {
	    					old += old1 + "\n";
	    				}
	    			}
	    			wt = new FileWriter(file);
	    			bw = new BufferedWriter(wt);
	    			bw.write(old);

				
				} catch (IOException e) {
					e.printStackTrace();
				} finally {
					try {
						if(bw != null) {bw.close();}
						if(wt != null) {wt.close();}
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
	    		
	    	
	    	}else if(input == 4) {
	    		System.out.print("삭제할 학번 > ");
	    		input = sc.nextInt();
	    		Writer wt = null;
	    		BufferedWriter bw = null;
	    		Reader rd = null;
	    		BufferedReader br = null;
	    		try {
	    			file.createNewFile();
	    			rd = new FileReader(file);
	    			br = new BufferedReader(rd);
	    			String old = new String();
	    			while(true) {
	    				String  old1 = br.readLine();
	    				if(old1 == null) {break;}
	    				
	    				int last = old1.indexOf("\t");
	    				String stuNum = old1.substring(0,last);
	    				if(stuNum.equals(""+input)) {
	    					
	    				}else {
	    					old += old1 + "\n";
	    				}
	    			}
	    			wt = new FileWriter(file);
	    			bw = new BufferedWriter(wt);
	    			bw.write(old);

				} catch (IOException e) {
					e.printStackTrace();
				} finally {
					try {
						if(bw != null) {bw.close();}
						if(wt != null) {wt.close();}
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
	    		
	    	}
	    }
		
	    sc.close();
	}

	

}
