package com.example.employeeManagement.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.employeeManagement.entity.Employee;
import com.example.employeeManagement.repo.EmpRepo;

@RestController
public class EmployeeControl {

    @Autowired
    EmpRepo emprepo;

    @PostMapping("/insertEmployee")
    public Employee insertEmployee(@RequestBody Employee emp) {
        return emprepo.save(emp);
    }

    @GetMapping("/getAllEmployees")
    public List<Employee> getAllEmployees() {
        return emprepo.findAll();
    }

    @PutMapping("/updateEmployee/{empid}")
    public Employee updateEmployee(@RequestBody Employee emp, @PathVariable int empid) {

        Optional<Employee> existing = emprepo.findById(empid);

        if (existing.isPresent()) {
            Employee updatedEmp = existing.get();

            // update fields
            updatedEmp.setEmp_name(emp.getEmp_name());
            updatedEmp.setCity(emp.getCity());
            updatedEmp.setAge(emp.getAge());

            return emprepo.save(updatedEmp);
        } else {
            throw new RuntimeException("Employee not found with id: " + empid);
        }
    }
    @DeleteMapping("/deleteEmployee/{empid}")
    public String deleteEmployee(@PathVariable int empid) {
        emprepo.deleteById(empid);
        return "Employee deleted successfully with id: " + empid;
    }
}