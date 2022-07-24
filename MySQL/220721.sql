use exam;
select * from member;
select * from board;
update member set name = '이수근' where id='bbb222' ;
alter table board drop writer;
-- join member테이블하고 board테이블 내부조인
select bno, pw, name,regdate, b.id from member as m , board as b
where m.id=b.id;

-- 표기법 ANSI
select bno, pw, name,regdate, b.id
from member as m join board as b
on m.id=b.id;

select * from emp;
select * from dept;
select ename, hiredate, sal, dname, LOC, dept.DEPTNO from emp, dept
where emp.DEPTNO = dept.DEPTNO;
select * from emp as e right outer join dept as d
on e.DEPTNO = d.DEPTNO;
select * from dept d left outer join emp e
on d.DEPTNO = e.DEPTNO;

select * from emp;
select count(*) as '총직원수' ,
 count(COMM) as '커미션받는직원' from emp;
select sum(sal) as '총급여' from emp;
select avg(sal) as '평균급여' from emp;
select max(sal) as '최고급여' from emp;
select min(sal) as '최저급여' from emp;
select sal, deptno
from emp
group by DEPTNO
having avg(sal) <= 2500;
-- 1. 각 부서별로 지급되는 총 월급은?
select DEPTNO, sum(SAL) as '부서별 총 월급' 
from emp
group by DEPTNO;

-- 2. 각 직업별로 월급이 제일 많은 사람과 제일 적은 사람의 차이는?
select JOB, max(SAL)-min(SAL) as '(최고-최저)월급 차이',
	max(SAL) as '최고 월급', min(SAL) as '최저 월급'
from emp
group by JOB;
-- 3. 커미션이 없는 사람 중에 각 부서별로 월급이 제일 작은 사람은?
select ENAME, comm, min(sal) as '월급 제일 적은 사람', deptno
from emp
where comm is null or comm = 0
group by deptno
;
-- having comm is null or comm = 0;
-- 서브쿼리 적용해서 이름까지 매칭
select ENAME, comm, min(sal) as '월급 제일 적은 사람', deptno
from emp
where sal in (select min(sal) from emp group by DEPTNO)
group by deptno
;
-- 4. 급여가 3000대인 회원의 사원번호, 성명, 일하는 지역 검색
select EMPNO, ENAME, LOC ,sal 
from emp join dept
on emp.deptno = dept.DEPTNO
where sal between 3000 and 3999;
-- where sal >= 3000 and sal < 4000;
-- 5. 성명에 LA가 포함된 회원의 성명, 부서명, 일하는 지역을 검색
select ENAME, dname, loc 
from emp e join dept d      -- join에 별칭 사용
on e.DEPTNO = d.DEPTNO
where ename like '%LA%';
select * from emp;
select * from dept;

-- select절 subQuery
-- 급여가 2000이상인 사원번호, 직업, 부서명을 조회(join)
select SAL, EMPNO, JOB, DNAME
from emp E join dept D
on E.DEPTNO = D.DEPTNO
where SAL >=2000;
-- 급여가 2000이상인 사원번호, 직업, 부서명을 조회(서브쿼리)
select SAL, EMPNO, JOB, 
	(select DNAME from DEPT d where e.DEPTNO = d.DEPTNO) as DNAME
from emp e
where SAL >=2000;
-- from절 서브쿼리
-- 부서별 최대 인원수를 검색
select max(count(*))
from emp
group by DEPTNO;
select count(*) as count
from emp
group by DEPTNO;

select max(count)
from (select count(*) count
	from emp
	group by DEPTNO
    ) as view
;

-- 사원 테이블의 평균급여보다 많이 받는 사원의 사원번호, 이름, 부서명을 검색
select empno, ename, dname
from emp e join dept d
on e.DEPTNO = d.DEPTNO
where SAL >= (select AVG(SAL) from emp);
select avg(sal) from emp;
select DEPTNO, AVG(sal) from emp
group by DEPTNO;
-- 각 부서별 평균급여보다 많이 받는 사원의 사원번호, 이름, 부서명, 급여
select empno, ename, dname
from emp e join dept d
on e.DEPTNO = d.DEPTNO
where SAL >= ALL (select AVG(SAL) from emp group by DEPTNO);

-- 커미션을 받는 직원
SELECT EMPNO, ENAME, DNAME
FROM emp E JOIN DEPT D
ON E.DEPTNO = D.DEPTNO
WHERE ENAME IN (SELECT ENAME FROM emp WHERE COMM > 0);

﻿-- 해당 부서별 평균급여보다 급여를 많이 받는 사원의 사원번호, 이름, 부서명, 급여
select empno, ename, dname, SAL
from emp e join dept d
on e.DEPTNO = d.DEPTNO
where SAL >= ANY (select AVG(SAL) from emp group by DEPTNO);

-- 1) 'ALLEN'의 직무와 같은 사람의 이름, 부서명, 급여, 직무를 출력하세요.
select ename, dname, sal, job
from emp e join dept d
on e.DEPTNO = d.DEPTNO
where job = (select job 
			from emp 
            where ename ='ALLEN');

-- 2) JONES가 속해있는 부서의 모든 사람의 사원번호, 이름, 입사일, 급여를 출력하세요.
select empno, ename, hiredate, sal, deptno
from emp
where deptno = (select deptno 
				from emp 
                where ename='JONES');

-- 3) 전체 사원의 평균 임금보다 많은 사원의 사원번호, 이름, 부서명, 입사일, 지역, 급여를 출력하세요.
select empno, ename, dname, hiredate, loc, sal
from emp e join dept d
on e.DEPTNO = d.DEPTNO
where sal > (select avg(sal) 
			from emp);

-- 4) 10번 부서와 같은 일을 하는 사원의 사원번호, 이름, 부서명, 지역, 급여를 급여가 많은 순으로 출력하세요.
select empno, ename, dname, loc, sal, JOB
from emp e join dept d
on e.DEPTNO = d.DEPTNO
WHERE JOB IN (SELECT JOB FROM EMP WHERE DEPTNO = 10)
-- WHERE JOB = ANY (SELECT JOB FROM EMP WHERE DEPTNO = 10)
order by sal desc;

-- 5) 'MARTIN'이나 'SCOTT'의 급여와 같은 사원의 사원번호, 이름, 급여를 출력하세요.
select empno, ename, sal
from emp
where sal in ( select sal from emp 
				where ename = 'MARTIN' or ename= 'SCOTT');
				-- WHERE ENAME IN ('MARTIN', 'SCOTT')

-- 6) 부서번호가 30번 부서의 최고 급여보다 높은 사원의 사원번호, 이름, 급여를 출력하세요.
select max(sal) from emp where DEPTNO=30; -- 30번 부서의 최고 급여
select empno, ename, sal
from emp
where sal > (select max(sal) 
			from emp 
			where DEPTNO=30);

-- 7) 사원중에서 급여와 comm을 합친 금액이 가장 많은 경우와 가장 적은 경우, 평균 금액을 구하세요.
-- hint) IFNULL
SELECT MAX(SAL+IFNULL(COMM,0)) MAX,
		MIN(SAL+IFNULL(COMM,0)) MIN,
        AVG(SAL+IFNULL(COMM,0)) AVG
FROM EMP;

-- 8) 부서별로 급여합계를 구하세요.
select DEPTNO, sum(sal)
from emp
group by DEPTNO;

-- 9) 급여가 3000이상이면 급여+급여의 15%의 격려금을, 급여가 2000이상이면 급여+급여의 10%의 격려금을
-- 급여가 1000이상이면 급여+급여의 5%의 격려금을, 
-- 그렇지 않으면 급여를 구하여, 이름, 직업, 급여,격려금(bonus)을 표시하시오.
-- HINT : DECODE사용(구글로 검색해보세요.)
select ename, job, sal, CASE WHEN sal >= 3000 THEN sal*1.15
							WHEN sal >= 2000 THEN sal*1.1
                            WHEN sal >= 1000 THEN sal*1.05
                            ELSE sal
						END as bonus
from emp;
    
-- 10) 'MARTIN'과 MGR이 같은 사원의 이름, 직업, 급여, 부서명, 지역을 구하세요.
select ename, job, sal, dname, loc
from emp e join dept d
on e.DEPTNO = d.DEPTNO
where MGR = (select MGR from emp 
			where ename='MARTIN');

-- 11) 부서명이 'RESEARCH'인 사람의 이름, 직업, 급여,부서명을 표시하시오.
select ename, job, sal, dname
from emp e join dept d
on e.DEPTNO = d.DEPTNO
where dname = 'RESEARCH'; 

-- 12) 각 부서별 평균 급여를 구하고, 
-- 그 중에서 평균 급여가 가장 적은 부서의 평균 급여보다 적게 받는 사원들의 부서명, 지역, 급여를 구하세요.
select deptno, avg(sal) from emp group by deptno; -- 각 부서별 평균 급여 (sales=1575)
select dname, loc, sal
from emp e join dept d
on e.DEPTNO = d.DEPTNO
where sal < all (select avg(sal) avgsal from emp 
				group by deptno);

select dname, loc, sal
from emp e join dept d
on e.DEPTNO = d.DEPTNO
where sal < (select min(avgsal)
			from (
				select avg(sal) avgsal from emp 
				group by deptno
				) as minsal );
                
-- 13) 'BLAKE'와 같은 부서에 있는 사원들의 이름과 고용일을 뽑는데 'BLAKE'는 빼고 출력하라.
select deptno from emp where ename='BLAKE'; -- BLAKE는 30번 부서이다.
select ename, hiredate
from emp
where deptno = (select deptno from emp where ename='BLAKE')
AND ENAME != 'BLAKE';

-- 14) 이름에 'T'를 포함하고 있는 사원들과 같은 부서에서 근무하고있는 사원의 사원번호와 이름을 출력하라.
select deptno from emp where ename like '%T%'; -- 이름에 T가 들어가는 사원은 20,30번 부서이다.
select empno, ename
from emp
where deptno IN (select deptno from emp where ename like '%T%');

-- 15) 자신의 급여가 평균 급여보다 많고, 이름에 'S'가 들어가는 사원과 동일한 부서에서 근무하는 
-- 모든 사원의 사원번호, 이름, 급여를 출력하라.
select empno, ename, sal
from emp
where deptno IN (select DEPTNO 
				from emp
				where sal > (select avg(sal) from emp )
				AND ename like '%S%');
                
-- 16) 커미션을 받는 사원과 부서번호, 월급이 같은 사원의 이름, 월급, 부서번호를 출력하라.
select ename, sal, deptno 
from emp
where deptno IN (select DEPTNO FROM EMP -- 커미션 받는 사원 부서번호
				WHERE COMM IS NOT NULL
				AND COMM > 0)
AND SAL IN (select SAL FROM EMP -- 커미션 받는 사원 급여
			WHERE COMM IS NOT NULL
			AND COMM > 0);
            
-- 17) 직업명과 사원의 등급을 직업이 'PRESIDENT' 이면 'A', 직업이 'ANALYST' 이면 'B', 
-- 직업이 'MANAGER' 이면 'C', 직업이 'SALESMAN' 이면 'D', 
-- 직업이 'CLERK' 이면 'E' 로 표시하시오.
SELECT JOB, CASE WHEN JOB='PRESIDENT' THEN 'A'
				WHEN JOB='ANALYST' THEN 'B'
                WHEN JOB='MANAGER' THEN 'C'
                WHEN JOB='SALESMAN' THEN 'D'
                WHEN JOB='CLERK' THEN 'E'
			END AS '사원의등급'
FROM EMP
order by JOB
;

-- 18) 10번 부서중에서 30번 부서에는 없는 업무를 하는 사원의 사원번호, 이름, 부서명,입사일, 지역을 출력하라.
SELECT JOB FROM EMP WHERE DEPTNO = 30; -- SALESMAN, MANAGER, CLERK 3직업 나옴
SELECT EMPNO, ENAME, DNAME, HIREDATE, loc ,JOB
FROM EMP E JOIN DEPT D
ON E.DEPTNO = D.DEPTNO
WHERE E.DEPTNO = 10
AND JOB NOT IN (SELECT JOB FROM EMP
				WHERE DEPTNO = 30);
                
-- 19) 급여가 30번 부서의 최고 급여보다 높은 사원의 사원번호, 이름, 급여를 출력하라.
SELECT MAX(SAL) FROM EMP WHERE DEPTNO = 30;
SELECT EMPNO, ENAME, SAL
FROM EMP
WHERE SAL > (SELECT MAX(SAL) FROM EMP WHERE DEPTNO = 30);

-- 20) 급여가 30번 부서의 최저 급여보다 낮은 사원의 사원번호, 이름, 급여를 출력하라.
SELECT MIN(SAL) FROM EMP WHERE DEPTNO =30; -- 30번 부서의 최저급여 950
SELECT EMPNO, ENAME, SAL
FROM EMP
WHERE SAL < (SELECT MIN(SAL) FROM EMP 
			WHERE DEPTNO =30);

-- 21) 사원 중에서 입사일이 가장 빠른 사원의 사원번호, 이름, 입사일, 부서명을 출력하세요.
SELECT EMPNO, ENAME, HIREDATE, DNAME
FROM EMP E JOIN DEPT D
ON E.DEPTNO = D.DEPTNO
WHERE HIREDATE = (SELECT MIN(HIREDATE) FROM EMP);

-- 22) 평균 연봉보다 많이 받는 사원들의 사원번호, 이름, 연봉을 연봉이 높은 순으로 정렬하여 출력하세요.
-- (연봉은 sal*12+comm으로 계산)
-- HINT : IFNULL사용(구글로 검색해보세요.)
SELECT AVG(SAL*12+IFNULL(COMM,0)) as moneyavg from EMP;
SELECT EMPNO, ENAME, SAL*12+IFNULL(COMM,0) AS MONEY
from EMP
-- 		내 연봉						평균 연봉
WHERE SAL*12+IFNULL(COMM,0)> (SELECT AVG(SAL*12+IFNULL(COMM,0)) 
							from EMP)
ORDER by MONEY desc;

-- 23) EMP와 DEPT TABLE을 JOIN하여 부서 번호, 부서명, 이름, 급여를 출력하라.
SELECT e.DEPTNO, DNAME, ENAME, SAL
FROM EMP E JOIN DEPT D
ON E.DEPTNO = D.DEPTNO;

-- 24) 이름이 'ALLEN'인 사원의 부서명을 출력하라.
SELECT DNAME, ename
FROM EMP E JOIN DEPT D
ON E.DEPTNO = D.DEPTNO
WHERE ENAME = 'ALLEN';

-- 25) DEPT Table 에는 존재하는 부서코드이지만 
-- 해당부서에 근무하는 사람이 존재하지 않는 경우의 결과를 출력하라.
select *
from EMP E right outer join DEPT D
ON E.DEPTNO = D.DEPTNO;

SELECT *
from EMP E right outer join DEPT D
ON E.DEPTNO = D.DEPTNO
WHERE empno is null;