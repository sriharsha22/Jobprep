package com.harsha.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.harsha.hibernate.entity.Student;

public class CreateStudent {

	public static void main(String[] args) {
		//create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		//create session
		
		Session session = factory.getCurrentSession();
		
		try{
			//create object
			Student student1 = new Student("harsha", "Ande", "harsha@gmail.com");
			
			//start transaction
			session.beginTransaction();
			
			//save the student object
			session.save(student1);
			
			//commit transaction
			session.getTransaction().commit();
			
			
			
			
		}finally{
			factory.close();
		}
	}

}
