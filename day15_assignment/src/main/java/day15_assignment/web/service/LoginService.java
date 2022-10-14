package day15_assignment.web.service;

import java.util.HashMap;

public interface LoginService {
	
	public boolean isValid(String username, String password);

	public String returnUserType(String username, String password);

	public HashMap<String, String> returnAllUser();

}
