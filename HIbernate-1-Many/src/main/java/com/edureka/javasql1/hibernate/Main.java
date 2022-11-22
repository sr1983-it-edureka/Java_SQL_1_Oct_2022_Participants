package com.edureka.javasql1.hibernate;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.edureka.javasql1.hibernate.demo.HibernateUtils;

public class Main {

	public static void main(String[] args) {
		
		insertData();
	}
	
	static void insertData() {
		
		Question q1 = new Question("What is Java?");
		
		
		Answer a1 = new Answer("Java is a programming language");
		Answer a2 = new Answer("Java provides JRE and JDK");
		
		List<Answer> answers = new ArrayList<Answer>();
		
		answers.add(a1);		answers.add(a2);

		
		q1.setAnswers(answers);
		
		Session session = null;
		Transaction transaction = null;
		try {
			session = HibernateUtils.creaateSession();

			transaction = session.beginTransaction();
			
			session.save(q1);
			
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
