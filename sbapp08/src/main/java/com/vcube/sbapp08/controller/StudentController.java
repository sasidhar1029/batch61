package com.vcube.sbapp08.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vcube.sbapp08.model.Student;
import com.vcube.sbapp08.repo.Student_Interface;

@RestController
public class StudentController {
	@Autowired
	Student_Interface student_Interface;
	@PostMapping("insertStudent")
	Student insertStudent(@RequestBody Student student) {
		return student_Interface.save(student);
	}
}
