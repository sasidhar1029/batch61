package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.entity.Person;
import com.example.service.PersonService;

@RestController
@RequestMapping("/person")
@CrossOrigin(origins="http://localhost:3000")
public class PersonController {

    @Autowired
    private PersonService service;

    @PostMapping
    public Person add(@RequestBody Person person){
        return service.savePerson(person);
    }

    @GetMapping
    public List<Person> getAll(){
        return service.getAllPersons();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        service.deletePerson(id);
    }
}