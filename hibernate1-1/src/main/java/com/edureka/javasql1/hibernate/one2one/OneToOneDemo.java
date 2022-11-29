package com.edureka.javasql1.hibernate.one2one;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.edureka.javasql1.hibernate.demo.HibernateUtils;

public class OneToOneDemo {

	public static void main(String[] args) {
		
		insertEmployees();	
//		queryEmployees();
//		updateEmployee();
//		deleteEmployee();
	}


	static void insertEmployees() {

		Address address1_Bangalore = new  Address("Some Aprtment in Indranagar", 
				"Bangalore", "Karnataka", 580080);
		Address address2_Chennai = new  Address("Aprtment in Ashok Nagar", 
				"Chennai", "Tamil Nadu", 600080);
		Address address3_Mumbai = new  Address("Thane", 
				"Mumbai", "Maharastra", 12345);
		Address address4_Delhi = new  Address("New Street", 
				"Delhi", "Delhi", 12345);
		
		ArrayList<Address> allAddressObjects = new ArrayList<Address>();
		allAddressObjects.add(address1_Bangalore);
		allAddressObjects.add(address2_Chennai);
		allAddressObjects.add(address3_Mumbai);
		allAddressObjects.add(address4_Delhi);
		

		Session session = null;
		Transaction transaction = null;
		try {
			session = HibernateUtils.creaateSession();

			Random randomObj = new Random();
			transaction = session.beginTransaction();
			
			for (int index = 1; index <= 25; index ++) {

				String firstName = "E - FN - " + index;
				String lastName = "E - LN - " + index;
				int age = 30 + index;
				Employee ashok = new Employee(firstName, lastName, age);
				
				int randomAddressIndex 
					= randomObj.nextInt(allAddressObjects.size());
				
				Address address = allAddressObjects.get(randomAddressIndex);
				ashok.setAddress(address);				
				session.save(ashok);				
			}
			
			transaction.commit();
		}catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}finally {
			
			if (session != null) {
				session.close();
			}
		}
	}
	
	static void queryEmployees() {

		Session session = null;
		Transaction transaction = null;
		try {
			session = HibernateUtils.creaateSession();

			transaction = session.beginTransaction();
			
			String selectQuery = "from jEmployee";
			List<Employee> employees = session.createQuery(
				selectQuery, Employee.class).list();
			

			for (int index = 0; index < employees.size(); index ++) {

				Employee employeeObj = employees.get(index);
				Address addressObj = employeeObj.getAddress();
				
				System.out.println(employeeObj);
				System.out.println(addressObj);
				System.out.println();
			}
			
			transaction.commit();
		}catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}finally {
			
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

			transaction = session.beginTransaction();

			Long id = 22L;
			Employee employeeObj = session.get(Employee.class, id);
			

			employeeObj.setFirstName("Rajesh");
			employeeObj.setAge(45);
			
			Address addressObj = employeeObj.getAddress();
			addressObj.setAddressInformation("Bandra");
			addressObj.setPincode(4000055);
			
			transaction.commit();
		}catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}finally {
			
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

			transaction = session.beginTransaction();

			Long id = 15L;
			Employee employeeObj = session.get(Employee.class, id);

			session.delete(employeeObj);			
			
			transaction.commit();
		}catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}finally {
			
			if (session != null) {
				session.close();
			}
		}
	}		
}
