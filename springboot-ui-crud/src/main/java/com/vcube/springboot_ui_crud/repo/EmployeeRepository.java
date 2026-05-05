package com.vcube.springboot_ui_crud.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vcube.springboot_ui_crud.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	
}