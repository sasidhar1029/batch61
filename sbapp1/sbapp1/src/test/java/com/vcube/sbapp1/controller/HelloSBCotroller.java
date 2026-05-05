package com.vcube.sbapp1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSBCotroller {
	@GetMapping
	public String d() {
		return"llllllll";
	}
}
