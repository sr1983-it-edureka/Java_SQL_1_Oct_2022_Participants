select * from employee;

create view employee_sal_mgmt_view
	as
    select ename, mgr, sal from employee;
    
desc employee_sal_mgmt_view;
select * from employee_sal_mgmt_view;

create view employee_org_restructuring_view
	as
    select job, deptno from employee;
desc employee_org_restructuring_view;

select * from employee_org_restructuring_view;


