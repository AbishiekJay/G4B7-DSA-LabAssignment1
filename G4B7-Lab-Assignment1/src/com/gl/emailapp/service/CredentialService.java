package com.gl.emailapp.service;

import com.gl.emailapp.model.Employee;

public interface CredentialService {
	public String passwordGenerator();

	public String emailGenerator(Employee employee, String department);

	public void displayCredentails(Employee emp,String department);
}
