package day15_assignment.web.service;

import java.util.HashMap;

import day15_assignment.web.dao.LoginDao;
import day15_assignment.web.dao.LoginDaoImpl;

public class LoginServiceImpl implements LoginService{

	LoginDao dao = new LoginDaoImpl();
	HashMap<String,String[]> loginCreds = dao.getUser();
	
	@Override
	public boolean isValid(String username, String password) {
		//Call the DAO from service to get the user list and apply business logic
		
		boolean isValid = false;
		
		for(HashMap.Entry<String, String[]> entry : loginCreds.entrySet()) {
		    if(username.equals(entry.getValue()[0]) && password.equals(entry.getValue()[1])) {
				isValid = true;
		    }
		}
		
		return isValid;
	}
	
	public String returnUserType(String username, String password) {
		String userType = "";
		for(HashMap.Entry<String, String[]> entry : loginCreds.entrySet()) {
			if(username.equals(entry.getValue()[0]) && password.equals(entry.getValue()[1])) {
				userType = entry.getKey();
		    }
		}
		
		return userType;
	}
	
	public HashMap<String,String> returnAllUser(){
		HashMap<String,String> userList = new HashMap<>();
		for(HashMap.Entry<String, String[]> entry : loginCreds.entrySet()) {
			if(entry.getKey().equalsIgnoreCase("user")) {
				userList.put(entry.getValue()[0], entry.getValue()[1]);
		    }
		}
		return userList;

	}

}
