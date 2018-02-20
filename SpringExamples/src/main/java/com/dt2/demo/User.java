package com.dt2.demo;

public class User {
	private String firstName;
	private String lastName;
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
	
	public void printFullName(){
		System.out.println("Full name is : " + this.firstName + " " + this.lastName);
	}

}
