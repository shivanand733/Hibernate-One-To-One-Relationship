package com.shivanand.hibernateOneToOne;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	
//	Hiberante step to connect  object and data Base.....
	
	SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	Session session = factory.openSession();
	
	Transaction transaction = session.beginTransaction();
	
//	session.persist(student);
	System.out.println("Enter to featch details ");
	Student s=session.get(Student.class, scan.nextInt());
	System.out.println(s);
	transaction.commit();
	factory.close();
	session.close();
	System.out.println("Application Done...");
	
}
}
