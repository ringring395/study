create database mynewdb;
use mynewdb;
create table emp(
	EMPNO int,
    ENAME varchar(10),
    JOB varchar(15),
    MGR int,
    HIREDATE date,
    SAL int,
    COMM int,
    DEPTNO int
);
create table DEPT(
	DEPTNO int,
    DNAME varchar(20),
    LOC varchar(15)
);
    
insert into emp
values('7369', 'SMITH','CLERK','7902','1980-12-17','800','0','20'),
	('7499', 'ALLEN','SALESMAN','7698','1981-02-20','1600','300','30'),
    ('7499', 'WARD','SALESMAN','7698','1981-02-22','1250','500','30'),
    ('7566', 'JONES','MANAGER','7839','1981-04-02','2975','0','20'),
    ('7654', 'MARTIN','SALESMAN','7698','1981-09-28','1250','1400','30'),
    ('7698', 'BLAKE','MANAGER','7839','1981-05-01','2850','0','30'),
    ('7782', 'CLARK','MANAGER','7839','1981-06-09','2450','0','10'),
    ('7788', 'SCOTT','ANALYST','7566','1982-12-09','3000','0','20'),
    ('7839', 'KING','PRESIDENT',NULL,'1981-11-17','5000','0','10'),
    ('7844', 'TURNER','SALESMAN','7698','1981-09-08','1500','0','30'),
    ('7876', 'ADAMS','CLERK','7788','1983-01-12','1100','0','20'),
    ('7900', 'JAMES','CLERK','7698','1981-12-03','950','0','30'),
    ('7902', 'FORD','ANALYST','7566','1981-12-03','3000','0','20'),
    ('7934', 'MILLER','CLERK','7782','1982-01-23','1300','0','10');
INSERT INTO DEPT
VALUES ('10','ACCOUNTING','NEW YORK'),  
	('20','RESEARCH','DALLAS'),
    ('30','SALES','CHICAGO'),
    ('40','OPERATIONS','BOSTON');

select * from emp
where sal >= 1500
and deptno = 30
and job = 'manager';

select * from emp order by deptno;

-- EMPLOYEE테이블에서 부서별로 SALARY의 합계가 2500이상인 데이터를 
-- 합계가 높은 순으로 조회하라.

select sum(sal) as '부서별급여', deptno as '부서번호' 
from emp 
group by deptno
having sum(sal) >=2500
order by `부서별급여` desc;
