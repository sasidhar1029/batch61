package com.vcube.taskmanager.controller;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import com.vcube.taskmanager.entity.Task;
import com.vcube.taskmanager.service.TaskService;

@RestController
@RequestMapping("/api/tasks")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:3001")
public class TaskController {

    private final TaskService service;

    @PostMapping
    public Task create(@RequestBody Task t){
        return service.create(t);
    }

    @GetMapping
    public List<Task> getAll(){
        return service.getAll();
    }

    @PutMapping("/{id}")
    public Task update(@PathVariable Long id,@RequestBody Task t){
        return service.update(id,t);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }
}