package com.vcube.sbappth02.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.vcube.sbappth02.model.User;
import com.vcube.sbappth02.service.UserService;

@Controller

public class UserController {

	@Autowired
	UserService userservice;
	
	@GetMapping("/")
	String home() {
		return"login";
	}
	
	@PostMapping("/login")
	public String login(@RequestParam String username,@RequestParam String password,Model model) {
		User user = userservice.findUserByUsernameAndPassword(username,password);
		if(user !=null) {
			return "redirect:/users";
		}
		model.addAttribute("error","Invalid Credentials");
	return "login";
	}
	
	//whenever we enter /add it will go to to the add-user page then it will fields set to 'model' 
	//with the help of 'Model' then it will create a new object for every user
	@GetMapping("/add")
	public String addUser(Model model) {
		model.addAttribute("user",new User());
		return "add-user";
	}
	
	@PostMapping("/save")
	//@Modelattribute is mappig from ui to model
	public String saveUser(@ModelAttribute User user) {
		userservice.insertUser(user);
		return "redirect:/users";
		//redirect:/users means it this mapping local method
	}
	
	@GetMapping("/users")
	String getAllUser(Model model) {
		model.addAttribute("users",userservice.getAllUser());
		return "users";
	}
}
