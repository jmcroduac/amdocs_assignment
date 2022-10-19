package com.training.springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.training.springmvc.model.User;
import com.training.springmvc.service.UserService;

@Controller
@RequestMapping("/")
public class HomeController {
	
	@Autowired
	UserService service;
	
	@RequestMapping(value="home" ,method=RequestMethod.GET)
	public String greet(Model map) {
		System.out.println("Inside controller method..");
		map.addAttribute("msg", "Hello From Spring MVC");
		return "home";
		
	}
	
	@RequestMapping(value="getUser" ,method=RequestMethod.GET)
	public String getVal(Model map, @RequestParam int userId) {
		
		User user = service.getUser(userId);
		System.out.println("User Name: "+user.getUserName());
		map.addAttribute("uId", user.getUserName());
		return "user";
		
	}
	@RequestMapping(value="getName/{name}" ,method=RequestMethod.GET)
	public String getName(Model map, @PathVariable String name, HttpServletRequest request) {
		System.out.println("User Name: "+name);
		map.addAttribute("name", name);
		return "username";
		
	}
	
	@RequestMapping(value="save" ,method=RequestMethod.POST)
	public String save(Model map, HttpServletRequest request) {
		User user = new User();
		String userName= request.getParameter("uname");
		user.setUserName(userName);
		
		service.save(user);
		map.addAttribute("userText", "User data saved Successfully");
		return "username";
		
	}
	
	@RequestMapping(value="delete" ,method=RequestMethod.GET)
	public String delete(Model map, @RequestParam int userId) {
		service.deleteUser(userId);
		map.addAttribute("userText", "User data deleted Successfully");
		System.out.println("User deleted!");
		return "username";
	}
	
	@RequestMapping(value="list" ,method=RequestMethod.GET)
	public String listAllUsers(Model map) {
		
		List<User> users = service.listUsers();
		List<String> usernames = new ArrayList<>();
		for(User u : users) {
			usernames.add(u.getUserName());
		}
		
		map.addAttribute("userText", usernames);
		return "username";
		
	}

}