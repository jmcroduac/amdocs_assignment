package day15_assignment.web.service;

import java.util.ArrayList;
import java.util.HashMap;

import day15_assignment.LogIn;

public interface LoginService {
	
	public boolean isValid(String username, String password);

	public String returnUserType(String username, String password);

	public ArrayList<LogIn> returnAllUser();

}
