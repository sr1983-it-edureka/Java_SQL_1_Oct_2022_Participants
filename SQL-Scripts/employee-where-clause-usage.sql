select * from employee;

select count(*) from employee;

select * from employee where job = 'SALESPERSON';

select * from employee where sal > 90000;

select * from employee where job <> 'MANAGER';
select * from employee where job != 'MANAGER';

select * from employee where sal > 80000 && job <> 'MANAGER';
select * from employee where sal > 100000 || job <> 'MANAGER';

select * from employee where sal > 80000 && (
JOB = 'MANAGER' AND DEPTNO = 10
)




