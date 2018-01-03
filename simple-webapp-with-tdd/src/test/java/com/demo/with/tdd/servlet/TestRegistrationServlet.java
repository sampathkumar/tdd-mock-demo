package com.demo.with.tdd.servlet;

import org.junit.Before;
import org.junit.Test;

public class TestRegistrationServlet {

	/**
	 * This is Class Under Test
	 */
	private RegistrationServlet registrationServlet;

	@Before
	public void setup() {
		registrationServlet = new RegistrationServlet();
	}

	@Test
	public void validateLastName() {
	}
}
