package com.edureka.javasql1.hibernate.demo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtils {

	public static Session creaateSession() {
		
		StandardServiceRegistry registry = 
				new StandardServiceRegistryBuilder().configure().build();
		
		MetadataSources metadataSources = new MetadataSources(registry);
		
		Metadata metadata = metadataSources.getMetadataBuilder().build();
		
		SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();
		return sessionFactory.openSession();
	}
}
