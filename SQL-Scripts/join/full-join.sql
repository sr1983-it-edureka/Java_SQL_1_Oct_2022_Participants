select * from employee
	LEFT JOIN
DEPARTMENT
ON employee.deptno = DEPARTMENT.deptno
	UNION
select * from employee
	RIGHT JOIN
DEPARTMENT
ON employee.deptno = DEPARTMENT.deptno;
