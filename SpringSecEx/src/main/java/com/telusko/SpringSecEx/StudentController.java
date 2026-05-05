package com.telusko.SpringSecEx;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController

public class StudentController {

	private List<Student> Students= new ArrayList<>(
			List.of(
					new Student (1,"sasi",60),
					new Student(2,"arjun",55))
			);
	
	@GetMapping("/student")
	public List<Student> getAllStudents(){
		return Students;
	}
	
	@GetMapping("csrf-token")
	public CsrfToken getCsrfToken(HttpServletRequest request) {
		return (CsrfToken) request.getAttribute("_csrf");
	}
	
	@PostMapping("/student")
	public Student addStudent(@RequestBody Student student) {
		Students.add(student);
		return student;
	}
}
