package com.vcube.sbapp08.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student7")

public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int sid;
	String name;
	String branch;
	long mobile;

	public Student() {

	}

	public Student(int sid, String name, String branch, long mobile) {
		super();
		this.sid = sid;
		this.name = name;
		this.branch = branch;
		this.mobile = mobile;
	}

	public int getId() {
		return sid;
	}

	public void setId(int id) {
		this.sid = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

}
