package com.vcube.taskmanager.service;

import java.util.List;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import com.vcube.taskmanager.entity.Task;
import com.vcube.taskmanager.repo.TaskRepository;

@Service
@RequiredArgsConstructor
public class TaskService {

    private final TaskRepository repo;

    public Task create(Task t){
        return repo.save(t);
    }

    public List<Task> getAll(){
        return repo.findAll();
    }

    public Task update(Long id, Task t){
        Task existing = repo.findById(id).orElseThrow();
        existing.setTitle(t.getTitle());
        existing.setDescription(t.getDescription());
        existing.setCompleted(t.getCompleted());
        return repo.save(existing);
    }

    public void delete(Long id){
        repo.deleteById(id);
    }
}