
select * from employee;

create table google_employees as
	select empno, ename, job, mgr, sal, deptno 
    from employee;

desc google_employees;

select * from google_employees;

select * from department;

