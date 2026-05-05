package com.vcube.sbapp07.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vcube.sbapp07.model.Student;
import com.vcube.sbapp07.repo.StudentRepo;

@RestController // create restful APIs
public class StudentController {
	@Autowired//creating auto objects
	StudentRepo studentrepo;

	@PostMapping("insertStudent")//for post request date
	Student insertStudent(@RequestBody Student student) {
		//postman date will come to student then it will goes to (save) to database

		return studentrepo.save(student);

	}
}
