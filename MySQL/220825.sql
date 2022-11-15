create table attach(
	uuid varchar(100) primary key,	-- uuid(pk)
    uploadpath varchar(100),		-- 파일경로
    filename varchar(100),			-- 파일명
    image boolean,					-- 파일타입
    bno int							-- bno
);

select * from attach ;
select * from board order by bno desc;
delete from board where bno=168;
insert into attach(uuid, uploadpath, filename, image, bno)
values ('6cb31c2c-78cb-4f6f-b095-ffe3b268ece7','2022\08\26','loopy08.jpg',true,'169');

select max(bno)+1 bno from board;
select * from member;

select * from reply order by replydate desc;


update reply set reply='수정원해요' where rno=60 and id='eee555';

use exam;
delete from reply where rno=64 and id='eee555';

create table mylike(
    lno int auto_increment primary key,		-- 좋아요(pk)
    lcnt int,					-- 좋아요 갯수
    bno int,					-- bno
    id varchar(18),				-- 아이디
    mylike boolean				-- 좋아요 여부
);

select * from mylike;

alter table mylike modify column mylike boolean;
select * from member;
delete from member where id='aaa';

select b.*, l.lno, l.lcnt, l.mylike 
from board b join mylike l on b.id=l.id;

select b.*, l.*
from board b join mylike l on b.bno=l.bno;

insert into mylike(lcnt, lno, id) 
values((select * from (select max(lcnt)+1 from mylike) next), lno, id);

insert into mylike(lcnt, lno, id) 
values((select * from (select max(lcnt)-1 from mylike) next), lno, id);

select * from mylike;

insert into mylike(lcnt, id, bno, mylike)
values((select * from (select max(lcnt)+1 from mylike) next), id, bno, 1);

select * from board b join mylike l on b.bno=l.bno;

select max(lcnt)+1 lcnt from mylike;
insert into mylike(lcnt, bno, id, mylike) 
values (lcnt+1, 183, 'iii777', 1);

select count(*) from mylike where bno=183 and id='iii777';

alter table mylike add column lcnt int default 0;

select * from board order by bno desc;

desc board;

update board set lcnt = lcnt+1 where bno=183;

update board set count = count+1 where bno=183;

alter table board drop column lcnt;

select *, (select count(*) from mylike where bno=(board.bno)) as lcnt
from board
order by bno desc;

select * from mylike;
insert into mylike(lno, bno, id, mylike)
values((select * from (select max(lno)+1 from mylike) next), 183, 'iii777', 1);

select * from (select max(lno)+1 from mylike) next;

alter table mylike rename column mylike to heart;

