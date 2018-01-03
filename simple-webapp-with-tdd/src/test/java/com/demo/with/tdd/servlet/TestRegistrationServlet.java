package com.demo.with.tdd.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

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
	public void validateLastName() throws IOException, ServletException {
		HttpServletRequest mockRequest = Mockito.mock(HttpServletRequest.class);

		String lastNameLessThan3Chars = "ab";
		Mockito.when(mockRequest.getParameter("LastName")).thenReturn(lastNameLessThan3Chars);

		HttpServletResponse mockResponse = Mockito.mock(HttpServletResponse.class);
		StringWriter stringWriter = new StringWriter();

		Mockito.when(mockResponse.getWriter()).thenReturn(new PrintWriter(stringWriter, true));

		registrationServlet.doPost(mockRequest, mockResponse);

		String writtenResponse = stringWriter.toString();
		JSONObject responseJson = new JSONObject(writtenResponse);

		Assert.assertTrue("Response json must contain key Last Name", responseJson.has("Last Name"));
		JSONObject lastNameValidateResponse = responseJson.getJSONObject("Last Name");
		Assert.assertTrue("Field validation response json must contain key: status",
				lastNameValidateResponse.has("status"));
		Assert.assertEquals("Last name validation must fail as length is less than 3 chars",
				lastNameValidateResponse.get("status"), "Failure");
		Assert.assertTrue("Last name validation must have message with reason for failure",
				lastNameValidateResponse.has("mesage"));
		Assert.assertEquals("Last name validation message msut specify length is less than 3 chars",
				lastNameValidateResponse.get("message"),
				"Length must be more than 3 characters and less than 16 characters");
	}
}
