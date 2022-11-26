select * from employee;

select * from employee group by deptno;

select deptno, count(*), sum(sal) from employee group by deptno;

select deptno, count(*), sum(sal), avg(sal) from employee group by deptno;
