use dreamland;

set sql_safe_updates=0;
select * from upload;

select * from board;

select * from event;

select * from help;

select * from user;

select * from ticket;

-- auto_increment 초기화
alter table event auto_increment=1;
