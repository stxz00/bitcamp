package com.bit.day09;

public class Ex08 {

   public static void main(String[] args) {
      System.out.println("학생성적관리프로그램(ver 0.3.0)");
      int tot=myInput("총원>");

      int[][] data=new int[tot][3];
      int input=0;
      while(true) {
         input=myInput("1.보기 2.입력 0.종료>");
         if(input==0) {
            break;
         }else if(input==1) {
            System.out.println("========================================");
            System.out.println("학번\t|국어\t|영어\t|수학\t|합계");
            System.out.println("----------------------------------------");
            for(int i=0; i<data.length; i++) {
               System.out.print(i+1+"\t|");
               int sum=0;
               for(int j=0; j<data[i].length; j++) {
                  sum+=data[i][j];
                  System.out.print(data[i][j]+"\t|");
               }
               System.out.println(sum);
               System.out.println("----------------------------------------");
            }
         }else if(input==2) {
            try {
               input=myInput("학번>");
               int[] stu=data[input-1];
               stuInput(stu,0);
               stuInput(stu,1);
               stuInput("수학>",stu,2);
            }catch(ArrayIndexOutOfBoundsException e) {
               System.out.println("존재하지 않는 학번입니다");
            }catch(NumberFormatException e) {
               System.out.println("입력을 다시 확인하세요");
            }
         }
      }
      
   }
   public static int myInput(String msg) {
      java.util.Scanner sc;
      sc=new java.util.Scanner(System.in);
      System.out.print(msg);
      int su=Integer.parseInt(sc.nextLine());
      return su;
   }
   
   public static void stuInput(int[] stu,int idx) {
      String[] title= {"국어>","영어>","수학>"};
      stu[idx]=myInput(title[idx]);
   }
   
   public static void stuInput(String title,int[] stu,int idx) {
      stu[idx]=myInput(title);
   }

}
