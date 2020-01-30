package com.hendisantika.springmvcjdbc.entity;

import lombok.Data;

/**
 * Created in Eclipse IDE.
 * Project : spring-mvc-jdbc-master
 * User: yash
 * Date: 18/01/2020
 */

@Data
public class User {
 
	private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String dob;
    public int getId() {
 		return id;
 	}
 	public void setId(int id) {
 		this.id = id;
 	}
 	public String getFirstName() {
 		return firstName;
 	}
 	public void setFirstName(String firstName) {
 		this.firstName = firstName;
 	}
 	public String getLastName() {
 		return lastName;
 	}
 	public void setLastName(String lastName) {
 		this.lastName = lastName;
 	}
 	public String getEmail() {
 		return email;
 	}
 	public void setEmail(String email) {
 		this.email = email;
 	}
 	public String getDob() {
 		return dob;
 	}
 	public void setDob(String dob) {
 		this.dob = dob;
 	}
}
