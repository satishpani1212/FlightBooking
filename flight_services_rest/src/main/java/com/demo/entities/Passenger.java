package com.demo.entities;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Passenger {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false)
	private String pName;
	@Column(nullable = false)
	private String pEmail;
	@Column(nullable = false)
	private String pGender;
	@Column(nullable = false)
	private double pAge;
	@Column(nullable = false)
	private double pPhone;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getpEmail() {
		return pEmail;
	}
	public void setpEmail(String pEmail) {
		this.pEmail = pEmail;
	}
	public String getpGender() {
		return pGender;
	}
	public void setpGender(String pGender) {
		this.pGender = pGender;
	}
	public double getpAge() {
		return pAge;
	}
	public void setpAge(double pAge) {
		this.pAge = pAge;
	}
	public double getpPhone() {
		return pPhone;
	}
	public void setpPhone(double pPhone) {
		this.pPhone = pPhone;
	}

	

	

}
