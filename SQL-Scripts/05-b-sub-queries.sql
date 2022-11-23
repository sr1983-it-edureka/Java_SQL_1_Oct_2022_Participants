select * from employee where deptno IN (10, 20);

select deptNo from DEPARTMENT where deptno in (10, 20);
select deptNo from DEPARTMENT where dname in ('ACCOUNTING', 'PRODUCT');

select * from employee where deptno IN (
select deptNo from DEPARTMENT where dname in ('ACCOUNTING', 'PRODUCT')


);
