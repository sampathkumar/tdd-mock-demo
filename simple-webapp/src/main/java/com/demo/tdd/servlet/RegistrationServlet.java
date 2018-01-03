package com.demo.tdd.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegistrationServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("RegistrationServlet.doPost()");
		String userName = request.getParameter("txtUserName");
		String firstName = request.getParameter("txtFirstName");
		String lastName = request.getParameter("txtLastName");
		String dateOfBirth = request.getParameter("txtDateOfBirth");
		String email = request.getParameter("txtEmail");
		String phoneNum = request.getParameter("txtPhoneNum");

		System.out.println("RegistrationServlet.doPost(): User Name: " + userName);
		System.out.println("RegistrationServlet.doPost(): First Name: " + firstName);
		System.out.println("RegistrationServlet.doPost(): Last Name: " + lastName);
		System.out.println("RegistrationServlet.doPost(): DOB: " + dateOfBirth);
		System.out.println("RegistrationServlet.doPost(): Email: " + email);
		System.out.println("RegistrationServlet.doPost(): Phone Number: " + phoneNum);
	}

}
