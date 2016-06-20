package code.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import code.model.ToDo;

@Service
public class ToDoService {
	private static List<ToDo> todos=new ArrayList<ToDo>();
	private static int count=3;
	
	static{
		todos.add(new ToDo(1,"chang","Eating lunch with friends", new Date(),false));
		todos.add(new ToDo(2,"chang","watch movie with Annie", new Date(),false));
		todos.add(new ToDo(3,"chang","Doing homework with teammake", new Date(),false));
	}
	
	public List<ToDo> getToDos(String user){
		List<ToDo> filterTodos=new ArrayList<ToDo>();
		for(ToDo todo:todos){
			if(todo.getUser().equals(user)){
				filterTodos.add(todo);
			}
		}
		return filterTodos;
	}
	
	public ToDo getToDo(int id){

		for(ToDo todo:todos){
			if(todo.getId()==id){
				return todo;
			}
		}
		return null;
	}
	public void updateToDo(ToDo todo){
		todos.remove(todo);
		todos.add(todo);
	}
	
	
	public void addToDos( String user, String description, Date date, boolean checked){
		todos.add(new ToDo(++count,user,description,date,checked));
	}
	
	public void deleteTodo(int id){
		Iterator<ToDo> iterator=todos.iterator();
		while(iterator.hasNext()){
			ToDo toDo=iterator.next();
			if(toDo.getId()==id){
				iterator.remove();
			}
		}	
	}

}
