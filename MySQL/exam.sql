-- create datebase 데이터베이스변수명;
create database exam;
-- 해당 데이터베이스 선택;
use exam;
-- create table 테이블명;
create table member(
	-- 변수명 타입(글자크기)
	id varchar(20) PRIMARY KEY,
    pw varchar(30) NOT NULL,
    name varchar(5),
    birth date,
    gender varchar(1)
);
-- member테이블에 주소 컬럼 추가
alter table member add column address varchar(30);
-- member테이블에 비밀번호 컬럼의 글자수를 20자로 변경
alter table member modify column pw varchar(20) NOT NULL;
-- member 테이블 제거
drop table member;
create table member(
	id varchar(18) primary key,
    pw varchar(25) not null,
    addr varchar(50) not null,
    phone varchar(13),
    email varchar(30),
    name varchar(10),
    age varchar(3)
);
alter table member modify column age int(3) not null;
alter table member modify column phone varchar(11);
alter table member modify column age int not null;

-- insert into 테이블명(컬럼명1, 컬럼명2,,,, 컬럼명5,,)
insert into member(id, pw, addr, phone, email, name, age)
-- values (데이터값1, 데이터값2,,,, 데이터값5,,)
	values('abc1234', '1234', '제주도', '010-1234-1234', 'kang@naver.com', '강호동', 22);

-- member 테이블에 있는 모든 컬럼을 조회
-- select 컬럼명 from 테이블명
select * from member;
-- member 테이블의 id, pw, email 컬럼만 조회
select id, pw, email from member;

insert into member(id, pw, addr)
	values('abc1234', '45678', '제주도');
alter table member modify age int;
insert into member(pw, addr)
	values('45678', '제주도');
insert into member(id, addr)
	values('abc5678', '제주도');
insert into member(id, pw, addr)
	values('abc5678', '1234', '제주도');	  
select * from member;    

-- 개명(강호동 -> 강포동)
-- update 테이블명
-- set 변경하고자하는 컬럼명 = 값
update member set name = '강호동' where id='abc1234' ;

-- 비밀번호 변경
update member set pw = 1234 where id='abc1234' ;
-- member테이블 중에서 아이디가 abc1234인 데이터의 모든 컬럼을 조회
-- 조건 where
-- select 컬럼명 from 테이블명 where 조건식
select * from member where id='abc1234';
select * from member;

-- 아이디가 abc1234인 데이터는 member테이블에서 삭제
-- delete from 테이블명 where 조건식
delete from member where id='abc1234';
select * from member;


insert into member (id, pw, addr)
values('aaa111', '4444', '서울'),
	('bbb222', '7777', '인천');
select * from member;

create table board(
	bno int auto_increment primary key,
    title varchar(20),
    content varchar(100),
    writer varchar(10),
    regdate datetime,
    count int,
    id varchar(18)
);
alter table board modify column regdate date;
insert into board(title, content, writer, count, id)
values('안녕','운영진입니다','운영진','2','admin'),
	('제목','제목추가','작성자','1','aaaa1111');
alter table board modify column regdate datetime;    
insert into board (regdate) values('2022-07-19 16:00');
delete from board;
select * from board;
insert into board(title, content, writer, regdate, id)
values('안녕','운영진입니다','운영진','2022-07-19 16:00','admin'),
	('제목','제목추가','작성자','2022-07-19 16:00','aaaa1111');
select * from board;
update board set count=0;
update board set count = count +1 where bno=4;
update board set count = count +1 where bno=5;
select * from board;

create table board(
	bno 	int auto_increment primary key,
    title 	varchar(20) not null,
    content varchar(1000),
    writer 	varchar(10),
    regdate datetime default now(), -- 자동 부여
    count 	int default 0,				-- 자동 부여
    id 		varchar(18)
);
insert into ﻿board(title, content, writer, id)
values('안녕','운영진입니다','운영진','admin'),
    	('제목','제목추가','작성자','aaaa1111');
select *from board;
insert into board(title, content, writer, id)
values('안녕','운영진입니다','운영진','admin'),
	('제목','제목추가','작성자','aaaa1111');
select *from board;
update member set id='aaaa1111' where id='aaa111' ;
select * from member;
-- alter문으로 foreign key 설정
-- alter table 자식테이블명 add constraint 제약조건명
-- foreign key (자식_컬럼명) references 부모테이블명 (부모_컬럼명)
alter table board add constraint id_fk
foreign key (id) references member (id)
on delete cascade -- 부모테이블 삭제시 자식테이블 데이터도 자동 삭제
on update cascade -- 부모테이블 변경시 자식테이블 데이터도 자동 변경
;
alter table board drop constraint id_fk;

delete from board where id='admin';

insert into board(title, content, writer, id)
values('안녕1','운영진입니다1','운영진1','abc5678');

delete from member where id='abc5678';

