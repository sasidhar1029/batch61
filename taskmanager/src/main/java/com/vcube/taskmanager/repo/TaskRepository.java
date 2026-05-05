package com.vcube.taskmanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.vcube.taskmanager.entity.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
}