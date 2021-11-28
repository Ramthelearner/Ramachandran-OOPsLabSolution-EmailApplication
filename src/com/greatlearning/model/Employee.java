package com.greatlearning.model;

public class Employee {

	// firstName , lastName, departmentName
	// setters and getters
	// parameterized constructor

	// Instance variables
	String firstName, lastName, departmentName;

	// Parameterized Constructor created to initialize the Object
	public Employee(String firstName, String lastName, String departmentName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.departmentName = departmentName;
	}

	// Getters and Setters created to access the instance variable outside the class
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

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

}
