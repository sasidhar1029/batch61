package com.vcube.sbapp11.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vcube.sbapp11.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee,Integer> {

}
