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