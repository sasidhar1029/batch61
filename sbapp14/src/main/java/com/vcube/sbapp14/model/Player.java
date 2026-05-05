package com.vcube.sbapp14.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "employee7")
@Data
public class Player {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int pid;
	private String pname;
	private double prate;
}
