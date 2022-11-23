package com.edureka.javasql1.hibernate.inheritance.type3;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.edureka.javasql1.hibernate.demo.HibernateUtils;

public class InheritanceDemo {

	public static void main(String[] args) {
		
		insertData();
	}
	
	static void insertData() {
		
		
		Session session = null;
		Transaction transaction = null;
		try {
			session = HibernateUtils.creaateSession();

			transaction = session.beginTransaction();

			Person person1 = new Person("Sharma", 35);
			Person person2 = new Person("Krishna", 40);
			Person person3 = new Person("Prabhakar", 38);
			
			Student kishore = new Student("Kishore", 17, "CSE", 12345);
			Student vasanth = new Student("Vasanth", 18, "IT", 23456);
			
			Professor kaushik = new Professor("Kaushik", 40, "PART", "9AM to 4 PM");
			Professor vidhya
				= new Professor("Vidhya", 40, "PART", "9AM to 1 PM");
			
			session.save(person1);session.save(person2);session.save(person3);
			
			session.save(kishore);session.save(vasanth);
			
			session.save(kaushik); session.save(vidhya);
			
			
			System.out.println();
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
