package com.sanidhya.accountManager;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String email;
	private String accountType;

	User(String name, String email, String accountType) {
		this.name = name;
		this.email = email;
		this.accountType = accountType;
	}

	User() {
	}

	//All getter and setter methods
	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getAccType() {
		return accountType;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAccType(String accountType) {
		this.accountType = accountType;
	}
}
