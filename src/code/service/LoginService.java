package code.service;



import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Service;

import hibernateutils.HibernateUtils;

@Service
public class LoginService {
	Session session;
	public boolean validateUser(String name,String password){
		session = HibernateUtils.getSessionFactory().openSession();
		 session = HibernateUtils.getSessionFactory().openSession();
		 session.beginTransaction();
		Query query= session.createQuery("select password from FirstUser where name= ? ");
	     query.setParameter(0,name);
	     if(query.list().isEmpty()){
	    	 return false;
	     }
	     if((query.list().get(0)).equals(password)){
	    	 return true;
	     }else{
	    	 return false;
	     }
		
	}

}
