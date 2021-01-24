package com.bit.day09;

class Student{
   // 정보의 은닉 - 캡슐화
   
   int kor,eng,math;
   private int num;
   private String name;
   
   public Student(int num,String name) {
      this.num=num;
      this.name=name;
   }
   public int saySum() {
      return kor+eng+math;
   }
   public int getNum() {
      return num;
   }
   public String getName() {
      return name;
   }
}

public class Ex10 {

   public static void main(String[] args) {
      java.util.Scanner sc;
      sc=new java.util.Scanner(System.in);
      
      System.out.print("총원>");
      int tot=Integer.parseInt(sc.nextLine());
      Student[] data=new Student[tot];
      int input=0;
      int cnt=0;
      while(true) {
         System.out.print("1.보기 2.입력 0.종료>");
         input=Integer.parseInt(sc.nextLine());
         if(input==0) {
            break;
         }else if(input==1) {
            System.out.println("========================================");
            System.out.println("학번\t|이름\t|국어\t|영어\t|수학\t|합계");
            System.out.println("----------------------------------------");
            
            for(int i=0; i<data.length; i++) {
               Student stu=data[i];
               if(stu==null) {break;}
               String msg=stu.getNum()+"\t|"
                     +stu.getName()+"\t|"+stu.kor+"\t|"
                     +stu.eng+"\t|"+stu.math+"\t|"
                     +stu.saySum();
               System.out.println(msg);
            }
         }else if(input==2) {
            cnt++;
            System.out.print("이름>");
            String name=sc.nextLine();
            Student stu=new Student(cnt,name);
            System.out.print("국어>");
            stu.kor=Integer.parseInt(sc.nextLine());
            System.out.print("영어>");
            stu.eng=Integer.parseInt(sc.nextLine());
            System.out.print("수학>");
            stu.math=Integer.parseInt(sc.nextLine());
            data[cnt-1]=stu;
         }
      }
   }

}

