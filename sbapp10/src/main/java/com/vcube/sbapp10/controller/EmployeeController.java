package com.vcube.sbapp10.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vcube.sbapp10.model.Employee;
import com.vcube.sbapp10.repo.EmployeeRepo;

@RestController


public class EmployeeController {
	@Autowired
	EmployeeRepo employeerepo;

	// create
	@PostMapping("add")
	public Employee add(@RequestBody Employee employee) {
		return employeerepo.save(employee);
	}

	// Read all
	   @GetMapping("/all")
	    public List<Employee> getAllEmployees() {
	        return employeerepo.findAll();
	    }

	// READ BY ID
	@GetMapping("/{id}")
	public Employee getById(@PathVariable int id) {
		return employeerepo.findById(id).orElse(null);
	}

	// Delete
	public String delete(@PathVariable int id) {
		employeerepo.deleteById(id);
		return "Deleted";
	}

}
