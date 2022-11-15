create database dreamland;
use dreamland;

create table event(
	e_no int auto_increment primary key,	-- 이벤트 목록내 넘버
    e_type varchar(10),						-- 이벤트 종류
    e_title varchar(50),					-- 이벤트 제목
    e_start date,							-- 이벤트 시작일
    e_end date,								-- 이벤트 종료일
    e_summary varchar(150),					-- 이벤트 한줄설명
    e_contents varchar(500), 				-- 이벤트 설명
    e_upload datetime default now() 		-- 이벤트 등록날짜
);

select * from event order by e_no desc;
select * from attach;
alter table event rename column e_summay to e_summary;

create table attach(
	uuid varchar(100) primary key,	-- uuid(pk)
    uploadpath varchar(100),		-- 파일경로
    filename varchar(100),			-- 파일명
    image boolean,					-- 파일타입
    i_no int,						-- 이미지 no
    i_type varchar(50)				-- 이미지 종류
);

insert into event(e_type, e_title, e_start, e_end, e_summary, e_contents) 
values ('event', '루피세상', '2022-10-01', '2022-10-31', '루피세계로 초대합니다.', '루피가 가득한 세상이에요.');


select *
from (
		select @rownum:=@rownum+1 rownum, event.* 
		from event, (select @rownum:=0) as tmp
        where e_type = 'event'
		order by e_no desc
        
) as e 
where rownum > 1 and rownum <= 10;

select * from board where b_type='notice';
create table board(
	b_no int auto_increment primary key,	-- 게시판 목록내 넘버
    b_type varchar(10) not null,			-- 게시판 종류
    b_title varchar(50),					-- 게시판 제목
    b_content varchar(2000), 				-- 게시판 설명
    b_regdate datetime default now() 		-- 게시판 등록날짜
);

select count(*) from board
where b_type='notice'
and (b_title like '%D%'or b_content like '%D%');

select * from user;
create table user(
	id varchar(30) primary key,			-- id
    pw varchar(30) not null,			-- 비번
    name varchar(15),					-- 이름
    phone varchar(15)					-- 전화번호
);

alter table user add column signup datetime default now(); 
alter table user modify column phone int;

alter table user add column grp tinyint default 0;
alter table user drop u_no;

select *
from (
		select @rownum:=@rownum+1 rownum, user.* 
		from user, (select @rownum:=0) as tmp
		order by signup desc
) as u
where rownum > 0 and rownum <= 10;

select * from help;
create table help(
	h_no int auto_increment primary key,	-- 1:1 내 넘버
    h_type varchar(10),						-- 1:1 종류
    h_title varchar(50),					-- 1:1 제목
    h_id varchar(30),						-- 1:1 작성자 id
    h_email varchar(30),					-- 1:1 답변 메일
    h_content varchar(2000), 				-- 1:1 내용
    h_regdate datetime default now(), 		-- 1:1 등록날짜
    h_answer tinyint default 0				-- 1:1 답변등록 여부		
);
select * from user;
update user set grp=1 where id='admin@mail.com';

delete from help where h_no=3;
alter table help add column h_an_content varchar(2000); 

alter table help modify column h_an_date datetime default now() on update now();

create table img(
	uuid varchar(100) primary key,	-- uuid(pk)
    uploadpath varchar(100),		-- 파일경로
    filename varchar(100),			-- 파일명
    image boolean,					-- 파일타입
    i_no int,						-- 글번호
    i_type varchar(50)				-- 이미지 종류
);

alter table help modify column h_an_content longtext;
ALTER TABLE upload rename column i_no to e_no;
alter table img rename upload;

select max(e_no)+1 e_no
from event;

delete from upload where e_no='20';

select u.*, e.*
from upload u left join event e
on u.e_no = e.e_no;

create table ticket(
	t_no int auto_increment primary key,	-- ticket테이블 주문넘버
	id varchar(30),			-- 아이디
	t_date varchar(15),	 	-- 예매일
	t_day varchar(5),		-- 요일
	t_time varchar(10),		-- 타임(종일/야간)
	t_a_price int default 0,		-- 어른가격
	t_j_price int default 0,		-- 청소년가격
	t_c_price int default 0,		-- 어린이가격
	t_a_cnt int	default 0,			-- 어른수량
	t_j_cnt int	default 0,			-- 청소년수량
	t_c_cnt int default 0,			-- 어린이수량
	t_total int	default 0,			-- 예매총합
	t_regdate datetime default now()	-- 티켓구매 날짜
);

alter table ticket add column t_discount int default 0;
alter table ticket add column t_final int;
alter table event add column e_discount int default 0;
select e_type, e_title, e_discount from event;
delete from ticket where t_no in(12,11,10,9,8,7,6,5,4);
delete from upload where uuid='a5c0602c-3244-42b3-97d7-ea7fa1d3cdd5,a5c0602c-3244-42b3-97d7-ea7fa1d3cdd5';
select * from event 
where (e_start <now() and e_end >now())
and e_type='sale';

select * from event 
where (e_start <sysdate() and e_end >sysdate())
and e_type='sale';

SELECT t.*, e_title, e_discount FROM ticket t join event e
on t.t_discount = e.e_no
where id='user1@mail.com'
ORDER BY t_regdate DESC LIMIT 1;

select *
from (
		select @rownum:=@rownum+1 rownum, event.* 
		from event, (select @rownum:=0) as tmp
		where e_type='sale'
        
        -- 현재
        -- and (e_start <now() and e_end>now())
        -- 지난
        -- and (e_end < now())
        -- 전체(null)
        
        
		order by e_no desc
) as e ;

select t_date, t_time, t_a_cnt, t_j_cnt, t_c_cnt from ticket;

select sum(t_a_cnt) a, sum(t_j_cnt) j, sum(t_c_cnt) c
from ticket
where t_date='2022-10-29'
and t_time='allday';

-- 메인 게시판 상위 3개만 출력하기
select * from board 
where b_type='notice' 
order by b_regdate desc limit 2;

-- 이벤트 폴더 > 이미지 출력(join)
select e.*,
	u.i_type,
	Concat(Replace(uploadPath,'\\','/'), '/', i_type, '_', uuid, '_' ,fileName)AS fileName
from (
		select @rownum:=@rownum+1 rownum, event.* 
		from event, (select @rownum:=0) as tmp
		where e_type='parade'
      ) as e join upload u
      on e.e_no = u.e_no
       where u.i_type='m';
-- 	and rownum > 1 and rownum <= 10

select t.*, e_title, e_discount 
from ticket t left join event e
on t.t_discount = e.e_no
where id='user2@mail.com'
order by t_regdate desc limit 1;

-- 이벤트 폴더 > 이미지 출력 m이랑 s 랑 둘다 하려구
select e.*, 
	u.i_type,
	Concat(Replace(uploadPath,'\\','/'), '/', i_type, '_', uuid, '_' ,fileName)AS fileName
from (
		select @rownum:=@rownum+1 rownum, event.* 
		from event, (select @rownum:=0) as tmp
		where e_type='event'				
						
		order by e_no desc
) as e join upload u
on e.e_no = u.e_no;

select * from event
where e_type='event';

delete from event where e_no=9;

update event set e_title='KB카드' where e_no=15;
