select * from employee;
select * from department;


select count(*) from employee;
select count(*) from department;

select count(*) from employee
	INNER JOIN
department;

select * from employee
	INNER JOIN
department;


select * from employee
	INNER JOIN
department
	ON
employee.deptno = department.deptno;




    
