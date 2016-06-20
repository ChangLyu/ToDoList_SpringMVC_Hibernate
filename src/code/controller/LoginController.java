package code.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import code.service.LoginService;

@Controller
@SessionAttributes("name")
public class LoginController {
	@Autowired
	LoginService loginService=new LoginService();
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String showWelcomePage(ModelMap model){
		model.put("name","chang");
		return "welcome";
		
	}
	
	
	
	
/*	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String showLoginPage(){
		return "login";
		
	}

	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String handleUserLogin(ModelMap model,@RequestParam String name,@RequestParam String password){
		if(loginService.validateUser(name,password)){
			model.put("name",name);
			model.put("password",password);
			return "welcome";
		}else{
			model.put("errorMessage","Invalid password");
			return "login";
			
		}
*/
		
	}


