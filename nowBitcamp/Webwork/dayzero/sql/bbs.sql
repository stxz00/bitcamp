drop table bbs;
create table bbs(
	num number,
	sub varchar2(30),
	name varchar2(15),
	nalja date,
	content varchar2(2000)
);

insert into bbs (num, sub, name, nalja, content) values(1,'제목없음1','이름1',sysdate,'내용1');
insert into bbs (num, sub, name, nalja, content) values(2,'제목없음2','이름2',sysdate,'내용2');
insert into bbs (num, sub, name, nalja, content) values(3,'제목없음3','이름3',sysdate,'내용3');
insert into bbs (num, sub, name, nalja, content) values(4,'제목없음4','이름4',sysdate,'내용4');
insert into bbs (num, sub, name, nalja, content) values(5,'제목없음5','이름5',sysdate,'내용5');

select num, sub, name, nalja, content from bbs order by num desc; 