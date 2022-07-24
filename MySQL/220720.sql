select bno as '게시판번호', 
		title as '제목', 
        writer as '작성자', 
        regdate  '작성일자', 
        count + 1 as  '조회수'
from board;
create table emp(
	EMPNO int primary key,
    ENAME varchar(10),
    JOB varchar(20),
    MGR int,
    HIREDATE date,
    SAL int,
    COMM int,
    DEPTNO int
);
create table DEPT(
	DEPTNO int primary key,
    DNAME varchar(20),
    LOC varchar(20)
);
insert into DEPT
values('10', 'ACCOUNTING', 'NEW YORK'),
	('20', 'RESEARCH', 'DALLAS'),
    ('30', 'SALES', 'CHICAGO'),
    ('40', 'OPERATIONS', 'BOSTON'),
    ('50', 'DEVELOPER', 'KOREA');
select * from DEPT;  

insert into emp(EMPNO,ENAME,JOB,MGR,HIREDATE,SAL,DEPTNO)
values('7698', 'BLAKE', 'MANAGER', '7839', '1981-05-01', '2850','30'),
	('7782', 'CLARK', 'MANAGER', '7839', '1981-06-09', '2450','10'),
    ('7788', 'SCOTT', 'ANALYST', '7566', '1982-12-09', '3000','20');
insert into emp(EMPNO,ENAME,JOB,HIREDATE,SAL,DEPTNO)
values('7839', 'KING', 'PRESIDENT', '1981-11-17', '5000', '10');    
insert into emp
values('7876', 'ADAMS', 'CLERK', '7788', '1983-01-12', '1100',NULL,'20'),
	('7900', 'JAMES', 'CLERK', '7698', '1981-12-03', '950',NULL,'30'),
    ('7902', 'FORD', 'ANALYST', '7566', '1981-12-03', '3000',NULL,'20'),
    ('7934', 'MILLER', 'CLERK', '7782', '1982-01-23', '1300',NULL,'10');
select * from emp;  
-- WHERE 절을 활용
-- 사원 테이블EMP 에서 사원번호EMPNO 7566의
-- ENAME과 DEPTNO 검색
SELECT ENAME, DEPTNO FROM emp WHERE EMPNO='7566';
-- 사원 테이블에서 DEPTNO가 20이고, SAL이 400 이상인
-- 사원 ENAME과 JOB검색
select ENAME, JOB from emp
WHERE DEPTNO =20 AND SAL>=400;
-- 사원 테이블에서 SAL이 2000대인
-- 사원 ENAME과 JOB검색
SELECT ENAME, JOB FROM emp
WHERE SAL >=2000 AND SAL <=2999;
-- 사원 테이블에서 SAL이 2000대인
-- 사원 ENAME과 JOB검색 (BETWEEN연산자)
SELECT ENAME, JOB FROM emp
WHERE SAL BETWEEN 2000 AND 2999;
-- 사원 테이블에서 JOB이 SALESMAN 이거나 MANAGER인
-- 사원의 EMPNO, ENAME을 검색
SELECT EMPNO, ENAME FROM emp
WHERE JOB ='SALESMAN' OR JOB ='MANAGER';
SELECT EMPNO, ENAME FROM emp
WHERE JOB IN('SALESMAN','MANAGER');
-- 사원테이블에서 COMM이 NULL값인
-- 사원의 EMPNO,ENAME 검색
select EMPNO, ENAME from emp
WHERE COMM IS NOT null;
-- 사원테이블에서 이름이 smith인 사원의 월급과 부서번호 검색
select SAL, DEPTNO from emp
where ENAME='SMITH';
-- 사원테이블에서 이름이 S로 시작하는 사원의 월급과 부서번호 검색
select SAL, DEPTNO from emp
where ENAME='S';
select SAL, DEPTNO from emp
where ENAME like 'S%';
-- 사원테이블에서 SAL이 높은 순부터 정렬하시오.(내림차순)
select * from emp
order by SAL asc;


# SQL 문제
-- 1. 사원 테이블에서 사원 번호와 이름과 월급을 출력하라
select EMPNO, ENAME, SAL from emp;
-- 2. 직위가 'SALESMAN'이고 월급이 1000이상인 사원의 이름과 월급을 출력하라.
select ENAME, SAL FROM emp 
WHERE JOB='SALESMAN' AND SAL >=1000;

-- 3. 직위가 MANAGER인 사원을 뽑는데 월급이 높은 사람순으로 이름, 직위, 월급을 출력하라.
SELECT ENAME, JOB, SAL FROM emp
WHERE JOB='MANAGER'
order by SAL desc;
-- 4. 이름이 SCOTT인 사원의 이름, 월급, 직업, 입사일, 부서 번호를 출력하라
select ENAME, SAL, JOB, HIREDATE, DEPTNO from EMP
where ENAME='SCOTT';

-- 5. 81년 11월 17일에 입사한 사원의 이름, 월급, 직업, 입사일을 출력하라
select ENAME, SAL, JOB, HIREDATE from EMP
where HIREDATE='1981-11-17';
-- 6. 월급이 3600 이상인 사원들의 이름과 월급을 출력하라
select ENAME, SAL from emp
WHERE SAL >= 3600;

-- 7. 월급이 1200 이하인 사원들의 이름과 월급, 직업, 부서번호를 출력하라
select ENAME, SAL, JOB, DEPTNO from emp
WHERE SAL <= 1200;
-- 8. 직업이 SALESMAN이 아닌 사원들의 이름과 부서 번호, 직업을 출력하라
select ENAME, DEPTNO, JOB from emp
WHERE JOB !='SALESMAN';

-- 9. 월급이 1000에서 3000사이가 아닌 사원들의 이름과 월급을 출력하라
select ENAME, SAL from emp
WHERE SAL NOT between 1000 AND 3000;
-- 10. 이름의 끝 글자가 T로 끝나는 사원들의 이름과 월급을 출력하라
select ENAME, SAL from emp
where ENAME like '%T';

-- 11. 커미션이 NULL인 사원들의 이름과 커미션을 출력하라
select ENAME, COMM from emp
where COMM IS null;
-- 12. 직업이 SALESMAN, ANALYST, MANAGER가 아닌 사원들의 이름, 월급, 직업을 출력하라
select ENAME, SAL, JOB from emp
where JOB NOT IN('SALESMAN', 'ANALYST', 'MANAGER');
-- 연봉을 제일 적게 받는 사원의 이름과 연봉
select ENAME, min(SAL) as 최저연봉 from emp;
-- 연봉의 평균
select avg(sal) as 평균연봉 from emp;
-- 직업별로 인원수를 파악
select job, count(*) as 직업별인원수  from emp
group by job;
-- 연봉 2000이상인 사원 중에서 부서별로 인원수 파악
select ename, sal, job as 부서별인원수 from emp
group by job
having sal >=2000;
