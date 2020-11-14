package com.capg.hcs.appointmentmanagement.model;

import java.math.BigInteger;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


@Entity(name="appointment-info")
public class AppointmentManagement {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE )
	private BigInteger appointmentId;
	private int testId;
	@DateTimeFormat(pattern = "yyyy/MM/ddThh:mm")
	private LocalDateTime dateTime;
	private boolean approved = false;
	
	
	public AppointmentManagement(BigInteger appointmentId, int testId, LocalDateTime dateTime, boolean approved) {
		super();
		this.appointmentId = appointmentId;
		this.testId = testId;
		this.dateTime = dateTime;
		this.approved = approved;
	}


	public BigInteger getAppointmentId() {
		return appointmentId;
	}


	public void setAppointmentId(BigInteger appointmentId) {
		this.appointmentId = appointmentId;
	}


	public int getTestId() {
		return testId;
	}


	public void setTestId(int testId) {
		this.testId = testId;
	}


	public LocalDateTime getDateTime() {
		return dateTime;
	}


	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}


	public boolean isApproved() {
		return approved;
	}


	public void setApproved(boolean approved) {
		this.approved = approved;
	}
	
	
	
	
	
	


}
