package com.vcube.sbapp15.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping("/")
	String hello() {
		return "Hello actuators info:";
	}
	//localhost:9191/actuator/info will give actuators info
}
