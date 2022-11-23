
select * from employee where deptno IN (
select deptNo from DEPARTMENT where deptno > 10
);

select deptNo from DEPARTMENT where deptno > 10
