package code.controller;


import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import code.model.ToDo;
import code.service.ToDoService;

@Controller
@SessionAttributes("name")
public class ToDoController {
	@Autowired
	private ToDoService service;
	
    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(
                dateFormat, false));
    }
    
	@RequestMapping(value="/list-todos",method=RequestMethod.GET)
	public String showToDoListPage(ModelMap model){
		model.addAttribute("todos",service.getToDos("chang"));
		return "list-todos";
	}
	
	@RequestMapping(value="/add-todo",method=RequestMethod.GET)
	public String showAddToDoListPage(ModelMap model){
		model.addAttribute("todoadd",new ToDo());
		return "todo-add";
	}
	
	@RequestMapping(value="/add-todo",method=RequestMethod.POST)
	public String addToDo(ModelMap model, @ModelAttribute("todoadd") ToDo todoadd,BindingResult result){
/*		if(result.hasErrors())
			return "todo-add";*/
		service.addToDo(model.get("name").toString(),todoadd.getDescription(),todoadd.getDate(),false);
		model.clear();//clear "name"
		return "redirect:list-todos";
	}
	
	@RequestMapping(value="/update-todo",method=RequestMethod.GET)
	public String showUpdateToDoPage(ModelMap model,@RequestParam int id){
		model.addAttribute("todo",service.getToDo(id));
		return "todo";
	}
	@RequestMapping(value="/update-todo",method=RequestMethod.POST)
	public String updateToDo(ModelMap model,@ModelAttribute("todo") ToDo todo,BindingResult result){
/*		if(result.hasErrors())
			return "todo";*/
		
		System.out.println("update method");
		todo.setUser(model.get("name").toString());
		service.updateToDo(todo);
		model.clear();//// to prevent request parameter "name" to be passed
		return "redirect:list-todos";
	}
	@RequestMapping(value="/delete-todo",method=RequestMethod.GET)
	public String deleteToDo(ModelMap model,@RequestParam int id){
		service.deleteTodo(id);
		return "redirect:list-todos";
	}
	

}
