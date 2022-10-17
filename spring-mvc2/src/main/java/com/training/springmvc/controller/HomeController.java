package com.training.springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HomeController {
	String username = "jorena";
	String password = "maika";
	
	@RequestMapping(value="login",method=RequestMethod.GET)
	public String login(ModelMap map,HttpServletRequest request) {
		
		return "login";
	}
	
	@RequestMapping(value="loginCheck",method=RequestMethod.POST)
	public String loginCheck(ModelMap map,HttpServletRequest request) {
		String userName = request.getParameter("uname");
		String passWord = request.getParameter("pwd");
		
		map.addAttribute("uname",username);
		if(username.equals(userName) && password.equals(passWord)) {
			return "success";
		}
		
		return "failed";
	}
}
