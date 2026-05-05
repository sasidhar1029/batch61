package com.vcube.sb006.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test6 {
	@GetMapping
	public String s() {
		return "sasi";
	}
}
