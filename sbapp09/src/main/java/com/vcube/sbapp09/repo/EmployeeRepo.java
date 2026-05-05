package com.vcube.sbapp09.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vcube.sbapp09.model.Employee;
@Repository
public interface EmployeeRepo  extends JpaRepository<Employee,Integer>{

	Employee getById(Integer empid);

	Employee getByName(String name);

	Employee findByEmpname(String name);

}
