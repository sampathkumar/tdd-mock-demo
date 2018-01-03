package com.demo.with.tdd.servlet;

import java.io.IOException;

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
		JSONObject responseJson = new JSONObject();
		String lastName = request.getParameter("LastName");
		JSONObject lastNameValidateJson = validateLastName(lastName);
		responseJson.put("Last Name", lastNameValidateJson);

		response.getWriter().write(responseJson.toString());
	}

	private JSONObject validateLastName(String lastName) {
		JSONObject responseJson = new JSONObject();
		responseJson.put("status", "Failure");
		responseJson.put("message", "No implementation");
		return responseJson;
	}
}
