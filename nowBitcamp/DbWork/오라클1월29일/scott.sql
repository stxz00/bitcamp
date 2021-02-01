insert into bbs04 values (bbs04_seq.nextval,'test1','tester',0,'test');
insert into bbs04 values (bbs04_seq.nextval,'test2','tester',0,'test');
insert into bbs04 values (bbs04_seq.nextval,'test3','tester',0,'test');
insert into bbs04 values (bbs04_seq.nextval,'test4','tester',0,'test');
insert into bbs04 values (bbs04_seq.nextval,'test5','tester',0,'test');

create table exercise02_guest(
	num number constraint exercise02_guest_num_pk primary key,
	id varchar2(15) constraint exercise02_guest_id_uk unique not null 
	references exercise02_user(id),
	content varchar2(100) constarint exercise02_guest_content_nn not null,
	nalja date constraint exercise02_guest_nalja_nn not null,
	cnt number default 0 constraint exercise02_guest_cnt_nn not null,
	ref number default 0 constraint exercise02_guest_ref_nn not null,
	ord number default 0 constraint exercise02_guest_ord_nn not null,
	lev number  default 0constraint exercise02_guest_lev_nn not null
);

create sequence