package com.vcube.HospitalManagemnet.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vcube.HospitalManagemnet.Entity.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment,Long> {

}
