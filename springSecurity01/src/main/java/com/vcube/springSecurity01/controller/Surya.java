package com.vcube.springSecurity01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Surya {
	@GetMapping()
	public String lavada() {
		return "sasi";
	}
}
