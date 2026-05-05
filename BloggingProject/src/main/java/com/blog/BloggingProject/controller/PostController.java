package com.blog.BloggingProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blog.BloggingProject.repo.Postrepo;

@RestController
public class PostController {
	@Autowired
	Postrepo postrepo;

	@GetMapping("/")
	public String viewHomePage(Model model) {
		model.addAttribute("post", postrepo.findAll());
		return "index";
	}
}
