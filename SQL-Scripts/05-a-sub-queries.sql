select * from employee where deptno= (
select deptno from department where dname = 'SERVICES'
)


