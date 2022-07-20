package com.Inheritance;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		
		System.out.println("**********Start***********");
		
		Employee e1 = new Employee();
		e1.setName("Kiran");
		
		PermanantEmployee e2 = new PermanantEmployee();
		e2.setName("Mahesh");
		e2.setSalary(50000);
		
		ContractorEmployee e3 = new ContractorEmployee();
		e3.setName("Rohit");
		e3.setDuration(6);
		e3.setPayPerHour(400);
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		session.persist(e3);
		session.persist(e2);
		session.persist(e1);
		
		tx.commit();
		session.close();
		factory.close();
		System.out.println("**********End***********");
	}
}
