create table student03(
  num number primary key,
  name varchar2(9),
  age number(2) check (age between 1 and 80)
);

create sequence stu03_seq start with 21001;

--num,name,age
create table grade03(
  num number primary key,
  kor number(3) default 0, --값을 입력 안하면 자동으로 0 만들어줌
  eng number(3) default 0,
  math number(3) default 0,
  foreign key(num) references student03(num)
);
-- num,kor,math

select * from student03;
select * from grade03;

select A.num,A.name,A.age,B.kor,B.eng,B.math 
from student03 A, grade03 B 
where A.num=B.num;

select num,a.name,a.age,b.kor,b.eng,b.math 
from student03 A inner join grade03 B using (num);

select num,a.name,a.age,b.kor,b.eng,b.math 
from student03 A left outer join grade03 B using (num);
  
  
select * from (select rownum,num,kor,eng,math,kor+eng+math from(
select num,kor,eng,math,kor+eng+math 
as hap from grade03 order by hap desc))
order by num; 

select num,kor,eng,math,rank() over(order by nvl(kor+eng+math,0) desc)
 as hap from grade03 order by num;

create sequence bbs02_seq start with 202;
select * from bbs02 order by num desc;



