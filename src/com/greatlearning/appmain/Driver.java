package com.greatlearning.appmain;

import java.util.Scanner;

import com.greatlearning.model.Employee;
import com.greatlearning.service.CredentialService;

public class Driver {

	public static void main(String args[]) {

		// Employee class object
		// userInput for firstName , lastName, departmentName
		// (Technical , Admin, HumanResouce, Legal)

		// Defining scanner class to get the input from the user
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter First Name");
		String firstName = sc.nextLine();

		System.out.println("Enter Last Name");
		String lastName = sc.nextLine();

		// System.out.println("Enter the Department");
		System.out.println("Enter the Department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resources");
		System.out.println("4. Legal");
		int choice = sc.nextInt();
		String email = null;
		String password = null;
		// creating credentialService object to call generateEmail method created
		CredentialService credentialService = new CredentialService();
		if (choice == 1) {
			// Object creation of employee
			Employee employee = new Employee(firstName, lastName, "Technical");
			// calling generateEmail
			email = credentialService.generateEmail(firstName, lastName, "Technical");
			// calling generatePassword
			password = credentialService.generatePassword();
			System.out.println("email is :: " + email);
			System.out.println("password is :: " + password);
		} else if (choice == 2) {
			Employee employee = new Employee(firstName, lastName, "Admin");
			email = credentialService.generateEmail(firstName, lastName, "Admin");
			password = credentialService.generatePassword();
			System.out.println("email is :: " + email);
			System.out.println("password is :: " + password);
		} else if (choice == 3) {
			Employee employee = new Employee(firstName, lastName, "Human Resources");
			email = credentialService.generateEmail(firstName, lastName, "Human Resources");
			password = credentialService.generatePassword();
			System.out.println("email is :: " + email);
			System.out.println("password is :: " + password);
		} else if (choice == 4) {
			Employee employee = new Employee(firstName, lastName, "Legal");
			email = credentialService.generateEmail(firstName, lastName, "Legal");
			password = credentialService.generatePassword();
			System.out.println("email is :: " + email);
			System.out.println("password is :: " + password);
		} else {
			System.out.println("Enter Valid Input");
		}

	}
}
