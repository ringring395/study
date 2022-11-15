use exam;
select * from board;
-- 제목title 클릭했을때 (트랜잭션 발동)
start transaction;
-- 제목 title과 내용content이 조회됨과 동시에 
select title, content from board where id='aaaa1111';
-- 조회수count가 1씩 증가
update board
set count1 = count1 + 1
where id = 'aaaa1111';

commit ;
rollback;
select * from board;
select * from emp;
-- 프로시저 (부서번호가 10번 사원을 출력)
DELIMITER //
create procedure pr1(a int)
begin
	select * from emp where deptno = a;
end
//
DELIMITER ;
-- pr2 프로시저 호출(부서 번호 10을 매개변수 a에 세팅)
call pr1(10);
call pr1(20);
call pr1(30);
call pr1(40);
-- 함수
show global variables like 'log_bin_trust_function_creators';
set global log_bin_trust_function_creators =1;

DELIMITER //
create function fu1(a int, b int) returns int
begin
	return a+b;
end
//
DELIMITER ;
-- 함수 호출
select fu1(10,20);
-- 함수 fu2 선언
DELIMITER //
create function fu2() returns double
begin
-- 변수 선언(declare)
	declare R double;
	select avg(sal) 
    into R	 -- avg(sal)을 R 에 저장
    from emp;
	return R; 
end
//
DELIMITER ;
-- 함수 fu2 호출
select fu2() as avgsal;

-- emp테이블을 이용해서 인수에 부서번호를 하나 설정하면 해당하는 부서의 급여합계를 반환하는 저장함수 F_SALES()를 만드시오.
select deptno, sum(sal) from emp group by deptno order by DEPTNO;
DELIMITER //
create function F_SALES(a int) returns int
begin
	declare s int;			-- 값을 저장한 변수 선언
    select sum(sal) into s 	-- s에 급여합계 저장
    from emp
    where DEPTNO = a;
    return s;
end    
//
DELIMITER ;
-- F_sales 호출
select F_SALES(10);
select F_SALES(20);
select f_sales(30);
select F_SALES(10) , F_SALES(20), F_SALES(30);
select * from member;
