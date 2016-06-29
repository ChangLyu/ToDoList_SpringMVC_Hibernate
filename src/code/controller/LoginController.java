package code.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import code.model.FirstUser;
import code.model.ToDo;
import code.service.LoginService;


@Controller
@SessionAttributes("name")
public class LoginController {
	@Autowired
	LoginService loginService=new LoginService();
	
/*	@RequestMapping(value="/", method=RequestMethod.GET)
	public String showWelcomePage(ModelMap model){
		model.put("name","chang");
		return "welcome";
		
	}*/

	@RequestMapping(value="/login", method=RequestMethod.GET)
	public ModelAndView showLoginPage(){
		 return new ModelAndView("login", "firstuser", new FirstUser());	
	}

	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String handleUserLogin(ModelMap model,@ModelAttribute("firstuser") FirstUser firstuser,BindingResult result){
		if(loginService.validateUser(firstuser.getName(),firstuser.getPassword())){
			model.put("name",firstuser.getName());
			return "welcome";
		}else{
			model.put("errorMessage","Invalid User or Password ");
			return "login";
			
		}
	}
	

	
}

