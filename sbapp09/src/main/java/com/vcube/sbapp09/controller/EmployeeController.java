package com.vcube.sbapp09.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vcube.sbapp09.model.Employee;
import com.vcube.sbapp09.repo.EmployeeRepo;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeRepo employeerepo;

	@PostMapping("insertEmployees")
	Employee insertEmployees(@RequestBody Employee employee) {
		return employeerepo.save(employee);
	}

	@GetMapping("getEmployees")
	List<Employee> getEmployees() {
		return employeerepo.findAll();

	}

	@GetMapping("/{id}")
	public Employee getEmployeeById(@PathVariable Integer id) {
		return employeerepo.findById(id).orElseThrow();
	}

	@GetMapping("/name/{name}")
	public Employee getEmployeeByName(@PathVariable String name) {
	    return employeerepo.findByEmpname(name);
	}

}
