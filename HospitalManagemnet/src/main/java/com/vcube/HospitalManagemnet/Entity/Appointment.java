package com.vcube.HospitalManagemnet.Entity;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Hospital1")
@Data
public class Appointment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long appointmentId;
	
	private String patientName;
	private long MobileNumber;
    private String doctorName;
	private LocalTime appointmentTime;
	private LocalDate appointmentDate;
	private String Status;
}
