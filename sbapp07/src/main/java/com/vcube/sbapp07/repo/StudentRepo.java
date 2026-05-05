package com.vcube.sbapp07.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.yaml.snakeyaml.events.Event.ID;

import com.vcube.sbapp07.model.Student;
@Repository
public interface StudentRepo extends JpaRepository<Student,ID> {

}
