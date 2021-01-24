package com.biy.stu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;



class Student1 implements Comparable<Student1>{
	   int num,kor,eng,math;

	   @Override
	   public int compareTo(Student1 before) {
	      return num-before.num;
	   }
	   
	}

	public class Ex05 {

	   public static void main(String[] args) {
	      Set<Student1> data=new TreeSet<>();
	      String title="학생성적관리프로그램(ver 0.5.0)";
	      System.out.println(title);
	      byte[] by=title.getBytes();
	      for(int i=0; i<by.length; i++) {
	         System.out.print('-');
	      }
	      System.out.println();
	      Scanner sc=new Scanner(System.in);
	      String header="----------------------------------------";
	      header+="\n학번\t국어\t영어\t수학";
	      header+="\n----------------------------------------";
	      String menu="1.보기 2.입력 3.수정 4.삭제 0.종료>";
	      int input=0;
	      while(true) {
	         System.out.print(menu);
	         input=sc.nextInt();
	         if(input==0) {break;}
	         if(input==1) {
	            System.out.println(header);
	            Iterator<Student1> ite = data.iterator();
	            while(ite.hasNext()) {
	               Student1 stu = ite.next();
	               System.out.println(stu.num+"\t"
	               +stu.kor+"\t"+stu.eng+"\t"+stu.math);
	            }
	            
	         }else if(input==2) {
	            System.out.print("학번>");
	            int num=sc.nextInt();
	            System.out.print("국어>");
	            int kor=sc.nextInt();
	            System.out.print("영어>");
	            int eng=sc.nextInt();
	            System.out.print("수학>");
	            int math=sc.nextInt();
	            Student1 stu=new Student1();
	            stu.num=num;
	            stu.kor=kor;
	            stu.eng=eng;
	            stu.math=math;
	            data.add(stu);
	            System.out.println(stu);
	         }else if(input==3) {
	            System.out.print("수정할 학번>");
	            int num=sc.nextInt();
	            Iterator<Student1> ite = data.iterator();
	            while(ite.hasNext()) {
	               Student1 stu = ite.next();
	               if(stu.num==num) {
	                  System.out.print("국어>");
	                  int kor=sc.nextInt();
	                  System.out.print("영어>");
	                  int eng=sc.nextInt();
	                  System.out.print("수학>");
	                  int math=sc.nextInt();
	                  stu.kor=kor;
	                  stu.eng=eng;
	                  stu.math=math;
	                  break;
	               }
	            }
	         }else if(input==4) {
	            System.out.print("삭제할 학번>");
	            int num=sc.nextInt();
	            Iterator<Student1> ite = data.iterator();
	            while(ite.hasNext()) {
	               Student1 stu = ite.next();
	               if(stu.num==num) {
	                  data.remove(stu);
	                  break;
	               }
	            }
	         }
	      }
	   }

	}
