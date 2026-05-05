package com.vcube.sbapp12.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vcube.sbapp12.model.Student;
import com.vcube.sbapp12.repo.StudentRepo;

@RestController
@RequestMapping("api")
public class StudentController {
	@Autowired
	StudentRepo studentrepo;
	
	//http://localhost:8282/api/insertStudents
	@PostMapping("insertStudents")
	Student insertStudents(@RequestBody Student student) {
		return studentrepo.save(student);
	}
	
	//http://localhost:8282/api/getStudents
	@GetMapping("getStudents")
	List<Student> getStudents() {
		return studentrepo.findAll();
	}
	
	//http://localhost:8282/api/getStudentById/5
	@GetMapping("getStudentById/{sid}")
	Optional<Student> getStudentById(@PathVariable int sid) {
		return studentrepo.findById(sid);
	}
	
	//http://localhost:8282/api/getStudentByName/sasidhar
	@GetMapping("getStudentByName/{sname}")
	Optional<Student> getStudentByName(@PathVariable String sname) {
		return studentrepo.findBySname(sname);

	}
	
	//http://localhost:8282/api/deleteStudent/4
	@DeleteMapping("deleteStudent/{sid}")
	String deleteStudent(@PathVariable("sid") int sid) {
		studentrepo.deleteById(sid);
		return "Student details as been removed successfully based on id" + sid;
	}

	//http://localhost:8282/api/updateStudent/3
	@PostMapping("/updateStudent/{sid}")
	public Student updateStudent(@RequestBody Student student, @PathVariable("sid") int sid) {

		Student existingStudent = studentrepo.findById(sid)
				.orElseThrow(() -> new RuntimeException("Student not found with id: " + sid));

		existingStudent.setSbranch(student.getSbranch());
		existingStudent.setSmobile(student.getSmobile());
		existingStudent.setSname(student.getSname());
		existingStudent.setSnative(student.getSnative());

		return studentrepo.save(existingStudent);
	}
	// http://localhost:8282/api/patchwork/3
	@PatchMapping("patchwork/{sid}")
	public Student patchStudentInfo(@RequestBody Student student, @PathVariable int sid) {

		Student existingStudent = studentrepo.findById(sid)
				.orElseThrow(() -> new RuntimeException("Student not found with id: " + sid));

		existingStudent.setSbranch(student.getSbranch());
//	        // Partial update (PATCH)
//	        if (student.getSbranch() != null) {
//	            existingStudent.setSbranch(student.getSbranch());
//	        }

		return studentrepo.save(existingStudent);
	}

}
