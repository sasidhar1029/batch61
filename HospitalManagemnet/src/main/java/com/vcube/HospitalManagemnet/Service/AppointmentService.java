package com.vcube.HospitalManagemnet.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vcube.HospitalManagemnet.Entity.Appointment;
import com.vcube.HospitalManagemnet.Repo.AppointmentRepository;

@Service
public class AppointmentService {

	@Autowired
	AppointmentRepository repository;

	public Appointment bookAppointment(Appointment appointment) {
		appointment.setStatus("BOOKED");
		return repository.save(appointment);
	}

	public List<Appointment> getAllAppointments() {
		return repository.findAll();
	}

	public Appointment getById(Long id) {
		return repository.findById(id).orElseThrow();
	}

	public Appointment UpdateAppointment(Long id, Appointment appointment) {
		appointment.setAppointmentId(id);
		return repository.save(appointment);
	}

	public void cancelAppointment(Long id) {
		repository.deleteById(id);
	}
}
