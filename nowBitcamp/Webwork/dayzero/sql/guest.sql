-- 방명록(guest01)
-- 글(content),글쓴이(name),날짜(nalja)

drop table guest;
create table guest(
	content varchar2(1024),
	name varchar2(15),
	nalja date
);

insert into guest (content,name,nalja) values('내용1','이름1',sysdate);
insert into guest (content,name,nalja) values('내용2','이름2',sysdate);
insert into guest (content,name,nalja) values('내용3','이름3',sysdate);
insert into guest (content,name,nalja) values('내용4','이름4',sysdate);
insert into guest (content,name,nalja) values('내용5','이름5',sysdate);

select content, name, nalja from guest;