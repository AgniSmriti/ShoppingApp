package com.niit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.niit.backendproject.Backend.DAO.UserDAO;
import com.niit.backendproject.Backend.model.User;

@Controller
public class HomeController {
	
	@Autowired
	UserDAO userDAO;
		
	
	@RequestMapping("/")
	public String home(){
		return "index";
		
	}
	
	
	@RequestMapping( "/Login")
	public String signup(Model model)
	{ 
		model.addAttribute("user",new User());
		return "Login";
		
	}
	
	
	@RequestMapping("/adduser")
	public String addUser(@ModelAttribute("user") User u,Model model)
	{ 
		if(userDAO.addUser(u))
		{
		model.addAttribute("msg","successsfully register");
		}
		else
		{
			model.addAttribute("msg","not successsfully register");
		}
		return "signup";
		
	}
	
}






    


