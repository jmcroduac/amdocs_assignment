package day15_assignment.web.service;

import java.util.ArrayList;
import java.util.HashMap;

import day15_assignment.LogIn;
import day15_assignment.web.dao.LoginDao;
import day15_assignment.web.dao.LoginDaoImpl;

public class LoginServiceImpl implements LoginService{

	LoginDao dao = new LoginDaoImpl();
	ArrayList<LogIn> loginCreds; 
	
	@Override
	public boolean isValid(String username, String password) {
		//Call the DAO from service to get the user list and apply business logic
		loginCreds = dao.getUser();
		
		boolean isValid = false;
		
		for(LogIn l : loginCreds) {
			if(username.equals(l.getUserName()) && password.equals(l.getPassword())) {
				isValid = true;
			}
		}
		
		return isValid;
	}
	
	public String returnUserType(String username, String password) {
		loginCreds = dao.getUser();
		String userType = "";
		
		for(LogIn l : loginCreds) {
			if(username.equals(l.getUserName()) && password.equals(l.getPassword())) {
				userType = l.getUserType();
			}
		}		
	
		return userType;
	}
	
	public ArrayList<LogIn> returnAllUser(){
		loginCreds = dao.getUser();
		ArrayList<LogIn> userList = new ArrayList<>();
		
		for(LogIn l : loginCreds) {
			if(l.getUserType().equals("user")) {
				userList.add(l);
			}
		}
		
		return userList;
	}

}
