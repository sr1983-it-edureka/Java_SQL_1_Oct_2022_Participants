select empno, ename, e.deptno, dname from employee as e
	INNER JOIN
department as d
	ON
e.deptno = d.deptno;