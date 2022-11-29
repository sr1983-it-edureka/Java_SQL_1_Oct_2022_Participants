select *  from employee
	INNER JOIN
department
	ON
employee.deptno = department.deptno;

select employee.*  from employee
	INNER JOIN
department
	ON
employee.deptno = department.deptno;

select empno, ename from employee
	INNER JOIN
department
	ON
employee.deptno = department.deptno;

select empno, ename, dname from employee
	INNER JOIN
department
	ON
employee.deptno = department.deptno;

select empno, ename, employee.deptno, dname from employee
	INNER JOIN
department
	ON
employee.deptno = department.deptno;