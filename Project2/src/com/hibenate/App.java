package com.hibenate;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.project2.User;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(User.class)
                .buildSessionFactory();

Session session = factory.getCurrentSession();

try {
// Create object of entity class type
com.hibernate.project2.User user = new User( 3, "Mahima","Shah","sshah@tns.org");
// Start transaction
session.beginTransaction();
// Perform operation
session.save(user);


// Commit the transaction 
session.getTransaction().commit();
System.out.println("Row Added");


} finally {
session.close();
factory.close();
}

}
}
