package com.edureka.javasql1.hibernate;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.edureka.javasql1.hibernate.demo.HibernateUtils;

public class Main {

	public static void main(String[] args) {
		
//		insertData();
//		selectData();		
//		updateData();
		
//		deleteAnswer();
//		deleteQuestion();
	}
	
	static void insertData() {
		
		
		Session session = null;
		Transaction transaction = null;
		try {
			session = HibernateUtils.creaateSession();

			transaction = session.beginTransaction();
			
			ArrayList<Question> questions = createQAndA();
			
			for (Question question : questions) {
				session.save(question);				
			}			
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
	
		
	static void selectData() {
		
		
		Session session = null;
		Transaction transaction = null;
		try {
			session = HibernateUtils.creaateSession();

			transaction = session.beginTransaction();
						
			List<Question> questions 
				= session.createQuery("from jQuestion", Question.class).list();
						
			for (Question question : questions) {
				System.out.println(question);				
				List<Answer> answers = question.getAnswers();
					
				System.out.println(answers);
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
	
	
	static void updateData() {
		
		
		Session session = null;
		Transaction transaction = null;
		try {
			session = HibernateUtils.creaateSession();

			transaction = session.beginTransaction();
			
			Long id = 3L;
			
			Question question = session.get(Question.class, id);
			
			question.setQuestionText("What is Spring and how it is related to Spring Boot");
			
			List<Answer> answers = question.getAnswers();
			answers.add(new Answer(
				"Spring integrates very nicely with all the popular frameworks (such as Hibernate) as well"));

			session.saveOrUpdate(question);
			
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
	
	
	static void deleteAnswer() {
		
		
		Session session = null;
		Transaction transaction = null;
		try {
			session = HibernateUtils.creaateSession();

			transaction = session.beginTransaction();
			
			Long id = 2L;
			
			Question question = session.get(Question.class, id);
						
			List<Answer> answers = question.getAnswers();
			int lastAnswerindex = answers.size() - 1;
			
			answers.remove(lastAnswerindex);
			
//			Answer lastAnswerObj = answers.get(lastAnswerindex);
//			session.delete(lastAnswerObj);
			
			session.saveOrUpdate(question);			
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
		
	
	static void deleteQuestion() {
		
		
		Session session = null;
		Transaction transaction = null;
		try {
			session = HibernateUtils.creaateSession();

			transaction = session.beginTransaction();
			
			Long id = 3L;
			
			Question question = session.get(Question.class, id);						
			session.delete(question);			
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
			
	static ArrayList<Question> createQAndA() {
		
		ArrayList<Question> questions = new ArrayList();
	
		// Q1
		{
		
			Question q1 = new Question("What is Java?");
			
			
			Answer a1 = new Answer("Java is a programming language");
			Answer a2 = new Answer("Java provides JRE and JDK");
			Answer a3 = new Answer("Java follows object oriented programming methods.");
			
			List<Answer> answers = new ArrayList<Answer>();
			
			answers.add(a1);		answers.add(a2);
			answers.add(a3);
	
			
			q1.setAnswers(answers);
			
			questions.add(q1);
		}
		
		
		// Q2
		{
		
			Question q1 = new Question("What is SQL?");
			
			
			Answer a1 = new Answer("SQL stands for Structured Query Language");
			Answer a2 = new Answer("SQL can be used to retrieve data from database");
			
			List<Answer> answers = new ArrayList<Answer>();
			
			answers.add(a1);		answers.add(a2);
	
			
			q1.setAnswers(answers);
			
			questions.add(q1);
		}
		
		
		// Q3
		{
		
			Question q1 = new Question("What is Spring?");
			
			
			Answer a1 = new Answer("Spring is a framework");
			Answer a2 = new Answer("Spring can be used to easily manage dependencies amongst objects");
			Answer a3 = new Answer("Spring has been there for the last 12+ years");
			Answer a4 = new Answer("Spring Boot technology includes Spring technology as well");
									
			List<Answer> answers = new ArrayList<Answer>();
			
			answers.add(a1);		answers.add(a2);
			answers.add(a3);		answers.add(a4);
	
			
			q1.setAnswers(answers);
			
			questions.add(q1);
		}		
		
		return questions;
	}
}
