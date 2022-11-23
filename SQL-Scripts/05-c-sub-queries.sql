select * from employee where deptno IN (
select deptNo from DEPARTMENT where dname NOT in ('ACCOUNTING', 'PRODUCT')
);

select deptNo, dname from DEPARTMENT where dname NOT in ('ACCOUNTING', 'PRODUCT');



