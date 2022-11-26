
select deptno, job, sum(sal), count(*) from employee group by deptno, job;

select deptno, job, sum(sal), count(*) from employee 
group by deptno, job
having job = 'MANAGER';

select deptno, job, sum(sal), count(*) from employee 
group by deptno, job
having job IN ('MANAGER', 'ASSOCIATE');

select deptno, job, sum(sal) as TotalSalary, count(*) as TotalEmployees from employee 
group by deptno, job
having TotalSalary > 100000;

