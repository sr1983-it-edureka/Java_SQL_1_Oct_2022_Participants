
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class EmployeeDataUtils {

	public static void main(String[] args) {
		
//		createEmployees();
//		selectEmployees();
//		updateEmployee();
		deleteEmployee();
	}
	
	static void createEmployees() {
		
		Session session = null;		
		Transaction transaction = null;
		try {

			session = HibernateUtils.creaateSession();
			transaction =  session.beginTransaction();
			
			for (int index = 1; index <=10; index ++) {
				
				String firstName = "FN -" + index;
				String lastName = "LN -" + index;
				int age = 30 + index;
				
				Employee employeeObj = new Employee(firstName, lastName, age);
				session.save(employeeObj);

			}
			
			
			transaction.commit();

		}catch (Exception e) {
			
			e.printStackTrace();
			
			if (transaction != null) {
				transaction.rollback();
			}
		} finally {
			
			if (session != null) {
				session.close();
			}
			
		}
		
	}
	
	static void selectEmployees() {
		
		
		Session session = null;		
		Transaction transaction = null;
		try {

			session = HibernateUtils.creaateSession();
			transaction =  session.beginTransaction();
			
			// HQL
			// Hibernate Query L
			
			String hqlSelect = "from jEmployee";
			List<Employee> employees 
				= session.createQuery(hqlSelect, Employee.class).list();
			
			System.out.println(employees);
			
			transaction.commit();

		}catch (Exception e) {
			
			e.printStackTrace();
			
			if (transaction != null) {
				transaction.rollback();
			}
		} finally {
			
			if (session != null) {
				session.close();
			}
			
		}		
				
	}
	
	static void updateEmployee() {
		
		
		Session session = null;		
		Transaction transaction = null;
		try {

			session = HibernateUtils.creaateSession();
			transaction =  session.beginTransaction();
			
			Long id = 10L;
			Employee empObj = session.get(Employee.class, id);
			
			empObj.setAge(100);
			empObj.setFirstName("Shankar");
			empObj.setLastName("Prasad");
			
			session.saveOrUpdate(empObj);
			
			transaction.commit();

		}catch (Exception e) {
			
			e.printStackTrace();
			
			if (transaction != null) {
				transaction.rollback();
			}
		} finally {
			
			if (session != null) {
				session.close();
			}
			
		}		
	}	
	
	
	
	static void deleteEmployee() {
		
		
		Session session = null;		
		Transaction transaction = null;
		try {

			session = HibernateUtils.creaateSession();
			transaction =  session.beginTransaction();
			
			Long id = 14L;
			Employee empObj = session.get(Employee.class, id);
			
			session.delete(empObj);
			
			transaction.commit();

		}catch (Exception e) {
			
			e.printStackTrace();
			
			if (transaction != null) {
				transaction.rollback();
			}
		} finally {
			
			if (session != null) {
				session.close();
			}
			
		}		
	}		
}
