package com.pk.main;

import org.hibernate.Session;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.pk.domain.Message;

public class Main {
	
	public static void main(String[] args) {
		
		Configuration configuration = new Configuration();
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
		configuration.addAnnotatedClass(Message.class);
		Session session = configuration.buildSessionFactory(serviceRegistry).openSession();
		
		Message message = new Message();
		message.setText("First message");
		
		session.beginTransaction();
		session.persist(message);
		session.getTransaction().commit();
		session.close();
	}

}