drop table exercise01;
drop sequence exercise01_seq;

create table exercise01(
	num number constraint exercise01_num_pk primary key,
	name varchar2(9) constraint exercise01_name_nn not null,
	nalja date constraint exercise01_nalja_nn not null,
	sub varchar2(30) constraint exercise01_sub_nn not null,
	content varchar(2000) ,
	ref number,
	ord number,
	lev number
);

create sequence exercise01_seq;



select rownum as rn, num,name,nalja,sub,content,ref,ord,lev from (select num,name,nalja,sub,content,ref,ord,lev from exercise01 order by ref desc, lev asc);