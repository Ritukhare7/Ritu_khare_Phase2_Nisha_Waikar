package com.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="passenger_details")
public class PassengerDetails {

	@Id
	@GeneratedValue (strategy = GenerationType.SEQUENCE)
	@Column(name="passenger_id")
	private int passengerId;
	
	@Column(name="passenger_name")
	private String passengerName;
	
	@Column(name="passenger_email")
	private String email;
	
	@Column(name="passenger_phone")
	private Integer phoneNo;
	
	public PassengerDetails() {}

	public PassengerDetails(String passengerName, String email, Integer phoneNo) {
		super();
		this.passengerName = passengerName;
		this.email = email;
		this.phoneNo = phoneNo;
	}

	public int getPassengerId() {
		return passengerId;
	}

	public void setPassengerId(int passengerId) {
		this.passengerId = passengerId;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(Integer phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "PassengerDetails [passengerId=" + passengerId + ", passengerName=" + passengerName + ", email=" + email
				+ ", phoneNo=" + phoneNo + "]";
	}
	
	
}
