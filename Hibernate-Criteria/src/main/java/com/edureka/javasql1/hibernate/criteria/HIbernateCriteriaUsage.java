package com.edureka.javasql1.hibernate.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Restrictions;

import com.edureka.javasql1.hibernate.demo.HibernateUtils;

public class HIbernateCriteriaUsage {

	public static void main(String[] args) {
		
		Session session = null;
		try {

			session = HibernateUtils.creaateSession();
			
//			demo1();
//			demo2(session);
//			demo3(session);
//			demo4(session);
//			demo5(session);
			demo6(session);
			
		}catch (Exception e) {
			
			if (session != null) {
				session.close();
			}
		}
		
		
	}
	
	static void demo1() {
		
		String selectQuery = "from employee where salary >= 80000";
		
		
		/**
		 * select * from employee where deptno = 10
		 * && (sal > 10000 || mgr_id == 101) 
		 * order by empname 
		 */
		
	}
	
	static void demo2(Session session){
		
		Criteria cr 
			= session.createCriteria(Employee.class);
		
		List<Employee> employees = cr.list();
		
		for (Employee employee : employees) {
			System.out.println(employee);
		}
	}

	static void demo3(Session session){
		
		Criteria cr 
			= session.createCriteria(Employee.class);
		
		cr.add(Restrictions.eq("deptNo", 10));
		
		List<Employee> employees = cr.list();
		
		for (Employee employee : employees) {
			System.out.println(employee);
		}
	}

	static void demo4(Session session){
		
		Criteria cr 
			= session.createCriteria(Employee.class);
		
		cr.add(Restrictions.like("name", "R%"));
		
		List<Employee> employees = cr.list();
		
		for (Employee employee : employees) {
			System.out.println(employee);
		}
	}

	static void demo5(Session session){
		
		Criteria cr 
			= session.createCriteria(Employee.class);
		
		cr.add(Restrictions.between("salary", 70000, 100000));
		
		List<Employee> employees = cr.list();
		
		for (Employee employee : employees) {
			System.out.println(employee);
		}
	}

	
	static void demo6(Session session){
		
		// where (job == ? AND salary === ?)
		Criteria cr 
			= session.createCriteria(Employee.class);
		
		Criterion jobCriterion = Restrictions.eq("job", "CLERK");
		Criterion salaryCriterion = 
				Restrictions.eqOrIsNull("salary", 80000);
		
		LogicalExpression andLE = 
				Restrictions.and(jobCriterion, salaryCriterion);
		
		cr.add(andLE);
		
		List<Employee> employees = cr.list();
		
		for (Employee employee : employees) {
			System.out.println(employee);
		}
	}
	
}
