package com.shivanand.hibernateOneToOne;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Eneter Street, city, state, pincode");
	String street = scan.next();
	String city = scan.next();
	String state = scan.next();
	int pincode = scan.nextInt();
	
	Address address = new Address(street, city, state, pincode);
	
	System.out.println("Enter name, email, phone number");
	String name = scan.next();
	String email = scan.next();
	int phone = scan.nextInt();
	
	Student student = new Student(name, email, phone);
	
	student.setAddr(address);
	
//	Hiberante step to connect  object and data Base.....
	
//	Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
//	SessionFactory factory = configuration.buildSessionFactory();
	
	
	SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	Session session = factory.openSession();
	
	Transaction transaction = session.beginTransaction();
	
	session.persist(student);
	transaction.commit();
	factory.close();
	session.close();
	System.out.println("Application Done...");
	
}
}
