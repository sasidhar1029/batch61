package com.vcube.springSecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Sasi {
	
	@GetMapping("/v1")
	public String arjun() {
		return"lavada surya";
	}
}
