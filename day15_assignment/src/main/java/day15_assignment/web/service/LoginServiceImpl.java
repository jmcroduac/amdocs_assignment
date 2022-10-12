package day15_assignment.web.service;

import java.util.HashMap;

import day15_assignment.web.dao.LoginDao;
import day15_assignment.web.dao.LoginDaoImpl;

public class LoginServiceImpl implements LoginService{

	LoginDao dao = new LoginDaoImpl();
	
	@Override
	public boolean isValid(String username, String password) {
		//Call the DAO from service to get the user list and apply business logic
		HashMap<String,String> loginCreds = dao.getUser();
		
		boolean isValid = false;
		
		for(HashMap.Entry<String, String> entry : loginCreds.entrySet()) {
		    if(username.equals(entry.getKey()) && password.equals(entry.getValue())) {
				isValid = true;
		    }
		}
		
		return isValid;
	}

}
