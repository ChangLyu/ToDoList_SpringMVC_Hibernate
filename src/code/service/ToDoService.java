package code.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.springframework.stereotype.Service;

import code.model.ToDo;
import hibernateutils.HibernateUtils;


@Service
public class ToDoService {

	Session session;
	
	public List<ToDo> getToDos(String user){
		 List<ToDo> todolist=new ArrayList<ToDo>();
		 session = HibernateUtils.getSessionFactory().openSession();
		 session.beginTransaction();
		 todolist= session.createQuery("from ToDo where user= :user").setParameter("user",user).list();
	     session.getTransaction().commit();
	     session.close(); 
	     return todolist;
	}
	
	public ToDo getToDo(int id){
		 List<ToDo> todolist=new ArrayList<ToDo>();
		 session = HibernateUtils.getSessionFactory().openSession();
		 session.beginTransaction();
		 todolist= session.createQuery("from ToDo where id= :id").setParameter("id",id).list();
	     session.getTransaction().commit();
	     session.close(); 
		 return todolist.get(0);
	}
	
	
	public void updateToDo(ToDo todo){
		 session = HibernateUtils.getSessionFactory().openSession();
		 session.beginTransaction();
		 session.update(todo);
	     session.getTransaction().commit();
	     session.close();
	}
	
	
	public void addToDo( String user, String description, Date date, boolean checked){
		 session = HibernateUtils.getSessionFactory().openSession();
		 session.beginTransaction();
		 session.save(new ToDo(user,description,date,checked));
	     session.getTransaction().commit();
	     session.close();
	}
	
	public void deleteTodo(int id){
		 session = HibernateUtils.getSessionFactory().openSession();
		 session.beginTransaction();
		 ToDo s=(ToDo)session.get(ToDo.class,id);
		 session.delete(s);
	     session.getTransaction().commit();
	     session.close();
	}

}
