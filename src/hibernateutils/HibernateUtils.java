package hibernateutils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
private static  SessionFactory sessionFactory=null;

	
	public static SessionFactory getSessionFactory(){
		System.out.println("loccate hibernate");
		
	sessionFactory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		System.out.println("from hibernateutils");
		return sessionFactory;
	}
}
