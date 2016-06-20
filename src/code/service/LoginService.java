package code.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
	public boolean validateUser(String name,String password){
		return name.equalsIgnoreCase("changlyu")&&password.equals("12345");
		
	}

}
