use exam;
select * from member where id='aaaa1111' and pw='4444';
select * from member;
desc member;
insert into member (id, pw, addr) values('ccc333', '8888', '거기');
delete from member where id='null';
select * from board;
desc board;
-- insert into board(title, content) values('안녕','운영진입니다');
update member set id='aaaa1111' where id='aaa111' ;
-- update board set title=?, content=? where bno=?
select bno, title, content from board where bno=14;
select title,content from board 
where bno = (select bno from board 
			where title);
delete from board where bno="18";
update board set title='hello', content='첫인사입니다' where bno=22;
delete from member where id="";
update member set addr='캐나다' where id='bbb222';
alter table member modify column addr varchar(50) NULL;    
select * 
from member m join board b
on m.id = b.id;
delete from board where bno=52;
delete from member where id='ggg777';
select sysdate();
select * from board;
﻿insert into board(title, content) values ('abc','def');  -- X
insert into board(title, content) values ('awef','awfe');  -- O
﻿insert into board(title, content) values ('awef','awfe'); -- X
select * from member;
select ename, deptno from emp where empno=7566;
select ename, job from emp where deptno=20 and sal >=400;
select deptno, sum(sal) as'부서별월급' from emp 
group by deptno order by `부서별월급`;
select job, max(sal)-min(sal) as'최고-최저월급차', max(sal) as'최고월급',
min(sal) as'최저월급' from emp group by job;
select ename, comm, min(sal), deptno from emp
where comm is null or comm=0 group by deptno;
select empno,ename, loc, sal from emp join dept
on emp.deptno = dept.DEPTNO
where sal between 3000 and 3999;
select ename, dname, loc
from emp e join dept d
on e.DEPTNO = d.DEPTNO
where ename like '%LA%';
select ename, dname, sal, job from emp e join dept d
on d.deptno = e.deptno
where job =(select job from emp where ename='allen');
select empno,ename, hiredate,sal, deptno from emp
where deptno = (select deptno from emp where ename='jones');
select empno,ename,dname,hiredate,loc,sal, e.deptno
from emp e join dept d on e.deptno = d.deptno
where sal > (select avg(sal) from emp);
select e.deptno,ename, dname, loc,sal
from emp e join dept d on e.deptno=d.deptno
where job in (select job from emp where deptno=10)
order by sal desc;
select empno, ename, sal from emp
where sal in (select sal from emp where ename='martin' or ename='scott');
select max(sal) from emp where deptno=30;
select empno, ename, sal from emp
where sal > (select max(sal) from emp where deptno=30);
select max(sal+ifnull(comm,0)) max,
min(sal+ifnull(comm,0)) min,
avg(sal+ifnull(comm,0)) avg
from emp;
select deptno,sum(sal) from emp group by deptno order by deptno;
select ename, job, sal, 
case when sal>=3000 then sal*1.15
	when sal>=2000 then sal*1.1
    when sal >=1000 then sal*1.05
    else sal
end as bonus
from emp;
select mgr from emp where ename='martin';
select ename, job, sal,dname, loc from emp e join dept d on e.deptno=d.DEPTNO
where MGR = (select mgr from emp where ename='martin');
select ename, job, sal, dname
from emp e join dept d on e.deptno=d.deptno
where dname='research';
select deptno, avg(sal) from emp group by deptno;
select dname, loc, sal from emp e join dept d on e.deptno=d.deptno
where sal < all(select avg(sal) avgsal from emp group by deptno);
select deptno,ename, hiredate from emp where ename='blake';
select deptno, ename, hiredate from emp
where deptno = (select deptno from emp where ename='blake')
and ename !='blake';
select deptno, ename from emp where ename like '%t%';
select deptno,empno,ename from emp
where deptno in(select deptno from emp where ename like '%t%'); 
select empno, ename, sal from emp
where deptno in(select deptno from emp
				where sal>(select avg(sal) from emp)
                and ename like '%s%') order by sal;
select ename, sal, deptno from emp
where deptno in(select deptno from emp where comm is not null and comm>0)
and sal in(select sal from emp where comm is not null and comm>0);
select job, case when job='president' then 'A'
				when job='analyst' then 'B'
                when job='manager' then 'c'
                when job='salesman' then 'D'
                when job='clerk' then 'E'
                end as '사원등급'
from emp order by `사원등급`;
select empno,ename, dname,hiredate,loc 
from emp e join dept d on e.deptno=d.deptno
where e.deptno=10 
and job not in (select job from emp where deptno=30);
select empno,ename, sal from emp
where sal >(select max(sal) from emp where deptno =30);
select empno,ename,sal from emp
where sal<(select min(sal) from emp where deptno=30);
select empno,ename, hiredate,dname
from emp e join dept d on e.deptno=d.deptno
where hiredate = (select min(hiredate) from emp);
select empno,ename, sal*12+ifnull(comm,0) as money from emp
where sal*12+ifnull(comm,0)>(select avg(sal*12+ifnull(comm,0)) from emp)
order by sal desc;
select e.deptno, dname, ename, sal 
from emp e join dept d on e.deptno=d.DEPTNO order by 1;
select dname, ename from emp e join dept d on e.deptno=d.deptno
where ename='allen';
select * from emp e right outer join dept d on e.deptno=d.deptno
where empno is null;
select empno, ename, sal from emp order by 3;
select ename, sal from emp where job='salesman' and sal>=1000;
select ename, job, sal from emp 
where job='manager' order by sal desc;
select ename, sal, job, hiredate, deptno from emp
where hiredate='1981-11-17';
select ename, sal from emp
where sal>=3600;
select ename, sal, job,deptno from emp
where sal <=1200;
select ename, deptno, job from emp
where job != 'salesman' order by 2;
select ename, sal from emp
where sal not between 1000 and 3000;
select ename, sal from emp where ename like '%t';
select ename, comm from emp where comm is null;
select ename, sal, job from emp
where job not in('salesman','analyst','manager');
select count(*) as '직원수' from emp;
select sum(sal) '급여합' from emp;
select sum(sal) '급여합', avg(sal) '급여평균', deptno from emp
group by DEPTNO
having `급여평균` <=2500;
select deptno, sum(sal) '부서별 급여합' from emp
group by deptno;
select job, max(sal)-min(sal) '최고-최저 월급',
max(sal) '최고월급', min(sal) '최저월급' from emp
group by job;
select ename, comm, min(sal) '최저월급', deptno from emp
where sal in (select min(sal) from emp group by deptno)
group by deptno ;
select ename, dname, loc 
from emp e join dept d on e.deptno=d.deptno
where ename like '%la%';
select empno, job, dname
from emp e join dept d on e.deptno=d.deptno
where sal >=2000;
select empno, job, 
	(select dname from dept d where e.deptno=d.deptno) as dname
from emp e
where sal >=2000;
select count(*) from emp group by deptno;
select max(count) 
from (select count(*) count from emp group by deptno) view;

select empno, ename, dname
from emp e join dept d on e.deptno=d.deptno
where sal> (select avg(sal) from emp) order by 3;

select avg(sal) from emp;
select deptno, avg(sal) from emp group by deptno;
select empno, ename, dname
from emp e join dept d on e.deptno=d.deptno
where sal > any (select avg(sal) from emp group by deptno);
use exam;


