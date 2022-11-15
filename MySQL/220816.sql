show variables like 'datadir';
create database mynewdb;
create database exam;
use exam;
select * from member;
select * from board;

insert into board (title, content, id) 
values('타이틀6', '내용내용내용6', 'fff666'),
	('타이틀6', '내용내용내용6', 'fff666'),
    ('타이틀6', '내용내용내용6', 'fff666'),
    ('타이틀6', '내용내용내용6', 'fff666'),
    ('타이틀6', '내용내용내용6', 'fff666'),
    ('타이틀6', '내용내용내용6', 'fff666'),
    ('타이틀6', '내용내용내용6', 'fff666'),
    ('타이틀6', '내용내용내용6', 'fff666'),
    ('타이틀6', '내용내용내용6', 'fff666'),
    ('타이틀6', '내용내용내용6', 'fff666'),
    ('타이틀6', '내용내용내용6', 'fff666'),
    ('타이틀6', '내용내용내용6', 'fff666'),
    ('타이틀6', '내용내용내용6', 'fff666'),
    ('타이틀6', '내용내용내용6', 'fff666'),
    ('타이틀6', '내용내용내용6', 'fff666'),
    ('타이틀6', '내용내용내용6', 'fff666'),
    ('타이틀6', '내용내용내용6', 'fff666'),
    ('타이틀6', '내용내용내용6', 'fff666');

select *
from (
		select @rownum:=@rownum+1 rownum, board.* 
		from board, (select @rownum:=0) as tmp
		-- 키워드가 null이 아니면 
        -- 키워드종류(type)이 제목이면
        where title like concat('%','go','%')
        
        -- 키워드종류(type)이 작성자이면
        -- where id like concat('%','go','%')
        -- 키워드종류(type)이 내용이면
        -- where content like concat('%','go','%')
        -- 키워드 종류(type)이 제목+내용이면
        -- where title like concat('%','go','%')
        -- or where content like concat('%','go','%')
        
        order by bno desc
) as boardlist 
where rownum >0 and rownum <=10; 
-- 1~10 1페이지에 10개(한페이지당 게시물 갯수)의 게시물
-- where rownum >10 and rownum <=20 11~20 2페이지
-- 21~30 3페이지
-- 31~40 4페이지
-- 41~50 5페이지

select count(*) from board;

select * from board order by bno desc;



update board set count = count+1 where bno=165;
select * from member;

create table reply(
	rno int auto_increment primary key, -- 댓글 번호
    reply varchar(300), 				-- 댓글 내용
    id varchar(20), 					-- id
    replydate datetime default now(), 	-- 댓글 작성 일자
    bno int 							-- 게시판 번호
);

insert into reply(reply, id, bno)   
values('댓글이 들어갑니까?','aaaa1111','19');

select * from reply order by replydate desc;

update reply set reply='댓글 수정 확인중' where rno=20;
select * from member;
update member set pw=1111, addr='거기' where id='ccc333';
