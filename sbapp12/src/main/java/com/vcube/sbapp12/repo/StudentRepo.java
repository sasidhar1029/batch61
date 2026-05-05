package com.vcube.sbapp12.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vcube.sbapp12.model.Student;

public interface StudentRepo extends JpaRepository<Student,Integer> {

	Optional<Student> findBySname(String sname);

}
