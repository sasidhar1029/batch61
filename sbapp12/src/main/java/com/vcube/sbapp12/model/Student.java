package com.vcube.sbapp12.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee3")
public class Student {
	@Id
	@GeneratedValue (strategy =GenerationType.AUTO)
	private int sid;
	private String sname;
	private String sbranch;
	private long smobile;
	private String snative;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSbranch() {
		return sbranch;
	}

	public void setSbranch(String sbranch) {
		this.sbranch = sbranch;
	}

	public long getSmobile() {
		return smobile;
	}

	public void setSmobile(long smobile) {
		this.smobile = smobile;
	}

	public String getSnative() {
		return snative;
	}

	public void setSnative(String snative) {
		this.snative = snative;
	}

}
