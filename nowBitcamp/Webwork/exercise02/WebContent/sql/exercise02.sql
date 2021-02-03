drop table exercise02_guest;
drop table exercise02_user;
drop sequence exercise02_user_seq;
drop sequence exercise02_guest_seq;

create table exercise02_user(
	num number constraint exercise02_user_num_pk primary key,
	id varchar2(15) constraint exercise02_user_id_uk unique not null,
	pw varchar2(18) constraint exercise02_user_pw_nn not null
);

create table exercise02_guest(
	num number constraint exercise02_guest_num_pk primary key,
	id varchar2(15) constraint exercise02_guest_id_nn not null 
	references exercise02_user(id),
	sub varchar2(100) constraint exercise02_guest_sub_nn not null,
	content varchar2(1000) constraint exercise02_guest_content_nn not null,
	nalja date constraint exercise02_guest_nalja_nn not null,
	cnt number default 0 constraint exercise02_guest_cnt_nn not null,
	ref number default 0 constraint exercise02_guest_ref_nn not null,
	ord number default 0 constraint exercise02_guest_ord_nn not null,
	lev number  default 0constraint exercise02_guest_lev_nn not null
);

create sequence exercise02_user_seq;
create sequence exercise02_guest_seq;

insert into exercise02_user values(exercise02_user_seq.nextval,'관리자','1234');
insert into exercise02_user values(exercise02_user_seq.nextval,'랄로맨','1234');
insert into exercise02_user values(exercise02_user_seq.nextval,'랄로와친구','1234');
insert into exercise02_user values(exercise02_user_seq.nextval,'랄롤로','1234');
insert into exercise02_user values(exercise02_user_seq.nextval,'지랄로','1234');

insert into exercise02_guest (num,id,sub,content,nalja,cnt,ref,ord,lev) 
values(exercise02_guest_seq.nextval,'랄로맨','랄선생님 생각나서....','어랏? 코인만 치면 나온다구???',sysdate,0,exercise02_guest_seq.currval,0,0);
insert into exercise02_guest (num,id,sub,content,nalja,cnt,ref,ord,lev) 
values(exercise02_guest_seq.nextval,'랄로와친구','바디 프렌드 안좋대여','이런 의견이 있다는것도 참고하시면 좋으실듯',sysdate,0,exercise02_guest_seq.currval,0,0);
insert into exercise02_guest (num,id,sub,content,nalja,cnt,ref,ord,lev) 
values(exercise02_guest_seq.nextval,'랄롤로','깝치지마','비트코인은 건제하다',sysdate,0,exercise02_guest_seq.currval,0,0);
insert into exercise02_guest (num,id,sub,content,nalja,cnt,ref,ord,lev) 
values(exercise02_guest_seq.nextval,'지랄로','랄로 팬아트','유투부 재밌게 보고 있슴니다

김찬호 파이팅',sysdate,0,exercise02_guest_seq.currval,0,0);
insert into exercise02_guest (num,id,sub,content,nalja,cnt,ref,ord,lev) 
values(exercise02_guest_seq.nextval,'랄로맨','랄선생님 생각나서....','어랏? 코인만 치면 나온다구???',sysdate,0,exercise02_guest_seq.currval,0,0);
insert into exercise02_guest (num,id,sub,content,nalja,cnt,ref,ord,lev) 
values(exercise02_guest_seq.nextval,'랄로와친구','바디 프렌드 안좋대여','이런 의견이 있다는것도 참고하시면 좋으실듯',sysdate,0,exercise02_guest_seq.currval,0,0);
insert into exercise02_guest (num,id,sub,content,nalja,cnt,ref,ord,lev) 
values(exercise02_guest_seq.nextval,'랄롤로','깝치지마','비트코인은 건제하다',sysdate,0,exercise02_guest_seq.currval,0,0);
insert into exercise02_guest (num,id,sub,content,nalja,cnt,ref,ord,lev) 
values(exercise02_guest_seq.nextval,'지랄로','랄로 팬아트','유투부 재밌게 보고 있슴니다

김찬호 파이팅',sysdate,0,exercise02_guest_seq.currval,0,0);
insert into exercise02_guest (num,id,sub,content,nalja,cnt,ref,ord,lev) 
values(exercise02_guest_seq.nextval,'랄로맨','랄선생님 생각나서....','어랏? 코인만 치면 나온다구???',sysdate,0,exercise02_guest_seq.currval,0,0);
insert into exercise02_guest (num,id,sub,content,nalja,cnt,ref,ord,lev) 
values(exercise02_guest_seq.nextval,'랄로와친구','바디 프렌드 안좋대여','이런 의견이 있다는것도 참고하시면 좋으실듯',sysdate,0,exercise02_guest_seq.currval,0,0);
insert into exercise02_guest (num,id,sub,content,nalja,cnt,ref,ord,lev) 
values(exercise02_guest_seq.nextval,'랄롤로','깝치지마','비트코인은 건제하다',sysdate,0,exercise02_guest_seq.currval,0,0);
insert into exercise02_guest (num,id,sub,content,nalja,cnt,ref,ord,lev) 
values(exercise02_guest_seq.nextval,'지랄로','랄로 팬아트','유투부 재밌게 보고 있슴니다

김찬호 파이팅',sysdate,0,exercise02_guest_seq.currval,0,0);
insert into exercise02_guest (num,id,sub,content,nalja,cnt,ref,ord,lev) 
values(exercise02_guest_seq.nextval,'랄로맨','랄선생님 생각나서....','어랏? 코인만 치면 나온다구???',sysdate,0,exercise02_guest_seq.currval,0,0);
insert into exercise02_guest (num,id,sub,content,nalja,cnt,ref,ord,lev) 
values(exercise02_guest_seq.nextval,'랄로와친구','바디 프렌드 안좋대여','이런 의견이 있다는것도 참고하시면 좋으실듯',sysdate,0,exercise02_guest_seq.currval,0,0);
insert into exercise02_guest (num,id,sub,content,nalja,cnt,ref,ord,lev) 
values(exercise02_guest_seq.nextval,'랄롤로','깝치지마','비트코인은 건제하다',sysdate,0,exercise02_guest_seq.currval,0,0);
insert into exercise02_guest (num,id,sub,content,nalja,cnt,ref,ord,lev) 
values(exercise02_guest_seq.nextval,'지랄로','랄로 팬아트','유투부 재밌게 보고 있슴니다

김찬호 파이팅',sysdate,0,exercise02_guest_seq.currval,0,0);
insert into exercise02_guest (num,id,sub,content,nalja,cnt,ref,ord,lev) 
values(exercise02_guest_seq.nextval,'랄로맨','랄선생님 생각나서....','어랏? 코인만 치면 나온다구???',sysdate,0,exercise02_guest_seq.currval,0,0);
insert into exercise02_guest (num,id,sub,content,nalja,cnt,ref,ord,lev) 
values(exercise02_guest_seq.nextval,'랄로와친구','바디 프렌드 안좋대여','이런 의견이 있다는것도 참고하시면 좋으실듯',sysdate,0,exercise02_guest_seq.currval,0,0);
insert into exercise02_guest (num,id,sub,content,nalja,cnt,ref,ord,lev) 
values(exercise02_guest_seq.nextval,'랄롤로','깝치지마','비트코인은 건제하다',sysdate,0,exercise02_guest_seq.currval,0,0);
insert into exercise02_guest (num,id,sub,content,nalja,cnt,ref,ord,lev) 
values(exercise02_guest_seq.nextval,'지랄로','랄로 팬아트','유투부 재밌게 보고 있슴니다

김찬호 파이팅',sysdate,0,exercise02_guest_seq.currval,0,0);
insert into exercise02_guest (num,id,sub,content,nalja,cnt,ref,ord,lev) 
values(exercise02_guest_seq.nextval,'랄로맨','랄선생님 생각나서....','어랏? 코인만 치면 나온다구???',sysdate,0,exercise02_guest_seq.currval,0,0);
insert into exercise02_guest (num,id,sub,content,nalja,cnt,ref,ord,lev) 
values(exercise02_guest_seq.nextval,'랄로와친구','바디 프렌드 안좋대여','이런 의견이 있다는것도 참고하시면 좋으실듯',sysdate,0,exercise02_guest_seq.currval,0,0);
insert into exercise02_guest (num,id,sub,content,nalja,cnt,ref,ord,lev) 
values(exercise02_guest_seq.nextval,'랄롤로','깝치지마','비트코인은 건제하다',sysdate,0,exercise02_guest_seq.currval,0,0);
insert into exercise02_guest (num,id,sub,content,nalja,cnt,ref,ord,lev) 
values(exercise02_guest_seq.nextval,'지랄로','랄로 팬아트','유투부 재밌게 보고 있슴니다

김찬호 파이팅',sysdate,0,exercise02_guest_seq.currval,0,0);
insert into exercise02_guest (num,id,sub,content,nalja,cnt,ref,ord,lev) 
values(exercise02_guest_seq.nextval,'랄로맨','랄선생님 생각나서....','어랏? 코인만 치면 나온다구???',sysdate,0,exercise02_guest_seq.currval,0,0);
insert into exercise02_guest (num,id,sub,content,nalja,cnt,ref,ord,lev) 
values(exercise02_guest_seq.nextval,'랄로와친구','바디 프렌드 안좋대여','이런 의견이 있다는것도 참고하시면 좋으실듯',sysdate,0,exercise02_guest_seq.currval,0,0);
insert into exercise02_guest (num,id,sub,content,nalja,cnt,ref,ord,lev) 
values(exercise02_guest_seq.nextval,'랄롤로','깝치지마','비트코인은 건제하다',sysdate,0,exercise02_guest_seq.currval,0,0);
insert into exercise02_guest (num,id,sub,content,nalja,cnt,ref,ord,lev) 
values(exercise02_guest_seq.nextval,'지랄로','랄로 팬아트','유투부 재밌게 보고 있슴니다

김찬호 파이팅',sysdate,0,exercise02_guest_seq.currval,0,0);
insert into exercise02_guest (num,id,sub,content,nalja,cnt,ref,ord,lev) 
values(exercise02_guest_seq.nextval,'랄로맨','랄선생님 생각나서....','어랏? 코인만 치면 나온다구???',sysdate,0,exercise02_guest_seq.currval,0,0);
insert into exercise02_guest (num,id,sub,content,nalja,cnt,ref,ord,lev) 
values(exercise02_guest_seq.nextval,'랄로와친구','바디 프렌드 안좋대여','이런 의견이 있다는것도 참고하시면 좋으실듯',sysdate,0,exercise02_guest_seq.currval,0,0);
insert into exercise02_guest (num,id,sub,content,nalja,cnt,ref,ord,lev) 
values(exercise02_guest_seq.nextval,'랄롤로','깝치지마','비트코인은 건제하다',sysdate,0,exercise02_guest_seq.currval,0,0);
insert into exercise02_guest (num,id,sub,content,nalja,cnt,ref,ord,lev) 
values(exercise02_guest_seq.nextval,'지랄로','랄로 팬아트','유투부 재밌게 보고 있슴니다

김찬호 파이팅',sysdate,0,exercise02_guest_seq.currval,0,0);
insert into exercise02_guest (num,id,sub,content,nalja,cnt,ref,ord,lev) 
values(exercise02_guest_seq.nextval,'랄로맨','랄선생님 생각나서....','어랏? 코인만 치면 나온다구???',sysdate,0,exercise02_guest_seq.currval,0,0);
insert into exercise02_guest (num,id,sub,content,nalja,cnt,ref,ord,lev) 
values(exercise02_guest_seq.nextval,'랄로와친구','바디 프렌드 안좋대여','이런 의견이 있다는것도 참고하시면 좋으실듯',sysdate,0,exercise02_guest_seq.currval,0,0);
insert into exercise02_guest (num,id,sub,content,nalja,cnt,ref,ord,lev) 
values(exercise02_guest_seq.nextval,'랄롤로','깝치지마','비트코인은 건제하다',sysdate,0,exercise02_guest_seq.currval,0,0);
insert into exercise02_guest (num,id,sub,content,nalja,cnt,ref,ord,lev) 
values(exercise02_guest_seq.nextval,'지랄로','랄로 팬아트','유투부 재밌게 보고 있슴니다

김찬호 파이팅',sysdate,0,exercise02_guest_seq.currval,0,0);



select * from (select rownum as rn,num,id,sub,content,nalja,cnt,ref,ord,lev from exercise02_guest where ord=0 order by num desc)
where sub like '%%' 
and rn between (select max(rn)-13 from 
(select * from (select rownum as rn,num,id,sub,content,nalja,cnt,ref,ord,lev from exercise02_guest where ord=0 order by num desc))) 
and (select max(rn) from 
(select * from (select rownum as rn,num,id,sub,content,nalja,cnt,ref,ord,lev from exercise02_guest where ord=0 order by num desc)))
order by rn desc;

select * from exercise02_guest;