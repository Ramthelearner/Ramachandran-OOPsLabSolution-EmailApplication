package com.greatlearning.service;

import java.util.Random;

import com.greatlearning.model.Employee;

public class CredentialService {

	// generate an email with syntax => firstNamelastName@department.company.com
	// generate a random password
	// display the generated credentials

	// Creating generateEmail method to create the email syntax
	public String generateEmail(String firstName, String lastName, String departmentName) {
		return firstName + lastName + "@" + departmentName + ".greatlearning.com";
	}

	// generate password
	public String generatePassword() {
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String specialCharacters = "!@#$%^&*_+=-?/<>";
		String values = capitalLetters + smallLetters + numbers + specialCharacters;

		Random random = new Random();
		char[] password = new char[8];
		for (int i = 0; i < 8; i++) {
			password[i] = values.charAt(random.nextInt(values.length()));
		}

		return String.valueOf(password);

	}

	public void showCreds(Employee employee, String email, String password) {
		System.out.println("Hello" + employee.getFirstName() + "your credentials generated");
		System.out.println(email);
		System.out.println(password);
	}

}
