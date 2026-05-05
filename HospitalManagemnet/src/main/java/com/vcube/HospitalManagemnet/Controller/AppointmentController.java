package com.vcube.HospitalManagemnet.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vcube.HospitalManagemnet.Entity.Appointment;
import com.vcube.HospitalManagemnet.Service.AppointmentService;

@RestController
@RequestMapping("/appointments")
@CrossOrigin(origins = "http://localhost:3000")
//@CrossOrigin(origins = "*")

public class AppointmentController {

	@Autowired
	AppointmentService service;
	
	@PostMapping
	public Appointment book(@RequestBody Appointment appointment) {
		return service.bookAppointment(appointment);
	}
	
	@GetMapping
	public List<Appointment> getAll(){
		return service.getAllAppointments();
	}
	
	@GetMapping("/{id}")
	public Appointment getById(@PathVariable Long id) {
		return service.getById(id);
	}
	
	@PutMapping("{id}")
	public Appointment update(@PathVariable Long id,@RequestBody Appointment appointment) {
		return service.UpdateAppointment(id, appointment);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		service.cancelAppointment(id);
	}
	
}
