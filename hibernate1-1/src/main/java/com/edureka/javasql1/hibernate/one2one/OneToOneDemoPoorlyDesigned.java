package com.edureka.javasql1.hibernate.one2one;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.edureka.javasql1.hibernate.demo.HibernateUtils;

public class OneToOneDemoPoorlyDesigned {

	public static void main(String[] args) {
		
		insertAndQueryEmployees();	
	}


	static void insertAndQueryEmployees() {

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

			// Inserting Employees

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
			
			// Select / Query process
			
			
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
}
