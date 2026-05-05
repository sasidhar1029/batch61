package com.vcube.sbapp11.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vcube.sbapp11.model.Employee;
import com.vcube.sbapp11.repo.EmployeeRepo;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	EmployeeRepo employeerepo;

	 @PostMapping("/add")
	Employee getEmployees(@RequestBody Employee employee) {
		return employeerepo.save(employee);
	}
	
	@GetMapping()
	List<Employee> getAllEmployess(){
		return employeerepo.findAll();
	}
}
