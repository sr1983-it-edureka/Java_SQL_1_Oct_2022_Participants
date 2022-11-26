create table employees_accounting as
	select empno, ename, job, mgr, sal, deptno 
    from employee where deptno = 10; 
    
desc employees_accounting;

select * from employees_accounting;

