package com.edureka.javasql1.dbms.index;

import java.util.ArrayList;
import java.util.Random;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.edureka.javasql1.hibernate.demo.HibernateUtils;

public class Main {

	public static void main(String[] args) {
		
		insertData();
	}
	
	static void insertData() {
		
		ArrayList<String> countries = new ArrayList();
		countries.add("India");
		countries.add("Pakistan");
		countries.add("Australia");
		countries.add("New Zealand");
		countries.add("West Indies");		
		
		Session session = null;
		Transaction transaction = null;
		try {
			
			
			session = HibernateUtils.creaateSession();

			Random randomObj = new Random();
			transaction = session.beginTransaction();
			
			for (int index = 1; index <= 100; index ++) {

				String firstName = "P - FN - " + index;
				String lastName = "P - LN - " + index;
				int age = 30 + index;
				
				int countryIndex = randomObj.nextInt(
						countries.size());
				String country = countries.get(countryIndex);
				
				Player player = new Player(firstName, lastName, country, age);				
				session.save(player);								
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
