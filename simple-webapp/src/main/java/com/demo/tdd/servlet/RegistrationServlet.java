package com.demo.tdd.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

public class RegistrationServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
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

		response.setContentType("application/json");

		JSONObject responseJson = new JSONObject();

		JSONObject userNameValidationJson = validateUserName();
		responseJson.put("User Name", userNameValidationJson);

		JSONObject firstNameValidationJson = validateFirstName();
		responseJson.put("First Name", firstNameValidationJson);

		JSONObject lastNameValidationJson = validateLastName();
		responseJson.put("Last Name", lastNameValidationJson);

		JSONObject dateOfBirthValidationJson = validateDOB();
		responseJson.put("DOB", dateOfBirthValidationJson);

		JSONObject emailValidationJson = validateEmail();
		responseJson.put("Email", emailValidationJson);

		JSONObject phoneNumValidationJson = validatePhoneNum();
		responseJson.put("Phone Number", phoneNumValidationJson);

		PrintWriter outputWriter = response.getWriter();
		outputWriter.write(responseJson.toString());
	}

	private JSONObject validatePhoneNum() {
		JSONObject validationJson = new JSONObject();
		validationJson.put("status", "Failed");
		validationJson.put("message", "No implementation");
		return validationJson;
	}

	private JSONObject validateEmail() {
		JSONObject validationJson = new JSONObject();
		validationJson.put("status", "Failed");
		validationJson.put("message", "No implementation");
		return validationJson;
	}

	private JSONObject validateDOB() {
		JSONObject validationJson = new JSONObject();
		validationJson.put("status", "Failed");
		validationJson.put("message", "No implementation");
		return validationJson;
	}

	private JSONObject validateLastName() {
		JSONObject validationJson = new JSONObject();
		validationJson.put("status", "Failed");
		validationJson.put("message", "No implementation");
		return validationJson;
	}

	private JSONObject validateFirstName() {
		JSONObject validationJson = new JSONObject();
		validationJson.put("status", "Failed");
		validationJson.put("message", "No implementation");
		return validationJson;
	}

	private JSONObject validateUserName() {
		JSONObject validationJson = new JSONObject();
		validationJson.put("status", "Failed");
		validationJson.put("message", "No implementation");
		return validationJson;
	}

}
