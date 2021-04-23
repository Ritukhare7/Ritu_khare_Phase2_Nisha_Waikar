package com.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="admin_details")
public class AdminDetails {

	@Id
	@GeneratedValue (strategy = GenerationType.SEQUENCE)
	@Column(name="admin_id")
	private int adminId;
	
	@Column(name="admin_email")
	private String email;
	
	@Column(name="admin_password")
	private String password;
	
	public AdminDetails() {}

	public AdminDetails(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "AdminDetails [adminId=" + adminId + ", email=" + email + ", password=" + password + "]";
	}
	
}
