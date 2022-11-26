select * from employee;

create view employee_sal_mgmt_view2 (emp_name, manager_id, salary)
	as
    select ename, mgr, sal from employee;
    
desc employee_sal_mgmt_view2;
