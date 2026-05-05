package com.vcube.springboot_ui_crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.vcube.springboot_ui_crud.entity.Employee;
import com.vcube.springboot_ui_crud.repo.EmployeeRepository;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeRepository repo;

    // Home Page
    @GetMapping("/")
    public String viewHomePage(Model model) {
        model.addAttribute("list", repo.findAll());
        return "index";
    }

    // Show Add Form
    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("employee", new Employee());
        return "add";
    }

    // Save Employee
    @PostMapping("/save")
    public String saveEmployee(@ModelAttribute Employee employee) {
        repo.save(employee);
        return "redirect:/";
    }

    // Edit Employee
    @GetMapping("/edit/{id}")
    public String editEmployee(@PathVariable Long id, Model model) {
        Employee emp = repo.findById(id).orElse(null);
        model.addAttribute("employee", emp);
        return "edit";
    }

    // Delete Employee
    @GetMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable Long id) {
        repo.deleteById(id);
        return "redirect:/";
    }
}