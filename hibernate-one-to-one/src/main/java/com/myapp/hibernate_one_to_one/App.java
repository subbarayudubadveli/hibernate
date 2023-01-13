package com.myapp.hibernate_one_to_one;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.myapp.entity.Passport;
import com.myapp.entity.Student;

public class App 
{
    public static void main( String[] args )
    {

    	

    	Configuration configuration = new Configuration();
    	configuration.configure("hibernate.cfg.xml");
    	configuration.addAnnotatedClass(Student.class);
    	configuration.addAnnotatedClass(Passport.class);
    	
    	SessionFactory sessionFactory = configuration.buildSessionFactory();
    	Session session = sessionFactory.openSession();
    	
    	Transaction transaction = session.getTransaction();
    	
    	Passport passport = new Passport();
    	passport.setPassportNumber("1285452RT45");
    	
    	Student student =new Student();
    	student.setStudentName("kalpana");
    	student.setStudentCountry("India");
    	student.setPassport(passport);
    	
    	transaction.begin();
//    	
//    	session.save(student);
    	
//    	Student student1 = session.get(Student.class, 1);
//    	System.out.println(student1);
//    	
//    	session.delete(student1);
    	
//    	 Passport passport = session.get(Passport.class, 2);
//    	 //passport.getStudent().setPassport(null);
//    	 session.delete(passport);
    	 
    	System.out.println("second commit");
    	System.out.println("third commit");
    	 transaction.commit();
    	
    	
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    }
}
