package com.vcube.sbapp08.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.yaml.snakeyaml.events.Event.ID;

import com.vcube.sbapp08.model.Student;
@Repository
public interface Student_Interface extends JpaRepository<Student,Integer> {

	
}
