package com.pk.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.pk.domain.Message;

public class Main {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hiberConfig01");
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		
		Message message = new Message();
		message.setText("First persist message");
		
		txn.begin();
		em.persist(message);
		txn.commit();
		
		em.close();
		
	}

}
