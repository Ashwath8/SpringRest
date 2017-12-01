package com.ash.spring.rest.user;

import javax.persistence.Entity;
import javax.persistence.Id;
// This represents the entity that is going to be mapped to the table in the Database
// The name convention used here is because of a reserved word conflict with Apache Derby
// Used mnemonic Users instead of User
@Entity
public class Users {
	// Username is the primary key for the table
	// Reason: Usernames are mandated to be unique in majority of websites
	@Id
	private String username;
	private String name;
	private String email;
	private String password; 

	//No-arg constructor 
	public Users(){}
	// Constructor with arguments
	public Users(String name, String email, String username, String password){
		super();
		this.name = name;
		this.email = email;
		this.username = username;
		this.password = password;
	}
	
	// Getters & Setters for the member fields
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
}
