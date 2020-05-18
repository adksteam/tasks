package com.sanidhya.accountManager;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Users {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Long id;
	@Column(name = "NAME")
	private String name;
	@Column(name = "EMAIL")
	private String email;
	@Column(name = "TYPE")
	private String accountType;

	Users(String name, String email, String accountType) {
		this.name = name;
		this.email = email;
		this.accountType = accountType;
	}

	Users() {
	}

	// All getter and setter methods
	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
}
