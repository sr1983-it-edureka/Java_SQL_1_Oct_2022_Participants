select * from employee;

select * from employee group by deptno, job;

select deptno, job, sum(sal), count(*) from employee group by deptno, job;


