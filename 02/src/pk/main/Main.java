package pk.main;

import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import pk.domain.Message;

public class Main {
	
	public static void main(String[] args) {
		
		Message message = new Message();
		message.setText("First test message");
		
		Configuration configuration = new Configuration().configure("hibernate.xml");
		Properties properties = configuration.getProperties();
		Session session = configuration.buildSessionFactory(new StandardServiceRegistryBuilder()
				.applySettings(properties)
				.build())
				.openSession();
		
		session.beginTransaction();
		session.persist(message);
		session.getTransaction().commit();
		session.close();
	}

}