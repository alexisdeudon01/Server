package testDatabaseConn;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.*;
import org.hibernate.classic.*;
import org.springframework.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {
	public static void main(String [] args) {
		//Hibernate
		//Initialize
		Configuration ctg=new Configuration();
		ctg.configure("hibernate.cfg.xml");
		System.out.println("Hello world");
		Session session=ctg.buildSessionFactory().openSession();
		Transaction txn=session.beginTransaction();
		txn.commit();
		session.close();
		//Spring
		//Initialize
		ApplicationContext context=new ClassPathXmlApplicationContext();
		
	}
}
 